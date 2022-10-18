package typings.workboxCore

import typings.std.CacheQueryOptions
import typings.std.Event
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWorkboxPluginMod {
  
  type CacheDidUpdateCallback = js.Function1[/* param */ CacheDidUpdateCallbackParam, js.Promise[Unit]]
  
  trait CacheDidUpdateCallbackParam extends StObject {
    
    var cacheName: String
    
    var event: js.UndefOr[Event] = js.undefined
    
    var newResponse: Response
    
    var oldResponse: js.UndefOr[Response | Null] = js.undefined
    
    var request: Request
  }
  object CacheDidUpdateCallbackParam {
    
    inline def apply(cacheName: String, newResponse: Response, request: Request): CacheDidUpdateCallbackParam = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheDidUpdateCallbackParam]
    }
    
    extension [Self <: CacheDidUpdateCallbackParam](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setNewResponse(value: Response): Self = StObject.set(x, "newResponse", value.asInstanceOf[js.Any])
      
      inline def setOldResponse(value: Response): Self = StObject.set(x, "oldResponse", value.asInstanceOf[js.Any])
      
      inline def setOldResponseNull: Self = StObject.set(x, "oldResponse", null)
      
      inline def setOldResponseUndefined: Self = StObject.set(x, "oldResponse", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheKeyWillBeUsedCallback = js.Function1[/* param */ CacheKeyWillBeUsedCallbackParam, js.Promise[Request | String]]
  
  trait CacheKeyWillBeUsedCallbackParam extends StObject {
    
    var mode: String
    
    var request: Request
  }
  object CacheKeyWillBeUsedCallbackParam {
    
    inline def apply(mode: String, request: Request): CacheKeyWillBeUsedCallbackParam = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKeyWillBeUsedCallbackParam]
    }
    
    extension [Self <: CacheKeyWillBeUsedCallbackParam](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheWillUpdateCallback = js.Function1[/* param */ CacheWillUpdateCallbackParamParam, js.Promise[js.UndefOr[Response]]]
  
  trait CacheWillUpdateCallbackParamParam extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ] = js.undefined
    
    var request: Request
    
    var response: Response
  }
  object CacheWillUpdateCallbackParamParam {
    
    inline def apply(request: Request, response: Response): CacheWillUpdateCallbackParamParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheWillUpdateCallbackParamParam]
    }
    
    extension [Self <: CacheWillUpdateCallbackParamParam](x: Self) {
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type CachedResponseWillBeUsedCallback = js.Function1[
    /* param */ CachedResponseWillBeUsedCallbackParam, 
    js.Promise[js.UndefOr[Response]]
  ]
  
  trait CachedResponseWillBeUsedCallbackParam extends StObject {
    
    var cacheName: String
    
    var cachedResponse: js.UndefOr[Response] = js.undefined
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ] = js.undefined
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var request: Request
  }
  object CachedResponseWillBeUsedCallbackParam {
    
    inline def apply(cacheName: String, request: Request): CachedResponseWillBeUsedCallbackParam = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
    }
    
    extension [Self <: CachedResponseWillBeUsedCallbackParam](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCachedResponse(value: Response): Self = StObject.set(x, "cachedResponse", value.asInstanceOf[js.Any])
      
      inline def setCachedResponseUndefined: Self = StObject.set(x, "cachedResponse", js.undefined)
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type FetchDidFailCallback = js.Function1[/* param */ FetchDidFailCallbackParam, js.Promise[Unit]]
  
  trait FetchDidFailCallbackParam extends StObject {
    
    var error: js.Error
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ] = js.undefined
    
    var originalRequest: Request
    
    var request: Request
  }
  object FetchDidFailCallbackParam {
    
    inline def apply(error: js.Error, originalRequest: Request, request: Request): FetchDidFailCallbackParam = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], originalRequest = originalRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchDidFailCallbackParam]
    }
    
    extension [Self <: FetchDidFailCallbackParam](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setOriginalRequest(value: Request): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type FetchDidSucceedCallback = js.Function1[/* param */ FetchDidSucceedCallbackParam, js.Promise[Response]]
  
  trait FetchDidSucceedCallbackParam extends StObject {
    
    var request: Request
    
    var response: Response
  }
  object FetchDidSucceedCallbackParam {
    
    inline def apply(request: Request, response: Response): FetchDidSucceedCallbackParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchDidSucceedCallbackParam]
    }
    
    extension [Self <: FetchDidSucceedCallbackParam](x: Self) {
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestWillFetchCallback = js.Function1[/* param */ RequestWillFetchCallbackParam, js.Promise[js.UndefOr[Request]]]
  
  trait RequestWillFetchCallbackParam extends StObject {
    
    var request: Request
  }
  object RequestWillFetchCallbackParam {
    
    inline def apply(request: Request): RequestWillFetchCallbackParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestWillFetchCallbackParam]
    }
    
    extension [Self <: RequestWillFetchCallbackParam](x: Self) {
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkboxPlugin extends StObject {
    
    var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.undefined
    
    var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.undefined
    
    var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.undefined
    
    var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.undefined
    
    var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.undefined
    
    var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.undefined
    
    var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.undefined
  }
  object WorkboxPlugin {
    
    inline def apply(): WorkboxPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkboxPlugin]
    }
    
    extension [Self <: WorkboxPlugin](x: Self) {
      
      inline def setCacheDidUpdate(value: /* param */ CacheDidUpdateCallbackParam => js.Promise[Unit]): Self = StObject.set(x, "cacheDidUpdate", js.Any.fromFunction1(value))
      
      inline def setCacheDidUpdateUndefined: Self = StObject.set(x, "cacheDidUpdate", js.undefined)
      
      inline def setCacheKeyWillBeUsed(value: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String]): Self = StObject.set(x, "cacheKeyWillBeUsed", js.Any.fromFunction1(value))
      
      inline def setCacheKeyWillBeUsedUndefined: Self = StObject.set(x, "cacheKeyWillBeUsed", js.undefined)
      
      inline def setCacheWillUpdate(value: /* param */ CacheWillUpdateCallbackParamParam => js.Promise[js.UndefOr[Response]]): Self = StObject.set(x, "cacheWillUpdate", js.Any.fromFunction1(value))
      
      inline def setCacheWillUpdateUndefined: Self = StObject.set(x, "cacheWillUpdate", js.undefined)
      
      inline def setCachedResponseWillBeUsed(value: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response]]): Self = StObject.set(x, "cachedResponseWillBeUsed", js.Any.fromFunction1(value))
      
      inline def setCachedResponseWillBeUsedUndefined: Self = StObject.set(x, "cachedResponseWillBeUsed", js.undefined)
      
      inline def setFetchDidFail(value: /* param */ FetchDidFailCallbackParam => js.Promise[Unit]): Self = StObject.set(x, "fetchDidFail", js.Any.fromFunction1(value))
      
      inline def setFetchDidFailUndefined: Self = StObject.set(x, "fetchDidFail", js.undefined)
      
      inline def setFetchDidSucceed(value: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response]): Self = StObject.set(x, "fetchDidSucceed", js.Any.fromFunction1(value))
      
      inline def setFetchDidSucceedUndefined: Self = StObject.set(x, "fetchDidSucceed", js.undefined)
      
      inline def setRequestWillFetch(value: /* param */ RequestWillFetchCallbackParam => js.Promise[js.UndefOr[Request]]): Self = StObject.set(x, "requestWillFetch", js.Any.fromFunction1(value))
      
      inline def setRequestWillFetchUndefined: Self = StObject.set(x, "requestWillFetch", js.undefined)
    }
  }
}
