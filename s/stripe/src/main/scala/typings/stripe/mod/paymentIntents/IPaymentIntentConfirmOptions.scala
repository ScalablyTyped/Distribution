package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentConfirmOptions extends js.Object {
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled. Required if using Publishable Key!
    */
  var client_secret: js.UndefOr[String] = js.undefined
  /**
    * Set to true to indicate that the customer is not in your checkout flow during this payment attempt, and therefore is unable to authenticate. This parameter is intended for scenarios where you collect card details and charge them later.
    */
  var off_session: js.UndefOr[Boolean] = js.undefined
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach to this PaymentIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.undefined
  /**
    * The list of payment method types that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String | Null] = js.undefined
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This parameter is only used for cards and other redirect-based payment methods.
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
  var shipping: js.UndefOr[IShippingInformation | Null] = js.undefined
}

object IPaymentIntentConfirmOptions {
  @scala.inline
  def apply(
    client_secret: String = null,
    off_session: js.UndefOr[Boolean] = js.undefined,
    payment_method: String = null,
    payment_method_options: IPaymentMethodOptions = null,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType] = null,
    receipt_email: js.UndefOr[Null | String] = js.undefined,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: PaymentIntentFutureUsageType = null,
    shipping: js.UndefOr[Null | IShippingInformation] = js.undefined
  ): IPaymentIntentConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (!js.isUndefined(off_session)) __obj.updateDynamic("off_session")(off_session.get.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options.asInstanceOf[js.Any])
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types.asInstanceOf[js.Any])
    if (!js.isUndefined(receipt_email)) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.get.asInstanceOf[js.Any])
    if (setup_future_usage != null) __obj.updateDynamic("setup_future_usage")(setup_future_usage.asInstanceOf[js.Any])
    if (!js.isUndefined(shipping)) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentConfirmOptions]
  }
}

