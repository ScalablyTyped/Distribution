package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPhaseAddInvoiceItem extends StObject {
  
  val AddInvoiceItem: TypeofAddInvoiceItem
  
  val Item: TypeofItem
}
object TypeofPhaseAddInvoiceItem {
  
  inline def apply(AddInvoiceItem: TypeofAddInvoiceItem, Item: TypeofItem): TypeofPhaseAddInvoiceItem = {
    val __obj = js.Dynamic.literal(AddInvoiceItem = AddInvoiceItem.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPhaseAddInvoiceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPhaseAddInvoiceItem] (val x: Self) extends AnyVal {
    
    inline def setAddInvoiceItem(value: TypeofAddInvoiceItem): Self = StObject.set(x, "AddInvoiceItem", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TypeofItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
