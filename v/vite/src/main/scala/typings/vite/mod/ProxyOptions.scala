package typings.vite.mod

import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.vite.mod.HttpProxy.Server
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions
  extends StObject
     with typings.vite.mod.HttpProxy.ServerOptions {
  
  /**
    * webpack-dev-server style bypass function
    */
  var bypass: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
      /* options */ this.type, 
      js.UndefOr[Unit | Null | `false` | String]
    ]
  ] = js.undefined
  
  /**
    * configure the proxy server (e.g. listen to events)
    */
  var configure: js.UndefOr[js.Function2[/* proxy */ Server, /* options */ this.type, Unit]] = js.undefined
  
  /**
    * rewrite path
    */
  var rewrite: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
}
object ProxyOptions {
  
  inline def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
    inline def setBypass(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], ProxyOptions) => js.UndefOr[Unit | Null | `false` | String]
    ): Self = StObject.set(x, "bypass", js.Any.fromFunction3(value))
    
    inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
    
    inline def setConfigure(value: (/* proxy */ Server, ProxyOptions) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
    
    inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    inline def setRewrite(value: /* path */ String => String): Self = StObject.set(x, "rewrite", js.Any.fromFunction1(value))
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
  }
}
