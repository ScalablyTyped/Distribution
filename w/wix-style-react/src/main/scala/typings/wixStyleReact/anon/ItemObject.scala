package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemObject extends StObject {
  
  var item: js.Object
  
  var items: js.Array[js.Object]
}
object ItemObject {
  
  inline def apply(item: js.Object, items: js.Array[js.Object]): ItemObject = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemObject]
  }
  
  extension [Self <: ItemObject](x: Self) {
    
    inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
