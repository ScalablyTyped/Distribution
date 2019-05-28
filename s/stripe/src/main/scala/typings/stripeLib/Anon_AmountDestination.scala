package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountDestination extends js.Object {
  /**
    * The amount transferred to the destination account, if specified.
    * By default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: java.lang.String
}

object Anon_AmountDestination {
  @scala.inline
  def apply(destination: java.lang.String, amount: scala.Int | scala.Double = null): Anon_AmountDestination = {
    val __obj = js.Dynamic.literal(destination = destination)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmountDestination]
  }
}

