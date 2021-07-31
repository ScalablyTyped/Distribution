package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  var cell: String
  
  var item: String
  
  var itemTitle: String
  
  var root: String
  
  var row: String
}
object Row {
  
  @scala.inline
  def apply(cell: String, item: String, itemTitle: String, root: String, row: String): Row = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemTitle = itemTitle.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitle(value: String): Self = StObject.set(x, "itemTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
