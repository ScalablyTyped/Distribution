package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var colNum: Any
  
  var column: Any
  
  var isDragOverlay: Any
  
  var maskingClassNames: Any
  
  var rowData: Any
  
  var rowNum: Any
}
object Column {
  
  inline def apply(colNum: Any, column: Any, isDragOverlay: Any, maskingClassNames: Any, rowData: Any, rowNum: Any): Column = {
    val __obj = js.Dynamic.literal(colNum = colNum.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], isDragOverlay = isDragOverlay.asInstanceOf[js.Any], maskingClassNames = maskingClassNames.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColNum(value: Any): Self = StObject.set(x, "colNum", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setIsDragOverlay(value: Any): Self = StObject.set(x, "isDragOverlay", value.asInstanceOf[js.Any])
    
    inline def setMaskingClassNames(value: Any): Self = StObject.set(x, "maskingClassNames", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowNum(value: Any): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
  }
}
