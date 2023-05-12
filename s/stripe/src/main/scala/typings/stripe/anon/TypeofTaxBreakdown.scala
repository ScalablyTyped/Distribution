package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxBreakdown extends StObject {
  
  val Jurisdiction: Any
  
  val TaxRateDetails: Any
}
object TypeofTaxBreakdown {
  
  inline def apply(Jurisdiction: Any, TaxRateDetails: Any): TypeofTaxBreakdown = {
    val __obj = js.Dynamic.literal(Jurisdiction = Jurisdiction.asInstanceOf[js.Any], TaxRateDetails = TaxRateDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaxBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTaxBreakdown] (val x: Self) extends AnyVal {
    
    inline def setJurisdiction(value: Any): Self = StObject.set(x, "Jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setTaxRateDetails(value: Any): Self = StObject.set(x, "TaxRateDetails", value.asInstanceOf[js.Any])
  }
}
