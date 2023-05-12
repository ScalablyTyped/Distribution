package typings.workboxBackgroundSync

import typings.std.Request
import typings.workboxBackgroundSync.libStorableRequestMod.RequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storableRequestMod {
  
  /**
    * A class to make it easier to serialize and de-serialize requests so they
    * can be stored in IndexedDB.
    *
    * Most developers will not need to access this class directly;
    * it is exposed for advanced use cases.
    */
  @JSImport("workbox-background-sync/StorableRequest", "StorableRequest")
  @js.native
  open class StorableRequest protected ()
    extends typings.workboxBackgroundSync.libStorableRequestMod.StorableRequest {
    /**
      * Accepts an object of request data that can be used to construct a
      * `Request` but can also be stored in IndexedDB.
      *
      * @param {Object} requestData An object of request data that includes the
      *     `url` plus any relevant properties of
      *     [requestInit]{@link https://fetch.spec.whatwg.org/#requestinit}.
      */
    def this(requestData: RequestData) = this()
  }
  object StorableRequest {
    
    @JSImport("workbox-background-sync/StorableRequest", "StorableRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a Request object to a plain object that can be structured
      * cloned or JSON-stringified.
      *
      * @param {Request} request
      * @return {Promise<StorableRequest>}
      */
    /* static member */
    inline def fromRequest(request: Request): js.Promise[typings.workboxBackgroundSync.libStorableRequestMod.StorableRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRequest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.workboxBackgroundSync.libStorableRequestMod.StorableRequest]]
  }
}
