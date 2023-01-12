package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLocalTransactionParams extends StObject {
  
  var primaryKey: PrimaryKeyInput
  
  var tableName: String
}
object StartLocalTransactionParams {
  
  inline def apply(primaryKey: PrimaryKeyInput, tableName: String): StartLocalTransactionParams = {
    val __obj = js.Dynamic.literal(primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalTransactionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartLocalTransactionParams] (val x: Self) extends AnyVal {
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
