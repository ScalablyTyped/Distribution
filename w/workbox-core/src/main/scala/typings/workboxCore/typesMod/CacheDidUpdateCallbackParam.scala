package typings.workboxCore.typesMod

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheDidUpdateCallbackParam extends StObject {
  
  var cacheName: String
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var newResponse: Response
  
  var oldResponse: js.UndefOr[Response | Null] = js.undefined
  
  var request: Request
  
  var state: js.UndefOr[PluginState] = js.undefined
}
object CacheDidUpdateCallbackParam {
  
  inline def apply(
    cacheName: String,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    newResponse: Response,
    request: Request
  ): CacheDidUpdateCallbackParam = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDidUpdateCallbackParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheDidUpdateCallbackParam] (val x: Self) extends AnyVal {
    
    inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNewResponse(value: Response): Self = StObject.set(x, "newResponse", value.asInstanceOf[js.Any])
    
    inline def setOldResponse(value: Response): Self = StObject.set(x, "oldResponse", value.asInstanceOf[js.Any])
    
    inline def setOldResponseNull: Self = StObject.set(x, "oldResponse", null)
    
    inline def setOldResponseUndefined: Self = StObject.set(x, "oldResponse", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setState(value: PluginState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
