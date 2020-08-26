package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used in checkout session creation
  */
@js.native
trait IPaymentIntentSessionSubset extends js.Object {
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  /**
    * Capture method of this PaymentIntent, one of automatic or manual.
    */
  var capture_method: js.UndefOr[PaymentIntentDataCaptureMethodOptions] = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    * If present, the payment method used with this PaymentIntent can be attached to a Customer, even after the transaction completes.
    * Use on_session if you intend to only reuse the payment method when your customer is present in your checkout flow. Use off_session if your customer may or may not be in your checkout flow. See Saving card details after a payment to learn more.
    * Stripe uses setup_future_usage to dynamically optimize your payment flow and comply with regional legislation and network rules. For example, if your customer is impacted by SCA, using off_session will ensure that they are authenticated while processing this PaymentIntent. You will then be able to collect off-session payments for this customer.
    */
  var setup_future_usage: js.UndefOr[PaymentIntendDataFutureUsageOptions] = js.native
  /**
    * Shipping information for this payment.
    */
  var shipping: js.UndefOr[IPaymentIntentDataShipping] = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[IPaymentIntentDataTransferDataOptions] = js.native
}

object IPaymentIntentSessionSubset {
  @scala.inline
  def apply(): IPaymentIntentSessionSubset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentSessionSubset]
  }
  @scala.inline
  implicit class IPaymentIntentSessionSubsetOps[Self <: IPaymentIntentSessionSubset] (val x: Self) extends AnyVal {
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
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee_amount: Self = this.set("application_fee_amount", js.undefined)
    @scala.inline
    def setCapture_method(value: PaymentIntentDataCaptureMethodOptions): Self = this.set("capture_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture_method: Self = this.set("capture_method", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt_email: Self = this.set("receipt_email", js.undefined)
    @scala.inline
    def setSetup_future_usage(value: PaymentIntendDataFutureUsageOptions): Self = this.set("setup_future_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_future_usage: Self = this.set("setup_future_usage", js.undefined)
    @scala.inline
    def setShipping(value: IPaymentIntentDataShipping): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setTransfer_data(value: IPaymentIntentDataTransferDataOptions): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_data: Self = this.set("transfer_data", js.undefined)
  }
  
}

