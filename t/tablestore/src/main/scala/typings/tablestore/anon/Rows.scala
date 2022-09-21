package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  var rows: js.Array[AttributeColumns | Condition | PrimaryKey]
  
  var tableName: String
}
object Rows {
  
  inline def apply(rows: js.Array[AttributeColumns | Condition | PrimaryKey], tableName: String): Rows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setRows(value: js.Array[AttributeColumns | Condition | PrimaryKey]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: (AttributeColumns | Condition | PrimaryKey)*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
