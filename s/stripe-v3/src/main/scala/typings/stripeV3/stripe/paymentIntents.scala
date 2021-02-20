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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentIntents {
  
  @js.native
  trait Charge extends StObject {
    
    /**
      * Amount charged in cents/pence, positive integer or zero.
      */
    var amount: Double = js.native
    
    /**
      * Amount in cents/pence refunded (can be less than the amount attribute on the
      * charge if a partial refund was issued), positive integer or zero.
      */
    var amount_refunded: Double = js.native
    
    /**
      * ID of the Connect application that created the charge.
      */
    var application: String | Null = js.native
    
    /**
      * The application fee (if any) for the charge. See the Connect documentation
      * for details.
      */
    var application_fee: String | Null = js.native
    
    /**
      * The amount of the application fee (if any) for the charge. See the Connect
      * documentation for details.
      */
    var application_fee_amount: Double | Null = js.native
    
    /**
      * ID of the balance transaction that describes the impact of this charge on
      * your account balance (not including refunds or disputes).
      */
    var balance_transaction: String = js.native
    
    /**
      * Billing information associated with the payment method at the time of the transaction.
      */
    var billing_details: BillingDetails = js.native
    
    /**
      * If the charge was created without capturing, this boolean represents whether or not it is
      * still uncaptured or has since been captured.
      */
    var captured: Boolean = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code representing the currency in which the
      * charge was made.
      */
    var currency: String = js.native
    
    /**
      * ID of the customer this charge is for if one exists.
      */
    var customer: String | Null = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: String | Null = js.native
    
    /**
      * Details about the dispute if the charge has been disputed.
      */
    var dispute: String | Null = js.native
    
    /**
      * Error code explaining reason for charge failure if available (see the errors section for a list of
      * codes: https://stripe.com/docs/api#errors).
      */
    var failure_code: String | Null = js.native
    
    /**
      * Message to user further explaining reason for charge failure if available.
      */
    var failure_message: String | Null = js.native
    
    /**
      * Hash with information on fraud assessments for the charge.
      */
    var fraud_details: Stripereport = js.native
    
    /**
      * Unique identifier for the object.
      */
    var id: String = js.native
    
    /**
      * ID of the invoice this charge is for if one exists. [Expandable]
      */
    var invoice: String | Null = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if
      * the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    var metadata: Metadata = js.native
    
    /**
      * Value is 'charge'
      */
    var `object`: charge = js.native
    
    /**
      * The Stripe account ID for which these funds are intended. Automatically
      * set if you use the destination parameter. For details, see [Creating
      * Separate Charges and Transfers]
      * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
      */
    var on_behalf_of: String | Null = js.native
    
    /**
      * ID of the order this charge is for if one exists.
      */
    var order: String | Null = js.native
    
    /**
      * Details about whether the payment was accepted, and why. See
      * understanding declines for details.
      */
    var outcome: Networkstatus | Null = js.native
    
    /**
      * true if the charge succeeded, or was successfully authorized for later capture.
      */
    var paid: Boolean = js.native
    
    /**
      * ID of the PaymentIntent associated with this charge, if one exists.
      */
    var payment_intent: String = js.native
    
    /**
      * ID of the payment method used in this charge.
      */
    var payment_method: String | Null = js.native
    
    var payment_method_details: PaymentMethodDetails = js.native
    
    /**
      * This is the email address that the receipt for this charge was sent to.
      */
    var receipt_email: String | Null = js.native
    
    /**
      * This is the transaction number that appears on email receipts sent for this charge.
      */
    var receipt_number: String | Null = js.native
    
    /**
      * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
      * latest state of the charge, including any refunds. If the charge is for an Invoice, the
      * receipt will be stylized as an Invoice receipt.
      */
    var receipt_url: String = js.native
    
    /**
      * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
      * this attribute will still be false.
      */
    var refunded: Boolean = js.native
    
    /**
      * A list of refunds that have been applied to the charge.
      */
    var refunds: List[Refund] = js.native
    
    /**
      * ID of the review associated with this charge if one exists.
      */
    var review: js.UndefOr[String | Null] = js.native
    
    /**
      * Shipping information for the charge.
      */
    var shipping: js.UndefOr[ShippingDetails | Null] = js.native
    
    /**
      * For most Stripe users, the source of every charge is a credit or debit card.
      * This hash is then the card object describing that card.
      */
    var source: js.UndefOr[Source] = js.native
    
    /**
      * The transfer ID which created this charge. Only present if the charge came
      * from another Stripe account. See the Connect documentation for details.
      */
    var source_transfer: String | Null = js.native
    
    /**
      * Extra information about a charge. This will appear on your customer’s
      * credit card statement.
      */
    var statement_descriptor: String | Null = js.native
    
    /**
      * The status of the payment is either "succeeded", "pending", or "failed".
      */
    var status: succeeded | pending | failed = js.native
    
    /**
      * ID of the transfer to the destination account (only applicable if the
      * charge was created using the destination parameter).
      */
    var transfer: js.UndefOr[String | Null] = js.native
    
    /**
      * A string that identifies this transaction as part of a group.
      * See the Connect documentation for details.
      */
    var transfer_group: js.UndefOr[String | Null] = js.native
  }
  object Charge {
    
    @scala.inline
    def apply(
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
      `object`: charge,
      paid: Boolean,
      payment_intent: String,
      payment_method_details: PaymentMethodDetails,
      receipt_url: String,
      refunded: Boolean,
      refunds: List[Refund],
      status: succeeded | pending | failed
    ): Charge = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], payment_intent = payment_intent.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Charge]
    }
    
    @scala.inline
    implicit class ChargeMutableBuilder[Self <: Charge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNull: Self = StObject.set(x, "application", null)
      
      @scala.inline
      def setApplication_fee(value: String): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_feeNull: Self = StObject.set(x, "application_fee", null)
      
      @scala.inline
      def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
      
      @scala.inline
      def setBalance_transaction(value: String): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDispute(value: String): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputeNull: Self = StObject.set(x, "dispute", null)
      
      @scala.inline
      def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
      
      @scala.inline
      def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
      
      @scala.inline
      def setFraud_details(value: Stripereport): Self = StObject.set(x, "fraud_details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceNull: Self = StObject.set(x, "invoice", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: charge): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOutcome(value: Networkstatus): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutcomeNull: Self = StObject.set(x, "outcome", null)
      
      @scala.inline
      def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_intent(value: String): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      @scala.inline
      def setPayment_method_details(value: PaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
      
      @scala.inline
      def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
      
      @scala.inline
      def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefunds(value: List[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReview(value: String): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviewNull: Self = StObject.set(x, "review", null)
      
      @scala.inline
      def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
      
      @scala.inline
      def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingNull: Self = StObject.set(x, "shipping", null)
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSource_transfer(value: String): Self = StObject.set(x, "source_transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transferNull: Self = StObject.set(x, "source_transfer", null)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      @scala.inline
      def setStatus(value: succeeded | pending | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer(value: String): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferNull: Self = StObject.set(x, "transfer", null)
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
      
      @scala.inline
      def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
    }
  }
  
  @js.native
  trait PaymentIntent extends StObject {
    
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
    implicit class PaymentIntentMutableBuilder[Self <: PaymentIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_capturable(value: Double): Self = StObject.set(x, "amount_capturable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNull: Self = StObject.set(x, "application", null)
      
      @scala.inline
      def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
      
      @scala.inline
      def setCancelation_reason(value: PaymentIntentCancelationReason): Self = StObject.set(x, "cancelation_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelation_reasonNull: Self = StObject.set(x, "cancelation_reason", null)
      
      @scala.inline
      def setCanceled_at(value: Double): Self = StObject.set(x, "canceled_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanceled_atNull: Self = StObject.set(x, "canceled_at", null)
      
      @scala.inline
      def setCapture_method(value: automatic | manual): Self = StObject.set(x, "capture_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharges(value: List[Charge]): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmation_method(value: automatic | manual): Self = StObject.set(x, "confirmation_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_payment_error(value: Error): Self = StObject.set(x, "last_payment_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_payment_errorNull: Self = StObject.set(x, "last_payment_error", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_action(value: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: payment_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      @scala.inline
      def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
      
      @scala.inline
      def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
      
      @scala.inline
      def setReview(value: String): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviewNull: Self = StObject.set(x, "review", null)
      
      @scala.inline
      def setShipping(value: ShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingNull: Self = StObject.set(x, "shipping", null)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      @scala.inline
      def setStatus(value: PaymentIntentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_data(value: Destination): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
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
    
    @scala.inline
    def abandoned: typings.stripeV3.stripeV3Strings.abandoned = "abandoned".asInstanceOf[typings.stripeV3.stripeV3Strings.abandoned]
    
    @scala.inline
    def automatic: typings.stripeV3.stripeV3Strings.automatic = "automatic".asInstanceOf[typings.stripeV3.stripeV3Strings.automatic]
    
    @scala.inline
    def duplicate: typings.stripeV3.stripeV3Strings.duplicate = "duplicate".asInstanceOf[typings.stripeV3.stripeV3Strings.duplicate]
    
    @scala.inline
    def failed_invoice: typings.stripeV3.stripeV3Strings.failed_invoice = "failed_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.failed_invoice]
    
    @scala.inline
    def fraudulent: typings.stripeV3.stripeV3Strings.fraudulent = "fraudulent".asInstanceOf[typings.stripeV3.stripeV3Strings.fraudulent]
    
    @scala.inline
    def requested_by_customer: typings.stripeV3.stripeV3Strings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripeV3.stripeV3Strings.requested_by_customer]
    
    @scala.inline
    def void_invoice: typings.stripeV3.stripeV3Strings.void_invoice = "void_invoice".asInstanceOf[typings.stripeV3.stripeV3Strings.void_invoice]
  }
  
  @js.native
  trait PaymentIntentNextActionRedirectToUrl extends StObject {
    
    /**
      * Contains instructions for authenticating a payment by
      * redirecting your customer to another page or application.
      */
    var redirect_to_url: Url = js.native
    
    /**
      * Type of the next action to perform
      */
    var `type`: redirect_to_url = js.native
  }
  object PaymentIntentNextActionRedirectToUrl {
    
    @scala.inline
    def apply(redirect_to_url: Url, `type`: redirect_to_url): PaymentIntentNextActionRedirectToUrl = {
      val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
    }
    
    @scala.inline
    implicit class PaymentIntentNextActionRedirectToUrlMutableBuilder[Self <: PaymentIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect_to_url(value: Url): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentIntentNextActionUseStripeSdk extends StObject {
    
    /**
      * Type of the next action to perform
      */
    var `type`: use_stripe_sdk = js.native
    
    /**
      * When confirming a PaymentIntent with Stripe.js,
      * Stripe.js depends on the contents of this dictionary
      * to invoke authentication flows. The shape of the contents
      * is subject to change and is only intended to be used by Stripe.js.
      */
    var use_stripe_sdk: js.Any = js.native
  }
  object PaymentIntentNextActionUseStripeSdk {
    
    @scala.inline
    def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): PaymentIntentNextActionUseStripeSdk = {
      val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentIntentNextActionUseStripeSdk]
    }
    
    @scala.inline
    implicit class PaymentIntentNextActionUseStripeSdkMutableBuilder[Self <: PaymentIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_stripe_sdk(value: js.Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def canceled: typings.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typings.stripeV3.stripeV3Strings.canceled]
    
    @scala.inline
    def processing: typings.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typings.stripeV3.stripeV3Strings.processing]
    
    @scala.inline
    def requires_action: typings.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_action]
    
    @scala.inline
    def requires_capture: typings.stripeV3.stripeV3Strings.requires_capture = "requires_capture".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_capture]
    
    @scala.inline
    def requires_confirmation: typings.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_confirmation]
    
    @scala.inline
    def requires_payment_method: typings.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_payment_method]
    
    @scala.inline
    def succeeded: typings.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typings.stripeV3.stripeV3Strings.succeeded]
  }
  
  @js.native
  trait Refund extends StObject {
    
    /**
      * Refund amount, in cents.
      */
    var amount: Double = js.native
    
    /**
      * Balance transaction that describes the impact on your account balance.
      */
    var balance_transaction: String | Null = js.native
    
    /**
      * ID of the charge that was refunded.
      */
    var charge: String = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for
      * displaying to users. (Available on non-card refunds only)
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * If the refund failed, this balance transaction describes the
      * adjustment made on your account balance that reverses the
      * initial balance transaction.
      */
    var failure_balance_transaction: js.UndefOr[String] = js.native
    
    /**
      * If the refund failed, the reason for refund failure if known
      */
    var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.native
    
    /**
      * Unique identifier for the object.
      */
    var id: String = js.native
    
    var metadata: Metadata = js.native
    
    /**
      * Value is "refund"
      */
    var `object`: refund = js.native
    
    /**
      * Reason for the refund
      */
    var reason: duplicate | fraudulent | requested_by_customer | Null = js.native
    
    /**
      * This is the transaction number that appears on email
      * receipts sent for this refund.
      */
    var receipt_number: String | Null = js.native
    
    /**
      * The transfer reversal that is associated with the refund.
      * Only present if the charge came from another Stripe account.
      * See the Connect documentation for details.
      */
    var source_transfer_reversal: String | Null = js.native
    
    /**
      * Status of the refund. For credit card refunds, this can be
      * pending, succeeded, or failed. For other types of refunds,
      * it can be pending, succeeded, failed, or canceled. Refer to
      * our refunds documentation for more details.
      */
    var status: pending | succeeded | failed | canceled = js.native
    
    /**
      * If the accompanying transfer was reversed, the transfer reversal object.
      * Only applicable if the charge was created using the destination parameter.
      */
    var transfer_reversal: String | Null = js.native
  }
  object Refund {
    
    @scala.inline
    def apply(
      amount: Double,
      charge: String,
      created: Double,
      currency: String,
      id: String,
      metadata: Metadata,
      `object`: refund,
      status: pending | succeeded | failed | canceled
    ): Refund = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Refund]
    }
    
    @scala.inline
    implicit class RefundMutableBuilder[Self <: Refund] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
      
      @scala.inline
      def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFailure_balance_transaction(value: String): Self = StObject.set(x, "failure_balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_balance_transactionUndefined: Self = StObject.set(x, "failure_balance_transaction", js.undefined)
      
      @scala.inline
      def setFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: refund): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: duplicate | fraudulent | requested_by_customer): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonNull: Self = StObject.set(x, "reason", null)
      
      @scala.inline
      def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
      
      @scala.inline
      def setSource_transfer_reversal(value: String): Self = StObject.set(x, "source_transfer_reversal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transfer_reversalNull: Self = StObject.set(x, "source_transfer_reversal", null)
      
      @scala.inline
      def setStatus(value: pending | succeeded | failed | canceled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_reversal(value: String): Self = StObject.set(x, "transfer_reversal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_reversalNull: Self = StObject.set(x, "transfer_reversal", null)
    }
  }
}
