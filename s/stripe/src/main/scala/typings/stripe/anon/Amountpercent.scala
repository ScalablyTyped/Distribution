package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amountpercent extends js.Object {
  /**
    * A non-negative decimal between 0 and 100, with at most two decimal places.
    * This represents the percentage of the subscription invoice subtotal that will be transferred to the destination account.
    * By default, the entire amount is transferred to the destination.
    */
  var amount_percent: js.UndefOr[Double] = js.undefined
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String
}

object Amountpercent {
  @scala.inline
  def apply(destination: String, amount_percent: js.UndefOr[Double] = js.undefined): Amountpercent = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (!js.isUndefined(amount_percent)) __obj.updateDynamic("amount_percent")(amount_percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountpercent]
  }
}

