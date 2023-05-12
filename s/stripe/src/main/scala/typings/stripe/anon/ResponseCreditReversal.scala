package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Treasury.CreditReversal.Network
import typings.stripe.mod.Stripe.Treasury.CreditReversal.Status
import typings.stripe.mod.Stripe.Treasury.CreditReversal.StatusTransitions
import typings.stripe.mod.Stripe.Treasury.Transaction
import typings.stripe.stripeStrings.treasuryDotcredit_reversal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.CreditReversal> */
trait ResponseCreditReversal extends StObject {
  
  /**
    * Amount (in cents) transferred.
    */
  var amount: Double
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The FinancialAccount to reverse funds from.
    */
  var financial_account: String
  
  /**
    * A [hosted transaction receipt](https://stripe.com/docs/treasury/moving-money/regulatory-receipts) URL that is provided when money movement is considered regulated under Stripe's money transmission licenses.
    */
  var hosted_regulatory_receipt_url: String | Null
  
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
    * The rails used to reverse the funds.
    */
  var network: Network
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDotcredit_reversal
  
  /**
    * The ReceivedCredit being reversed.
    */
  var received_credit: String
  
  /**
    * Status of the CreditReversal
    */
  var status: Status
  
  var status_transitions: StatusTransitions
  
  /**
    * The Transaction associated with this object.
    */
  var transaction: String | Transaction | Null
}
object ResponseCreditReversal {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    financial_account: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    network: Network,
    received_credit: String,
    status: Status,
    status_transitions: StatusTransitions
  ): ResponseCreditReversal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], financial_account = financial_account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], received_credit = received_credit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], hosted_regulatory_receipt_url = null, transaction = null)
    __obj.updateDynamic("object")("treasury.credit_reversal")
    __obj.asInstanceOf[ResponseCreditReversal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCreditReversal] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_url(value: String): Self = StObject.set(x, "hosted_regulatory_receipt_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_urlNull: Self = StObject.set(x, "hosted_regulatory_receipt_url", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDotcredit_reversal): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReceived_credit(value: String): Self = StObject.set(x, "received_credit", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
  }
}
