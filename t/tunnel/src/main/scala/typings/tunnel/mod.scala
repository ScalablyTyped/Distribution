package typings.tunnel

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tunnel", "httpOverHttp")
  @js.native
  def httpOverHttp(): Agent = js.native
  @JSImport("tunnel", "httpOverHttp")
  @js.native
  def httpOverHttp(options: HttpOptions): Agent = js.native
  
  @JSImport("tunnel", "httpOverHttps")
  @js.native
  def httpOverHttps(): Agent = js.native
  @JSImport("tunnel", "httpOverHttps")
  @js.native
  def httpOverHttps(options: HttpOverHttpsOptions): Agent = js.native
  
  @JSImport("tunnel", "httpsOverHttp")
  @js.native
  def httpsOverHttp(): Agent = js.native
  @JSImport("tunnel", "httpsOverHttp")
  @js.native
  def httpsOverHttp(options: HttpsOverHttpOptions): Agent = js.native
  
  @JSImport("tunnel", "httpsOverHttps")
  @js.native
  def httpsOverHttps(): Agent = js.native
  @JSImport("tunnel", "httpsOverHttps")
  @js.native
  def httpsOverHttps(options: HttpsOverHttpsOptions): Agent = js.native
  
  @js.native
  trait HttpOptions extends StObject {
    
    var maxSockets: js.UndefOr[Double] = js.native
    
    var proxy: js.UndefOr[ProxyOptions] = js.native
  }
  object HttpOptions {
    
    @scala.inline
    def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit class HttpOptionsMutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      @scala.inline
      def setProxy(value: ProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait HttpOverHttpsOptions extends HttpOptions {
    
    @JSName("proxy")
    var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.native
  }
  object HttpOverHttpsOptions {
    
    @scala.inline
    def apply(): HttpOverHttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOverHttpsOptions]
    }
    
    @scala.inline
    implicit class HttpOverHttpsOptionsMutableBuilder[Self <: HttpOverHttpsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: HttpsProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait HttpsOverHttpOptions extends HttpOptions {
    
    var ca: js.UndefOr[js.Array[Buffer]] = js.native
    
    var cert: js.UndefOr[Buffer] = js.native
    
    var key: js.UndefOr[Buffer] = js.native
  }
  object HttpsOverHttpOptions {
    
    @scala.inline
    def apply(): HttpsOverHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOverHttpOptions]
    }
    
    @scala.inline
    implicit class HttpsOverHttpOptionsMutableBuilder[Self <: HttpsOverHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Array[Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: Buffer*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait HttpsOverHttpsOptions extends HttpsOverHttpOptions {
    
    @JSName("proxy")
    var proxy_HttpsOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.native
  }
  object HttpsOverHttpsOptions {
    
    @scala.inline
    def apply(): HttpsOverHttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOverHttpsOptions]
    }
    
    @scala.inline
    implicit class HttpsOverHttpsOptionsMutableBuilder[Self <: HttpsOverHttpsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: HttpsProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait HttpsProxyOptions extends ProxyOptions {
    
    var ca: js.UndefOr[js.Array[Buffer]] = js.native
    
    var cert: js.UndefOr[Buffer] = js.native
    
    var key: js.UndefOr[Buffer] = js.native
    
    var servername: js.UndefOr[String] = js.native
  }
  object HttpsProxyOptions {
    
    @scala.inline
    def apply(host: String, port: Double): HttpsProxyOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsProxyOptions]
    }
    
    @scala.inline
    implicit class HttpsProxyOptionsMutableBuilder[Self <: HttpsProxyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Array[Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: Buffer*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  @js.native
  trait ProxyOptions extends StObject {
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var host: String = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var proxyAuth: js.UndefOr[String] = js.native
  }
  object ProxyOptions {
    
    @scala.inline
    def apply(host: String, port: Double): ProxyOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyOptions]
    }
    
    @scala.inline
    implicit class ProxyOptionsMutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
    }
  }
}
