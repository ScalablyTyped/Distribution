package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accountnumber extends js.Object {
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

object Accountnumber {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_code: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_code = swift_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
}

