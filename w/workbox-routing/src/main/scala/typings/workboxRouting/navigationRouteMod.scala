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
    
    @scala.inline
    def apply(): NavigationRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationRouteOptions]
    }
    
    @scala.inline
    implicit class NavigationRouteOptionsMutableBuilder[Self <: NavigationRouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[RegExp]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: RegExp*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[RegExp]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: RegExp*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
