import java.util.Scanner;

public class Hello {

    //This comment is for lab6
    public static void main(String[] args) {
        System.out.print("Hello. What is your name? ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //ask the user to input his/her name
        System.out.print("It's nice to meet you," + input + ". How old are you? ");

        String age = sc.next();
        //ask the user to input his/her age
        System.out.println("I see that you are still quite young at only " + age + ".");

        System.out.print("Where do you live? ");
        String location = sc.next();
        //ask the user for his/her location
        System.out.println("Wow! I've always wanted to go to " + location + "." + " Thanks for chatting with me. Bye! ");
    }
}
