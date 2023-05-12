package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setCatchHandlerMod {
  
  @JSImport("workbox-routing/setCatchHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If a Route throws an error while handling a request, this `handler`
    * will be called and given a chance to provide a response.
    *
    * @param {workbox-routing~handlerCallback} handler A callback
    * function that returns a Promise resulting in a Response.
    *
    * @memberof workbox-routing
    */
  inline def setCatchHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCatchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
