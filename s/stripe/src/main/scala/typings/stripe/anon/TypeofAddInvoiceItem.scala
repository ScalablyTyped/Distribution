package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAddInvoiceItem extends StObject {
  
  val PriceData: Any
}
object TypeofAddInvoiceItem {
  
  inline def apply(PriceData: Any): TypeofAddInvoiceItem = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAddInvoiceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAddInvoiceItem] (val x: Self) extends AnyVal {
    
    inline def setPriceData(value: Any): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
