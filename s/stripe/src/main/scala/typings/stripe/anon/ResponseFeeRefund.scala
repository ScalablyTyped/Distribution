package typings.stripe.anon

import typings.stripe.mod.Stripe.ApplicationFee
import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.fee_refund
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.FeeRefund> */
trait ResponseFeeRefund extends StObject {
  
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
    * ID of the application fee that was refunded.
    */
  var fee: String | ApplicationFee
  
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
  var `object`: fee_refund
}
object ResponseFeeRefund {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    fee: String | ApplicationFee,
    id: String,
    lastResponse: ApiVersion
  ): ResponseFeeRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], balance_transaction = null, metadata = null)
    __obj.updateDynamic("object")("fee_refund")
    __obj.asInstanceOf[ResponseFeeRefund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseFeeRefund] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFee(value: String | ApplicationFee): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: fee_refund): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
