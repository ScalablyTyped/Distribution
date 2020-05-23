package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmountNumber extends js.Object {
  /**
    * The amount that will be transferred automatically when a charge succeeds. The amount is capped at the total transaction amount and if no amount is set, the full amount is transferred.
    * If you intend to collect a fee and you need a more robust reporting experience, using application_fee_amount might be a better fit for your integration.
    */
  var amount: js.UndefOr[Double] = js.undefined
}

object AmountNumber {
  @scala.inline
  def apply(amount: js.UndefOr[Double] = js.undefined): AmountNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountNumber]
  }
}

