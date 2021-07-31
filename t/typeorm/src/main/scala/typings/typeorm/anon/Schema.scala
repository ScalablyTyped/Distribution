package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  var schema: String
  
  var tableName: String
}
object Schema {
  
  @scala.inline
  def apply(schema: String, tableName: String): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
