package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Treasury.Transaction.BalanceImpact
import typings.stripe.mod.Stripe.Treasury.Transaction.FlowDetails
import typings.stripe.mod.Stripe.Treasury.Transaction.FlowType
import typings.stripe.mod.Stripe.Treasury.Transaction.Status
import typings.stripe.mod.Stripe.Treasury.Transaction.StatusTransitions
import typings.stripe.mod.Stripe.Treasury.TransactionEntry
import typings.stripe.stripeStrings.treasuryDottransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.Transaction> */
trait ResponseTransactionAmount extends StObject {
  
  /**
    * Amount (in cents) transferred.
    */
  var amount: Double
  
  /**
    * Change to a FinancialAccount's balance
    */
  var balance_impact: BalanceImpact
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String
  
  /**
    * A list of TransactionEntries that are part of this Transaction. This cannot be expanded in any list endpoints.
    */
  var entries: ApiList[TransactionEntry] | Null
  
  /**
    * The FinancialAccount associated with this object.
    */
  var financial_account: String
  
  /**
    * ID of the flow that created the Transaction.
    */
  var flow: String | Null
  
  /**
    * Details of the flow that created the Transaction.
    */
  var flow_details: FlowDetails | Null
  
  /**
    * Type of the flow that created the Transaction.
    */
  var flow_type: FlowType
  
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
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDottransaction
  
  /**
    * Status of the Transaction.
    */
  var status: Status
  
  var status_transitions: StatusTransitions
}
object ResponseTransactionAmount {
  
  inline def apply(
    amount: Double,
    balance_impact: BalanceImpact,
    created: Double,
    currency: String,
    description: String,
    financial_account: String,
    flow_type: FlowType,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    status: Status,
    status_transitions: StatusTransitions
  ): ResponseTransactionAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_impact = balance_impact.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], financial_account = financial_account.asInstanceOf[js.Any], flow_type = flow_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], entries = null, flow = null, flow_details = null)
    __obj.updateDynamic("object")("treasury.transaction")
    __obj.asInstanceOf[ResponseTransactionAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransactionAmount] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_impact(value: BalanceImpact): Self = StObject.set(x, "balance_impact", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: ApiList[TransactionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowNull: Self = StObject.set(x, "flow", null)
    
    inline def setFlow_details(value: FlowDetails): Self = StObject.set(x, "flow_details", value.asInstanceOf[js.Any])
    
    inline def setFlow_detailsNull: Self = StObject.set(x, "flow_details", null)
    
    inline def setFlow_type(value: FlowType): Self = StObject.set(x, "flow_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDottransaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
  }
}
