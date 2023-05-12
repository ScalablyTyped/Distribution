package typings.workboxCore.typesMod

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerDidErrorCallbackParam extends StObject {
  
  var error: js.Error
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var request: Request
  
  var state: js.UndefOr[PluginState] = js.undefined
}
object HandlerDidErrorCallbackParam {
  
  inline def apply(
    error: js.Error,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request
  ): HandlerDidErrorCallbackParam = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerDidErrorCallbackParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerDidErrorCallbackParam] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setState(value: PluginState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
