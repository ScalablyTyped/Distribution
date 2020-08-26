package typings.stripeV3.stripe.setupIntents

import typings.stripeV3.stripe.Error
import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripeV3Strings.off_session
import typings.stripeV3.stripeV3Strings.on_session
import typings.stripeV3.stripeV3Strings.setup_intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupIntent extends js.Object {
  /**
    * ID of the Connect application that created the SetupIntent.
    */
  var application: String | Null = js.native
  /**
    * Reason for cancellation of this SetupIntent.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null = js.native
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    * The client secret can be used to complete payment setup from your frontend.
    * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
    * Make sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    * If present, payment methods used with this SetupIntent can only be attached
    * to this Customer, and payment methods attached to other Customers cannot be
    * used with this SetupIntent.
    */
  var customer: String | Null = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  /**
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_payment_error: Error | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be
    * useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata = js.native
  /**
    * If present, this property tells you what actions you need to take in
    * order for your customer to continue payment setup.
    */
  var next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "setup_intent".
    */
  var `object`: setup_intent = js.native
  /**
    * The account (if any) for which the setup is intended.
    */
  var on_behalf_of: String | Null = js.native
  /**
    * ID of the payment method used with this SetupIntent.
    */
  var payment_method: String | Null = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up.
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * Status of this SetupIntent
    */
  var status: SetupIntentStatus = js.native
  /**
    * Indicates how the payment method is intended to be used in the future.
    * Use on_session if you intend to only reuse the payment method
    * when the customer is in your checkout flow. Use off_session if your
    * customer may or may not be in your checkout flow. If not provided,
    * this value defaults to off_session.
    */
  var usage: on_session | off_session = js.native
}

object SetupIntent {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl,
    `object`: setup_intent,
    payment_method_types: js.Array[String],
    status: SetupIntentStatus,
    usage: on_session | off_session
  ): SetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupIntent]
  }
  @scala.inline
  implicit class SetupIntentOps[Self <: SetupIntent] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_action(value: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl): Self = this.set("next_action", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: setup_intent): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_method_typesVarargs(value: String*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[String]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: SetupIntentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: on_session | off_session): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    @scala.inline
    def setCancelation_reason(value: SetupIntentCancelationReason): Self = this.set("cancelation_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelation_reasonNull: Self = this.set("cancelation_reason", null)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLast_payment_error(value: Error): Self = this.set("last_payment_error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_payment_errorNull: Self = this.set("last_payment_error", null)
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn_behalf_ofNull: Self = this.set("on_behalf_of", null)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_methodNull: Self = this.set("payment_method", null)
  }
  
}

