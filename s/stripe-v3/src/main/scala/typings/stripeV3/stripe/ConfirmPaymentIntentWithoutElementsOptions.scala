package typings.stripeV3.stripe

import typings.stripeV3.AnonBillingdetailsCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPaymentIntentWithoutElementsOptions extends ConfirmPaymentIntentOptions {
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  @JSName("payment_method_data")
  var payment_method_data_ConfirmPaymentIntentWithoutElementsOptions: js.UndefOr[AnonBillingdetailsCard] = js.undefined
}

object ConfirmPaymentIntentWithoutElementsOptions {
  @scala.inline
  def apply(
    payment_method: String = null,
    payment_method_data: AnonBillingdetailsCard = null,
    receipt_email: String = null,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: String = null,
    shipping: ShippingDetails = null
  ): ConfirmPaymentIntentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.asInstanceOf[js.Any])
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPaymentIntentWithoutElementsOptions]
  }
}

