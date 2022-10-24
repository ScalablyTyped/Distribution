package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowData extends StObject {
  
  var isDragOverlay: Boolean
  
  var rowData: Any
  
  var rowNum: Double
}
object RowData {
  
  inline def apply(isDragOverlay: Boolean, rowData: Any, rowNum: Double): RowData = {
    val __obj = js.Dynamic.literal(isDragOverlay = isDragOverlay.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
  
  extension [Self <: RowData](x: Self) {
    
    inline def setIsDragOverlay(value: Boolean): Self = StObject.set(x, "isDragOverlay", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowNum(value: Double): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
  }
}
