package typings.web3ProvidersHttp

import typings.node.httpMod.Agent
import typings.web3CoreHelpers.mod.HttpProviderBase
import typings.web3CoreHelpers.mod.JsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-providers-http", "HttpProvider")
  @js.native
  open class HttpProvider () extends HttpProviderBase {
    def this(host: String) = this()
    def this(host: String, options: HttpProviderOptions) = this()
    def this(host: Unit, options: HttpProviderOptions) = this()
    
    var agent: js.UndefOr[HttpProviderAgent] = js.native
    
    var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
    
    def send(payload: js.Object): Unit = js.native
    def send(
      payload: js.Object,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
    ): Unit = js.native
    
    var timeout: Double = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  
  trait HttpHeader extends StObject {
    
    var name: String
    
    var value: String
  }
  object HttpHeader {
    
    inline def apply(name: String, value: String): HttpHeader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpHeader] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpProviderAgent extends StObject {
    
    var http: js.UndefOr[Agent] = js.undefined
    
    var https: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
  }
  object HttpProviderAgent {
    
    inline def apply(): HttpProviderAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProviderAgent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpProviderAgent] (val x: Self) extends AnyVal {
      
      inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  trait HttpProviderOptions extends StObject {
    
    var agent: js.UndefOr[HttpProviderAgent] = js.undefined
    
    var headers: js.UndefOr[js.Array[HttpHeader]] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object HttpProviderOptions {
    
    inline def apply(): HttpProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: HttpProviderAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
