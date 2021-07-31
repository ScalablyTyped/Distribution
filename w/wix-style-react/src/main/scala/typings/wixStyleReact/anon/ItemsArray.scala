package typings.wixStyleReact.anon

import typings.wixStyleReact.styledNestableListMod.StyledNestableListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsArray extends StObject {
  
  var items: js.Array[StyledNestableListItem]
}
object ItemsArray {
  
  @scala.inline
  def apply(items: js.Array[StyledNestableListItem]): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  
  @scala.inline
  implicit class ItemsArrayMutableBuilder[Self <: ItemsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[StyledNestableListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: StyledNestableListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
