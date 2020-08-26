package typings.stripe.mod.setupIntents

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IStripeError
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.customers.ICustomer
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

@js.native
trait ISetupIntent extends IResourceObject {
  /**
    * ID of the Connect application that created the SetupIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  /**
    * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null = js.native
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    *
    * The client secret can be used to complete payment setup from your frontend. It should not
    * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
    * sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * ID of the Customer this SetupIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  /**
    * An arbitrary string attached to the object.
    *
    * If present, payment methods used with this SetupIntent can only be attached to
    * this Customer, and payment methods attached to other Customers cannot be used with
    * this SetupIntent.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_setup_error: IStripeError | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * If present, this property tells you what actions you need to take in order for your customer to continue payment setup.
    */
  var next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "setup_intent".
    */
  @JSName("object")
  var object_ISetupIntent: setup_intent = js.native
  /**
    * The account (if any) for which the setup is intended. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  /**
    * ID of the payment method used in this SetupIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.native
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.Array[SetupIntentPaymentMethodType] = js.native
  /**
    * The several states the SetupIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded = js.native
  /**
    * Indicates how the payment method is intended to be used in the future.
    *
    * Use `on_session` if you intend to only reuse the payment method when the customer is in
    * your checkout flow. Use `off_session` if your customer may or may not be in your checkout
    * flow. If not provided, this value defaults to `off_session`.
    */
  var usage: SetupIntentUsageType = js.native
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
    usage: SetupIntentUsageType
  ): ISetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntent]
  }
  @scala.inline
  implicit class ISetupIntentOps[Self <: ISetupIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_action(value: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl): Self = this.set("next_action", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: setup_intent): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(
      value: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: SetupIntentUsageType): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: String | IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    @scala.inline
    def setCancelation_reason(value: SetupIntentCancelationReason): Self = this.set("cancelation_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelation_reasonNull: Self = this.set("cancelation_reason", null)
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLast_setup_error(value: IStripeError): Self = this.set("last_setup_error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_setup_errorNull: Self = this.set("last_setup_error", null)
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    @scala.inline
    def setOn_behalf_ofNull: Self = this.set("on_behalf_of", null)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setPayment_methodNull: Self = this.set("payment_method", null)
    @scala.inline
    def setPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = this.set("payment_method_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_options: Self = this.set("payment_method_options", js.undefined)
  }
  
}

