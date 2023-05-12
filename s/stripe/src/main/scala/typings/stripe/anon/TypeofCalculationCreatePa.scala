package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalculationCreatePa extends StObject {
  
  val CustomerDetails: TypeofCustomerDetails
  
  val LineItem: Any
  
  val ShippingCost: Any
}
object TypeofCalculationCreatePa {
  
  inline def apply(CustomerDetails: TypeofCustomerDetails, LineItem: Any, ShippingCost: Any): TypeofCalculationCreatePa = {
    val __obj = js.Dynamic.literal(CustomerDetails = CustomerDetails.asInstanceOf[js.Any], LineItem = LineItem.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalculationCreatePa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCalculationCreatePa] (val x: Self) extends AnyVal {
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setLineItem(value: Any): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: Any): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
  }
}
