package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Treasury.OutboundTransfer.DestinationPaymentMethodDetails
import typings.stripe.mod.Stripe.Treasury.OutboundTransfer.ReturnedDetails
import typings.stripe.mod.Stripe.Treasury.OutboundTransfer.Status
import typings.stripe.mod.Stripe.Treasury.OutboundTransfer.StatusTransitions
import typings.stripe.mod.Stripe.Treasury.Transaction
import typings.stripe.stripeStrings.treasuryDotoutbound_transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Treasury.OutboundTransfer> */
trait ResponseOutboundTransfer extends StObject {
  
  /**
    * Amount (in cents) transferred.
    */
  var amount: Double
  
  /**
    * Returns `true` if the object can be canceled, and `false` otherwise.
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
    * The PaymentMethod used as the payment instrument for an OutboundTransfer.
    */
  var destination_payment_method: String | Null
  
  var destination_payment_method_details: DestinationPaymentMethodDetails
  
  /**
    * The date when funds are expected to arrive in the destination account.
    */
  var expected_arrival_date: Double
  
  /**
    * The FinancialAccount that funds were pulled from.
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
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: treasuryDotoutbound_transfer
  
  /**
    * Details about a returned OutboundTransfer. Only set when the status is `returned`.
    */
  var returned_details: ReturnedDetails | Null
  
  /**
    * Information about the OutboundTransfer to be sent to the recipient account.
    */
  var statement_descriptor: String
  
  /**
    * Current status of the OutboundTransfer: `processing`, `failed`, `canceled`, `posted`, `returned`. An OutboundTransfer is `processing` if it has been created and is pending. The status changes to `posted` once the OutboundTransfer has been "confirmed" and funds have left the account, or to `failed` or `canceled`. If an OutboundTransfer fails to arrive at its destination, its status will change to `returned`.
    */
  var status: Status
  
  var status_transitions: StatusTransitions
  
  /**
    * The Transaction associated with this object.
    */
  var transaction: String | Transaction
}
object ResponseOutboundTransfer {
  
  inline def apply(
    amount: Double,
    cancelable: Boolean,
    created: Double,
    currency: String,
    destination_payment_method_details: DestinationPaymentMethodDetails,
    expected_arrival_date: Double,
    financial_account: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    statement_descriptor: String,
    status: Status,
    status_transitions: StatusTransitions,
    transaction: String | Transaction
  ): ResponseOutboundTransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination_payment_method_details = destination_payment_method_details.asInstanceOf[js.Any], expected_arrival_date = expected_arrival_date.asInstanceOf[js.Any], financial_account = financial_account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], description = null, destination_payment_method = null, hosted_regulatory_receipt_url = null, returned_details = null)
    __obj.updateDynamic("object")("treasury.outbound_transfer")
    __obj.asInstanceOf[ResponseOutboundTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseOutboundTransfer] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDestination_payment_method(value: String): Self = StObject.set(x, "destination_payment_method", value.asInstanceOf[js.Any])
    
    inline def setDestination_payment_methodNull: Self = StObject.set(x, "destination_payment_method", null)
    
    inline def setDestination_payment_method_details(value: DestinationPaymentMethodDetails): Self = StObject.set(x, "destination_payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setExpected_arrival_date(value: Double): Self = StObject.set(x, "expected_arrival_date", value.asInstanceOf[js.Any])
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_url(value: String): Self = StObject.set(x, "hosted_regulatory_receipt_url", value.asInstanceOf[js.Any])
    
    inline def setHosted_regulatory_receipt_urlNull: Self = StObject.set(x, "hosted_regulatory_receipt_url", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: treasuryDotoutbound_transfer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReturned_details(value: ReturnedDetails): Self = StObject.set(x, "returned_details", value.asInstanceOf[js.Any])
    
    inline def setReturned_detailsNull: Self = StObject.set(x, "returned_details", null)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_transitions(value: StatusTransitions): Self = StObject.set(x, "status_transitions", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String | Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
