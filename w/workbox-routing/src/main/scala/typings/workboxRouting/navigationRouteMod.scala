package typings.workboxRouting

import typings.std.RegExp
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationRouteMod {
  
  @JSImport("workbox-routing/NavigationRoute", "NavigationRoute")
  @js.native
  class NavigationRoute protected () extends Route[Boolean] {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  trait NavigationRouteOptions extends StObject {
    
    var blacklist: js.UndefOr[js.Array[RegExp]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[RegExp]] = js.undefined
  }
  object NavigationRouteOptions {
    
    inline def apply(): NavigationRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationRouteOptions]
    }
    
    extension [Self <: NavigationRouteOptions](x: Self) {
      
      inline def setBlacklist(value: js.Array[RegExp]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: RegExp*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setWhitelist(value: js.Array[RegExp]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: RegExp*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
