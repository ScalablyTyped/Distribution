package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemTitle extends StObject {
  
  var cell: String
  
  var item: String
  
  var itemLabel: String
  
  var itemTitle: String
  
  var root: String
  
  var row: String
}
object ItemTitle {
  
  inline def apply(cell: String, item: String, itemLabel: String, itemTitle: String, root: String, row: String): ItemTitle = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemLabel = itemLabel.asInstanceOf[js.Any], itemTitle = itemTitle.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTitle]
  }
  
  extension [Self <: ItemTitle](x: Self) {
    
    inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemLabel(value: String): Self = StObject.set(x, "itemLabel", value.asInstanceOf[js.Any])
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
