package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceItemCreatePa extends StObject {
  
  val PriceData: Any
}
object TypeofInvoiceItemCreatePa {
  
  inline def apply(PriceData: Any): TypeofInvoiceItemCreatePa = {
    val __obj = js.Dynamic.literal(PriceData = PriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceItemCreatePa]
  }
  
  extension [Self <: TypeofInvoiceItemCreatePa](x: Self) {
    
    inline def setPriceData(value: Any): Self = StObject.set(x, "PriceData", value.asInstanceOf[js.Any])
  }
}
