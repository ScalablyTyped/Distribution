package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Refund
import typings.stripe.mod.Stripe.Transfer
import typings.stripe.stripeStrings.transfer_reversal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.TransferReversal> */
trait ResponseTransferReversal extends StObject {
  
  /**
    * Amount, in %s.
    */
  var amount: Double
  
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * Linked payment refund for the transfer reversal.
    */
  var destination_payment_refund: String | Refund | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: transfer_reversal
  
  /**
    * ID of the refund responsible for the transfer reversal.
    */
  var source_refund: String | Refund | Null
  
  /**
    * ID of the transfer that was reversed.
    */
  var transfer: String | Transfer
}
object ResponseTransferReversal {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    transfer: String | Transfer
  ): ResponseTransferReversal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], balance_transaction = null, destination_payment_refund = null, metadata = null, source_refund = null)
    __obj.updateDynamic("object")("transfer_reversal")
    __obj.asInstanceOf[ResponseTransferReversal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransferReversal] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDestination_payment_refund(value: String | Refund): Self = StObject.set(x, "destination_payment_refund", value.asInstanceOf[js.Any])
    
    inline def setDestination_payment_refundNull: Self = StObject.set(x, "destination_payment_refund", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: transfer_reversal): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSource_refund(value: String | Refund): Self = StObject.set(x, "source_refund", value.asInstanceOf[js.Any])
    
    inline def setSource_refundNull: Self = StObject.set(x, "source_refund", null)
    
    inline def setTransfer(value: String | Transfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
  }
}
