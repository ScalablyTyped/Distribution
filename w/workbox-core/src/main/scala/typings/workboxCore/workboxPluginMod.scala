package typings.workboxCore

import typings.std.CacheQueryOptions
import typings.std.Error
import typings.std.Event
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxPluginMod {
  
  type CacheDidUpdateCallback = js.Function1[/* param */ CacheDidUpdateCallbackParam, js.Promise[Unit]]
  
  @js.native
  trait CacheDidUpdateCallbackParam extends StObject {
    
    var cacheName: String = js.native
    
    var event: js.UndefOr[Event] = js.native
    
    var newResponse: Response = js.native
    
    var oldResponse: js.UndefOr[Response | Null] = js.native
    
    var request: Request = js.native
  }
  object CacheDidUpdateCallbackParam {
    
    @scala.inline
    def apply(cacheName: String, newResponse: Response, request: Request): CacheDidUpdateCallbackParam = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheDidUpdateCallbackParam]
    }
    
    @scala.inline
    implicit class CacheDidUpdateCallbackParamMutableBuilder[Self <: CacheDidUpdateCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setNewResponse(value: Response): Self = StObject.set(x, "newResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldResponse(value: Response): Self = StObject.set(x, "oldResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldResponseNull: Self = StObject.set(x, "oldResponse", null)
      
      @scala.inline
      def setOldResponseUndefined: Self = StObject.set(x, "oldResponse", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheKeyWillBeUsedCallback = js.Function1[/* param */ CacheKeyWillBeUsedCallbackParam, js.Promise[Request | String]]
  
  @js.native
  trait CacheKeyWillBeUsedCallbackParam extends StObject {
    
    var mode: String = js.native
    
    var request: Request = js.native
  }
  object CacheKeyWillBeUsedCallbackParam {
    
    @scala.inline
    def apply(mode: String, request: Request): CacheKeyWillBeUsedCallbackParam = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKeyWillBeUsedCallbackParam]
    }
    
    @scala.inline
    implicit class CacheKeyWillBeUsedCallbackParamMutableBuilder[Self <: CacheKeyWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheWillUpdateCallback = js.Function1[/* param */ CacheWillUpdateCallbackParamParam, js.Promise[js.UndefOr[Response]]]
  
  @js.native
  trait CacheWillUpdateCallbackParamParam extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ] = js.native
    
    var request: Request = js.native
    
    var response: Response = js.native
  }
  object CacheWillUpdateCallbackParamParam {
    
    @scala.inline
    def apply(request: Request, response: Response): CacheWillUpdateCallbackParamParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheWillUpdateCallbackParamParam]
    }
    
    @scala.inline
    implicit class CacheWillUpdateCallbackParamParamMutableBuilder[Self <: CacheWillUpdateCallbackParamParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type CachedResponseWillBeUsedCallback = js.Function1[
    /* param */ CachedResponseWillBeUsedCallbackParam, 
    js.Promise[js.UndefOr[Response]]
  ]
  
  @js.native
  trait CachedResponseWillBeUsedCallbackParam extends StObject {
    
    var cacheName: String = js.native
    
    var cachedResponse: js.UndefOr[Response] = js.native
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ] = js.native
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
    
    var request: Request = js.native
  }
  object CachedResponseWillBeUsedCallbackParam {
    
    @scala.inline
    def apply(cacheName: String, request: Request): CachedResponseWillBeUsedCallbackParam = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
    }
    
    @scala.inline
    implicit class CachedResponseWillBeUsedCallbackParamMutableBuilder[Self <: CachedResponseWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedResponse(value: Response): Self = StObject.set(x, "cachedResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedResponseUndefined: Self = StObject.set(x, "cachedResponse", js.undefined)
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type FetchDidFailCallback = js.Function1[/* param */ FetchDidFailCallbackParam, js.Promise[Unit]]
  
  @js.native
  trait FetchDidFailCallbackParam extends StObject {
    
    var error: Error = js.native
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ] = js.native
    
    var originalRequest: Request = js.native
    
    var request: Request = js.native
  }
  object FetchDidFailCallbackParam {
    
    @scala.inline
    def apply(error: Error, originalRequest: Request, request: Request): FetchDidFailCallbackParam = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], originalRequest = originalRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchDidFailCallbackParam]
    }
    
    @scala.inline
    implicit class FetchDidFailCallbackParamMutableBuilder[Self <: FetchDidFailCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setOriginalRequest(value: Request): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type FetchDidSucceedCallback = js.Function1[/* param */ FetchDidSucceedCallbackParam, js.Promise[Response]]
  
  @js.native
  trait FetchDidSucceedCallbackParam extends StObject {
    
    var request: Request = js.native
    
    var response: Response = js.native
  }
  object FetchDidSucceedCallbackParam {
    
    @scala.inline
    def apply(request: Request, response: Response): FetchDidSucceedCallbackParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchDidSucceedCallbackParam]
    }
    
    @scala.inline
    implicit class FetchDidSucceedCallbackParamMutableBuilder[Self <: FetchDidSucceedCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestWillFetchCallback = js.Function1[/* param */ RequestWillFetchCallbackParam, js.Promise[js.UndefOr[Request]]]
  
  @js.native
  trait RequestWillFetchCallbackParam extends StObject {
    
    var request: Request = js.native
  }
  object RequestWillFetchCallbackParam {
    
    @scala.inline
    def apply(request: Request): RequestWillFetchCallbackParam = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestWillFetchCallbackParam]
    }
    
    @scala.inline
    implicit class RequestWillFetchCallbackParamMutableBuilder[Self <: RequestWillFetchCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkboxPlugin extends StObject {
    
    var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.native
    
    var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.native
    
    var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.native
    
    var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.native
    
    var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.native
    
    var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.native
    
    var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.native
  }
  object WorkboxPlugin {
    
    @scala.inline
    def apply(): WorkboxPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkboxPlugin]
    }
    
    @scala.inline
    implicit class WorkboxPluginMutableBuilder[Self <: WorkboxPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDidUpdate(value: /* param */ CacheDidUpdateCallbackParam => js.Promise[Unit]): Self = StObject.set(x, "cacheDidUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCacheDidUpdateUndefined: Self = StObject.set(x, "cacheDidUpdate", js.undefined)
      
      @scala.inline
      def setCacheKeyWillBeUsed(value: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String]): Self = StObject.set(x, "cacheKeyWillBeUsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCacheKeyWillBeUsedUndefined: Self = StObject.set(x, "cacheKeyWillBeUsed", js.undefined)
      
      @scala.inline
      def setCacheWillUpdate(value: /* param */ CacheWillUpdateCallbackParamParam => js.Promise[js.UndefOr[Response]]): Self = StObject.set(x, "cacheWillUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCacheWillUpdateUndefined: Self = StObject.set(x, "cacheWillUpdate", js.undefined)
      
      @scala.inline
      def setCachedResponseWillBeUsed(value: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response]]): Self = StObject.set(x, "cachedResponseWillBeUsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCachedResponseWillBeUsedUndefined: Self = StObject.set(x, "cachedResponseWillBeUsed", js.undefined)
      
      @scala.inline
      def setFetchDidFail(value: /* param */ FetchDidFailCallbackParam => js.Promise[Unit]): Self = StObject.set(x, "fetchDidFail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchDidFailUndefined: Self = StObject.set(x, "fetchDidFail", js.undefined)
      
      @scala.inline
      def setFetchDidSucceed(value: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response]): Self = StObject.set(x, "fetchDidSucceed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchDidSucceedUndefined: Self = StObject.set(x, "fetchDidSucceed", js.undefined)
      
      @scala.inline
      def setRequestWillFetch(value: /* param */ RequestWillFetchCallbackParam => js.Promise[js.UndefOr[Request]]): Self = StObject.set(x, "requestWillFetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestWillFetchUndefined: Self = StObject.set(x, "requestWillFetch", js.undefined)
    }
  }
}
