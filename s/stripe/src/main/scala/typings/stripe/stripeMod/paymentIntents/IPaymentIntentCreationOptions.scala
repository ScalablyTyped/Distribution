package typings.stripe.stripeMod.paymentIntents

import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentCreationOptions extends IPaymentIntentUpdateOptions {
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
    * The Stripe account ID for which these funds are intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.undefined
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  @JSName("transfer_data")
  var transfer_data_IPaymentIntentCreationOptions: js.UndefOr[IPaymentIntentTransferData] = js.undefined
}

object IPaymentIntentCreationOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    application_fee_amount: Int | Double = null,
    capture_method: automatic | manual = null,
    confirm: js.UndefOr[Boolean] = js.undefined,
    confirmation_method: automatic | manual = null,
    currency: String = null,
    customer: String = null,
    description: String = null,
    metadata: IOptionsMetadata = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    payment_method_options: IPaymentMethodOptions = null,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType] = null,
    receipt_email: String = null,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: IShippingInformation = null,
    statement_descriptor: String = null,
    statement_descriptor_suffix: String = null,
    transfer_data: IPaymentIntentTransferData = null,
    transfer_group: String = null
  ): IPaymentIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (capture_method != null) __obj.updateDynamic("capture_method")(capture_method.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm)
    if (confirmation_method != null) __obj.updateDynamic("confirmation_method")(confirmation_method.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
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
    if (statement_descriptor_suffix != null) __obj.updateDynamic("statement_descriptor_suffix")(statement_descriptor_suffix)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IPaymentIntentCreationOptions]
  }
}

