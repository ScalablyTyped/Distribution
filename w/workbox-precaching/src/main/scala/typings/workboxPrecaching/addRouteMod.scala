package typings.workboxPrecaching

import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addRouteMod {
  
  @JSImport("workbox-precaching/addRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a `fetch` listener to the service worker that will
    * respond to
    * [network requests]{@link https://developer.mozilla.org/en-US/docs/Web/API/Service_Worker_API/Using_Service_Workers#Custom_responses_to_requests}
    * with precached assets.
    *
    * Requests for assets that aren't precached, the `FetchEvent` will not be
    * responded to, allowing the event to fall through to other `fetch` event
    * listeners.
    *
    * @param {Object} [options] See the {@link workbox-precaching.PrecacheRoute}
    * options.
    *
    * @memberof workbox-precaching
    */
  inline def addRoute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")().asInstanceOf[Unit]
  inline def addRoute(options: PrecacheRouteOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
