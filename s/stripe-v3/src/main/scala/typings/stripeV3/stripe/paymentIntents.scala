package typings.stripeV3.stripe

import typings.stripeV3.anon.Destination
import typings.stripeV3.anon.Networkstatus
import typings.stripeV3.anon.Stripereport
import typings.stripeV3.anon.Url
import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import typings.stripeV3.stripeV3Strings.automatic
import typings.stripeV3.stripeV3Strings.canceled
import typings.stripeV3.stripeV3Strings.charge
import typings.stripeV3.stripeV3Strings.duplicate
import typings.stripeV3.stripeV3Strings.expired_or_canceled_card
import typings.stripeV3.stripeV3Strings.failed
import typings.stripeV3.stripeV3Strings.fraudulent
import typings.stripeV3.stripeV3Strings.lost_or_stolen_card
import typings.stripeV3.stripeV3Strings.manual
import typings.stripeV3.stripeV3Strings.payment_intent
import typings.stripeV3.stripeV3Strings.pending
import typings.stripeV3.stripeV3Strings.redirect_to_url
import typings.stripeV3.stripeV3Strings.refund
import typings.stripeV3.stripeV3Strings.requested_by_customer
import typings.stripeV3.stripeV3Strings.succeeded
import typings.stripeV3.stripeV3Strings.unknown_
import typings.stripeV3.stripeV3Strings.use_stripe_sdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentIntents {
  
  trait Charge extends StObject {
    
    /**
      * Amount charged in cents/pence, positive integer or zero.
      */
    var amount: Double
    
    /**
      * Amount in cents/pence refunded (can be less than the amount attribute on the
      * charge if a partial refund was issued), positive integer or zero.
      */
    var amount_refunded: Double
    
    /**
      * ID of the Connect application that created the charge.
      */
    var application: String | Null
    
    /**
      * The application fee (if any) for the charge. See the Connect documentation
      * for details.
      */
    var application_fee: String | Null
    
    /**
      * The amount of the application fee (if any) for the charge. See the Connect
      * documentation for details.
      */
    var application_fee_amount: Double | Null
    
    /**
      * ID of the balance transaction that describes the impact of this charge on
      * your account balance (not including refunds or disputes).
      */
    var balance_transaction: String
    
    /**
      * Billing information associated with the payment method at the time of the transaction.
      */
    var billing_details: BillingDetails
    
    /**
      * If the charge was created without capturing, this boolean represents whether or not it is
      * still uncaptured or has since been captured.
      */
    var captured: Boolean
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code representing the currency in which the
      * charge was made.
      */
    var currency: String
    
    /**
      * ID of the customer this charge is for if one exists.
      */
    var customer: String | Null
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: String | Null
    
    /**
      * Details about the dispute if the charge has been disputed.
      */
    var dispute: String | Null
    
    /**
      * Error code explaining reason for charge failure if available (see the errors section for a list of
      * codes: https://stripe.com/docs/api#errors).
      */
    var failure_code: String | Null
    
    /**
      * Message to user further explaining reason for charge failure if available.
      */
    var failure_message: String | Null
    
    /**
      * Hash with information on fraud assessments for the charge.
      */
    var fraud_details: Stripereport
    
    /**
      * Unique identifier for the object.
      */
    var id: String
    
    /**
      * ID of the invoice this charge is for if one exists. [Expandable]
      */
    var invoice: String | Null
    
    /**
      * Has the value true if the object exists in live mode or the value false if
      * the object exists in test mode.
      */
    var livemode: Boolean
    
    var metadata: Metadata
    
    /**
      * Value is 'charge'
      */
    var `object`: charge
    
    /**
      * The Stripe account ID for which these funds are intended. Automatically
      * set if you use the destination parameter. For details, see [Creating
      * Separate Charges and Transfers]
      * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
      */
    var on_behalf_of: String | Null
    
    /**
      * ID of the order this charge is for if one exists.
      */
    var order: String | Null
    
    /**
      * Details about whether the payment was accepted, and why. See
      * understanding declines for details.
      */
    var outcome: Networkstatus | Null
    
    /**
      * true if the charge succeeded, or was successfully authorized for later capture.
      */
    var paid: Boolean
    
    /**
      * ID of the PaymentIntent associated with this charge, if one exists.
      */
    var payment_intent: String
    
    /**
      * ID of the payment method used in this charge.
      */
    var payment_method: String | Null
    
    var payment_method_details: PaymentMethodDetails
    
    /**
      * This is the email address that the receipt for this charge was sent to.
      */
    var receipt_email: String | Null
    
    /**
      * This is the transaction number that appears on email receipts sent for this charge.
      */
    var receipt_number: String | Null
    
    /**
      * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
      * latest state of the charge, including any refunds. If the charge is for an Invoice, the
      * receipt will be stylized as an Invoice receipt.
      */
    var receipt_url: String
    
    /**
      * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
      * this attribute will still be false.
      */
    var refunded: Boolean
    
    /**
      * A list of refunds that have been applied to the charge.
      */
    var refunds: typings.stripeV3.stripe.List[Refund]
    
    /**
      * ID of the review associated with this charge if one exists.
      */
    var review: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Shipping information for the charge.
      */
    var shipping: js.UndefOr[ShippingDetails | Null] = js.undefined
    
    /**
      * For most Stripe users, the source of every charge is a credit or debit card.
      * This hash is then the card object describing that card.
      */
    var source: js.UndefOr[Source] = js.undefined
    
    /**
      * The transfer ID which created this charge. Only present if the charge came
      * from another Stripe account. See the Connect documentation for details.
      */
    var source_transfer: String | Null
    
    /**
      * Extra information about a charge. This will appear on your customer’s
      * credit card statement.
      */
    var statement_descriptor: String | Null
    
    /**
      * The status of the payment is either "succeeded", "pending", or "failed".
      */
    var status: succeeded | pending | failed
    
    /**
      * ID of the transfer to the destination account (only applicable if the
      * charge was created using the destination parameter).
      */
    var transfer: js.UndefOr[String | Null] = js.undefined
    
    /**
      * A string that identifies this transaction as part of a group.
      * See the Connect documentation for details.
      */
    var transfer_group: js.UndefOr[String | Null] = js.undefined
  }
  object Charge {
    
    inline def apply(
      amount: Double,
      amount_refunded: Double,
      balance_transaction: String,
      billing_details: BillingDetails,
      captured: Boolean,
      created: Double,
      currency: String,
      fraud_details: Stripereport,
      id: String,
      livemode: Boolean,
      metadata: Metadata,
      paid: Boolean,
      payment_intent: String,
      payment_method_details: PaymentMethodDetails,
      receipt_url: String,
      refunded: Boolean,
      refunds: typings.stripeV3.stripe.List[Refund],
      status: succeeded | pending | failed
    ): Charge = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], payment_intent = payment_intent.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], application = null, application_fee = null, application_fee_amount = null, customer = null, description = null, dispute = null, failure_code = null, failure_message = null, invoice = null, on_behalf_of = null, order = null, outcome = null, payment_method = null, receipt_email = null, receipt_number = null, source_transfer = null, statement_descriptor = null)
      __obj.updateDynamic("object")("charge")
      __obj.asInstanceOf[Charge]
    }
    
    extension [Self <: Charge](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationNull: Self = StObject.set(x, "application", null)
      
      inline def setApplication_fee(value: String): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      inline def setApplication_feeNull: Self = StObject.set(x, "application_fee", null)
      
      inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
      
      inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
      
      inline def setBalance_transaction(value: String): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
      
      inline def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDispute(value: String): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
      
      inline def setDisputeNull: Self = StObject.set(x, "dispute", null)
      
      inline def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
      
      inline def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
      
      inline def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
      
      inline def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
      
      inline def setFraud_details(value: Stripereport): Self = StObject.set(x, "fraud_details", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: charge): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOutcome(value: Networkstatus): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
      
      inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
      
      inline def setPayment_intent(value: String): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
      
      inline def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      inline def setPayment_method_details(value: PaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
      
      inline def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
      
      inline def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
      
      inline def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
      
      inline def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
      
      inline def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
      
      inline def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
      
      inline def setRefunds(value: typings.stripeV3.stripe.List[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
      
      inline def setReview(value: String): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      inline def setReviewNull: Self = StObject.set(x, "review", null)
      
      inline def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
      
      inline def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingNull: Self = StObject.set(x, "shipping", null)
      
      inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSource_transfer(value: String): Self = StObject.set(x, "source_transfer", value.asInstanceOf[js.Any])
      
      inline def setSource_transferNull: Self = StObject.set(x, "source_transfer", null)
      
      inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      inline def setStatus(value: succeeded | pending | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransfer(value: String): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferNull: Self = StObject.set(x, "transfer", null)
      
      inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
      
      inline def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      inline def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
      
      inline def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
    }
  }
  
  trait PaymentIntent extends StObject {
    
    /**
      * The amount in cents that is to be collected from this PaymentIntent.
      */
    var amount: Double
    
    /**
      * The amount that can be captured with from this PaymentIntent (in cents).
      */
    var amount_capturable: Double
    
    /**
      * The amount that was collected from this PaymentIntent (in cents).
      */
    var amount_received: Double
    
    /**
      * ID of the Connect application that created the PaymentIntent.
      */
    var application: String | Null
    
    /**
      * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
      */
    var application_fee_amount: Double | Null
    
    /**
      * User-given reason for cancellation of this PaymentIntent.
      */
    var cancelation_reason: PaymentIntentCancelationReason | Null
    
    /**
      * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
      * Measured in seconds since the Unix epoch.
      */
    var canceled_at: Double | Null
    
    /**
      * Capture method of this PaymentIntent.
      */
    var capture_method: automatic | manual
    
    /**
      * Charges that were created by this PaymentIntent, if any.
      */
    var charges: typings.stripeV3.stripe.List[Charge]
    
    /**
      * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
      */
    var client_secret: String
    
    /**
      * Confirmation method of this PaymentIntent.
      */
    var confirmation_method: automatic | manual
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String
    
    /**
      * ID of the Customer this PaymentIntent is for if one exists.
      */
    var customer: String | Null
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier for the object.
      */
    var id: String
    
    /**
      * The payment error encountered in the previous PaymentIntent confirmation.
      */
    var last_payment_error: Error | Null
    
    /**
      * Has the value true if the object exists in live mode or the value false
      * if the object exists in test mode.
      */
    var livemode: Boolean
    
    var metadata: Metadata
    
    /**
      * If present, this property tells you what actions you need to take in order
      * for your customer to fulfill a payment using the provided source.
      */
    var next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl
    
    /**
      * Value is "payment_intent".
      */
    var `object`: payment_intent
    
    /**
      * The account (if any) for which the funds of the PaymentIntent are intended.
      * See the PaymentIntents Connect usage guide for details.
      */
    var on_behalf_of: String | Null
    
    /**
      * ID of the payment method used in this PaymentIntent.
      */
    var payment_method: String | Null
    
    /**
      * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
      */
    var payment_method_types: js.Array[String]
    
    /**
      * Email address that the receipt for the resulting payment will be sent to.
      */
    var receipt_email: String | Null
    
    /**
      * ID of the review associated with this PaymentIntent, if any.
      */
    var review: String | Null
    
    /**
      * Shipping information for this PaymentIntent.
      */
    var shipping: ShippingDetails | Null
    
    /**
      * The ID of a Source (e.g. 'src_abc123' or 'card_abc123').
      * Will be null unless this PaymentIntent was created with a source
      * instead of a payment_method. (Undocumented as of August 2019)
      */
    var source: String | Null
    
    /**
      * Extra information about a PaymentIntent. This will appear on your
      * customer’s statement when this PaymentIntent succeeds in creating a charge.
      */
    var statement_descriptor: String | Null
    
    /**
      * The several states the PaymentIntent goes through until it it either canceled or succeeds.
      */
    var status: PaymentIntentStatus
    
    /**
      * The data with which to automatically create a Transfer when the payment is finalized.
      */
    var transfer_data: Destination | Null
    
    /**
      * A string that identifies the resulting payment as part of a group.
      */
    var transfer_group: String | Null
  }
  object PaymentIntent {
    
    inline def apply(
      amount: Double,
      amount_capturable: Double,
      amount_received: Double,
      capture_method: automatic | manual,
      charges: typings.stripeV3.stripe.List[Charge],
      client_secret: String,
      confirmation_method: automatic | manual,
      created: Double,
      currency: String,
      id: String,
      livemode: Boolean,
      metadata: Metadata,
      next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl,
      payment_method_types: js.Array[String],
      status: PaymentIntentStatus
    ): PaymentIntent = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], application = null, application_fee_amount = null, cancelation_reason = null, canceled_at = null, customer = null, last_payment_error = null, on_behalf_of = null, payment_method = null, receipt_email = null, review = null, shipping = null, source = null, statement_descriptor = null, transfer_data = null, transfer_group = null)
      __obj.updateDynamic("object")("payment_intent")
      __obj.asInstanceOf[PaymentIntent]
    }
    
    extension [Self <: PaymentIntent](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmount_capturable(value: Double): Self = StObject.set(x, "amount_capturable", value.asInstanceOf[js.Any])
      
      inline def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationNull: Self = StObject.set(x, "application", null)
      
      inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
      
      inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
      
      inline def setCancelation_reason(value: PaymentIntentCancelationReason): Self = StObject.set(x, "cancelation_reason", value.asInstanceOf[js.Any])
      
      inline def setCancelation_reasonNull: Self = StObject.set(x, "cancelation_reason", null)
      
      inline def setCanceled_at(value: Double): Self = StObject.set(x, "canceled_at", value.asInstanceOf[js.Any])
      
      inline def setCanceled_atNull: Self = StObject.set(x, "canceled_at", null)
      
      inline def setCapture_method(value: automatic | manual): Self = StObject.set(x, "capture_method", value.asInstanceOf[js.Any])
      
      inline def setCharges(value: typings.stripeV3.stripe.List[Charge]): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setConfirmation_method(value: automatic | manual): Self = StObject.set(x, "confirmation_method", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_payment_error(value: Error): Self = StObject.set(x, "last_payment_error", value.asInstanceOf[js.Any])
      
      inline def setLast_payment_errorNull: Self = StObject.set(x, "last_payment_error", null)
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setNext_action(value: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
      
      inline def setObject(value: payment_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      inline def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      inline def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      inline def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value*))
      
      inline def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
      
      inline def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
      
      inline def setReview(value: String): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      inline def setReviewNull: Self = StObject.set(x, "review", null)
      
      inline def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingNull: Self = StObject.set(x, "shipping", null)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      inline def setStatus(value: PaymentIntentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransfer_data(value: Destination): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
      
      inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
      
      inline def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      inline def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.duplicate
    - typings.stripeV3.stripeV3Strings.fraudulent
    - typings.stripeV3.stripeV3Strings.requested_by_customer
    - typings.stripeV3.stripeV3Strings.abandoned
    - typings.stripeV3.stripeV3Strings.failed_invoice
    - typings.stripeV3.stripeV3Strings.void_invoice
    - typings.stripeV3.stripeV3Strings.automatic
  */
  trait PaymentIntentCancelationReason extends StObject
  object PaymentIntentCancelationReason {
    
    inline def abandoned: typings.stripeV3.stripeV3Strings.abandoned = "abandoned".asInstanceOf[typings.stripeV3.stripeV3Strings.abandoned]
    
    inline def automatic: typings.stripeV3.stripeV3Strings.automatic = "automatic".asInstanceOf[typings.stripeV3.stripeV3Strings.automatic]
    
    inline def duplicate: typings.stripeV3.stripeV3Strings.duplicate = "duplicate".asInstanceOf[typings.stripeV3.stripeV3Strings.duplicate]
    
    inline def failed_invoice: typings.stripeV3.stripeV3Strings.failed_invoice = "failed_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.failed_invoice]
    
    inline def fraudulent: typings.stripeV3.stripeV3Strings.fraudulent = "fraudulent".asInstanceOf[typings.stripeV3.stripeV3Strings.fraudulent]
    
    inline def requested_by_customer: typings.stripeV3.stripeV3Strings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripeV3.stripeV3Strings.requested_by_customer]
    
    inline def void_invoice: typings.stripeV3.stripeV3Strings.void_invoice = "void_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.void_invoice]
  }
  
  trait PaymentIntentNextActionRedirectToUrl extends StObject {
    
    /**
      * Contains instructions for authenticating a payment by
      * redirecting your customer to another page or application.
      */
    var redirect_to_url: Url
    
    /**
      * Type of the next action to perform
      */
    var `type`: redirect_to_url
  }
  object PaymentIntentNextActionRedirectToUrl {
    
    inline def apply(redirect_to_url: Url): PaymentIntentNextActionRedirectToUrl = {
      val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("redirect_to_url")
      __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
    }
    
    extension [Self <: PaymentIntentNextActionRedirectToUrl](x: Self) {
      
      inline def setRedirect_to_url(value: Url): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentIntentNextActionUseStripeSdk extends StObject {
    
    /**
      * Type of the next action to perform
      */
    var `type`: use_stripe_sdk
    
    /**
      * When confirming a PaymentIntent with Stripe.js,
      * Stripe.js depends on the contents of this dictionary
      * to invoke authentication flows. The shape of the contents
      * is subject to change and is only intended to be used by Stripe.js.
      */
    var use_stripe_sdk: Any
  }
  object PaymentIntentNextActionUseStripeSdk {
    
    inline def apply(use_stripe_sdk: Any): PaymentIntentNextActionUseStripeSdk = {
      val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("use_stripe_sdk")
      __obj.asInstanceOf[PaymentIntentNextActionUseStripeSdk]
    }
    
    extension [Self <: PaymentIntentNextActionUseStripeSdk](x: Self) {
      
      inline def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUse_stripe_sdk(value: Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.requires_payment_method
    - typings.stripeV3.stripeV3Strings.requires_confirmation
    - typings.stripeV3.stripeV3Strings.requires_action
    - typings.stripeV3.stripeV3Strings.processing
    - typings.stripeV3.stripeV3Strings.requires_capture
    - typings.stripeV3.stripeV3Strings.canceled
    - typings.stripeV3.stripeV3Strings.succeeded
  */
  trait PaymentIntentStatus extends StObject
  object PaymentIntentStatus {
    
    inline def canceled: typings.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typings.stripeV3.stripeV3Strings.canceled]
    
    inline def processing: typings.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typings.stripeV3.stripeV3Strings.processing]
    
    inline def requires_action: typings.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_action]
    
    inline def requires_capture: typings.stripeV3.stripeV3Strings.requires_capture = "requires_capture".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_capture]
    
    inline def requires_confirmation: typings.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_confirmation]
    
    inline def requires_payment_method: typings.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_payment_method]
    
    inline def succeeded: typings.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typings.stripeV3.stripeV3Strings.succeeded]
  }
  
  trait Refund extends StObject {
    
    /**
      * Refund amount, in cents.
      */
    var amount: Double
    
    /**
      * Balance transaction that describes the impact on your account balance.
      */
    var balance_transaction: String | Null
    
    /**
      * ID of the charge that was refunded.
      */
    var charge: String
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String
    
    /**
      * An arbitrary string attached to the object. Often useful for
      * displaying to users. (Available on non-card refunds only)
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * If the refund failed, this balance transaction describes the
      * adjustment made on your account balance that reverses the
      * initial balance transaction.
      */
    var failure_balance_transaction: js.UndefOr[String] = js.undefined
    
    /**
      * If the refund failed, the reason for refund failure if known
      */
    var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.undefined
    
    /**
      * Unique identifier for the object.
      */
    var id: String
    
    var metadata: Metadata
    
    /**
      * Value is "refund"
      */
    var `object`: refund
    
    /**
      * Reason for the refund
      */
    var reason: duplicate | fraudulent | requested_by_customer | Null
    
    /**
      * This is the transaction number that appears on email
      * receipts sent for this refund.
      */
    var receipt_number: String | Null
    
    /**
      * The transfer reversal that is associated with the refund.
      * Only present if the charge came from another Stripe account.
      * See the Connect documentation for details.
      */
    var source_transfer_reversal: String | Null
    
    /**
      * Status of the refund. For credit card refunds, this can be
      * pending, succeeded, or failed. For other types of refunds,
      * it can be pending, succeeded, failed, or canceled. Refer to
      * our refunds documentation for more details.
      */
    var status: pending | succeeded | failed | canceled
    
    /**
      * If the accompanying transfer was reversed, the transfer reversal object.
      * Only applicable if the charge was created using the destination parameter.
      */
    var transfer_reversal: String | Null
  }
  object Refund {
    
    inline def apply(
      amount: Double,
      charge: String,
      created: Double,
      currency: String,
      id: String,
      metadata: Metadata,
      status: pending | succeeded | failed | canceled
    ): Refund = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], balance_transaction = null, reason = null, receipt_number = null, source_transfer_reversal = null, transfer_reversal = null)
      __obj.updateDynamic("object")("refund")
      __obj.asInstanceOf[Refund]
    }
    
    extension [Self <: Refund](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBalance_transaction(value: String): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
      
      inline def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFailure_balance_transaction(value: String): Self = StObject.set(x, "failure_balance_transaction", value.asInstanceOf[js.Any])
      
      inline def setFailure_balance_transactionUndefined: Self = StObject.set(x, "failure_balance_transaction", js.undefined)
      
      inline def setFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      inline def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: refund): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setReason(value: duplicate | fraudulent | requested_by_customer): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonNull: Self = StObject.set(x, "reason", null)
      
      inline def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
      
      inline def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
      
      inline def setSource_transfer_reversal(value: String): Self = StObject.set(x, "source_transfer_reversal", value.asInstanceOf[js.Any])
      
      inline def setSource_transfer_reversalNull: Self = StObject.set(x, "source_transfer_reversal", null)
      
      inline def setStatus(value: pending | succeeded | failed | canceled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransfer_reversal(value: String): Self = StObject.set(x, "transfer_reversal", value.asInstanceOf[js.Any])
      
      inline def setTransfer_reversalNull: Self = StObject.set(x, "transfer_reversal", null)
    }
  }
}
