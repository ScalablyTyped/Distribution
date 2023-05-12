package typings.workboxBackgroundSync

import typings.std.Request
import typings.workboxCore.typesMod.MapLikeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorableRequestMod {
  
  /**
    * A class to make it easier to serialize and de-serialize requests so they
    * can be stored in IndexedDB.
    *
    * Most developers will not need to access this class directly;
    * it is exposed for advanced use cases.
    */
  @JSImport("workbox-background-sync/lib/StorableRequest", "StorableRequest")
  @js.native
  open class StorableRequest protected () extends StObject {
    /**
      * Accepts an object of request data that can be used to construct a
      * `Request` but can also be stored in IndexedDB.
      *
      * @param {Object} requestData An object of request data that includes the
      *     `url` plus any relevant properties of
      *     [requestInit]{@link https://fetch.spec.whatwg.org/#requestinit}.
      */
    def this(requestData: RequestData) = this()
    
    /* private */ val _requestData: Any = js.native
    
    /**
      * Returns a deep clone of the instances `_requestData` object.
      *
      * @return {Object}
      */
    def toObject(): RequestData = js.native
    
    /**
      * Converts this instance to a Request.
      *
      * @return {Request}
      */
    def toRequest(): Request = js.native
  }
  object StorableRequest {
    
    @JSImport("workbox-background-sync/lib/StorableRequest", "StorableRequest")
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
    inline def fromRequest(request: Request): js.Promise[StorableRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRequest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorableRequest]]
  }
  
  trait RequestData
    extends StObject
       with MapLikeObject {
    
    var body: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    var headers: MapLikeObject
    
    var url: String
  }
  object RequestData {
    
    inline def apply(headers: MapLikeObject, url: String): RequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestData] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: MapLikeObject): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
