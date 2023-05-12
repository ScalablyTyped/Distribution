package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.ApplicationFee
import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Charge.AlternateStatementDescriptors
import typings.stripe.mod.Stripe.Charge.BillingDetails
import typings.stripe.mod.Stripe.Charge.FraudDetails
import typings.stripe.mod.Stripe.Charge.Level3
import typings.stripe.mod.Stripe.Charge.Outcome
import typings.stripe.mod.Stripe.Charge.PaymentMethodDetails
import typings.stripe.mod.Stripe.Charge.RadarOptions
import typings.stripe.mod.Stripe.Charge.Shipping
import typings.stripe.mod.Stripe.Charge.Status
import typings.stripe.mod.Stripe.Charge.TransferData
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.CustomerSource
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Dispute
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.mod.Stripe.Refund
import typings.stripe.mod.Stripe.Review
import typings.stripe.mod.Stripe.Transfer
import typings.stripe.stripeStrings.charge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Charge> */
trait ResponseCharge extends StObject {
  
  var alternate_statement_descriptors: js.UndefOr[AlternateStatementDescriptors] = js.undefined
  
  /**
    * Amount intended to be collected by this payment. A positive integer representing how much to charge in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
    */
  var amount: Double
  
  /**
    * Amount in %s captured (can be less than the amount attribute on the charge if a partial capture was made).
    */
  var amount_captured: Double
  
  /**
    * Amount in %s refunded (can be less than the amount attribute on the charge if a partial refund was issued).
    */
  var amount_refunded: Double
  
  /**
    * ID of the Connect application that created the charge.
    */
  var application: String | Application | Null
  
  /**
    * The application fee (if any) for the charge. [See the Connect documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees) for details.
    */
  var application_fee: String | ApplicationFee | Null
  
  /**
    * The amount of the application fee (if any) requested for the charge. [See the Connect documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees) for details.
    */
  var application_fee_amount: Double | Null
  
  /**
    * Authorization code on the charge.
    */
  var authorization_code: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the balance transaction that describes the impact of this charge on your account balance (not including refunds or disputes).
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  var billing_details: BillingDetails
  
  /**
    * The full statement descriptor that is passed to card networks, and that is displayed on your customers' credit card and bank statements. Allows you to see what the statement descriptor looks like after the static and dynamic portions are combined.
    */
  var calculated_statement_descriptor: String | Null
  
  /**
    * If the charge was created without capturing, this Boolean represents whether it is still uncaptured or has since been captured.
    */
  var captured: Boolean
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * ID of the customer this charge is for if one exists.
    */
  var customer: String | Customer | DeletedCustomer | Null
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * ID of an existing, connected Stripe account to transfer funds to if `transfer_data` was specified in the charge request.
    */
  var destination: String | Account | Null
  
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: String | Dispute | Null
  
  /**
    * Whether the charge has been disputed.
    */
  var disputed: Boolean
  
  /**
    * ID of the balance transaction that describes the reversal of the balance on your account due to payment failure.
    */
  var failure_balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Error code explaining reason for charge failure if available (see [the errors section](https://stripe.com/docs/error-codes) for a list of codes).
    */
  var failure_code: String | Null
  
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: String | Null
  
  /**
    * Information on fraud assessments for the charge.
    */
  var fraud_details: FraudDetails | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * ID of the invoice this charge is for if one exists.
    */
  var invoice: String | Invoice | Null
  
  var lastResponse: ApiVersion
  
  var level3: js.UndefOr[Level3] = js.undefined
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: charge
  
  /**
    * The account (if any) the charge was made on behalf of without triggering an automatic transfer. See the [Connect documentation](https://stripe.com/docs/connect/charges-transfers) for details.
    */
  var on_behalf_of: String | Account | Null
  
  /**
    * Details about whether the payment was accepted, and why. See [understanding declines](https://stripe.com/docs/declines) for details.
    */
  var outcome: Outcome | Null
  
  /**
    * `true` if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean
  
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: String | PaymentIntent | Null
  
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null
  
  /**
    * Details about the payment method at the time of the transaction.
    */
  var payment_method_details: PaymentMethodDetails | Null
  
  /**
    * Options to configure Radar. See [Radar Session](https://stripe.com/docs/radar/radar-session) for more information.
    */
  var radar_options: js.UndefOr[RadarOptions] = js.undefined
  
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: String | Null
  
  /**
    * This is the transaction number that appears on email receipts sent for this charge. This attribute will be `null` until a receipt has been sent.
    */
  var receipt_number: String | Null
  
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the latest state of the charge, including any refunds. If the charge is for an Invoice, the receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: String | Null
  
  /**
    * Whether the charge has been fully refunded. If the charge is only partially refunded, this attribute will still be false.
    */
  var refunded: Boolean
  
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: ApiList[Refund] | Null
  
  /**
    * ID of the review associated with this charge if one exists.
    */
  var review: String | Review | Null
  
  /**
    * Shipping information for the charge.
    */
  var shipping: Shipping | Null
  
  /**
    * This is a legacy field that will be removed in the future. It contains the Source, Card, or BankAccount object used for the charge. For details about the payment method used for this charge, refer to `payment_method` or `payment_method_details` instead.
    */
  var source: CustomerSource | Null
  
  /**
    * The transfer ID which created this charge. Only present if the charge came from another Stripe account. [See the Connect documentation](https://stripe.com/docs/connect/destination-charges) for details.
    */
  var source_transfer: String | Transfer | Null
  
  /**
    * For card charges, use `statement_descriptor_suffix` instead. Otherwise, you can use this value as the complete description of a charge on your customers' statements. Must contain at least one letter, maximum 22 characters.
    */
  var statement_descriptor: String | Null
  
  /**
    * Provides information about the charge that customers see on their statements. Concatenated with the prefix (shortened descriptor) or statement descriptor that's set on the account to form the complete statement descriptor. Maximum 22 characters for the concatenated descriptor.
    */
  var statement_descriptor_suffix: String | Null
  
  /**
    * The status of the payment is either `succeeded`, `pending`, or `failed`.
    */
  var status: Status
  
  /**
    * ID of the transfer to the `destination` account (only applicable if the charge was created using the `destination` parameter).
    */
  var transfer: js.UndefOr[String | Transfer] = js.undefined
  
  /**
    * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the Connect documentation](https://stripe.com/docs/connect/destination-charges) for details.
    */
  var transfer_data: TransferData | Null
  
  /**
    * A string that identifies this transaction as part of a group. See the [Connect documentation](https://stripe.com/docs/connect/charges-transfers#transfer-options) for details.
    */
  var transfer_group: String | Null
}
object ResponseCharge {
  
  inline def apply(
    amount: Double,
    amount_captured: Double,
    amount_refunded: Double,
    billing_details: BillingDetails,
    captured: Boolean,
    created: Double,
    currency: String,
    disputed: Boolean,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    paid: Boolean,
    refunded: Boolean,
    status: Status
  ): ResponseCharge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_captured = amount_captured.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], disputed = disputed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], application = null, application_fee = null, application_fee_amount = null, balance_transaction = null, calculated_statement_descriptor = null, customer = null, description = null, destination = null, dispute = null, failure_balance_transaction = null, failure_code = null, failure_message = null, fraud_details = null, invoice = null, on_behalf_of = null, outcome = null, payment_intent = null, payment_method = null, payment_method_details = null, receipt_email = null, receipt_number = null, receipt_url = null, refunds = null, review = null, shipping = null, source = null, source_transfer = null, statement_descriptor = null, statement_descriptor_suffix = null, transfer_data = null, transfer_group = null)
    __obj.updateDynamic("object")("charge")
    __obj.asInstanceOf[ResponseCharge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCharge] (val x: Self) extends AnyVal {
    
    inline def setAlternate_statement_descriptors(value: AlternateStatementDescriptors): Self = StObject.set(x, "alternate_statement_descriptors", value.asInstanceOf[js.Any])
    
    inline def setAlternate_statement_descriptorsUndefined: Self = StObject.set(x, "alternate_statement_descriptors", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_captured(value: Double): Self = StObject.set(x, "amount_captured", value.asInstanceOf[js.Any])
    
    inline def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setApplication_fee(value: String | ApplicationFee): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
    
    inline def setApplication_feeNull: Self = StObject.set(x, "application_fee", null)
    
    inline def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    inline def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    inline def setAuthorization_code(value: String): Self = StObject.set(x, "authorization_code", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_codeUndefined: Self = StObject.set(x, "authorization_code", js.undefined)
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setCalculated_statement_descriptor(value: String): Self = StObject.set(x, "calculated_statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setCalculated_statement_descriptorNull: Self = StObject.set(x, "calculated_statement_descriptor", null)
    
    inline def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDestination(value: String | Account): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDispute(value: String | Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    inline def setDisputeNull: Self = StObject.set(x, "dispute", null)
    
    inline def setDisputed(value: Boolean): Self = StObject.set(x, "disputed", value.asInstanceOf[js.Any])
    
    inline def setFailure_balance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "failure_balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setFailure_balance_transactionNull: Self = StObject.set(x, "failure_balance_transaction", null)
    
    inline def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
    
    inline def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
    
    inline def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
    
    inline def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
    
    inline def setFraud_details(value: FraudDetails): Self = StObject.set(x, "fraud_details", value.asInstanceOf[js.Any])
    
    inline def setFraud_detailsNull: Self = StObject.set(x, "fraud_details", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLevel3(value: Level3): Self = StObject.set(x, "level3", value.asInstanceOf[js.Any])
    
    inline def setLevel3Undefined: Self = StObject.set(x, "level3", js.undefined)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: charge): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String | Account): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setOutcome(value: Outcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentNull: Self = StObject.set(x, "payment_intent", null)
    
    inline def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
    
    inline def setPayment_method_details(value: PaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_detailsNull: Self = StObject.set(x, "payment_method_details", null)
    
    inline def setRadar_options(value: RadarOptions): Self = StObject.set(x, "radar_options", value.asInstanceOf[js.Any])
    
    inline def setRadar_optionsUndefined: Self = StObject.set(x, "radar_options", js.undefined)
    
    inline def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    inline def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
    
    inline def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
    
    inline def setReceipt_numberNull: Self = StObject.set(x, "receipt_number", null)
    
    inline def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
    
    inline def setReceipt_urlNull: Self = StObject.set(x, "receipt_url", null)
    
    inline def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
    
    inline def setRefunds(value: ApiList[Refund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsNull: Self = StObject.set(x, "refunds", null)
    
    inline def setReview(value: String | Review): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setReviewNull: Self = StObject.set(x, "review", null)
    
    inline def setShipping(value: Shipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingNull: Self = StObject.set(x, "shipping", null)
    
    inline def setSource(value: CustomerSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSource_transfer(value: String | Transfer): Self = StObject.set(x, "source_transfer", value.asInstanceOf[js.Any])
    
    inline def setSource_transferNull: Self = StObject.set(x, "source_transfer", null)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatement_descriptor_suffix(value: String): Self = StObject.set(x, "statement_descriptor_suffix", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptor_suffixNull: Self = StObject.set(x, "statement_descriptor_suffix", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: String | Transfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTransfer_data(value: TransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    inline def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
    
    inline def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    inline def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
  }
}
