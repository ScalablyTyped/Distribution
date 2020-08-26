package typings.stripe.mod.paymentIntents

import typings.stripe.mod.setupIntents.ISetupIntentTransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentCaptureOptions extends js.Object {
  /**
    * The amount to capture (in cents) from the PaymentIntent, which must be less than or equal to the original amount. Any additional amount will be automatically refunded. Defaults to the full `amount_capturable` if not provided.
    */
  var amount_to_capture: js.UndefOr[Double] = js.native
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[ISetupIntentTransferData] = js.native
}

object IPaymentIntentCaptureOptions {
  @scala.inline
  def apply(): IPaymentIntentCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCaptureOptions]
  }
  @scala.inline
  implicit class IPaymentIntentCaptureOptionsOps[Self <: IPaymentIntentCaptureOptions] (val x: Self) extends AnyVal {
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
    def setAmount_to_capture(value: Double): Self = this.set("amount_to_capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount_to_capture: Self = this.set("amount_to_capture", js.undefined)
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee_amount: Self = this.set("application_fee_amount", js.undefined)
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    @scala.inline
    def setTransfer_data(value: ISetupIntentTransferData): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_data: Self = this.set("transfer_data", js.undefined)
  }
  
}

