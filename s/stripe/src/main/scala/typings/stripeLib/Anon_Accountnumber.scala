package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accountnumber extends js.Object {
  /**
    * Account number to transfer funds to.
    */
  var account_number: java.lang.String
  /**
    * Name of the bank associated with the routing number.
    */
  var bank_name: java.lang.String
  /**
    * Routing transit number for the bank account to transfer funds to.
    */
  var routing_number: java.lang.String
  /**
    * SWIFT code of the bank associated with the routing number.
    */
  var swift_code: java.lang.String
}

object Anon_Accountnumber {
  @scala.inline
  def apply(
    account_number: java.lang.String,
    bank_name: java.lang.String,
    routing_number: java.lang.String,
    swift_code: java.lang.String
  ): Anon_Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number, bank_name = bank_name, routing_number = routing_number, swift_code = swift_code)
  
    __obj.asInstanceOf[Anon_Accountnumber]
  }
}

