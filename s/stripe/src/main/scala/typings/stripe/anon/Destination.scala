package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * The amount transferred to the destination account, if specified. By
    * default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * ID of an existing, connected Stripe account to transfer funds to if
    * transfer_data was specified in the charge request.
    */
  var destination: String
}

object Destination {
  @scala.inline
  def apply(destination: String, amount: js.UndefOr[Null | Double] = js.undefined): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

