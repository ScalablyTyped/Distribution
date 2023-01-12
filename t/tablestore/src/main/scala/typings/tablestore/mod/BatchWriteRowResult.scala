package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteRowResult extends StObject {
  
  var RequestId: String
  
  var tables: js.Array[RowInBatch]
}
object BatchWriteRowResult {
  
  inline def apply(RequestId: String, tables: js.Array[RowInBatch]): BatchWriteRowResult = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteRowResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchWriteRowResult] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setTables(value: js.Array[RowInBatch]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: RowInBatch*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
