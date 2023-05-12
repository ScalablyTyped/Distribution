package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPhase extends StObject {
  
  val AddInvoiceItem: TypeofAddInvoiceItem
  
  val Item: TypeofItem
}
object TypeofPhase {
  
  inline def apply(AddInvoiceItem: TypeofAddInvoiceItem, Item: TypeofItem): TypeofPhase = {
    val __obj = js.Dynamic.literal(AddInvoiceItem = AddInvoiceItem.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPhase] (val x: Self) extends AnyVal {
    
    inline def setAddInvoiceItem(value: TypeofAddInvoiceItem): Self = StObject.set(x, "AddInvoiceItem", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TypeofItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
