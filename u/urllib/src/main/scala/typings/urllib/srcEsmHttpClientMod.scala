package typings.urllib

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.LookupFunction
import typings.urllib.anon.Cert
import typings.urllib.srcEsmHttpAgentMod.CheckAddressFunction
import typings.urllib.srcEsmRequestMod.RequestOptions
import typings.urllib.srcEsmRequestMod.RequestURL
import typings.urllib.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmHttpClientMod {
  
  @JSImport("urllib/src/esm/HttpClient", "HEADER_USER_AGENT")
  @js.native
  val HEADER_USER_AGENT: String = js.native
  
  @JSImport("urllib/src/esm/HttpClient", "HttpClient")
  @js.native
  open class HttpClient () extends EventEmitter {
    def this(clientOptions: ClientOptions) = this()
    
    /* private */ var `private`: Any = js.native
    
    def request(url: RequestURL): js.Promise[HttpClientResponse] = js.native
    def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = js.native
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * check request address to protect from SSRF and similar attacks.
      * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
      * It rely on lookup and have the same version requirement.
      */
    var checkAddress: js.UndefOr[CheckAddressFunction] = js.undefined
    
    var connect: js.UndefOr[Cert] = js.undefined
    
    var defaultArgs: js.UndefOr[RequestOptions] = js.undefined
    
    /**
      * Custom DNS lookup function, default is `dns.lookup`.
      */
    var lookup: js.UndefOr[LookupFunction] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = StObject.set(x, "checkAddress", js.Any.fromFunction2(value))
      
      inline def setCheckAddressUndefined: Self = StObject.set(x, "checkAddress", js.undefined)
      
      inline def setConnect(value: Cert): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDefaultArgs(value: RequestOptions): Self = StObject.set(x, "defaultArgs", value.asInstanceOf[js.Any])
      
      inline def setDefaultArgsUndefined: Self = StObject.set(x, "defaultArgs", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
}
