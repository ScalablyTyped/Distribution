package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Tax.Calculation.CustomerDetails
import typings.stripe.mod.Stripe.Tax.Calculation.ShippingCost
import typings.stripe.mod.Stripe.Tax.Calculation.TaxBreakdown
import typings.stripe.mod.Stripe.Tax.CalculationLineItem
import typings.stripe.stripeStrings.taxDotcalculation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Tax.Calculation> */
trait ResponseCalculation extends StObject {
  
  /**
    * Total after taxes.
    */
  var amount_total: Double
  
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
    * Timestamp of date at which the tax calculation will expire.
    */
  var expires_at: Double | Null
  
  /**
    * Unique identifier for the calculation.
    */
  var id: String | Null
  
  var lastResponse: ApiVersion
  
  /**
    * The list of items the customer is purchasing.
    */
  var line_items: ApiList[CalculationLineItem] | Null
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: taxDotcalculation
  
  /**
    * The shipping cost details for the calculation.
    */
  var shipping_cost: ShippingCost | Null
  
  /**
    * The amount of tax to be collected on top of the line item prices.
    */
  var tax_amount_exclusive: Double
  
  /**
    * The amount of tax already included in the line item prices.
    */
  var tax_amount_inclusive: Double
  
  /**
    * Breakdown of individual tax amounts that add up to the total.
    */
  var tax_breakdown: js.Array[TaxBreakdown]
  
  /**
    * Timestamp of date at which the tax rules and rates in effect applies for the calculation.
    */
  var tax_date: Double
}
object ResponseCalculation {
  
  inline def apply(
    amount_total: Double,
    currency: String,
    customer_details: CustomerDetails,
    lastResponse: ApiVersion,
    livemode: Boolean,
    tax_amount_exclusive: Double,
    tax_amount_inclusive: Double,
    tax_breakdown: js.Array[TaxBreakdown],
    tax_date: Double
  ): ResponseCalculation = {
    val __obj = js.Dynamic.literal(amount_total = amount_total.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer_details = customer_details.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], tax_amount_exclusive = tax_amount_exclusive.asInstanceOf[js.Any], tax_amount_inclusive = tax_amount_inclusive.asInstanceOf[js.Any], tax_breakdown = tax_breakdown.asInstanceOf[js.Any], tax_date = tax_date.asInstanceOf[js.Any], customer = null, expires_at = null, id = null, line_items = null, shipping_cost = null)
    __obj.updateDynamic("object")("tax.calculation")
    __obj.asInstanceOf[ResponseCalculation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCalculation] (val x: Self) extends AnyVal {
    
    inline def setAmount_total(value: Double): Self = StObject.set(x, "amount_total", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomer_details(value: CustomerDetails): Self = StObject.set(x, "customer_details", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLine_items(value: ApiList[CalculationLineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
    
    inline def setLine_itemsNull: Self = StObject.set(x, "line_items", null)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: taxDotcalculation): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setTax_amount_exclusive(value: Double): Self = StObject.set(x, "tax_amount_exclusive", value.asInstanceOf[js.Any])
    
    inline def setTax_amount_inclusive(value: Double): Self = StObject.set(x, "tax_amount_inclusive", value.asInstanceOf[js.Any])
    
    inline def setTax_breakdown(value: js.Array[TaxBreakdown]): Self = StObject.set(x, "tax_breakdown", value.asInstanceOf[js.Any])
    
    inline def setTax_breakdownVarargs(value: TaxBreakdown*): Self = StObject.set(x, "tax_breakdown", js.Array(value*))
    
    inline def setTax_date(value: Double): Self = StObject.set(x, "tax_date", value.asInstanceOf[js.Any])
  }
}
