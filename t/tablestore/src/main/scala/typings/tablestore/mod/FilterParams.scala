package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  columnsToGet :std.Array<string>,   columnFilter :tablestore.tablestore.ColumnCondition,   timeRange :tablestore.tablestore.TimeRange,   maxVersions :number,   startColumn :string,   endColumn :string}> */
trait FilterParams extends StObject {
  
  var columnFilter: js.UndefOr[ColumnCondition] = js.undefined
  
  var columnsToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  var endColumn: js.UndefOr[String] = js.undefined
  
  var maxVersions: js.UndefOr[Double] = js.undefined
  
  var startColumn: js.UndefOr[String] = js.undefined
  
  var timeRange: js.UndefOr[TimeRange] = js.undefined
}
object FilterParams {
  
  inline def apply(): FilterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterParams] (val x: Self) extends AnyVal {
    
    inline def setColumnFilter(value: ColumnCondition): Self = StObject.set(x, "columnFilter", value.asInstanceOf[js.Any])
    
    inline def setColumnFilterUndefined: Self = StObject.set(x, "columnFilter", js.undefined)
    
    inline def setColumnsToGet(value: js.Array[String]): Self = StObject.set(x, "columnsToGet", value.asInstanceOf[js.Any])
    
    inline def setColumnsToGetUndefined: Self = StObject.set(x, "columnsToGet", js.undefined)
    
    inline def setColumnsToGetVarargs(value: String*): Self = StObject.set(x, "columnsToGet", js.Array(value*))
    
    inline def setEndColumn(value: String): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setMaxVersions(value: Double): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    inline def setStartColumn(value: String): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
  }
}
