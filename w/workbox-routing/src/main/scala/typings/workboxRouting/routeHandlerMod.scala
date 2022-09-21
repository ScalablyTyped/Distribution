package typings.workboxRouting

import typings.std.Record
import typings.std.Request
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeHandlerMod {
  
  type RouteHandler = RouteHandlerCallback | RouteHandlerObject
  
  type RouteHandlerCallback = js.Function1[/* context */ RouteHandlerCallbackContext, js.Promise[Response]]
  
  trait RouteHandlerCallbackContext extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ Any
      ] = js.undefined
    
    var params: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var url: URL
  }
  object RouteHandlerCallbackContext {
    
    inline def apply(url: URL): RouteHandlerCallbackContext = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteHandlerCallbackContext]
    }
    
    extension [Self <: RouteHandlerCallbackContext](x: Self) {
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setParams(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteHandlerObject extends StObject {
    
    def handle(context: RouteHandlerCallbackContext): js.Promise[Response]
    @JSName("handle")
    var handle_Original: RouteHandlerCallback
  }
  object RouteHandlerObject {
    
    inline def apply(handle: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): RouteHandlerObject = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[RouteHandlerObject]
    }
    
    extension [Self <: RouteHandlerObject](x: Self) {
      
      inline def setHandle(value: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
}
