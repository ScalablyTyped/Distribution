package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemColor extends StObject {
  
  var itemColor: String = js.native
  
  var itemList: js.Array[String] = js.native
}
object ItemColor {
  
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
  
  @scala.inline
  implicit class ItemColorMutableBuilder[Self <: ItemColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value :_*))
  }
}
