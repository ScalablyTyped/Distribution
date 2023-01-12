package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.WithTransactionId & {  tableName :string,   primaryKey :tablestore.tablestore.PrimaryKeyInput,   condition :tablestore.tablestore.Condition} */
trait DeleteRowParams extends StObject {
  
  var condition: Condition
  
  var primaryKey: PrimaryKeyInput
  
  var tableName: String
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object DeleteRowParams {
  
  inline def apply(condition: Condition, primaryKey: PrimaryKeyInput, tableName: String): DeleteRowParams = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRowParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRowParams] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
