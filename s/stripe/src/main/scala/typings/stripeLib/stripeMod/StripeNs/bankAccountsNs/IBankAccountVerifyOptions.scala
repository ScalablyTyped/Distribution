package typings
package stripeLib.stripeMod.StripeNs.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountVerifyOptions extends js.Object {
  /**
    * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
    */
  var amounts: js.Tuple2[scala.Double, scala.Double]
}

