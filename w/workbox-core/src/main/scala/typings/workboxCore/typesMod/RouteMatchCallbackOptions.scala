package typings.workboxCore.typesMod

import typings.std.Request
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteMatchCallbackOptions extends StObject {
  
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
  
  var request: Request
  
  var sameOrigin: Boolean
  
  var url: URL
}
object RouteMatchCallbackOptions {
  
  inline def apply(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request,
    sameOrigin: Boolean,
    url: URL
  ): RouteMatchCallbackOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], sameOrigin = sameOrigin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteMatchCallbackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteMatchCallbackOptions] (val x: Self) extends AnyVal {
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSameOrigin(value: Boolean): Self = StObject.set(x, "sameOrigin", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
