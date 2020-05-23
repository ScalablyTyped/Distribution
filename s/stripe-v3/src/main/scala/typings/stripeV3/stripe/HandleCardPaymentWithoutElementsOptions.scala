package typings.stripeV3.stripe

import typings.stripeV3.anon.BillingdetailsCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardPaymentWithoutElementsOptions extends HandleCardPaymentOptions {
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
  var payment_method_data_HandleCardPaymentWithoutElementsOptions: js.UndefOr[BillingdetailsCard] = js.undefined
  /**
    * Instead of payment_method, the ID of a Source may be passed in.
    * (Note that this is undocumented as of August 2019).
    */
  var source: js.UndefOr[String] = js.undefined
}

object HandleCardPaymentWithoutElementsOptions {
  @scala.inline
  def apply(
    payment_method: String = null,
    payment_method_data: BillingdetailsCard = null,
    receipt_email: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    shipping: ShippingDetails = null,
    source: String = null
  ): HandleCardPaymentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.get.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCardPaymentWithoutElementsOptions]
  }
}

