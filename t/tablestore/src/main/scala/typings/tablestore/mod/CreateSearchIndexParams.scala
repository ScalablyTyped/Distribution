package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSearchIndexParams extends StObject {
  
  var indexName: String
  
  var schema: typings.tablestore.anon.FieldSchemas
  
  var tableName: String
}
object CreateSearchIndexParams {
  
  inline def apply(indexName: String, schema: typings.tablestore.anon.FieldSchemas, tableName: String): CreateSearchIndexParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSearchIndexParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSearchIndexParams] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: typings.tablestore.anon.FieldSchemas): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
