package typings
package stripeLib.stripeMod.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntent
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * The amount in cents that is to be collected from this PaymentIntent.
    */
  var amount: scala.Double
  /**
    * The amount that can be captured with from this PaymentIntent (in cents).
    */
  var amount_capturable: scala.Double
  /**
    * The amount that was collected from this PaymentIntent (in cents).
    */
  var amount_received: scala.Double
  /**
    * ID of the Connect application that created the PaymentIntent. [Expandable]
    */
  var application: js.UndefOr[java.lang.String | stripeLib.stripeMod.applicationsNs.IApplication | scala.Null] = js.undefined
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancelation_reason: PaymentIntentCancelationReason | scala.Null
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: scala.Double | scala.Null
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: stripeLib.stripeLibStrings.automatic | stripeLib.stripeLibStrings.manual
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge]
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: java.lang.String
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: stripeLib.stripeLibStrings.secret | stripeLib.stripeLibStrings.publishable
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: java.lang.String
  /**
    * ID of the Customer this PaymentIntent is for if one exists. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer | scala.Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: stripeLib.stripeMod.IStripeError | scala.Null
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment using the provided source.
    */
  var next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl
  /**
    * Value is "payment_intent".
    */
  @JSName("object")
  var object_IPaymentIntent: stripeLib.stripeLibStrings.payment_intent
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. See the PaymentIntents Connect usage guide for details. [Expandable]
    */
  var on_behalf_of: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[java.lang.String]
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: java.lang.String | scala.Null
  /**
    * ID of the review associated with this PaymentIntent, if any. [Expandable]
    */
  var review: js.UndefOr[java.lang.String | stripeLib.stripeMod.reviewsNs.IReview | scala.Null] = js.undefined
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[stripeLib.stripeMod.IShippingInformation | scala.Null] = js.undefined
  /**
    * ID of the source used in this PaymentIntent. [Expandable]
    */
  var source: java.lang.String | stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.bankAccountsNs.IBankAccount
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: java.lang.String | scala.Null
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: stripeLib.stripeLibStrings.requires_payment_method | stripeLib.stripeLibStrings.requires_action | stripeLib.stripeLibStrings.processing | stripeLib.stripeLibStrings.requires_authorization | stripeLib.stripeLibStrings.requires_capture | stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.succeeded
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: IPaymentIntentTransferData | scala.Null
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: java.lang.String | scala.Null
}

object IPaymentIntent {
  @scala.inline
  def apply(
    amount: scala.Double,
    amount_capturable: scala.Double,
    amount_received: scala.Double,
    capture_method: stripeLib.stripeLibStrings.automatic | stripeLib.stripeLibStrings.manual,
    charges: stripeLib.stripeMod.IList[stripeLib.stripeMod.chargesNs.ICharge],
    client_secret: java.lang.String,
    confirmation_method: stripeLib.stripeLibStrings.secret | stripeLib.stripeLibStrings.publishable,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl,
    `object`: stripeLib.stripeLibStrings.payment_intent,
    payment_method_types: js.Array[java.lang.String],
    source: java.lang.String | stripeLib.stripeMod.cardsNs.ICard | stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.bankAccountsNs.IBankAccount,
    status: stripeLib.stripeLibStrings.requires_payment_method | stripeLib.stripeLibStrings.requires_action | stripeLib.stripeLibStrings.processing | stripeLib.stripeLibStrings.requires_authorization | stripeLib.stripeLibStrings.requires_capture | stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.succeeded,
    application: java.lang.String | stripeLib.stripeMod.applicationsNs.IApplication = null,
    application_fee_amount: scala.Int | scala.Double = null,
    cancelation_reason: PaymentIntentCancelationReason = null,
    canceled_at: scala.Int | scala.Double = null,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer = null,
    description: java.lang.String = null,
    last_payment_error: stripeLib.stripeMod.IStripeError = null,
    on_behalf_of: java.lang.String = null,
    receipt_email: java.lang.String = null,
    review: java.lang.String | stripeLib.stripeMod.reviewsNs.IReview = null,
    shipping: stripeLib.stripeMod.IShippingInformation = null,
    statement_descriptor: java.lang.String = null,
    transfer_data: IPaymentIntentTransferData = null,
    transfer_group: java.lang.String = null
  ): IPaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount, amount_capturable = amount_capturable, amount_received = amount_received, capture_method = capture_method.asInstanceOf[js.Any], charges = charges, client_secret = client_secret, confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created, currency = currency, id = id, livemode = livemode, metadata = metadata, next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types, source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (cancelation_reason != null) __obj.updateDynamic("cancelation_reason")(cancelation_reason)
    if (canceled_at != null) __obj.updateDynamic("canceled_at")(canceled_at.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (last_payment_error != null) __obj.updateDynamic("last_payment_error")(last_payment_error)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IPaymentIntent]
  }
}

