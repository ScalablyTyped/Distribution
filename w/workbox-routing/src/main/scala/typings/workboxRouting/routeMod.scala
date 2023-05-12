package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import typings.workboxCore.typesMod.RouteHandlerObject
import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxCore.typesMod.RouteMatchCallbackOptions
import typings.workboxRouting.utilsConstantsMod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  /**
    * A `Route` consists of a pair of callback functions, "match" and "handler".
    * The "match" callback determine if a route should be used to "handle" a
    * request by returning a non-falsy value if it can. The "handler" callback
    * is called when there is a match and should return a Promise that resolves
    * to a `Response`.
    *
    * @memberof workbox-routing
    */
  @JSImport("workbox-routing/Route", "Route")
  @js.native
  open class Route protected () extends StObject {
    /**
      * Constructor for Route class.
      *
      * @param {workbox-routing~matchCallback} match
      * A callback function that determines whether the route matches a given
      * `fetch` event by returning a non-falsy value.
      * @param {workbox-routing~handlerCallback} handler A callback
      * function that returns a Promise resolving to a Response.
      * @param {string} [method='GET'] The HTTP method to match the Route
      * against.
      */
    def this(`match`: RouteMatchCallback, handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback, handler: RouteHandler, method: HTTPMethod) = this()
    
    var catchHandler: js.UndefOr[RouteHandlerObject] = js.native
    
    var handler: RouteHandlerObject = js.native
    
    def `match`(options: RouteMatchCallbackOptions): Any = js.native
    @JSName("match")
    var match_Original: RouteMatchCallback = js.native
    
    var method: HTTPMethod = js.native
    
    /**
      *
      * @param {workbox-routing-handlerCallback} handler A callback
      * function that returns a Promise resolving to a Response
      */
    def setCatchHandler(handler: RouteHandler): Unit = js.native
  }
}
