package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTransactionCustomerDetails extends StObject {
  
  val CustomerDetails: TypeofCustomerDetails
  
  val ShippingCost: TypeofShippingCostTaxBreakdown
}
object TypeofTransactionCustomerDetails {
  
  inline def apply(CustomerDetails: TypeofCustomerDetails, ShippingCost: TypeofShippingCostTaxBreakdown): TypeofTransactionCustomerDetails = {
    val __obj = js.Dynamic.literal(CustomerDetails = CustomerDetails.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTransactionCustomerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTransactionCustomerDetails] (val x: Self) extends AnyVal {
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: TypeofShippingCostTaxBreakdown): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
  }
}
