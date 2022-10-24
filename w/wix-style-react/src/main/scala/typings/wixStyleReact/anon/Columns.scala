package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.Array[scala.Nothing]
  
  var dragging: Boolean
  
  var groupName: String
  
  var hoveredColumnIndex: Null
  
  var sortableListBaseItems: js.Array[scala.Nothing]
}
object Columns {
  
  inline def apply(
    columns: js.Array[scala.Nothing],
    dragging: Boolean,
    groupName: String,
    hoveredColumnIndex: Null,
    sortableListBaseItems: js.Array[scala.Nothing]
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hoveredColumnIndex = hoveredColumnIndex.asInstanceOf[js.Any], sortableListBaseItems = sortableListBaseItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[scala.Nothing]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: scala.Nothing*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setHoveredColumnIndex(value: Null): Self = StObject.set(x, "hoveredColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setSortableListBaseItems(value: js.Array[scala.Nothing]): Self = StObject.set(x, "sortableListBaseItems", value.asInstanceOf[js.Any])
    
    inline def setSortableListBaseItemsVarargs(value: scala.Nothing*): Self = StObject.set(x, "sortableListBaseItems", js.Array(value*))
  }
}
