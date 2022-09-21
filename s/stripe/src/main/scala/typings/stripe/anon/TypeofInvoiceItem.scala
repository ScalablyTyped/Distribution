package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceItem extends StObject {
  
  val PriceData: Any
}
object TypeofInvoiceItem {
  
  inline def apply(PriceData: Any): TypeofInvoiceItem = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceItem]
  }
  
  extension [Self <: TypeofInvoiceItem](x: Self) {
    
    inline def setPriceData(value: Any): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
