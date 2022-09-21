package typings.tablestore.mod

import typings.tablestore.anon.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.WithTransactionId & {  tables :std.Array<{  tableName :string,   rows :std.Array<{  type :'UPDATE',   condition :tablestore.tablestore.Condition,   primaryKey :tablestore.tablestore.PrimaryKeyInput,   attributeColumns :std.Array<{  PUT :tablestore.tablestore.AttributesInput | undefined,   DELETE :std.Array<{[name: string] : tablestore.tablestore.int64}> | undefined,   DELETE_ALL :std.Array<string> | undefined}>,   returnContent :tablestore.tablestore.ReturnContent | undefined} | {  type :'PUT',   condition :tablestore.tablestore.Condition,   primaryKey :tablestore.tablestore.PrimaryKeyInput,   attributeColumns :tablestore.tablestore.AttributesInput | undefined,   returnContent :tablestore.tablestore.ReturnContent | undefined} | {  type :'DELETE',   condition :tablestore.tablestore.Condition,   primaryKey :tablestore.tablestore.PrimaryKeyInput}>}>} */
trait BatchWriteRowParams extends StObject {
  
  var tables: js.Array[Rows]
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object BatchWriteRowParams {
  
  inline def apply(tables: js.Array[Rows]): BatchWriteRowParams = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteRowParams]
  }
  
  extension [Self <: BatchWriteRowParams](x: Self) {
    
    inline def setTables(value: js.Array[Rows]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: Rows*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
