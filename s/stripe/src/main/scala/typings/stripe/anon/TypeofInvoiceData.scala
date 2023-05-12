package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceData extends StObject {
  
  val RenderingOptions: Any
}
object TypeofInvoiceData {
  
  inline def apply(RenderingOptions: Any): TypeofInvoiceData = {
    val __obj = js.Dynamic.literal(RenderingOptions = RenderingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoiceData] (val x: Self) extends AnyVal {
    
    inline def setRenderingOptions(value: Any): Self = StObject.set(x, "RenderingOptions", value.asInstanceOf[js.Any])
  }
}
