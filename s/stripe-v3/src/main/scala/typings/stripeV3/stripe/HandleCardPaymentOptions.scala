package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardPaymentOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  var payment_method_data: js.UndefOr[Billingdetails] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * If the PaymentIntent is associated with a customer and this parameter
    * is set to true, the provided payment method will be attached to the
    * customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  /**
    * The shipping details for the payment, if collected. [Recommended]
    */
  var shipping: js.UndefOr[ShippingDetails] = js.undefined
}

object HandleCardPaymentOptions {
  @scala.inline
  def apply(
    payment_method_data: Billingdetails = null,
    receipt_email: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    shipping: ShippingDetails = null
  ): HandleCardPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.get.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCardPaymentOptions]
  }
}

