package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setDefaultHandlerMod {
  
  @JSImport("workbox-routing/setDefaultHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Define a default `handler` that's called when no routes explicitly
    * match the incoming request.
    *
    * Without a default handler, unmatched requests will go against the
    * network as if there were no service worker present.
    *
    * @param {workbox-routing~handlerCallback} handler A callback
    * function that returns a Promise resulting in a Response.
    *
    * @memberof workbox-routing
    */
  inline def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
