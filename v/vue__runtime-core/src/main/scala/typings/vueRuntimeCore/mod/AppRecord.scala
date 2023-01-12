package typings.vueRuntimeCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRecord extends StObject {
  
  var app: App[Any]
  
  var id: Double
  
  var types: Record[String, String | js.Symbol]
  
  var version: String
}
object AppRecord {
  
  inline def apply(app: App[Any], id: Double, types: Record[String, String | js.Symbol], version: String): AppRecord = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRecord] (val x: Self) extends AnyVal {
    
    inline def setApp(value: App[Any]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Record[String, String | js.Symbol]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
