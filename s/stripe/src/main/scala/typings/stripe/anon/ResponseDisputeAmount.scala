package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Issuing.Dispute.Evidence
import typings.stripe.mod.Stripe.Issuing.Dispute.Status
import typings.stripe.mod.Stripe.Issuing.Dispute.Treasury
import typings.stripe.mod.Stripe.Issuing.Transaction
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.issuingDotdispute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Issuing.Dispute> */
trait ResponseDisputeAmount extends StObject {
  
  /**
    * Disputed amount in the card's currency and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal). Usually the amount of the `transaction`, but can differ (usually because of currency fluctuation).
    */
  var amount: Double
  
  /**
    * List of balance transactions associated with the dispute.
    */
  var balance_transactions: js.Array[BalanceTransaction] | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The currency the `transaction` was made in.
    */
  var currency: String
  
  var evidence: Evidence
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
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
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: issuingDotdispute
  
  /**
    * Current status of the dispute.
    */
  var status: Status
  
  /**
    * The transaction being disputed.
    */
  var transaction: String | Transaction
  
  /**
    * [Treasury](https://stripe.com/docs/api/treasury) details related to this dispute if it was created on a [FinancialAccount](/docs/api/treasury/financial_accounts
    */
  var treasury: js.UndefOr[Treasury | Null] = js.undefined
}
object ResponseDisputeAmount {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    evidence: Evidence,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    status: Status,
    transaction: String | Transaction
  ): ResponseDisputeAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], balance_transactions = null)
    __obj.updateDynamic("object")("issuing.dispute")
    __obj.asInstanceOf[ResponseDisputeAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseDisputeAmount] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactions(value: js.Array[BalanceTransaction]): Self = StObject.set(x, "balance_transactions", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionsNull: Self = StObject.set(x, "balance_transactions", null)
    
    inline def setBalance_transactionsVarargs(value: BalanceTransaction*): Self = StObject.set(x, "balance_transactions", js.Array(value*))
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: issuingDotdispute): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTreasury(value: Treasury): Self = StObject.set(x, "treasury", value.asInstanceOf[js.Any])
    
    inline def setTreasuryNull: Self = StObject.set(x, "treasury", null)
    
    inline def setTreasuryUndefined: Self = StObject.set(x, "treasury", js.undefined)
  }
}
