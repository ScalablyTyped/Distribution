package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseName extends StObject {
  
  var database: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var schema: String
}
object DatabaseName {
  
  @scala.inline
  def apply(name: String, schema: String): DatabaseName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseName]
  }
  
  @scala.inline
  implicit class DatabaseNameMutableBuilder[Self <: DatabaseName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
