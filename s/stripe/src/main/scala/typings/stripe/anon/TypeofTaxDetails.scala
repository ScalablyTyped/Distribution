package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxDetails extends StObject {
  
  val TaxId: Any
}
object TypeofTaxDetails {
  
  inline def apply(TaxId: Any): TypeofTaxDetails = {
    val __obj = js.Dynamic.literal(TaxId = TaxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaxDetails]
  }
  
  extension [Self <: TypeofTaxDetails](x: Self) {
    
    inline def setTaxId(value: Any): Self = StObject.set(x, "TaxId", value.asInstanceOf[js.Any])
  }
}
