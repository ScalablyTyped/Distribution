package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Tax.Transaction.CustomerDetails
import typings.stripe.mod.Stripe.Tax.Transaction.Reversal
import typings.stripe.mod.Stripe.Tax.Transaction.ShippingCost
import typings.stripe.mod.Stripe.Tax.TransactionLineItem
import typings.stripe.stripeStrings.taxDottransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Tax.Transaction> */
trait ResponseTransactionCreated extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The ID of an existing [Customer](https://stripe.com/docs/api/customers/object) used for the resource.
    */
  var customer: String | Null
  
  var customer_details: CustomerDetails
  
  /**
    * Unique identifier for the transaction.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * The tax collected or refunded, by line item.
    */
  var line_items: ApiList[TransactionLineItem] | Null
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: taxDottransaction
  
  /**
    * A custom unique identifier, such as 'myOrder_123'.
    */
  var reference: String
  
  /**
    * If `type=reversal`, contains information about what was reversed.
    */
  var reversal: Reversal | Null
  
  /**
    * The shipping cost details for the transaction.
    */
  var shipping_cost: ShippingCost | Null
  
  /**
    * Timestamp of date at which the tax rules and rates in effect applies for the calculation.
    */
  var tax_date: Double
  
  /**
    * If `reversal`, this transaction reverses an earlier transaction.
    */
  var `type`: typings.stripe.mod.Stripe.Tax.Transaction.Type
}
object ResponseTransactionCreated {
  
  inline def apply(
    created: Double,
    currency: String,
    customer_details: CustomerDetails,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    reference: String,
    tax_date: Double,
    `type`: typings.stripe.mod.Stripe.Tax.Transaction.Type
  ): ResponseTransactionCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer_details = customer_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], tax_date = tax_date.asInstanceOf[js.Any], customer = null, line_items = null, metadata = null, reversal = null, shipping_cost = null)
    __obj.updateDynamic("object")("tax.transaction")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTransactionCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransactionCreated] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomer_details(value: CustomerDetails): Self = StObject.set(x, "customer_details", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: ApiList[TransactionLineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsNull: Self = StObject.set(x, "line_items", null)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: taxDottransaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReversal(value: Reversal): Self = StObject.set(x, "reversal", value.asInstanceOf[js.Any])
    
    inline def setReversalNull: Self = StObject.set(x, "reversal", null)
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setTax_date(value: Double): Self = StObject.set(x, "tax_date", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Tax.Transaction.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
