package typings.swaggerizeExpress.mod

import typings.swaggerizeExpress.mod.Swagger.ApiDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var api: ApiDefinition
  
  var docspath: String
  
  var handlers: String | RouteSegment
}
object Options {
  
  inline def apply(api: ApiDefinition, docspath: String, handlers: String | RouteSegment): Options = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], docspath = docspath.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setApi(value: ApiDefinition): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setDocspath(value: String): Self = StObject.set(x, "docspath", value.asInstanceOf[js.Any])
    
    inline def setHandlers(value: String | RouteSegment): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
  }
}
