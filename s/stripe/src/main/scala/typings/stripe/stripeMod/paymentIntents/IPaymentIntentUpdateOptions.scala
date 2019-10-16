package typings.stripe.stripeMod.paymentIntents

import typings.stripe.Anon_AmountNumber
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentUpdateOptions extends js.Object {
  /**
    * Amount intended to be collected by this PaymentIntent (in cents).
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The amount of the application fee in cents (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: js.UndefOr[String] = js.undefined
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
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach to this PaymentIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * The list of payment method types that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * Set to `true` to save this PaymentIntent’s payment method to the associated Customer, if the payment method is not already attached. This parameter only applies to the payment method passed in the same request or the current payment method attached to the PaymentIntent and must be specified again if a new payment method is added.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  /**
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
    * Provides information about a card payment that customers see on their statements. Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on the account to form the complete statement descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String] = js.undefined
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  var transfer_data: js.UndefOr[Anon_AmountNumber] = js.undefined
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}

object IPaymentIntentUpdateOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    application_fee_amount: Int | Double = null,
    currency: String = null,
    customer: String = null,
    description: String = null,
    metadata: IOptionsMetadata = null,
    payment_method: String = null,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType] = null,
    receipt_email: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: IShippingInformation = null,
    statement_descriptor: String = null,
    statement_descriptor_suffix: String = null,
    transfer_data: Anon_AmountNumber = null,
    transfer_group: String = null
  ): IPaymentIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (statement_descriptor_suffix != null) __obj.updateDynamic("statement_descriptor_suffix")(statement_descriptor_suffix)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IPaymentIntentUpdateOptions]
  }
}

