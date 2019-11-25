package typings.stripe.stripeMod.paymentIntents

import typings.stripe.stripeMod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentData extends js.Object {
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  /**
    * Capture method of this PaymentIntent, one of automatic or manual.
    */
  var capture_method: js.UndefOr[PaymentIntentDataCaptureMethodOptions] = js.undefined
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    * If present, the payment method used with this PaymentIntent can be attached to a Customer, even after the transaction completes.
    * Use on_session if you intend to only reuse the payment method when your customer is present in your checkout flow. Use off_session if your customer may or may not be in your checkout flow. See Saving card details after a payment to learn more.
    * Stripe uses setup_future_usage to dynamically optimize your payment flow and comply with regional legislation and network rules. For example, if your customer is impacted by SCA, using off_session will ensure that they are authenticated while processing this PaymentIntent. You will then be able to collect off-session payments for this customer.
    */
  var setup_future_usage: js.UndefOr[PaymentIntendDataFutureUsageOptions] = js.undefined
  /**
    * Shipping information for this payment.
    */
  var shipping: js.UndefOr[IPaymentIntentDataShipping] = js.undefined
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[IPaymentIntentDataTransferDataOptions] = js.undefined
}

object IPaymentIntentData {
  @scala.inline
  def apply(
    application_fee_amount: Int | Double = null,
    capture_method: PaymentIntentDataCaptureMethodOptions = null,
    description: String = null,
    metadata: IMetadata = null,
    on_behalf_of: String = null,
    receipt_email: String = null,
    setup_future_usage: PaymentIntendDataFutureUsageOptions = null,
    shipping: IPaymentIntentDataShipping = null,
    transfer_data: IPaymentIntentDataTransferDataOptions = null
  ): IPaymentIntentData = {
    val __obj = js.Dynamic.literal()
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (capture_method != null) __obj.updateDynamic("capture_method")(capture_method.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentData]
  }
}

