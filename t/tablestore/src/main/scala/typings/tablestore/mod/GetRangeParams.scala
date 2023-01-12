package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tablestore.anon.BACKWARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.FilterParams & tablestore.tablestore.WithTransactionId & {  tableName :string,   direction :tablestore.tablestore.EnumValues<{  FORWARD :'FORWARD',   BACKWARD :'BACKWARD'}>,   inclusiveStartPrimaryKey :tablestore.tablestore.PrimaryKeyInput,   exclusiveEndPrimaryKey :tablestore.tablestore.PrimaryKeyInput,   limit :number | undefined} */
trait GetRangeParams extends StObject {
  
  var columnFilter: js.UndefOr[ColumnCondition] = js.undefined
  
  var columnsToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  var direction: EnumValues[BACKWARD]
  
  var endColumn: js.UndefOr[String] = js.undefined
  
  var exclusiveEndPrimaryKey: PrimaryKeyInput
  
  var inclusiveStartPrimaryKey: PrimaryKeyInput
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var maxVersions: js.UndefOr[Double] = js.undefined
  
  var startColumn: js.UndefOr[String] = js.undefined
  
  var tableName: String
  
  var timeRange: js.UndefOr[TimeRange] = js.undefined
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object GetRangeParams {
  
  inline def apply(
    direction: EnumValues[BACKWARD],
    exclusiveEndPrimaryKey: PrimaryKeyInput,
    inclusiveStartPrimaryKey: PrimaryKeyInput,
    tableName: String
  ): GetRangeParams = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], exclusiveEndPrimaryKey = exclusiveEndPrimaryKey.asInstanceOf[js.Any], inclusiveStartPrimaryKey = inclusiveStartPrimaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRangeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRangeParams] (val x: Self) extends AnyVal {
    
    inline def setColumnFilter(value: ColumnCondition): Self = StObject.set(x, "columnFilter", value.asInstanceOf[js.Any])
    
    inline def setColumnFilterUndefined: Self = StObject.set(x, "columnFilter", js.undefined)
    
    inline def setColumnsToGet(value: js.Array[String]): Self = StObject.set(x, "columnsToGet", value.asInstanceOf[js.Any])
    
    inline def setColumnsToGetUndefined: Self = StObject.set(x, "columnsToGet", js.undefined)
    
    inline def setColumnsToGetVarargs(value: String*): Self = StObject.set(x, "columnsToGet", js.Array(value*))
    
    inline def setDirection(value: EnumValues[BACKWARD]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: String): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setExclusiveEndPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "exclusiveEndPrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setExclusiveEndPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "exclusiveEndPrimaryKey", js.Array(value*))
    
    inline def setInclusiveStartPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "inclusiveStartPrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "inclusiveStartPrimaryKey", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxVersions(value: Double): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    inline def setStartColumn(value: String): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
