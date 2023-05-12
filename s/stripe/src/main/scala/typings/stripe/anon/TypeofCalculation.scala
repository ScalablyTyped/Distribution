package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalculation extends StObject {
  
  val CustomerDetails: TypeofCustomerDetails
  
  val ShippingCost: TypeofShippingCostTaxBreakdown
  
  val TaxBreakdown: TypeofTaxBreakdownTaxRateDetails
}
object TypeofCalculation {
  
  inline def apply(
    CustomerDetails: TypeofCustomerDetails,
    ShippingCost: TypeofShippingCostTaxBreakdown,
    TaxBreakdown: TypeofTaxBreakdownTaxRateDetails
  ): TypeofCalculation = {
    val __obj = js.Dynamic.literal(CustomerDetails = CustomerDetails.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any], TaxBreakdown = TaxBreakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalculation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCalculation] (val x: Self) extends AnyVal {
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: TypeofShippingCostTaxBreakdown): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTaxBreakdown(value: TypeofTaxBreakdownTaxRateDetails): Self = StObject.set(x, "TaxBreakdown", value.asInstanceOf[js.Any])
  }
}
