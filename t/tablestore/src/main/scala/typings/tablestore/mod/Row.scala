package typings.tablestore.mod

import typings.tablestore.anon.ColumnName
import typings.tablestore.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  var attributes: AttributesOutput | Null
  
  var primaryKey: PrimaryKeyOutput | Null
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal(attributes = null, primaryKey = null)
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setAttributes(value: AttributesOutput): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesVarargs(value: ColumnName*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setPrimaryKey(value: PrimaryKeyOutput): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyNull: Self = StObject.set(x, "primaryKey", null)
    
    inline def setPrimaryKeyVarargs(value: Name*): Self = StObject.set(x, "primaryKey", js.Array(value*))
  }
}
