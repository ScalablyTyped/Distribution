package typings.workboxStrategies

import typings.std.Request
import typings.std.Response
import typings.workboxCore.typesMod.CacheDidUpdateCallback
import typings.workboxCore.typesMod.CacheDidUpdateCallbackParam
import typings.workboxCore.typesMod.CacheKeyWillBeUsedCallback
import typings.workboxCore.typesMod.CacheKeyWillBeUsedCallbackParam
import typings.workboxCore.typesMod.CacheWillUpdateCallback
import typings.workboxCore.typesMod.CacheWillUpdateCallbackParam
import typings.workboxCore.typesMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.typesMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.typesMod.FetchDidFailCallback
import typings.workboxCore.typesMod.FetchDidFailCallbackParam
import typings.workboxCore.typesMod.FetchDidSucceedCallback
import typings.workboxCore.typesMod.FetchDidSucceedCallbackParam
import typings.workboxCore.typesMod.HandlerDidCompleteCallback
import typings.workboxCore.typesMod.HandlerDidCompleteCallbackParam
import typings.workboxCore.typesMod.HandlerDidErrorCallback
import typings.workboxCore.typesMod.HandlerDidErrorCallbackParam
import typings.workboxCore.typesMod.HandlerDidRespondCallback
import typings.workboxCore.typesMod.HandlerDidRespondCallbackParam
import typings.workboxCore.typesMod.HandlerWillRespondCallback
import typings.workboxCore.typesMod.HandlerWillRespondCallbackParam
import typings.workboxCore.typesMod.HandlerWillStartCallback
import typings.workboxCore.typesMod.HandlerWillStartCallbackParam
import typings.workboxCore.typesMod.RequestWillFetchCallback
import typings.workboxCore.typesMod.RequestWillFetchCallbackParam
import typings.workboxStrategies.strategyHandlerMod.StrategyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handler extends StObject {
    
    var handler: StrategyHandler
    
    var logs: js.Array[Any]
    
    var request: Request
    
    var timeoutId: js.UndefOr[Double] = js.undefined
  }
  object Handler {
    
    inline def apply(handler: StrategyHandler, logs: js.Array[Any], request: Request): Handler = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: StrategyHandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[Any]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: Any*): Self = StObject.set(x, "logs", js.Array(value*))
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setTimeoutId(value: Double): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
    }
  }
  
  /* Inlined std.NonNullable<workbox-core.workbox-core/types.WorkboxPlugin> */
  trait NonNullableWorkboxPlugin extends StObject {
    
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
  object NonNullableWorkboxPlugin {
    
    inline def apply(): NonNullableWorkboxPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NonNullableWorkboxPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonNullableWorkboxPlugin] (val x: Self) extends AnyVal {
      
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
}
