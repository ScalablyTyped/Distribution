package typings.tablestore.mod

import typings.tablestore.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowInBatch
  extends StObject
     with Row
     with Consumed {
  
  var errorCode: String | Null
  
  var errorMessage: String | Null
  
  var isOk: Boolean
  
  var tableName: String
}
object RowInBatch {
  
  inline def apply(capacityUnit: Read, isOk: Boolean, tableName: String): RowInBatch = {
    val __obj = js.Dynamic.literal(capacityUnit = capacityUnit.asInstanceOf[js.Any], isOk = isOk.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], attributes = null, errorCode = null, errorMessage = null, primaryKey = null)
    __obj.asInstanceOf[RowInBatch]
  }
  
  extension [Self <: RowInBatch](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setIsOk(value: Boolean): Self = StObject.set(x, "isOk", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
