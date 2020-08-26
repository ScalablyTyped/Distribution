package typings.stripeV3.stripe.paymentIntents

import typings.stripeV3.anon.Destination
import typings.stripeV3.stripe.Error
import typings.stripeV3.stripe.List
import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripe.ShippingDetails
import typings.stripeV3.stripeV3Strings.automatic
import typings.stripeV3.stripeV3Strings.manual
import typings.stripeV3.stripeV3Strings.payment_intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntent extends js.Object {
  /**
    * The amount in cents that is to be collected from this PaymentIntent.
    */
  var amount: Double = js.native
  /**
    * The amount that can be captured with from this PaymentIntent (in cents).
    */
  var amount_capturable: Double = js.native
  /**
    * The amount that was collected from this PaymentIntent (in cents).
    */
  var amount_received: Double = js.native
  /**
    * ID of the Connect application that created the PaymentIntent.
    */
  var application: String | Null = js.native
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: Double | Null = js.native
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancelation_reason: PaymentIntentCancelationReason | Null = js.native
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null = js.native
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual = js.native
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: List[Charge] = js.native
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String = js.native
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: automatic | manual = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * ID of the Customer this PaymentIntent is for if one exists.
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
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: Error | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false
    * if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var metadata: Metadata = js.native
  /**
    * If present, this property tells you what actions you need to take in order
    * for your customer to fulfill a payment using the provided source.
    */
  var next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "payment_intent".
    */
  var `object`: payment_intent = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended.
    * See the PaymentIntents Connect usage guide for details.
    */
  var on_behalf_of: String | Null = js.native
  /**
    * ID of the payment method used in this PaymentIntent.
    */
  var payment_method: String | Null = js.native
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null = js.native
  /**
    * ID of the review associated with this PaymentIntent, if any.
    */
  var review: String | Null = js.native
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: ShippingDetails | Null = js.native
  /**
    * The ID of a Source (e.g. 'src_abc123' or 'card_abc123').
    * Will be null unless this PaymentIntent was created with a source
    * instead of a payment_method. (Undocumented as of August 2019)
    */
  var source: String | Null = js.native
  /**
    * Extra information about a PaymentIntent. This will appear on your
    * customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: PaymentIntentStatus = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: Destination | Null = js.native
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null = js.native
}

object PaymentIntent {
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: List[Charge],
    client_secret: String,
    confirmation_method: automatic | manual,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[String],
    status: PaymentIntentStatus
  ): PaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntent]
  }
  @scala.inline
  implicit class PaymentIntentOps[Self <: PaymentIntent] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_capturable(value: Double): Self = this.set("amount_capturable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_received(value: Double): Self = this.set("amount_received", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapture_method(value: automatic | manual): Self = this.set("capture_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharges(value: List[Charge]): Self = this.set("charges", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmation_method(value: automatic | manual): Self = this.set("confirmation_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_action(value: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl): Self = this.set("next_action", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: payment_intent): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_method_typesVarargs(value: String*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[String]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PaymentIntentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication_fee_amountNull: Self = this.set("application_fee_amount", null)
    @scala.inline
    def setCancelation_reason(value: PaymentIntentCancelationReason): Self = this.set("cancelation_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelation_reasonNull: Self = this.set("cancelation_reason", null)
    @scala.inline
    def setCanceled_at(value: Double): Self = this.set("canceled_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanceled_atNull: Self = this.set("canceled_at", null)
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
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_emailNull: Self = this.set("receipt_email", null)
    @scala.inline
    def setReview(value: String): Self = this.set("review", value.asInstanceOf[js.Any])
    @scala.inline
    def setReviewNull: Self = this.set("review", null)
    @scala.inline
    def setShipping(value: ShippingDetails): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippingNull: Self = this.set("shipping", null)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
    @scala.inline
    def setTransfer_data(value: Destination): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer_dataNull: Self = this.set("transfer_data", null)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
  
}

