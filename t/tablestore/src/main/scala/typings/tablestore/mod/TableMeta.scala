package typings.tablestore.mod

import typings.tablestore.anon.Option
import typings.tablestore.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableMeta extends StObject {
  
  var definedColumn: js.UndefOr[js.Array[Type]] = js.undefined
  
  var primaryKey: js.Array[Option]
  
  var tableName: String
}
object TableMeta {
  
  inline def apply(primaryKey: js.Array[Option], tableName: String): TableMeta = {
    val __obj = js.Dynamic.literal(primaryKey = primaryKey.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMeta]
  }
  
  extension [Self <: TableMeta](x: Self) {
    
    inline def setDefinedColumn(value: js.Array[Type]): Self = StObject.set(x, "definedColumn", value.asInstanceOf[js.Any])
    
    inline def setDefinedColumnUndefined: Self = StObject.set(x, "definedColumn", js.undefined)
    
    inline def setDefinedColumnVarargs(value: Type*): Self = StObject.set(x, "definedColumn", js.Array(value*))
    
    inline def setPrimaryKey(value: js.Array[Option]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: Option*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
