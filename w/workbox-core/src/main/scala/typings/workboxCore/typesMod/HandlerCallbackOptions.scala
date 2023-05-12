package typings.workboxCore.typesMod

import typings.std.Request
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.workboxCore.typesMod.RouteHandlerCallbackOptions
  - typings.workboxCore.typesMod.ManualHandlerCallbackOptions
*/
trait HandlerCallbackOptions extends StObject
object HandlerCallbackOptions {
  
  inline def ManualHandlerCallbackOptions(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request | String
  ): typings.workboxCore.typesMod.ManualHandlerCallbackOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.workboxCore.typesMod.ManualHandlerCallbackOptions]
  }
  
  inline def RouteHandlerCallbackOptions(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
    request: Request,
    url: URL
  ): typings.workboxCore.typesMod.RouteHandlerCallbackOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.workboxCore.typesMod.RouteHandlerCallbackOptions]
  }
}
