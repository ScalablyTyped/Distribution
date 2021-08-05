package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemTitle extends StObject {
  
  var itemTitle: String
  
  var itemValue: String
  
  var root: String
  
  var row: String
}
object ItemTitle {
  
  inline def apply(itemTitle: String, itemValue: String, root: String, row: String): ItemTitle = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTitle]
  }
  
  extension [Self <: ItemTitle](x: Self) {
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    inline def setItemValue(value: String): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
