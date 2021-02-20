package typings.web3ProvidersHttp

import typings.node.httpMod.Agent
import typings.std.Error
import typings.web3CoreHelpers.mod.HttpProviderBase
import typings.web3CoreHelpers.mod.JsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-providers-http", "HttpProvider")
  @js.native
  class HttpProvider () extends HttpProviderBase {
    def this(host: String) = this()
    def this(host: js.UndefOr[scala.Nothing], options: HttpProviderOptions) = this()
    def this(host: String, options: HttpProviderOptions) = this()
    
    var agent: js.UndefOr[HttpProviderAgent] = js.native
    
    var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
    
    def send(payload: js.Object): Unit = js.native
    def send(
      payload: js.Object,
      callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
    ): Unit = js.native
    
    var timeout: Double = js.native
    
    var withCredentials: Boolean = js.native
  }
  
  @js.native
  trait HttpHeader extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object HttpHeader {
    
    @scala.inline
    def apply(name: String, value: String): HttpHeader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpHeader]
    }
    
    @scala.inline
    implicit class HttpHeaderMutableBuilder[Self <: HttpHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpProviderAgent extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var http: js.UndefOr[Agent] = js.native
    
    var https: js.UndefOr[typings.node.httpsMod.Agent] = js.native
  }
  object HttpProviderAgent {
    
    @scala.inline
    def apply(): HttpProviderAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProviderAgent]
    }
    
    @scala.inline
    implicit class HttpProviderAgentMutableBuilder[Self <: HttpProviderAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  @js.native
  trait HttpProviderOptions extends StObject {
    
    var agent: js.UndefOr[HttpProviderAgent] = js.native
    
    var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object HttpProviderOptions {
    
    @scala.inline
    def apply(): HttpProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProviderOptions]
    }
    
    @scala.inline
    implicit class HttpProviderOptionsMutableBuilder[Self <: HttpProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: HttpProviderAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
