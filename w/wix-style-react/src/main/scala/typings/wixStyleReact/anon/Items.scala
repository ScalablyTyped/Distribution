package typings.wixStyleReact.anon

import typings.wixStyleReact.modalSelectorLayoutMod.ModalSelectorLayoutItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var items: js.Array[ModalSelectorLayoutItem]
  
  var totalCount: Double
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[ModalSelectorLayoutItem], totalCount: Double): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ModalSelectorLayoutItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ModalSelectorLayoutItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
