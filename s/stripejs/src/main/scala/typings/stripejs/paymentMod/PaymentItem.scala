package typings.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  /**
    * The amount the user has to pay in the given currency
    * @see StripePaymentOptions.currency
    */
  var amount: Double
  /**
    * A text that should be shown to the user
    */
  var label: String
  /**
    * Whether or not the payment should be executed immediately
    * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
    */
  var pending: js.UndefOr[Boolean] = js.undefined
}

object PaymentItem {
  @scala.inline
  def apply(amount: Double, label: String, pending: js.UndefOr[Boolean] = js.undefined): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
}

