package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleCardPaymentOptions extends js.Object {
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
    * If the PaymentIntent is associated with a customer and this parameter
    * is set to true, the provided payment method will be attached to the
    * customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.native
  /**
    * The shipping details for the payment, if collected. [Recommended]
    */
  var shipping: js.UndefOr[ShippingDetails] = js.native
}

object HandleCardPaymentOptions {
  @scala.inline
  def apply(): HandleCardPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardPaymentOptions]
  }
  @scala.inline
  implicit class HandleCardPaymentOptionsOps[Self <: HandleCardPaymentOptions] (val x: Self) extends AnyVal {
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
    def setSave_payment_method(value: Boolean): Self = this.set("save_payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave_payment_method: Self = this.set("save_payment_method", js.undefined)
    @scala.inline
    def setShipping(value: ShippingDetails): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
  }
  
}

