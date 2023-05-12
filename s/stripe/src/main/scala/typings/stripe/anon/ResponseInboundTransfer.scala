package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Treasury.InboundTransfer.FailureDetails
import typings.stripe.mod.Stripe.Treasury.InboundTransfer.LinkedFlows
import typings.stripe.mod.Stripe.Treasury.InboundTransfer.OriginPaymentMethodDetails
import typings.stripe.mod.Stripe.Treasury.InboundTransfer.Status
import typings.stripe.mod.Stripe.Treasury.InboundTransfer.StatusTransitions
import typings.stripe.mod.Stripe.Treasury.Transaction
import typings.stripe.stripeStrings.treasuryDotinbound_transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.InboundTransfer> */
trait ResponseInboundTransfer extends StObject {
  
  /**
    * Amount (in cents) transferred.
    */
  var amount: Double
  
  /**
    * Returns `true` if the InboundTransfer is able to be canceled.
    */
  var cancelable: Boolean
  
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
  var description: String | Null
  
  /**
    * Details about this InboundTransfer's failure. Only set when status is `failed`.
    */
  var failure_details: FailureDetails | Null
  
  /**
    * The FinancialAccount that received the funds.
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
  
  var linked_flows: LinkedFlows
  
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
  var `object`: treasuryDotinbound_transfer
  
  /**
    * The origin payment method to be debited for an InboundTransfer.
    */
  var origin_payment_method: String
  
  /**
    * Details about the PaymentMethod for an InboundTransfer.
    */
  var origin_payment_method_details: OriginPaymentMethodDetails | Null
  
  /**
    * Returns `true` if the funds for an InboundTransfer were returned after the InboundTransfer went to the `succeeded` state.
    */
  var returned: Boolean | Null
  
  /**
    * Statement descriptor shown when funds are debited from the source. Not all payment networks support `statement_descriptor`.
    */
  var statement_descriptor: String
  
  /**
    * Status of the InboundTransfer: `processing`, `succeeded`, `failed`, and `canceled`. An InboundTransfer is `processing` if it is created and pending. The status changes to `succeeded` once the funds have been "confirmed" and a `transaction` is created and posted. The status changes to `failed` if the transfer fails.
    */
  var status: Status
  
  var status_transitions: StatusTransitions
  
  /**
    * The Transaction associated with this object.
    */
  var transaction: String | Transaction | Null
}
object ResponseInboundTransfer {
  
  inline def apply(
    amount: Double,
    cancelable: Boolean,
    created: Double,
    currency: String,
    financial_account: String,
    id: String,
    lastResponse: ApiVersion,
    linked_flows: LinkedFlows,
    livemode: Boolean,
    metadata: Metadata,
    origin_payment_method: String,
    statement_descriptor: String,
    status: Status,
    status_transitions: StatusTransitions
  ): ResponseInboundTransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], financial_account = financial_account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], linked_flows = linked_flows.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], origin_payment_method = origin_payment_method.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], description = null, failure_details = null, hosted_regulatory_receipt_url = null, origin_payment_method_details = null, returned = null, transaction = null)
    __obj.updateDynamic("object")("treasury.inbound_transfer")
    __obj.asInstanceOf[ResponseInboundTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInboundTransfer] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setFailure_details(value: FailureDetails): Self = StObject.set(x, "failure_details", value.asInstanceOf[js.Any])
    
    inline def setFailure_detailsNull: Self = StObject.set(x, "failure_details", null)
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_url(value: String): Self = StObject.set(x, "hosted_regulatory_receipt_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_urlNull: Self = StObject.set(x, "hosted_regulatory_receipt_url", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLinked_flows(value: LinkedFlows): Self = StObject.set(x, "linked_flows", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDotinbound_transfer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOrigin_payment_method(value: String): Self = StObject.set(x, "origin_payment_method", value.asInstanceOf[js.Any])
    
    inline def setOrigin_payment_method_details(value: OriginPaymentMethodDetails): Self = StObject.set(x, "origin_payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setOrigin_payment_method_detailsNull: Self = StObject.set(x, "origin_payment_method_details", null)
    
    inline def setReturned(value: Boolean): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    inline def setReturnedNull: Self = StObject.set(x, "returned", null)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
  }
}
