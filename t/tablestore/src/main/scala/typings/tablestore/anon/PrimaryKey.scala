package typings.tablestore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tablestore.mod.CellValue
import typings.tablestore.mod.PrimaryKeyInput
import typings.tablestore.mod.VirtualData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryKey extends StObject {
  
  var condition: typings.tablestore.mod.Condition
  
  var primaryKey: PrimaryKeyInput
  
  var `type`: typings.tablestore.tablestoreStrings.DELETE
}
object PrimaryKey {
  
  inline def apply(condition: typings.tablestore.mod.Condition, primaryKey: PrimaryKeyInput): PrimaryKey = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DELETE")
    __obj.asInstanceOf[PrimaryKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimaryKey] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: typings.tablestore.mod.Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setType(value: typings.tablestore.tablestoreStrings.DELETE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
