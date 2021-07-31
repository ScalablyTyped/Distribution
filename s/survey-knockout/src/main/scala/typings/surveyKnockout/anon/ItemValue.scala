package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemValue extends StObject {
  
  var itemTitle: String
  
  var itemValue: String
  
  var root: String
}
object ItemValue {
  
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String): ItemValue = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemValue]
  }
  
  @scala.inline
  implicit class ItemValueMutableBuilder[Self <: ItemValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
