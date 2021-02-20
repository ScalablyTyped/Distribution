package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemTitle extends StObject {
  
  var itemTitle: String = js.native
  
  var itemValue: String = js.native
  
  var root: String = js.native
  
  var row: String = js.native
}
object ItemTitle {
  
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String, row: String): ItemTitle = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTitle]
  }
  
  @scala.inline
  implicit class ItemTitleMutableBuilder[Self <: ItemTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
