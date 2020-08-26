package typings.stripeV3.stripe

import typings.stripeV3.anon.BillingdetailsCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPaymentIntentWithoutElementsOptions extends ConfirmPaymentIntentOptions {
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  @JSName("payment_method_data")
  var payment_method_data_ConfirmPaymentIntentWithoutElementsOptions: js.UndefOr[BillingdetailsCard] = js.native
}

object ConfirmPaymentIntentWithoutElementsOptions {
  @scala.inline
  def apply(): ConfirmPaymentIntentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPaymentIntentWithoutElementsOptions]
  }
  @scala.inline
  implicit class ConfirmPaymentIntentWithoutElementsOptionsOps[Self <: ConfirmPaymentIntentWithoutElementsOptions] (val x: Self) extends AnyVal {
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
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setPayment_method_data(value: BillingdetailsCard): Self = this.set("payment_method_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_data: Self = this.set("payment_method_data", js.undefined)
  }
  
}

