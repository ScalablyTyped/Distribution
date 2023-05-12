package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceCreationInvoiceData extends StObject {
  
  val InvoiceData: Any
}
object TypeofInvoiceCreationInvoiceData {
  
  inline def apply(InvoiceData: Any): TypeofInvoiceCreationInvoiceData = {
    val __obj = js.Dynamic.literal(InvoiceData = InvoiceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceCreationInvoiceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoiceCreationInvoiceData] (val x: Self) extends AnyVal {
    
    inline def setInvoiceData(value: Any): Self = StObject.set(x, "InvoiceData", value.asInstanceOf[js.Any])
  }
}
