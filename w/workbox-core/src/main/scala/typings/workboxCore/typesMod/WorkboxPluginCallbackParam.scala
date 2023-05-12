package typings.workboxCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkboxPluginCallbackParam extends StObject {
  
  var cacheDidUpdate: CacheDidUpdateCallbackParam
  
  var cacheKeyWillBeUsed: CacheKeyWillBeUsedCallbackParam
  
  var cacheWillUpdate: CacheWillUpdateCallbackParam
  
  var cachedResponseWillBeUsed: CachedResponseWillBeUsedCallbackParam
  
  var fetchDidFail: FetchDidFailCallbackParam
  
  var fetchDidSucceed: FetchDidSucceedCallbackParam
  
  var handlerDidComplete: HandlerDidCompleteCallbackParam
  
  var handlerDidError: HandlerDidErrorCallbackParam
  
  var handlerDidRespond: HandlerDidRespondCallbackParam
  
  var handlerWillRespond: HandlerWillRespondCallbackParam
  
  var handlerWillStart: HandlerWillStartCallbackParam
  
  var requestWillFetch: RequestWillFetchCallbackParam
}
object WorkboxPluginCallbackParam {
  
  inline def apply(
    cacheDidUpdate: CacheDidUpdateCallbackParam,
    cacheKeyWillBeUsed: CacheKeyWillBeUsedCallbackParam,
    cacheWillUpdate: CacheWillUpdateCallbackParam,
    cachedResponseWillBeUsed: CachedResponseWillBeUsedCallbackParam,
    fetchDidFail: FetchDidFailCallbackParam,
    fetchDidSucceed: FetchDidSucceedCallbackParam,
    handlerDidComplete: HandlerDidCompleteCallbackParam,
    handlerDidError: HandlerDidErrorCallbackParam,
    handlerDidRespond: HandlerDidRespondCallbackParam,
    handlerWillRespond: HandlerWillRespondCallbackParam,
    handlerWillStart: HandlerWillStartCallbackParam,
    requestWillFetch: RequestWillFetchCallbackParam
  ): WorkboxPluginCallbackParam = {
    val __obj = js.Dynamic.literal(cacheDidUpdate = cacheDidUpdate.asInstanceOf[js.Any], cacheKeyWillBeUsed = cacheKeyWillBeUsed.asInstanceOf[js.Any], cacheWillUpdate = cacheWillUpdate.asInstanceOf[js.Any], cachedResponseWillBeUsed = cachedResponseWillBeUsed.asInstanceOf[js.Any], fetchDidFail = fetchDidFail.asInstanceOf[js.Any], fetchDidSucceed = fetchDidSucceed.asInstanceOf[js.Any], handlerDidComplete = handlerDidComplete.asInstanceOf[js.Any], handlerDidError = handlerDidError.asInstanceOf[js.Any], handlerDidRespond = handlerDidRespond.asInstanceOf[js.Any], handlerWillRespond = handlerWillRespond.asInstanceOf[js.Any], handlerWillStart = handlerWillStart.asInstanceOf[js.Any], requestWillFetch = requestWillFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxPluginCallbackParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkboxPluginCallbackParam] (val x: Self) extends AnyVal {
    
    inline def setCacheDidUpdate(value: CacheDidUpdateCallbackParam): Self = StObject.set(x, "cacheDidUpdate", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyWillBeUsed(value: CacheKeyWillBeUsedCallbackParam): Self = StObject.set(x, "cacheKeyWillBeUsed", value.asInstanceOf[js.Any])
    
    inline def setCacheWillUpdate(value: CacheWillUpdateCallbackParam): Self = StObject.set(x, "cacheWillUpdate", value.asInstanceOf[js.Any])
    
    inline def setCachedResponseWillBeUsed(value: CachedResponseWillBeUsedCallbackParam): Self = StObject.set(x, "cachedResponseWillBeUsed", value.asInstanceOf[js.Any])
    
    inline def setFetchDidFail(value: FetchDidFailCallbackParam): Self = StObject.set(x, "fetchDidFail", value.asInstanceOf[js.Any])
    
    inline def setFetchDidSucceed(value: FetchDidSucceedCallbackParam): Self = StObject.set(x, "fetchDidSucceed", value.asInstanceOf[js.Any])
    
    inline def setHandlerDidComplete(value: HandlerDidCompleteCallbackParam): Self = StObject.set(x, "handlerDidComplete", value.asInstanceOf[js.Any])
    
    inline def setHandlerDidError(value: HandlerDidErrorCallbackParam): Self = StObject.set(x, "handlerDidError", value.asInstanceOf[js.Any])
    
    inline def setHandlerDidRespond(value: HandlerDidRespondCallbackParam): Self = StObject.set(x, "handlerDidRespond", value.asInstanceOf[js.Any])
    
    inline def setHandlerWillRespond(value: HandlerWillRespondCallbackParam): Self = StObject.set(x, "handlerWillRespond", value.asInstanceOf[js.Any])
    
    inline def setHandlerWillStart(value: HandlerWillStartCallbackParam): Self = StObject.set(x, "handlerWillStart", value.asInstanceOf[js.Any])
    
    inline def setRequestWillFetch(value: RequestWillFetchCallbackParam): Self = StObject.set(x, "requestWillFetch", value.asInstanceOf[js.Any])
  }
}
