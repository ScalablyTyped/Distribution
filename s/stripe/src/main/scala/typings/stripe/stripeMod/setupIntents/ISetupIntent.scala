package typings.stripe.stripeMod.setupIntents

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IStripeError
import typings.stripe.stripeMod.applications.IApplication
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.processing
import typings.stripe.stripeStrings.requires_action
import typings.stripe.stripeStrings.requires_confirmation
import typings.stripe.stripeStrings.requires_payment_method
import typings.stripe.stripeStrings.setup_intent
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntent extends IResourceObject {
  /**
    * ID of the Connect application that created the SetupIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.undefined
  /**
    * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    *
    * The client secret can be used to complete payment setup from your frontend. It should not
    * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
    * sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * ID of the Customer this SetupIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null
  /**
    * An arbitrary string attached to the object.
    *
    * If present, payment methods used with this SetupIntent can only be attached to
    * this Customer, and payment methods attached to other Customers cannot be used with
    * this SetupIntent.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_setup_error: IStripeError | Null
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * If present, this property tells you what actions you need to take in order for your customer to continue payment setup.
    */
  var next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl
  /**
    * Value is "setup_intent".
    */
  @JSName("object")
  var object_ISetupIntent: setup_intent
  /**
    * The account (if any) for which the setup is intended. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.undefined
  /**
    * ID of the payment method used in this SetupIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.undefined
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.undefined
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.Array[SetupIntentPaymentMethodType]
  /**
    * The several states the SetupIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded
  /**
    * Indicates how the payment method is intended to be used in the future.
    *
    * Use `on_session` if you intend to only reuse the payment method when the customer is in
    * your checkout flow. Use `off_session` if your customer may or may not be in your checkout
    * flow. If not provided, this value defaults to `off_session`.
    */
  var usage: SetupIntentUsageType
}

object ISetupIntent {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl,
    `object`: setup_intent,
    payment_method_types: js.Array[SetupIntentPaymentMethodType],
    status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded,
    usage: SetupIntentUsageType,
    application: String | IApplication = null,
    cancelation_reason: SetupIntentCancelationReason = null,
    customer: String | ICustomer = null,
    description: String = null,
    last_setup_error: IStripeError = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    payment_method_options: ISetupIntentPaymentMethodOptions = null
  ): ISetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, created = created, id = id, livemode = livemode, metadata = metadata, next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types, status = status.asInstanceOf[js.Any], usage = usage)
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (cancelation_reason != null) __obj.updateDynamic("cancelation_reason")(cancelation_reason)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (last_setup_error != null) __obj.updateDynamic("last_setup_error")(last_setup_error)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options)
    __obj.asInstanceOf[ISetupIntent]
  }
}

