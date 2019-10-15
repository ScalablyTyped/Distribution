package typings.stripe.stripeMod.paymentIntents

import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.IStripeError
import typings.stripe.stripeMod.IStripeSource
import typings.stripe.stripeMod.applications.IApplication
import typings.stripe.stripeMod.charges.ICharge
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeMod.reviews.IReview
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
    application: String | IApplication = null,
    application_fee_amount: Int | Double = null,
    canceled_at: Int | Double = null,
    cancellation_reason: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason = null,
    customer: String | ICustomer = null,
    description: String = null,
    last_payment_error: IStripeError = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    payment_method_options: IPaymentMethodOptions = null,
    receipt_email: String = null,
    review: String | IReview = null,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: IShippingInformation = null,
    source: String | IStripeSource = null,
    statement_descriptor: String = null,
    transfer_data: IPaymentIntentTransferData = null,
    transfer_group: String = null
  ): IPaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount, amount_capturable = amount_capturable, amount_received = amount_received, capture_method = capture_method.asInstanceOf[js.Any], charges = charges, client_secret = client_secret, confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created, currency = currency, id = id, livemode = livemode, metadata = metadata, next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (canceled_at != null) __obj.updateDynamic("canceled_at")(canceled_at.asInstanceOf[js.Any])
    if (cancellation_reason != null) __obj.updateDynamic("cancellation_reason")(cancellation_reason.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (last_payment_error != null) __obj.updateDynamic("last_payment_error")(last_payment_error)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IPaymentIntent]
  }
}

