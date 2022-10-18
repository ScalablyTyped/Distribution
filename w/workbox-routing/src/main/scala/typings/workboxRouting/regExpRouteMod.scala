package typings.workboxRouting

import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.typesHttpmethodMod.HTTPMethod
import typings.workboxRouting.typesRouteHandlerMod.RouteHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regExpRouteMod {
  
  @JSImport("workbox-routing/RegExpRoute", "RegExpRoute")
  @js.native
  open class RegExpRoute protected ()
    extends Route[js.Array[String]] {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
}
