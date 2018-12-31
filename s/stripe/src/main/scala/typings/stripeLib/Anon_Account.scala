package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  /**
    * ID of the Stripe account this fee will be transferred to.
    */
  var account: java.lang.String
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) reflecting the amount of the
    * charge to be transferred to the destination[account].
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
}

