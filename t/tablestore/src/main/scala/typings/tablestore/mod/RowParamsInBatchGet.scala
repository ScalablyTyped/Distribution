package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.FilterParams & {  tableName :string,   primaryKey :std.Array<tablestore.tablestore.PrimaryKeyInput>} */
trait RowParamsInBatchGet extends StObject {
  
  var columnFilter: js.UndefOr[ColumnCondition] = js.undefined
  
  var columnsToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  var endColumn: js.UndefOr[String] = js.undefined
  
  var maxVersions: js.UndefOr[Double] = js.undefined
  
  var primaryKey: js.Array[PrimaryKeyInput]
  
  var startColumn: js.UndefOr[String] = js.undefined
  
  var tableName: String
  
  var timeRange: js.UndefOr[TimeRange] = js.undefined
}
object RowParamsInBatchGet {
  
  inline def apply(primaryKey: js.Array[PrimaryKeyInput], tableName: String): RowParamsInBatchGet = {
    val __obj = js.Dynamic.literal(primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowParamsInBatchGet]
  }
  
  extension [Self <: RowParamsInBatchGet](x: Self) {
    
    inline def setColumnFilter(value: ColumnCondition): Self = StObject.set(x, "columnFilter", value.asInstanceOf[js.Any])
    
    inline def setColumnFilterUndefined: Self = StObject.set(x, "columnFilter", js.undefined)
    
    inline def setColumnsToGet(value: js.Array[String]): Self = StObject.set(x, "columnsToGet", value.asInstanceOf[js.Any])
    
    inline def setColumnsToGetUndefined: Self = StObject.set(x, "columnsToGet", js.undefined)
    
    inline def setColumnsToGetVarargs(value: String*): Self = StObject.set(x, "columnsToGet", js.Array(value*))
    
    inline def setEndColumn(value: String): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setMaxVersions(value: Double): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    inline def setPrimaryKey(value: js.Array[PrimaryKeyInput]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: PrimaryKeyInput*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setStartColumn(value: String): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
  }
}
