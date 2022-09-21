package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.WithTransactionId & {  tables :std.Array<tablestore.tablestore.RowParamsInBatchGet>} */
trait BatchGetRowParams extends StObject {
  
  var tables: js.Array[RowParamsInBatchGet]
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object BatchGetRowParams {
  
  inline def apply(tables: js.Array[RowParamsInBatchGet]): BatchGetRowParams = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRowParams]
  }
  
  extension [Self <: BatchGetRowParams](x: Self) {
    
    inline def setTables(value: js.Array[RowParamsInBatchGet]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: RowParamsInBatchGet*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
