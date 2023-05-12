package typings.workboxCore.typesMod

import typings.std.CacheQueryOptions
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachedResponseWillBeUsedCallbackParam extends StObject {
  
  var cacheName: String
  
  var cachedResponse: js.UndefOr[Response] = js.undefined
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  
  var request: Request
  
  var state: js.UndefOr[PluginState] = js.undefined
}
object CachedResponseWillBeUsedCallbackParam {
  
  inline def apply(
    cacheName: String,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request
  ): CachedResponseWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResponseWillBeUsedCallbackParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CachedResponseWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
    
    inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setCachedResponse(value: Response): Self = StObject.set(x, "cachedResponse", value.asInstanceOf[js.Any])
    
    inline def setCachedResponseUndefined: Self = StObject.set(x, "cachedResponse", js.undefined)
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
    
    inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setState(value: PluginState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
