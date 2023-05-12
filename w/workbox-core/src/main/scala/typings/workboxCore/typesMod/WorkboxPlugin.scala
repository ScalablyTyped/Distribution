package typings.workboxCore.typesMod

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkboxPlugin extends StObject {
  
  var cacheDidUpdate: js.UndefOr[CacheDidUpdateCallback] = js.undefined
  
  var cacheKeyWillBeUsed: js.UndefOr[CacheKeyWillBeUsedCallback] = js.undefined
  
  var cacheWillUpdate: js.UndefOr[CacheWillUpdateCallback] = js.undefined
  
  var cachedResponseWillBeUsed: js.UndefOr[CachedResponseWillBeUsedCallback] = js.undefined
  
  var fetchDidFail: js.UndefOr[FetchDidFailCallback] = js.undefined
  
  var fetchDidSucceed: js.UndefOr[FetchDidSucceedCallback] = js.undefined
  
  var handlerDidComplete: js.UndefOr[HandlerDidCompleteCallback] = js.undefined
  
  var handlerDidError: js.UndefOr[HandlerDidErrorCallback] = js.undefined
  
  var handlerDidRespond: js.UndefOr[HandlerDidRespondCallback] = js.undefined
  
  var handlerWillRespond: js.UndefOr[HandlerWillRespondCallback] = js.undefined
  
  var handlerWillStart: js.UndefOr[HandlerWillStartCallback] = js.undefined
  
  var requestWillFetch: js.UndefOr[RequestWillFetchCallback] = js.undefined
}
object WorkboxPlugin {
  
  inline def apply(): WorkboxPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkboxPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkboxPlugin] (val x: Self) extends AnyVal {
    
    inline def setCacheDidUpdate(value: /* param */ CacheDidUpdateCallbackParam => js.Promise[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "cacheDidUpdate", js.Any.fromFunction1(value))
    
    inline def setCacheDidUpdateUndefined: Self = StObject.set(x, "cacheDidUpdate", js.undefined)
    
    inline def setCacheKeyWillBeUsed(value: /* param */ CacheKeyWillBeUsedCallbackParam => js.Promise[Request | String]): Self = StObject.set(x, "cacheKeyWillBeUsed", js.Any.fromFunction1(value))
    
    inline def setCacheKeyWillBeUsedUndefined: Self = StObject.set(x, "cacheKeyWillBeUsed", js.undefined)
    
    inline def setCacheWillUpdate(value: /* param */ CacheWillUpdateCallbackParam => js.Promise[js.UndefOr[Response | Unit | Null]]): Self = StObject.set(x, "cacheWillUpdate", js.Any.fromFunction1(value))
    
    inline def setCacheWillUpdateUndefined: Self = StObject.set(x, "cacheWillUpdate", js.undefined)
    
    inline def setCachedResponseWillBeUsed(
      value: /* param */ CachedResponseWillBeUsedCallbackParam => js.Promise[js.UndefOr[Response | Unit | Null]]
    ): Self = StObject.set(x, "cachedResponseWillBeUsed", js.Any.fromFunction1(value))
    
    inline def setCachedResponseWillBeUsedUndefined: Self = StObject.set(x, "cachedResponseWillBeUsed", js.undefined)
    
    inline def setFetchDidFail(value: /* param */ FetchDidFailCallbackParam => js.Promise[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "fetchDidFail", js.Any.fromFunction1(value))
    
    inline def setFetchDidFailUndefined: Self = StObject.set(x, "fetchDidFail", js.undefined)
    
    inline def setFetchDidSucceed(value: /* param */ FetchDidSucceedCallbackParam => js.Promise[Response]): Self = StObject.set(x, "fetchDidSucceed", js.Any.fromFunction1(value))
    
    inline def setFetchDidSucceedUndefined: Self = StObject.set(x, "fetchDidSucceed", js.undefined)
    
    inline def setHandlerDidComplete(value: /* param */ HandlerDidCompleteCallbackParam => js.Promise[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "handlerDidComplete", js.Any.fromFunction1(value))
    
    inline def setHandlerDidCompleteUndefined: Self = StObject.set(x, "handlerDidComplete", js.undefined)
    
    inline def setHandlerDidError(value: /* param */ HandlerDidErrorCallbackParam => js.Promise[js.UndefOr[Response]]): Self = StObject.set(x, "handlerDidError", js.Any.fromFunction1(value))
    
    inline def setHandlerDidErrorUndefined: Self = StObject.set(x, "handlerDidError", js.undefined)
    
    inline def setHandlerDidRespond(value: /* param */ HandlerDidRespondCallbackParam => js.Promise[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "handlerDidRespond", js.Any.fromFunction1(value))
    
    inline def setHandlerDidRespondUndefined: Self = StObject.set(x, "handlerDidRespond", js.undefined)
    
    inline def setHandlerWillRespond(value: /* param */ HandlerWillRespondCallbackParam => js.Promise[Response]): Self = StObject.set(x, "handlerWillRespond", js.Any.fromFunction1(value))
    
    inline def setHandlerWillRespondUndefined: Self = StObject.set(x, "handlerWillRespond", js.undefined)
    
    inline def setHandlerWillStart(value: /* param */ HandlerWillStartCallbackParam => js.Promise[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "handlerWillStart", js.Any.fromFunction1(value))
    
    inline def setHandlerWillStartUndefined: Self = StObject.set(x, "handlerWillStart", js.undefined)
    
    inline def setRequestWillFetch(value: /* param */ RequestWillFetchCallbackParam => js.Promise[Request]): Self = StObject.set(x, "requestWillFetch", js.Any.fromFunction1(value))
    
    inline def setRequestWillFetchUndefined: Self = StObject.set(x, "requestWillFetch", js.undefined)
  }
}
