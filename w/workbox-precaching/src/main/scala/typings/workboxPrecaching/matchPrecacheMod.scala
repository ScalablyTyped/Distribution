package typings.workboxPrecaching

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchPrecacheMod {
  
  @JSImport("workbox-precaching/matchPrecache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that calls
    * {@link PrecacheController#matchPrecache} on the default
    * {@link PrecacheController} instance.
    *
    * If you are creating your own {@link PrecacheController}, then call
    * {@link PrecacheController#matchPrecache} on that instance,
    * instead of using this function.
    *
    * @param {string|Request} request The key (without revisioning parameters)
    * to look up in the precache.
    * @return {Promise<Response|undefined>}
    *
    * @memberof workbox-precaching
    */
  inline def matchPrecache(request: String): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPrecache")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
  inline def matchPrecache(request: Request): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPrecache")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
}
