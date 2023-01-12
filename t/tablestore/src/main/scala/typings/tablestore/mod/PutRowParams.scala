package typings.tablestore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tablestore.anon.Dictname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tablestore.tablestore.WithTransactionId & {  tableName :string,   primaryKey :tablestore.tablestore.PrimaryKeyInput,   condition :tablestore.tablestore.Condition,   attributeColumns :tablestore.tablestore.AttributesInput,   returnContent :tablestore.tablestore.ReturnContent | undefined} */
trait PutRowParams extends StObject {
  
  var attributeColumns: AttributesInput
  
  var condition: Condition
  
  var primaryKey: PrimaryKeyInput
  
  var returnContent: js.UndefOr[ReturnContent] = js.undefined
  
  var tableName: String
  
  var transactionId: js.UndefOr[String] = js.undefined
}
object PutRowParams {
  
  inline def apply(
    attributeColumns: AttributesInput,
    condition: Condition,
    primaryKey: PrimaryKeyInput,
    tableName: String
  ): PutRowParams = {
    val __obj = js.Dynamic.literal(attributeColumns = attributeColumns.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRowParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRowParams] (val x: Self) extends AnyVal {
    
    inline def setAttributeColumns(value: AttributesInput): Self = StObject.set(x, "attributeColumns", value.asInstanceOf[js.Any])
    
    inline def setAttributeColumnsVarargs(value: Dictname*): Self = StObject.set(x, "attributeColumns", js.Array(value*))
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: PrimaryKeyInput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: (StringDictionary[CellValue | VirtualData])*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setReturnContent(value: ReturnContent): Self = StObject.set(x, "returnContent", value.asInstanceOf[js.Any])
    
    inline def setReturnContentUndefined: Self = StObject.set(x, "returnContent", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
