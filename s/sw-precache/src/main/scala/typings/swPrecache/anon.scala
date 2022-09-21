package typings.swPrecache

import typings.swPrecache.mod.Method
import typings.swToolbox.mod.Options_
import typings.swToolbox.mod.Request
import typings.swToolbox.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handler extends StObject {
    
    var handler: typings.swPrecache.mod.Handler
    
    var method: js.UndefOr[Method] = js.undefined
    
    var options: js.UndefOr[Options_] = js.undefined
    
    var urlPattern: js.RegExp | String
  }
  object Handler {
    
    inline def apply(handler: typings.swPrecache.mod.Handler, urlPattern: js.RegExp | String): Handler = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler]
    }
    
    extension [Self <: Handler](x: Self) {
      
      inline def setHandler(value: typings.swPrecache.mod.Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction1(value: /* request */ Request => js.Promise[Response]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOptions(value: Options_): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setUrlPattern(value: js.RegExp | String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    }
  }
}
