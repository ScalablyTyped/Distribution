package typings.tablestore.anon

import typings.tablestore.mod.CellValue
import typings.tablestore.mod.int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnName extends StObject {
  
  var columnName: String
  
  var columnValue: CellValue
  
  var timestamp: int64 | Double
}
object ColumnName {
  
  inline def apply(columnName: String, timestamp: int64 | Double): ColumnName = {
    val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], columnValue = null)
    __obj.asInstanceOf[ColumnName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnName] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnValue(value: CellValue): Self = StObject.set(x, "columnValue", value.asInstanceOf[js.Any])
    
    inline def setColumnValueNull: Self = StObject.set(x, "columnValue", null)
    
    inline def setTimestamp(value: int64 | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
