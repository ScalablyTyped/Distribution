package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropIndexParams extends StObject {
  
  var indexName: String
  
  var mainTableName: String
}
object DropIndexParams {
  
  inline def apply(indexName: String, mainTableName: String): DropIndexParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], mainTableName = mainTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropIndexParams] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setMainTableName(value: String): Self = StObject.set(x, "mainTableName", value.asInstanceOf[js.Any])
  }
}
