package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBody extends StObject {
  
  var item: String
  
  var itemBody: String
  
  var itemSelected: String
  
  var root: String
}
object ItemBody {
  
  inline def apply(item: String, itemBody: String, itemSelected: String, root: String): ItemBody = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemBody = itemBody.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBody] (val x: Self) extends AnyVal {
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemBody(value: String): Self = StObject.set(x, "itemBody", value.asInstanceOf[js.Any])
    
    inline def setItemSelected(value: String): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
