package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOrder extends StObject {
  
  val AutomaticTax: Any
  
  val Payment: TypeofPayment
  
  val ShippingCost: Any
  
  val TaxDetails: TypeofTaxDetails
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofOrder {
  
  inline def apply(
    AutomaticTax: Any,
    Payment: TypeofPayment,
    ShippingCost: Any,
    TaxDetails: TypeofTaxDetails,
    TotalDetails: TypeofTotalDetails
  ): TypeofOrder = {
    val __obj = js.Dynamic.literal(AutomaticTax = AutomaticTax.asInstanceOf[js.Any], Payment = Payment.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any], TaxDetails = TaxDetails.asInstanceOf[js.Any], TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOrder]
  }
  
  extension [Self <: TypeofOrder](x: Self) {
    
    inline def setAutomaticTax(value: Any): Self = StObject.set(x, "AutomaticTax", value.asInstanceOf[js.Any])
    
    inline def setPayment(value: TypeofPayment): Self = StObject.set(x, "Payment", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: Any): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTaxDetails(value: TypeofTaxDetails): Self = StObject.set(x, "TaxDetails", value.asInstanceOf[js.Any])
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
