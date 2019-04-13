package typings
package stripeLib.stripeMod.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountVerifyOptions extends js.Object {
  /**
    * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
    */
  var amounts: js.Tuple2[scala.Double, scala.Double]
}

object IBankAccountVerifyOptions {
  @scala.inline
  def apply(amounts: js.Tuple2[scala.Double, scala.Double]): IBankAccountVerifyOptions = {
    val __obj = js.Dynamic.literal(amounts = amounts)
  
    __obj.asInstanceOf[IBankAccountVerifyOptions]
  }
}

