package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmountDestination extends js.Object {
  /**
    * The amount transferred to the destination account, if specified.
    * By default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * ID of an existing, connected Stripe account.
    */
  var destination: String
}

object AmountDestination {
  @scala.inline
  def apply(destination: String, amount: js.UndefOr[Double] = js.undefined): AmountDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountDestination]
  }
}

