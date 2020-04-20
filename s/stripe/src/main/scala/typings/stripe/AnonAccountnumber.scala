package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountnumber extends js.Object {
  /**
    * Account number to transfer funds to.
    */
  var account_number: String
  /**
    * Name of the bank associated with the routing number.
    */
  var bank_name: String
  /**
    * Routing transit number for the bank account to transfer funds to.
    */
  var routing_number: String
  /**
    * SWIFT code of the bank associated with the routing number.
    */
  var swift_code: String
}

object AnonAccountnumber {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_code: String): AnonAccountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountnumber]
  }
}

