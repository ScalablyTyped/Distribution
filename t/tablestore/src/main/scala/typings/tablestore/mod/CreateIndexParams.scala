package typings.tablestore.mod

import typings.tablestore.anon.DefinedColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexParams extends StObject {
  
  var indexMeta: DefinedColumn
  
  var mainTableName: String
}
object CreateIndexParams {
  
  inline def apply(indexMeta: DefinedColumn, mainTableName: String): CreateIndexParams = {
    val __obj = js.Dynamic.literal(indexMeta = indexMeta.asInstanceOf[js.Any], mainTableName = mainTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIndexParams] (val x: Self) extends AnyVal {
    
    inline def setIndexMeta(value: DefinedColumn): Self = StObject.set(x, "indexMeta", value.asInstanceOf[js.Any])
    
    inline def setMainTableName(value: String): Self = StObject.set(x, "mainTableName", value.asInstanceOf[js.Any])
  }
}
