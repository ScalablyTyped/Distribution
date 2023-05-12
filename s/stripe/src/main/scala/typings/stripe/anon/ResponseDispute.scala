package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.Dispute.Evidence
import typings.stripe.mod.Stripe.Dispute.EvidenceDetails
import typings.stripe.mod.Stripe.Dispute.Status
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentIntent
import typings.stripe.stripeStrings.dispute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Dispute> */
trait ResponseDispute extends StObject {
  
  /**
    * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency fluctuation or because only part of the order is disputed).
    */
  var amount: Double
  
  /**
    * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your Stripe account as a result of this dispute.
    */
  var balance_transactions: js.Array[BalanceTransaction]
  
  /**
    * ID of the charge that was disputed.
    */
  var charge: String | Charge
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  var evidence: Evidence
  
  var evidence_details: EvidenceDetails
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * If true, it is still possible to refund the disputed payment. Once the payment has been fully refunded, no further funds will be withdrawn from your Stripe account as a result of this dispute.
    */
  var is_charge_refundable: Boolean
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * Network-dependent reason code for the dispute.
    */
  var network_reason_code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: dispute
  
  /**
    * ID of the PaymentIntent that was disputed.
    */
  var payment_intent: String | PaymentIntent | Null
  
  /**
    * Reason given by cardholder for dispute. Possible values are `bank_cannot_process`, `check_returned`, `credit_not_processed`, `customer_initiated`, `debit_not_authorized`, `duplicate`, `fraudulent`, `general`, `incorrect_account_details`, `insufficient_funds`, `product_not_received`, `product_unacceptable`, `subscription_canceled`, or `unrecognized`. Read more about [dispute reasons](https://stripe.com/docs/disputes/categories).
    */
  var reason: String
  
  /**
    * Current status of dispute. Possible values are `warning_needs_response`, `warning_under_review`, `warning_closed`, `needs_response`, `under_review`, `charge_refunded`, `won`, or `lost`.
    */
  var status: Status
}
object ResponseDispute {
  
  inline def apply(
    amount: Double,
    balance_transactions: js.Array[BalanceTransaction],
    charge: String | Charge,
    created: Double,
    currency: String,
    evidence: Evidence,
    evidence_details: EvidenceDetails,
    id: String,
    is_charge_refundable: Boolean,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    reason: String,
    status: Status
  ): ResponseDispute = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transactions = balance_transactions.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], evidence_details = evidence_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_charge_refundable = is_charge_refundable.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], payment_intent = null)
    __obj.updateDynamic("object")("dispute")
    __obj.asInstanceOf[ResponseDispute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseDispute] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactions(value: js.Array[BalanceTransaction]): Self = StObject.set(x, "balance_transactions", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionsVarargs(value: BalanceTransaction*): Self = StObject.set(x, "balance_transactions", js.Array(value*))
    
    inline def setCharge(value: String | Charge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidence_details(value: EvidenceDetails): Self = StObject.set(x, "evidence_details", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_charge_refundable(value: Boolean): Self = StObject.set(x, "is_charge_refundable", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNetwork_reason_code(value: String): Self = StObject.set(x, "network_reason_code", value.asInstanceOf[js.Any])
    
    inline def setNetwork_reason_codeNull: Self = StObject.set(x, "network_reason_code", null)
    
    inline def setNetwork_reason_codeUndefined: Self = StObject.set(x, "network_reason_code", js.undefined)
    
    inline def setObject(value: dispute): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent(value: String | PaymentIntent): Self = StObject.set(x, "payment_intent", value.asInstanceOf[js.Any])
    
    inline def setPayment_intentNull: Self = StObject.set(x, "payment_intent", null)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
