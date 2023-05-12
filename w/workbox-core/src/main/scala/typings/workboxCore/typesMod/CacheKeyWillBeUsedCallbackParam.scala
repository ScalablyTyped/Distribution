package typings.workboxCore.typesMod

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKeyWillBeUsedCallbackParam extends StObject {
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var mode: String
  
  var params: js.UndefOr[Any] = js.undefined
  
  var request: Request
  
  var state: js.UndefOr[PluginState] = js.undefined
}
object CacheKeyWillBeUsedCallbackParam {
  
  inline def apply(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    mode: String,
    request: Request
  ): CacheKeyWillBeUsedCallbackParam = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKeyWillBeUsedCallbackParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheKeyWillBeUsedCallbackParam] (val x: Self) extends AnyVal {
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setState(value: PluginState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
