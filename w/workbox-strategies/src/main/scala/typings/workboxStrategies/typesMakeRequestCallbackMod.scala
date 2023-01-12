package typings.workboxStrategies

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMakeRequestCallbackMod {
  
  type MakeRequestCallback = js.Function1[/* options */ MakeRequestCallbackOptions, js.Promise[Response]]
  
  trait MakeRequestCallbackOptions extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ] = js.undefined
    
    var request: String | Request
  }
  object MakeRequestCallbackOptions {
    
    inline def apply(request: String | Request): MakeRequestCallbackOptions = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeRequestCallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeRequestCallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setRequest(value: String | Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
