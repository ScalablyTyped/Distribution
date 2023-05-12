package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxBreakdownTaxRateDetails extends StObject {
  
  val TaxRateDetails: Any
}
object TypeofTaxBreakdownTaxRateDetails {
  
  inline def apply(TaxRateDetails: Any): TypeofTaxBreakdownTaxRateDetails = {
    val __obj = js.Dynamic.literal(TaxRateDetails = TaxRateDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaxBreakdownTaxRateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTaxBreakdownTaxRateDetails] (val x: Self) extends AnyVal {
    
    inline def setTaxRateDetails(value: Any): Self = StObject.set(x, "TaxRateDetails", value.asInstanceOf[js.Any])
  }
}
