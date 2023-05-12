package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalculationLineItem extends StObject {
  
  val TaxBreakdown: TypeofTaxBreakdown
}
object TypeofCalculationLineItem {
  
  inline def apply(TaxBreakdown: TypeofTaxBreakdown): TypeofCalculationLineItem = {
    val __obj = js.Dynamic.literal(TaxBreakdown = TaxBreakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalculationLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCalculationLineItem] (val x: Self) extends AnyVal {
    
    inline def setTaxBreakdown(value: TypeofTaxBreakdown): Self = StObject.set(x, "TaxBreakdown", value.asInstanceOf[js.Any])
  }
}
