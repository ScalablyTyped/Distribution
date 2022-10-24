package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColNum extends StObject {
  
  var colNum: Any
  
  var column: Any
  
  var rowData: Any
}
object ColNum {
  
  inline def apply(colNum: Any, column: Any, rowData: Any): ColNum = {
    val __obj = js.Dynamic.literal(colNum = colNum.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColNum]
  }
  
  extension [Self <: ColNum](x: Self) {
    
    inline def setColNum(value: Any): Self = StObject.set(x, "colNum", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
