package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceItemUpdatePa extends StObject {
  
  val PriceData: Any
}
object TypeofInvoiceItemUpdatePa {
  
  inline def apply(PriceData: Any): TypeofInvoiceItemUpdatePa = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceItemUpdatePa]
  }
  
  extension [Self <: TypeofInvoiceItemUpdatePa](x: Self) {
    
    inline def setPriceData(value: Any): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
