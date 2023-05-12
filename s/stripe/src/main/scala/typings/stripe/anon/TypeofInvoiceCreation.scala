package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceCreation extends StObject {
  
  val InvoiceData: TypeofInvoiceData
}
object TypeofInvoiceCreation {
  
  inline def apply(InvoiceData: TypeofInvoiceData): TypeofInvoiceCreation = {
    val __obj = js.Dynamic.literal(InvoiceData = InvoiceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceCreation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoiceCreation] (val x: Self) extends AnyVal {
    
    inline def setInvoiceData(value: TypeofInvoiceData): Self = StObject.set(x, "InvoiceData", value.asInstanceOf[js.Any])
  }
}
