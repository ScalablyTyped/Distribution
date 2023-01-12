package typings.waitOn

import typings.node.tlsMod.SecureContextOptions
import typings.std.Record
import typings.waitOn.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: WaitOnOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(options: WaitOnOptions, cb: js.Function1[/* err */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("wait-on", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AxiosProxyConfig extends StObject {
    
    var auth: js.UndefOr[Password] = js.undefined
    
    var host: String
    
    var port: Double
    
    var protocol: js.UndefOr[String] = js.undefined
  }
  object AxiosProxyConfig {
    
    inline def apply(host: String, port: Double): AxiosProxyConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosProxyConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AxiosProxyConfig] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait HttpSignature extends StObject {
    
    var key: String
    
    var keyId: String
  }
  object HttpSignature {
    
    inline def apply(key: String, keyId: String): HttpSignature = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpSignature] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidateStatus = js.Function1[/* status */ Double, Boolean]
  
  trait WaitOnAuth extends StObject {
    
    var password: String
    
    var username: String
  }
  object WaitOnAuth {
    
    inline def apply(password: String, username: String): WaitOnAuth = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitOnAuth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitOnAuth] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitOnOptions
    extends StObject
       with SecureContextOptions {
    
    /**
      * Https specific option.
      * see https://github.com/request/request#readme for specific details
      */
    var auth: js.UndefOr[WaitOnAuth] = js.undefined
    
    /**
      * Initial delay in ms.
      * @default 0
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * http HEAD/GET timeout to wait for request
      * @default 0
      */
    var httpTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Poll resource interval in ms,
      * @default 250ms
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Flag which outputs to stdout, remaining resources waited on and when complete or any error occurs.
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Proxy options.
      * see https://github.com/axios/axios#config-defaults
      */
    var proxy: js.UndefOr[AxiosProxyConfig] = js.undefined
    
    /**
      * Array of string resources to wait for. prefix determines the type of resource with the default type of file:
      */
    var resources: js.Array[String]
    
    /**
      * Flag to reverse operation so checks are for resources being NOT available.
      * @default false
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit of concurrent connections to a resource
      * @default Infinity
      */
    var simultaneous: js.UndefOr[Double] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tcp timeout in ms.
      * @default 300
      */
    var tcpTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Timeout in ms until it aborts with error.
      * @default Infinity
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Validates whether a status is valid.
      */
    var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
    
    /**
      * Flag which outputs debug output.
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stabilization time in ms
      * Waits this amount of time for file sizes to stabilize or other resource availability to remain unchanged.
      * @default 750ms.
      */
    var window: js.UndefOr[Double] = js.undefined
  }
  object WaitOnOptions {
    
    inline def apply(resources: js.Array[String]): WaitOnOptions = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitOnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitOnOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: WaitOnAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpTimeout(value: Double): Self = StObject.set(x, "httpTimeout", value.asInstanceOf[js.Any])
      
      inline def setHttpTimeoutUndefined: Self = StObject.set(x, "httpTimeout", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSimultaneous(value: Double): Self = StObject.set(x, "simultaneous", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousUndefined: Self = StObject.set(x, "simultaneous", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      inline def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
