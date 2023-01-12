package typings.tunnel

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tunnel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def httpOverHttp(): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpOverHttp")().asInstanceOf[Agent]
  inline def httpOverHttp(options: HttpOptions): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpOverHttp")(options.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  inline def httpOverHttps(): typings.node.httpsMod.Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpOverHttps")().asInstanceOf[typings.node.httpsMod.Agent]
  inline def httpOverHttps(options: HttpOverHttpsOptions): typings.node.httpsMod.Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpOverHttps")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.httpsMod.Agent]
  
  inline def httpsOverHttp(): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsOverHttp")().asInstanceOf[Agent]
  inline def httpsOverHttp(options: HttpsOverHttpOptions): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsOverHttp")(options.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  inline def httpsOverHttps(): typings.node.httpsMod.Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsOverHttps")().asInstanceOf[typings.node.httpsMod.Agent]
  inline def httpsOverHttps(options: HttpsOverHttpsOptions): typings.node.httpsMod.Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsOverHttps")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.httpsMod.Agent]
  
  trait HttpOptions extends StObject {
    
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[ProxyOptions] = js.undefined
  }
  object HttpOptions {
    
    inline def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setProxy(value: ProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait HttpOverHttpsOptions
    extends StObject
       with HttpOptions {
    
    @JSName("proxy")
    var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
  }
  object HttpOverHttpsOptions {
    
    inline def apply(): HttpOverHttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOverHttpsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpOverHttpsOptions] (val x: Self) extends AnyVal {
      
      inline def setProxy(value: HttpsProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait HttpsOverHttpOptions
    extends StObject
       with HttpOptions {
    
    var ca: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    var cert: js.UndefOr[Buffer] = js.undefined
    
    var key: js.UndefOr[Buffer] = js.undefined
  }
  object HttpsOverHttpOptions {
    
    inline def apply(): HttpsOverHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOverHttpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpsOverHttpOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: js.Array[Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: Buffer*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait HttpsOverHttpsOptions
    extends StObject
       with HttpsOverHttpOptions {
    
    @JSName("proxy")
    var proxy_HttpsOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
  }
  object HttpsOverHttpsOptions {
    
    inline def apply(): HttpsOverHttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOverHttpsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpsOverHttpsOptions] (val x: Self) extends AnyVal {
      
      inline def setProxy(value: HttpsProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait HttpsProxyOptions
    extends StObject
       with ProxyOptions {
    
    var ca: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    var cert: js.UndefOr[Buffer] = js.undefined
    
    var key: js.UndefOr[Buffer] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
  }
  object HttpsProxyOptions {
    
    inline def apply(host: String, port: Double): HttpsProxyOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsProxyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpsProxyOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: js.Array[Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: Buffer*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait ProxyOptions extends StObject {
    
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var host: String
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var proxyAuth: js.UndefOr[String] = js.undefined
  }
  object ProxyOptions {
    
    inline def apply(host: String, port: Double): ProxyOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      inline def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
    }
  }
}
