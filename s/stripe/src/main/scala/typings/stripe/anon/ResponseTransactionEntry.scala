package typings.stripe.anon

import typings.stripe.mod.Stripe.Treasury.Transaction
import typings.stripe.mod.Stripe.Treasury.TransactionEntry.BalanceImpact
import typings.stripe.mod.Stripe.Treasury.TransactionEntry.FlowDetails
import typings.stripe.mod.Stripe.Treasury.TransactionEntry.FlowType
import typings.stripe.stripeStrings.treasuryDottransaction_entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.TransactionEntry> */
trait ResponseTransactionEntry extends StObject {
  
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
    * When the TransactionEntry will impact the FinancialAccount's balance.
    */
  var effective_at: Double
  
  /**
    * The FinancialAccount associated with this object.
    */
  var financial_account: String
  
  /**
    * Token of the flow associated with the TransactionEntry.
    */
  var flow: String | Null
  
  /**
    * Details of the flow associated with the TransactionEntry.
    */
  var flow_details: FlowDetails | Null
  
  /**
    * Type of the flow associated with the TransactionEntry.
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
  var `object`: treasuryDottransaction_entry
  
  /**
    * The Transaction associated with this object.
    */
  var transaction: String | Transaction
  
  /**
    * The specific money movement that generated the TransactionEntry.
    */
  var `type`: typings.stripe.mod.Stripe.Treasury.TransactionEntry.Type
}
object ResponseTransactionEntry {
  
  inline def apply(
    balance_impact: BalanceImpact,
    created: Double,
    currency: String,
    effective_at: Double,
    financial_account: String,
    flow_type: FlowType,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    transaction: String | Transaction,
    `type`: typings.stripe.mod.Stripe.Treasury.TransactionEntry.Type
  ): ResponseTransactionEntry = {
    val __obj = js.Dynamic.literal(balance_impact = balance_impact.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], effective_at = effective_at.asInstanceOf[js.Any], financial_account = financial_account.asInstanceOf[js.Any], flow_type = flow_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], flow = null, flow_details = null)
    __obj.updateDynamic("object")("treasury.transaction_entry")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTransactionEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransactionEntry] (val x: Self) extends AnyVal {
    
    inline def setBalance_impact(value: BalanceImpact): Self = StObject.set(x, "balance_impact", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setEffective_at(value: Double): Self = StObject.set(x, "effective_at", value.asInstanceOf[js.Any])
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowNull: Self = StObject.set(x, "flow", null)
    
    inline def setFlow_details(value: FlowDetails): Self = StObject.set(x, "flow_details", value.asInstanceOf[js.Any])
    
    inline def setFlow_detailsNull: Self = StObject.set(x, "flow_details", null)
    
    inline def setFlow_type(value: FlowType): Self = StObject.set(x, "flow_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDottransaction_entry): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Treasury.TransactionEntry.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
