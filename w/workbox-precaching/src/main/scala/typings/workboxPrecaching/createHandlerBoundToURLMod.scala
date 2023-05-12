package typings.workboxPrecaching

import typings.workboxCore.typesMod.RouteHandlerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHandlerBoundToURLMod {
  
  @JSImport("workbox-precaching/createHandlerBoundToURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that calls
    * {@link PrecacheController#createHandlerBoundToURL} on the default
    * {@link PrecacheController} instance.
    *
    * If you are creating your own {@link PrecacheController}, then call the
    * {@link PrecacheController#createHandlerBoundToURL} on that instance,
    * instead of using this function.
    *
    * @param {string} url The precached URL which will be used to lookup the
    * `Response`.
    * @param {boolean} [fallbackToNetwork=true] Whether to attempt to get the
    * response from the network if there's a precache miss.
    * @return {workbox-routing~handlerCallback}
    *
    * @memberof workbox-precaching
    */
  inline def createHandlerBoundToURL(url: String): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandlerBoundToURL")(url.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
}
