package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemColor extends StObject {
  
  var itemColor: String
  
  var itemList: js.Array[String]
}
object ItemColor {
  
  inline def apply(itemColor: String, itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
  
  extension [Self <: ItemColor](x: Self) {
    
    inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    inline def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    inline def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value :_*))
  }
}
