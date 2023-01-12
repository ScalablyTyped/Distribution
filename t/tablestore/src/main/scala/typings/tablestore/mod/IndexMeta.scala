package typings.tablestore.mod

import typings.tablestore.anon.ITGLOBALINDEX
import typings.tablestore.anon.IUMASYNCINDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMeta extends StObject {
  
  var definedColumn: js.Array[String]
  
  var indexType: js.UndefOr[EnumValues[ITGLOBALINDEX]] = js.undefined
  
  var indexUpdateMode: js.UndefOr[EnumValues[IUMASYNCINDEX]] = js.undefined
  
  var name: String
  
  var primaryKey: js.Array[String]
}
object IndexMeta {
  
  inline def apply(definedColumn: js.Array[String], name: String, primaryKey: js.Array[String]): IndexMeta = {
    val __obj = js.Dynamic.literal(definedColumn = definedColumn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexMeta] (val x: Self) extends AnyVal {
    
    inline def setDefinedColumn(value: js.Array[String]): Self = StObject.set(x, "definedColumn", value.asInstanceOf[js.Any])
    
    inline def setDefinedColumnVarargs(value: String*): Self = StObject.set(x, "definedColumn", js.Array(value*))
    
    inline def setIndexType(value: EnumValues[ITGLOBALINDEX]): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setIndexTypeUndefined: Self = StObject.set(x, "indexType", js.undefined)
    
    inline def setIndexUpdateMode(value: EnumValues[IUMASYNCINDEX]): Self = StObject.set(x, "indexUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setIndexUpdateModeUndefined: Self = StObject.set(x, "indexUpdateMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
  }
}
