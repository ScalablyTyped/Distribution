package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesNestableListMod.NestableListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemItems extends StObject {
  
  var item: NestableListItem
  
  var items: js.Array[NestableListItem]
}
object ItemItems {
  
  inline def apply(item: NestableListItem, items: js.Array[NestableListItem]): ItemItems = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemItems]
  }
  
  extension [Self <: ItemItems](x: Self) {
    
    inline def setItem(value: NestableListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[NestableListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: NestableListItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
