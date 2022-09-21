package typings.swaggerizeExpress.mod

import typings.express.mod.IRoute
import typings.swaggerizeExpress.mod.Swagger.ApiDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfig extends StObject {
  
  var api: ApiDefinition
  
  var routes: js.Array[IRoute]
}
object IConfig {
  
  inline def apply(api: ApiDefinition, routes: js.Array[IRoute]): IConfig = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  extension [Self <: IConfig](x: Self) {
    
    inline def setApi(value: ApiDefinition): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: js.Array[IRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: IRoute*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
