package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.IStripeError
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.reviews.IReview
import typings.stripe.stripeStrings.automatic
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.payment_intent
import typings.stripe.stripeStrings.processing
import typings.stripe.stripeStrings.publishable
import typings.stripe.stripeStrings.requires_action
import typings.stripe.stripeStrings.requires_capture
import typings.stripe.stripeStrings.requires_confirmation
import typings.stripe.stripeStrings.requires_payment_method
import typings.stripe.stripeStrings.secret
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntent extends IResourceObject {
  
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
    * ID of the Connect application that created the PaymentIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.native
  
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null = js.native
  
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancellation_reason: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason | Null = js.native
  
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual = js.native
  
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: IList[ICharge] = js.native
  
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String = js.native
  
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: secret | publishable = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  
  /**
    * ID of the Customer this PaymentIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: IStripeError | Null = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  /**
    * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment using the provided source.
    */
  var next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl = js.native
  
  /**
    * Value is "payment_intent".
    */
  @JSName("object")
  var object_IPaymentIntent: payment_intent = js.native
  
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. See the PaymentIntents Connect usage guide for details. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  
  /**
    * ID of the payment method used in this PaymentIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.native
  
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.native
  
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[PaymentIntentPaymentMethodType] = js.native
  
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null = js.native
  
  /**
    * ID of the review associated with this PaymentIntent, if any. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.native
  
  /*
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: PaymentIntentFutureUsageType | Null = js.native
  
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.native
  
  /**
    * ID of the source used in this PaymentIntent. [Expandable]
    */
  var source: String | IStripeSource | Null = js.native
  
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null = js.native
  
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded = js.native
  
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: IPaymentIntentTransferData | Null = js.native
  
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null = js.native
}
object IPaymentIntent {
  
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: IList[ICharge],
    client_secret: String,
    confirmation_method: secret | publishable,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType],
    status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
  ): IPaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntent]
  }
  
  @scala.inline
  implicit class IPaymentIntentOps[Self <: IPaymentIntent] (val x: Self) extends AnyVal {
    
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
    def setCharges(value: IList[ICharge]): Self = this.set("charges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmation_method(value: secret | publishable): Self = this.set("confirmation_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_action(value: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl): Self = this.set("next_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: payment_intent): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_typesVarargs(value: PaymentIntentPaymentMethodType*): Self = this.set("payment_method_types", js.Array(value :_*))
    
    @scala.inline
    def setPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(
      value: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: String | IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication_fee_amount: Self = this.set("application_fee_amount", js.undefined)
    
    @scala.inline
    def setApplication_fee_amountNull: Self = this.set("application_fee_amount", null)
    
    @scala.inline
    def setCanceled_at(value: Double): Self = this.set("canceled_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled_atNull: Self = this.set("canceled_at", null)
    
    @scala.inline
    def setCancellation_reason(value: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason): Self = this.set("cancellation_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellation_reasonNull: Self = this.set("cancellation_reason", null)
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLast_payment_error(value: IStripeError): Self = this.set("last_payment_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_payment_errorNull: Self = this.set("last_payment_error", null)
    
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
    def setPayment_method_options(value: IPaymentMethodOptions): Self = this.set("payment_method_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_method_options: Self = this.set("payment_method_options", js.undefined)
    
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailNull: Self = this.set("receipt_email", null)
    
    @scala.inline
    def setReview(value: String | IReview): Self = this.set("review", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReview: Self = this.set("review", js.undefined)
    
    @scala.inline
    def setReviewNull: Self = this.set("review", null)
    
    @scala.inline
    def setSetup_future_usage(value: PaymentIntentFutureUsageType): Self = this.set("setup_future_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_future_usageNull: Self = this.set("setup_future_usage", null)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    
    @scala.inline
    def setShippingNull: Self = this.set("shipping", null)
    
    @scala.inline
    def setSource(value: String | IStripeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
    
    @scala.inline
    def setTransfer_data(value: IPaymentIntentTransferData): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_dataNull: Self = this.set("transfer_data", null)
    
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
}
