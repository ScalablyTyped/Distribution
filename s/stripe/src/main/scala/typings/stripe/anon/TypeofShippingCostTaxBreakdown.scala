package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofShippingCostTaxBreakdown extends StObject {
  
  val TaxBreakdown: TypeofTaxBreakdown
}
object TypeofShippingCostTaxBreakdown {
  
  inline def apply(TaxBreakdown: TypeofTaxBreakdown): TypeofShippingCostTaxBreakdown = {
    val __obj = js.Dynamic.literal(TaxBreakdown = TaxBreakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShippingCostTaxBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofShippingCostTaxBreakdown] (val x: Self) extends AnyVal {
    
    inline def setTaxBreakdown(value: TypeofTaxBreakdown): Self = StObject.set(x, "TaxBreakdown", value.asInstanceOf[js.Any])
  }
}
