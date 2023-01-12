package typings.webpackDevServer.mod

import typings.httpProxyMiddleware.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyConfigArrayItem
  extends StObject
     with Options {
  
  var bypass: js.UndefOr[ByPass] = js.undefined
  
  var context: js.UndefOr[HttpProxyMiddlewareOptionsFilter] = js.undefined
  
  var path: js.UndefOr[HttpProxyMiddlewareOptionsFilter] = js.undefined
}
object ProxyConfigArrayItem {
  
  inline def apply(): ProxyConfigArrayItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigArrayItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyConfigArrayItem] (val x: Self) extends AnyVal {
    
    inline def setBypass(
      value: (/* req */ typings.std.Request, /* res */ typings.std.Response, /* proxyConfig */ ProxyConfigArrayItem) => Any
    ): Self = StObject.set(x, "bypass", js.Any.fromFunction3(value))
    
    inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
    
    inline def setContext(value: HttpProxyMiddlewareOptionsFilter): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextFunction2(
      value: (/* pathname */ String, /* req */ typings.httpProxyMiddleware.distTypesMod.Request) => Boolean
    ): Self = StObject.set(x, "context", js.Any.fromFunction2(value))
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setPath(value: HttpProxyMiddlewareOptionsFilter): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathFunction2(
      value: (/* pathname */ String, /* req */ typings.httpProxyMiddleware.distTypesMod.Request) => Boolean
    ): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
