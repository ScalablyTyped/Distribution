package typings.workboxBuild.buildTypesMod

import typings.std.Response
import typings.workboxBuild.anon.BackgroundSync
import typings.workboxCore.typesMod.RouteHandler
import typings.workboxCore.typesMod.RouteHandlerCallbackOptions
import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxCore.typesMod.RouteMatchCallbackOptions
import typings.workboxRouting.utilsConstantsMod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeCaching extends StObject {
  
  /**
    * This determines how the runtime route will generate a response.
    * To use one of the built-in {@link workbox-strategies}, provide its name,
    * like `'NetworkFirst'`.
    * Alternatively, this can be a {@link workbox-core.RouteHandler} callback
    * function with custom response logic.
    */
  var handler: RouteHandler | StrategyName
  
  /**
    * The HTTP method to match against. The default value of `'GET'` is normally
    * sufficient, unless you explicitly need to match `'POST'`, `'PUT'`, or
    * another type of request.
    * @default "GET"
    */
  var method: js.UndefOr[HTTPMethod] = js.undefined
  
  var options: js.UndefOr[BackgroundSync] = js.undefined
  
  /**
    * This match criteria determines whether the configured handler will
    * generate a response for any requests that don't match one of the precached
    * URLs. If multiple `RuntimeCaching` routes are defined, then the first one
    * whose `urlPattern` matches will be the one that responds.
    *
    * This value directly maps to the first parameter passed to
    * {@link workbox-routing.registerRoute}. It's recommended to use a
    * {@link workbox-core.RouteMatchCallback} function for greatest flexibility.
    */
  var urlPattern: js.RegExp | String | RouteMatchCallback
}
object RuntimeCaching {
  
  inline def apply(handler: RouteHandler | StrategyName, urlPattern: js.RegExp | String | RouteMatchCallback): RuntimeCaching = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCaching]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeCaching] (val x: Self) extends AnyVal {
    
    inline def setHandler(value: RouteHandler | StrategyName): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerFunction1(value: /* options */ RouteHandlerCallbackOptions => js.Promise[Response]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setMethod(value: HTTPMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOptions(value: BackgroundSync): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrlPattern(value: js.RegExp | String | RouteMatchCallback): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternFunction1(value: /* options */ RouteMatchCallbackOptions => Any): Self = StObject.set(x, "urlPattern", js.Any.fromFunction1(value))
  }
}
