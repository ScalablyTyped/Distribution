package typings.syncFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.nodeFetch.mod.Headers
import typings.syncFetch.mod.ResponseInit
import typings.syncFetch.mod.SyncBodyInit
import typings.syncFetch.mod.SyncRequest
import typings.syncFetch.mod.SyncRequestInfo
import typings.syncFetch.mod.SyncRequestInit
import typings.syncFetch.mod.SyncResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FetchError extends StObject {
    
    var FetchError: Instantiable2[/* message */ String, /* type */ String, typings.nodeFetch.mod.FetchError]
    
    var Headers: Instantiable0[typings.nodeFetch.mod.Headers]
    
    var Request: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest]
    
    var Response: Instantiable2[
        /* body */ js.UndefOr[SyncBodyInit], 
        /* init */ js.UndefOr[ResponseInit], 
        SyncResponse
      ]
  }
  object FetchError {
    
    inline def apply(
      FetchError: Instantiable2[/* message */ String, /* type */ String, typings.nodeFetch.mod.FetchError],
      Headers: Instantiable0[Headers],
      Request: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest],
      Response: Instantiable2[
          /* body */ js.UndefOr[SyncBodyInit], 
          /* init */ js.UndefOr[ResponseInit], 
          SyncResponse
        ]
    ): FetchError = {
      val __obj = js.Dynamic.literal(FetchError = FetchError.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchError]
    }
    
    extension [Self <: FetchError](x: Self) {
      
      inline def setFetchError(value: Instantiable2[/* message */ String, /* type */ String, typings.nodeFetch.mod.FetchError]): Self = StObject.set(x, "FetchError", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Instantiable0[Headers]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(
        value: Instantiable2[/* input */ SyncRequestInfo, /* init */ js.UndefOr[SyncRequestInit], SyncRequest]
      ): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setResponse(
        value: Instantiable2[
              /* body */ js.UndefOr[SyncBodyInit], 
              /* init */ js.UndefOr[ResponseInit], 
              SyncResponse
            ]
      ): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
}
