package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRowResult extends StObject {
  
  var RequestId: String
  
  var tables: js.Array[js.Array[RowInBatch]]
}
object BatchGetRowResult {
  
  inline def apply(RequestId: String, tables: js.Array[js.Array[RowInBatch]]): BatchGetRowResult = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRowResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetRowResult] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setTables(value: js.Array[js.Array[RowInBatch]]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesVarargs(value: js.Array[RowInBatch]*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
