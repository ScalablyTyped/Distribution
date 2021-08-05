package typings.vueRouter

import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  trait Vue extends StObject {
    
    @JSName("$route")
    var $route: Route
    
    @JSName("$router")
    var $router: default
  }
  object Vue {
    
    inline def apply($route: Route, $router: default): Vue = {
      val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    extension [Self <: Vue](x: Self) {
      
      inline def set$route(value: Route): Self = StObject.set(x, "$route", value.asInstanceOf[js.Any])
      
      inline def set$router(value: default): Self = StObject.set(x, "$router", value.asInstanceOf[js.Any])
    }
  }
}
