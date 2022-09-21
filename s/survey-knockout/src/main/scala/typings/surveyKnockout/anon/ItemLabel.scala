package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemLabel extends StObject {
  
  var item: String
  
  var itemLabel: String
  
  var itemTitle: String
  
  var itemValue: String
  
  var root: String
  
  var row: String
}
object ItemLabel {
  
  inline def apply(item: String, itemLabel: String, itemTitle: String, itemValue: String, root: String, row: String): ItemLabel = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLabel = itemLabel.asInstanceOf[js.Any], itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemLabel]
  }
  
  extension [Self <: ItemLabel](x: Self) {
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemLabel(value: String): Self = StObject.set(x, "itemLabel", value.asInstanceOf[js.Any])
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    inline def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
