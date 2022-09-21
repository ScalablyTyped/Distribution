package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceLineItem extends StObject {
  
  val ProrationDetails: Any
}
object TypeofInvoiceLineItem {
  
  inline def apply(ProrationDetails: Any): TypeofInvoiceLineItem = {
    val __obj = js.Dynamic.literal(ProrationDetails = ProrationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceLineItem]
  }
  
  extension [Self <: TypeofInvoiceLineItem](x: Self) {
    
    inline def setProrationDetails(value: Any): Self = StObject.set(x, "ProrationDetails", value.asInstanceOf[js.Any])
  }
}
