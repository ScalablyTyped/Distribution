package typings.stripe.stripeMod.paymentIntentsNs

import typings.stripe.Anon_Card
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentCreationOptions extends js.Object {
  /**
    * Amount intended to be collected by this PaymentIntent (in cents).
    */
  var amount: Double
  /**
    * The amount of the application fee in cents (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: js.UndefOr[automatic | manual] = js.undefined
  /**
    * Attempt to confirm this PaymentIntent immediately. If the payment method attached is a card, a return_url must be provided in case additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use the publishable key automatic method, or the secret key manual method
    */
  var confirmation_method: js.UndefOr[automatic | manual] = js.undefined
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * ID of the customer this PaymentIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  /**
    * A set of key/value pairs that you can attach to an object. It can be
    * useful for storing additional information about the object in a structured
    * format. You can unset an individual key by setting its value to null and
    * then saving. To clear all keys, set metadata to null, then save.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * The Stripe account ID for which these funds are intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * The ID of the payment method used to pay
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[Anon_Card] = js.undefined
  /**
    * The list of payment method types that this PaymentIntent is allowed to use. If this is not provided, defaults to ["card"].
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * Set to `true` to save this PaymentIntent’s payment method to the associated Customer, if the payment method is not already attached. This parameter only applies to the payment method passed in the same request or the current payment method attached to the PaymentIntent and must be specified again if a new payment method is added.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  /*
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: js.UndefOr[PaymentIntentFutureUsageType] = js.undefined
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  var transfer_data: js.UndefOr[IPaymentIntentTransferData] = js.undefined
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}

object IPaymentIntentCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    application_fee_amount: Int | Double = null,
    capture_method: automatic | manual = null,
    confirm: js.UndefOr[Boolean] = js.undefined,
    confirmation_method: automatic | manual = null,
    customer: String = null,
    description: String = null,
    metadata: IOptionsMetadata = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    payment_method_options: Anon_Card = null,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType] = null,
    receipt_email: String = null,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: IShippingInformation = null,
    statement_descriptor: String = null,
    transfer_data: IPaymentIntentTransferData = null,
    transfer_group: String = null
  ): IPaymentIntentCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (capture_method != null) __obj.updateDynamic("capture_method")(capture_method.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm)
    if (confirmation_method != null) __obj.updateDynamic("confirmation_method")(confirmation_method.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options)
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IPaymentIntentCreationOptions]
  }
}

