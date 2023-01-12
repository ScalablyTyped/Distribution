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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoiceSettings] (val x: Self) extends AnyVal {
    
    inline def setRenderingOptions(value: Any): Self = StObject.set(x, "RenderingOptions", value.asInstanceOf[js.Any])
  }
}
