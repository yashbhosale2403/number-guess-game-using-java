
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      int mynumber = (int)(Math.random()*100);

      Scanner s = new Scanner(System.in);
        int usernumber =0;
      do{
          System.out.print("guess my number = ");
          usernumber= s.nextInt();
          if (mynumber == usernumber){
              System.out.println("wooo,congratulation you guess right!");
              break;
          }
          else if (mynumber > usernumber){
              System.out.println("you enter small number");
          }
          else
              System.out.println("you enter large number");

      }while(usernumber >= 0 );

    }
}