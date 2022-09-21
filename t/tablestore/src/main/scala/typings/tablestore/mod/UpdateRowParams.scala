package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tablestore.anon.DELETE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.WithTransactionId & {  tableName :string,   primaryKey :tablestore.tablestore.PrimaryKeyInput,   condition :tablestore.tablestore.Condition,   updateOfAttributeColumns :std.Array<{  PUT :tablestore.tablestore.AttributesInput | undefined,   DELETE :std.Array<{[name: string] : tablestore.tablestore.int64}> | undefined,   DELETE_ALL :std.Array<string> | undefined,   INCREMENT :std.Array<{[name: string] : tablestore.tablestore.int64}> | undefined}>,   returnContent :tablestore.tablestore.ReturnContent | undefined} */
trait UpdateRowParams extends StObject {
  
  var condition: Condition
  
  var primaryKey: PrimaryKeyInput
  
  var returnContent: js.UndefOr[ReturnContent] = js.undefined
  
  var tableName: String
  
  var transactionId: js.UndefOr[String] = js.undefined
  
  var updateOfAttributeColumns: js.Array[DELETE]
}
object UpdateRowParams {
  
  inline def apply(
    condition: Condition,
    primaryKey: PrimaryKeyInput,
    tableName: String,
    updateOfAttributeColumns: js.Array[DELETE]
  ): UpdateRowParams = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], updateOfAttributeColumns = updateOfAttributeColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRowParams]
  }
  
  extension [Self <: UpdateRowParams](x: Self) {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setReturnContent(value: ReturnContent): Self = StObject.set(x, "returnContent", value.asInstanceOf[js.Any])
    
    inline def setReturnContentUndefined: Self = StObject.set(x, "returnContent", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setUpdateOfAttributeColumns(value: js.Array[DELETE]): Self = StObject.set(x, "updateOfAttributeColumns", value.asInstanceOf[js.Any])
    
    inline def setUpdateOfAttributeColumnsVarargs(value: DELETE*): Self = StObject.set(x, "updateOfAttributeColumns", js.Array(value*))
  }
}
