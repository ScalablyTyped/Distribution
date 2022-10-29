package typings.undici

import typings.undici.anon.TlsOptionsservernamestrin
import typings.undici.typesAgentMod.DispatchOptions
import typings.undici.typesDispatcherMod.DispatchHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProxyAgentMod {
  
  @JSImport("undici/types/proxy-agent", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ProxyAgent {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  
  trait Options
    extends StObject
       with typings.undici.typesAgentMod.Options {
    
    /**
      * @deprecated use opts.token
      */
    var auth: js.UndefOr[String] = js.undefined
    
    var proxyTls: js.UndefOr[TlsOptionsservernamestrin] = js.undefined
    
    var requestTls: js.UndefOr[TlsOptionsservernamestrin] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var uri: String
  }
  object Options {
    
    inline def apply(uri: String): Options = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setProxyTls(value: TlsOptionsservernamestrin): Self = StObject.set(x, "proxyTls", value.asInstanceOf[js.Any])
      
      inline def setProxyTlsUndefined: Self = StObject.set(x, "proxyTls", js.undefined)
      
      inline def setRequestTls(value: TlsOptionsservernamestrin): Self = StObject.set(x, "requestTls", value.asInstanceOf[js.Any])
      
      inline def setRequestTlsUndefined: Self = StObject.set(x, "requestTls", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProxyAgent
    extends typings.undici.typesDispatcherMod.^ {
    
    def dispatch(options: DispatchOptions, handler: DispatchHandlers): Boolean = js.native
  }
}
