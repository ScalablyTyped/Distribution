package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPaymentIntentOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  var payment_method_data: js.UndefOr[Billingdetails] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * If you are handling next actions yourself, pass in a return_url.
    * If the subsequent action is redirect_to_url, this URL will be used
    * on the return path for the redirect.
    */
  var return_url: js.UndefOr[String] = js.native
  /**
    * If the PaymentIntent is associated with a customer and this parameter
    * is set to true, the provided payment method will be attached to the
    * customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that you intend to make future payments with this PaymentIntent's payment method.
    */
  var setup_future_usage: js.UndefOr[String] = js.native
  /**
    * The shipping details for the payment, if collected. [Recommended]
    */
  var shipping: js.UndefOr[ShippingDetails] = js.native
}

object ConfirmPaymentIntentOptions {
  @scala.inline
  def apply(): ConfirmPaymentIntentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPaymentIntentOptions]
  }
  @scala.inline
  implicit class ConfirmPaymentIntentOptionsOps[Self <: ConfirmPaymentIntentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPayment_method_data(value: Billingdetails): Self = this.set("payment_method_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_data: Self = this.set("payment_method_data", js.undefined)
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt_email: Self = this.set("receipt_email", js.undefined)
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = this.set("save_payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave_payment_method: Self = this.set("save_payment_method", js.undefined)
    @scala.inline
    def setSetup_future_usage(value: String): Self = this.set("setup_future_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_future_usage: Self = this.set("setup_future_usage", js.undefined)
    @scala.inline
    def setShipping(value: ShippingDetails): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
  }
  
}

