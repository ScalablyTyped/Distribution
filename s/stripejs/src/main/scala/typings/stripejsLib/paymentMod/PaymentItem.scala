package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  /**
    * The amount the user has to pay in the given currency
    * @see StripePaymentOptions.currency
    */
  var amount: scala.Double
  /**
    * A text that should be shown to the user
    */
  var label: java.lang.String
  /**
    * Whether or not the payment should be executed immediately
    * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
    */
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object PaymentItem {
  @scala.inline
  def apply(amount: scala.Double, label: java.lang.String, pending: js.UndefOr[scala.Boolean] = js.undefined): PaymentItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("label")(label)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[PaymentItem]
  }
}

