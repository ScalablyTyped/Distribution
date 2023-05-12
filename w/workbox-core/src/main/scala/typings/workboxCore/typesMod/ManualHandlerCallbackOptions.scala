package typings.workboxCore.typesMod

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualHandlerCallbackOptions
  extends StObject
     with HandlerCallbackOptions {
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var request: Request | String
}
object ManualHandlerCallbackOptions {
  
  inline def apply(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request | String
  ): ManualHandlerCallbackOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualHandlerCallbackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualHandlerCallbackOptions] (val x: Self) extends AnyVal {
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request | String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
