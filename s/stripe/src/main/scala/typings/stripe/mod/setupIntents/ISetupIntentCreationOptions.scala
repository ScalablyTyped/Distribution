package typings.stripe.mod.setupIntents

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentCreationOptions extends js.Object {
  /**
    * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults
    * to `false`. If the payment method attached is a card, a return_url may be provided in case
    * additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    *
    * If present, payment methods used with this SetupIntent can only be attached to this
    * Customer, and payment methods attached to other Customers cannot be used with this
    * SetupIntent.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to `null` and then saving.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * The Stripe account ID for which this SetupIntent is created.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.undefined
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.undefined
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on
    * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
    * can alternatively supply an application URI scheme. This parameter can only be used with
    * `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * Indicates how the payment method is intended to be used in the future.
    *
    * Use `on_session` if you intend to only reuse the payment method when the customer is in your checkout flow. Use `off_session` if your customer may or may not be in your checkout flow. If not provided, this value defaults to `off_session`.
    */
  var usage: js.UndefOr[SetupIntentUsageType] = js.undefined
}

object ISetupIntentCreationOptions {
  @scala.inline
  def apply(
    confirm: js.UndefOr[Boolean] = js.undefined,
    customer: String = null,
    description: js.UndefOr[Null | String] = js.undefined,
    metadata: IOptionsMetadata = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    payment_method_options: ISetupIntentPaymentMethodOptions = null,
    payment_method_types: js.Array[SetupIntentPaymentMethodType] = null,
    return_url: String = null,
    usage: SetupIntentUsageType = null
  ): ISetupIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.get.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options.asInstanceOf[js.Any])
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentCreationOptions]
  }
}

