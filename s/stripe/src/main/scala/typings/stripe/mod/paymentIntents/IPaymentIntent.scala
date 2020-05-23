package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.IStripeError
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.reviews.IReview
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.payment_intent
import typings.stripe.stripeStrings.processing
import typings.stripe.stripeStrings.publishable
import typings.stripe.stripeStrings.requires_action
import typings.stripe.stripeStrings.requires_capture
import typings.stripe.stripeStrings.requires_confirmation
import typings.stripe.stripeStrings.requires_payment_method
import typings.stripe.stripeStrings.secret
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntent extends IResourceObject {
  /**
    * The amount in cents that is to be collected from this PaymentIntent.
    */
  var amount: Double
  /**
    * The amount that can be captured with from this PaymentIntent (in cents).
    */
  var amount_capturable: Double
  /**
    * The amount that was collected from this PaymentIntent (in cents).
    */
  var amount_received: Double
  /**
    * ID of the Connect application that created the PaymentIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.undefined
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancellation_reason: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason | Null
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: IList[ICharge]
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: secret | publishable
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * ID of the Customer this PaymentIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: IStripeError | Null
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment using the provided source.
    */
  var next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl
  /**
    * Value is "payment_intent".
    */
  @JSName("object")
  var object_IPaymentIntent: payment_intent
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. See the PaymentIntents Connect usage guide for details. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.undefined
  /**
    * ID of the payment method used in this PaymentIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.undefined
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.undefined
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[PaymentIntentPaymentMethodType]
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null
  /**
    * ID of the review associated with this PaymentIntent, if any. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.undefined
  /*
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: PaymentIntentFutureUsageType | Null
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.undefined
  /**
    * ID of the source used in this PaymentIntent. [Expandable]
    */
  var source: String | IStripeSource | Null
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: IPaymentIntentTransferData | Null
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null
}

object IPaymentIntent {
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: IList[ICharge],
    client_secret: String,
    confirmation_method: secret | publishable,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType],
    status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded,
    application: js.UndefOr[Null | String | IApplication] = js.undefined,
    application_fee_amount: js.UndefOr[Null | Double] = js.undefined,
    canceled_at: Double = null.asInstanceOf[Double],
    cancellation_reason: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason = null,
    customer: String | ICustomer = null,
    description: String = null,
    last_payment_error: IStripeError = null,
    on_behalf_of: js.UndefOr[Null | String] = js.undefined,
    payment_method: js.UndefOr[Null | String] = js.undefined,
    payment_method_options: IPaymentMethodOptions = null,
    receipt_email: String = null,
    review: js.UndefOr[Null | String | IReview] = js.undefined,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: js.UndefOr[Null | IShippingInformation] = js.undefined,
    source: String | IStripeSource = null,
    statement_descriptor: String = null,
    transfer_data: IPaymentIntentTransferData = null,
    transfer_group: String = null
  ): IPaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], canceled_at = canceled_at.asInstanceOf[js.Any], cancellation_reason = cancellation_reason.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], last_payment_error = last_payment_error.asInstanceOf[js.Any], receipt_email = receipt_email.asInstanceOf[js.Any], setup_future_usage = setup_future_usage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], transfer_data = transfer_data.asInstanceOf[js.Any], transfer_group = transfer_group.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(application)) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (!js.isUndefined(application_fee_amount)) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(on_behalf_of)) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (!js.isUndefined(payment_method)) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options.asInstanceOf[js.Any])
    if (!js.isUndefined(review)) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (!js.isUndefined(shipping)) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntent]
  }
}

