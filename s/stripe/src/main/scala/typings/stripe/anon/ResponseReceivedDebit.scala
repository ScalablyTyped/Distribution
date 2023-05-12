package typings.stripe.anon

import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.FailureCode
import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.InitiatingPaymentMethodDetails
import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.LinkedFlows
import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.Network
import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.ReversalDetails
import typings.stripe.mod.Stripe.Treasury.ReceivedDebit.Status
import typings.stripe.mod.Stripe.Treasury.Transaction
import typings.stripe.stripeStrings.treasuryDotreceived_debit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.ReceivedDebit> */
trait ResponseReceivedDebit extends StObject {
  
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
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String
  
  /**
    * Reason for the failure. A ReceivedDebit might fail because the FinancialAccount doesn't have sufficient funds, is closed, or is frozen.
    */
  var failure_code: FailureCode | Null
  
  /**
    * The FinancialAccount that funds were pulled from.
    */
  var financial_account: String | Null
  
  /**
    * A [hosted transaction receipt](https://stripe.com/docs/treasury/moving-money/regulatory-receipts) URL that is provided when money movement is considered regulated under Stripe's money transmission licenses.
    */
  var hosted_regulatory_receipt_url: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var initiating_payment_method_details: js.UndefOr[InitiatingPaymentMethodDetails] = js.undefined
  
  var lastResponse: ApiVersion
  
  var linked_flows: LinkedFlows
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The network used for the ReceivedDebit.
    */
  var network: Network
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDotreceived_debit
  
  /**
    * Details describing when a ReceivedDebit might be reversed.
    */
  var reversal_details: ReversalDetails | Null
  
  /**
    * Status of the ReceivedDebit. ReceivedDebits are created with a status of either `succeeded` (approved) or `failed` (declined). The failure reason can be found under the `failure_code`.
    */
  var status: Status
  
  /**
    * The Transaction associated with this object.
    */
  var transaction: String | Transaction | Null
}
object ResponseReceivedDebit {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    description: String,
    id: String,
    lastResponse: ApiVersion,
    linked_flows: LinkedFlows,
    livemode: Boolean,
    network: Network,
    status: Status
  ): ResponseReceivedDebit = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], linked_flows = linked_flows.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], failure_code = null, financial_account = null, hosted_regulatory_receipt_url = null, reversal_details = null, transaction = null)
    __obj.updateDynamic("object")("treasury.received_debit")
    __obj.asInstanceOf[ResponseReceivedDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReceivedDebit] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFailure_code(value: FailureCode): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
    
    inline def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setFinancial_accountNull: Self = StObject.set(x, "financial_account", null)
    
    inline def setHosted_regulatory_receipt_url(value: String): Self = StObject.set(x, "hosted_regulatory_receipt_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_urlNull: Self = StObject.set(x, "hosted_regulatory_receipt_url", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitiating_payment_method_details(value: InitiatingPaymentMethodDetails): Self = StObject.set(x, "initiating_payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setInitiating_payment_method_detailsUndefined: Self = StObject.set(x, "initiating_payment_method_details", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLinked_flows(value: LinkedFlows): Self = StObject.set(x, "linked_flows", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDotreceived_debit): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReversal_details(value: ReversalDetails): Self = StObject.set(x, "reversal_details", value.asInstanceOf[js.Any])
    
    inline def setReversal_detailsNull: Self = StObject.set(x, "reversal_details", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
  }
}
