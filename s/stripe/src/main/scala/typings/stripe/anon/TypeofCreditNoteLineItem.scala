package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCreditNoteLineItem extends StObject {
  
  val TaxAmount: Any
}
object TypeofCreditNoteLineItem {
  
  inline def apply(TaxAmount: Any): TypeofCreditNoteLineItem = {
    val __obj = js.Dynamic.literal(TaxAmount = TaxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCreditNoteLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCreditNoteLineItem] (val x: Self) extends AnyVal {
    
    inline def setTaxAmount(value: Any): Self = StObject.set(x, "TaxAmount", value.asInstanceOf[js.Any])
  }
}
