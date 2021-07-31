package typings.workboxRouting

import typings.std.Request
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMatchCallbackMod {
  
  type RouteMatchCallback[R] = js.Function1[/* options */ RouteMatchCallbackOptions, R]
  
  trait RouteMatchCallbackOptions extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var url: URL
  }
  object RouteMatchCallbackOptions {
    
    @scala.inline
    def apply(url: URL): RouteMatchCallbackOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteMatchCallbackOptions]
    }
    
    @scala.inline
    implicit class RouteMatchCallbackOptionsMutableBuilder[Self <: RouteMatchCallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
