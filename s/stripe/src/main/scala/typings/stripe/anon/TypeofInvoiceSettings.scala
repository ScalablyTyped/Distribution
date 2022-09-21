package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceSettings extends StObject {
  
  val RenderingOptions: Any
}
object TypeofInvoiceSettings {
  
  inline def apply(RenderingOptions: Any): TypeofInvoiceSettings = {
    val __obj = js.Dynamic.literal(RenderingOptions = RenderingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceSettings]
  }
  
  extension [Self <: TypeofInvoiceSettings](x: Self) {
    
    inline def setRenderingOptions(value: Any): Self = StObject.set(x, "RenderingOptions", value.asInstanceOf[js.Any])
  }
}
