package typings.undici

import typings.node.urlMod.URL_
import typings.undici.typesClientMod.Client.Options
import typings.undici.typesConnectorMod.buildConnector.BuildOptions
import typings.undici.typesConnectorMod.buildConnector.Callback
import typings.undici.typesConnectorMod.buildConnector.connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @JSImport("undici/types/client", JSImport.Default)
  @js.native
  open class default protected () extends Client {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: Options) = this()
    def this(url: URL_, options: Options) = this()
  }
  
  @JSImport("undici/types/client", "Client")
  @js.native
  open class Client protected ()
    extends typings.undici.typesDispatcherMod.default {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: Options) = this()
    def this(url: URL_, options: Options) = this()
    
    /** `true` after `client.close()` has been called. */
    var closed: Boolean = js.native
    
    /** `true` after `client.destroyed()` has been called or `client.close()` has been called and the client shutdown has completed. */
    var destroyed: Boolean = js.native
    
    /** Property to get and set the pipelining factor. */
    var pipelining: Double = js.native
  }
  object Client {
    
    trait Options extends StObject {
      
      /** Enables a family autodetection algorithm that loosely implements section 5 of RFC 8305. */
      var autoSelectFamily: js.UndefOr[Boolean] = js.undefined
      
      /** The amount of time in milliseconds to wait for a connection attempt to finish before trying the next address when using the `autoSelectFamily` option. */
      var autoSelectFamilyAttemptTimeout: js.UndefOr[Double] = js.undefined
      
      /** The timeout after which a request will time out, in milliseconds. Monitors time between receiving body data. Use `0` to disable it entirely. Default: `300e3` milliseconds (300s). */
      var bodyTimeout: js.UndefOr[Double] = js.undefined
      
      /** TODO */
      var connect: js.UndefOr[BuildOptions | connector] = js.undefined
      
      /** TODO */
      var connectTimeout: js.UndefOr[Double] = js.undefined
      
      /** The amount of time the parser will wait to receive the complete HTTP headers (Node 14 and above only). Default: `300e3` milliseconds (300s). */
      var headersTimeout: js.UndefOr[Double] = js.undefined
      
      /** @deprecated unsupported idleTimeout, use keepAliveTimeout instead */
      var idleTimeout: js.UndefOr[scala.Nothing] = js.undefined
      
      /** TODO */
      var interceptors: js.UndefOr[OptionsInterceptors] = js.undefined
      
      /** @deprecated unsupported keepAlive, use pipelining=0 instead */
      var keepAlive: js.UndefOr[scala.Nothing] = js.undefined
      
      /** the maximum allowed `idleTimeout` when overridden by *keep-alive* hints from the server. Default: `600e3` milliseconds (10min). */
      var keepAliveMaxTimeout: js.UndefOr[Double] = js.undefined
      
      /** the timeout after which a socket without active requests will time out. Monitors time between activity on a connected socket. This value may be overridden by *keep-alive* hints from the server. Default: `4e3` milliseconds (4s). */
      var keepAliveTimeout: js.UndefOr[Double] = js.undefined
      
      /** A number subtracted from server *keep-alive* hints when overriding `idleTimeout` to account for timing inaccuracies caused by e.g. transport latency. Default: `1e3` milliseconds (1s). */
      var keepAliveTimeoutThreshold: js.UndefOr[Double] = js.undefined
      
      /** TODO */
      var localAddress: js.UndefOr[String] = js.undefined
      
      /** TODO */
      var maxCachedSessions: js.UndefOr[Double] = js.undefined
      
      /** The maximum length of request headers in bytes. Default: `16384` (16KiB). */
      var maxHeaderSize: js.UndefOr[Double] = js.undefined
      
      /** @deprecated unsupported maxKeepAliveTimeout, use keepAliveMaxTimeout instead */
      var maxKeepAliveTimeout: js.UndefOr[scala.Nothing] = js.undefined
      
      /** TODO */
      var maxRedirections: js.UndefOr[Double] = js.undefined
      
      /** TODO */
      var maxRequestsPerClient: js.UndefOr[Double] = js.undefined
      
      /** Max response body size in bytes, -1 is disabled */
      var maxResponseSize: js.UndefOr[Double] = js.undefined
      
      /** The amount of concurrent requests to be sent over the single TCP/TLS connection according to [RFC7230](https://tools.ietf.org/html/rfc7230#section-6.3.2). Default: `1`. */
      var pipelining: js.UndefOr[Double] = js.undefined
      
      /** @deprecated unsupported requestTimeout, use headersTimeout & bodyTimeout instead */
      var requestTimeout: js.UndefOr[scala.Nothing] = js.undefined
      
      /** TODO */
      var socketPath: js.UndefOr[String] = js.undefined
      
      /** @deprecated unsupported socketTimeout, use headersTimeout & bodyTimeout instead */
      var socketTimeout: js.UndefOr[scala.Nothing] = js.undefined
      
      /** If `true`, an error is thrown when the request content-length header doesn't match the length of the request body. Default: `true`. */
      var strictContentLength: js.UndefOr[Boolean] = js.undefined
      
      /** @deprecated use the connect option instead */
      var tls: js.UndefOr[scala.Nothing] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAutoSelectFamily(value: Boolean): Self = StObject.set(x, "autoSelectFamily", value.asInstanceOf[js.Any])
        
        inline def setAutoSelectFamilyAttemptTimeout(value: Double): Self = StObject.set(x, "autoSelectFamilyAttemptTimeout", value.asInstanceOf[js.Any])
        
        inline def setAutoSelectFamilyAttemptTimeoutUndefined: Self = StObject.set(x, "autoSelectFamilyAttemptTimeout", js.undefined)
        
        inline def setAutoSelectFamilyUndefined: Self = StObject.set(x, "autoSelectFamily", js.undefined)
        
        inline def setBodyTimeout(value: Double): Self = StObject.set(x, "bodyTimeout", value.asInstanceOf[js.Any])
        
        inline def setBodyTimeoutUndefined: Self = StObject.set(x, "bodyTimeout", js.undefined)
        
        inline def setConnect(value: BuildOptions | connector): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
        
        inline def setConnectFunction2(
          value: (/* options */ typings.undici.typesConnectorMod.buildConnector.Options, /* callback */ Callback) => Unit
        ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
        
        inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
        
        inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
        
        inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
        
        inline def setHeadersTimeout(value: Double): Self = StObject.set(x, "headersTimeout", value.asInstanceOf[js.Any])
        
        inline def setHeadersTimeoutUndefined: Self = StObject.set(x, "headersTimeout", js.undefined)
        
        inline def setInterceptors(value: OptionsInterceptors): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
        
        inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
        
        inline def setKeepAliveMaxTimeout(value: Double): Self = StObject.set(x, "keepAliveMaxTimeout", value.asInstanceOf[js.Any])
        
        inline def setKeepAliveMaxTimeoutUndefined: Self = StObject.set(x, "keepAliveMaxTimeout", js.undefined)
        
        inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
        
        inline def setKeepAliveTimeoutThreshold(value: Double): Self = StObject.set(x, "keepAliveTimeoutThreshold", value.asInstanceOf[js.Any])
        
        inline def setKeepAliveTimeoutThresholdUndefined: Self = StObject.set(x, "keepAliveTimeoutThreshold", js.undefined)
        
        inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
        
        inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        inline def setMaxCachedSessions(value: Double): Self = StObject.set(x, "maxCachedSessions", value.asInstanceOf[js.Any])
        
        inline def setMaxCachedSessionsUndefined: Self = StObject.set(x, "maxCachedSessions", js.undefined)
        
        inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
        
        inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
        
        inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
        
        inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
        
        inline def setMaxRequestsPerClient(value: Double): Self = StObject.set(x, "maxRequestsPerClient", value.asInstanceOf[js.Any])
        
        inline def setMaxRequestsPerClientUndefined: Self = StObject.set(x, "maxRequestsPerClient", js.undefined)
        
        inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
        
        inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
        
        inline def setPipelining(value: Double): Self = StObject.set(x, "pipelining", value.asInstanceOf[js.Any])
        
        inline def setPipeliningUndefined: Self = StObject.set(x, "pipelining", js.undefined)
        
        inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
        
        inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
        
        inline def setStrictContentLength(value: Boolean): Self = StObject.set(x, "strictContentLength", value.asInstanceOf[js.Any])
        
        inline def setStrictContentLengthUndefined: Self = StObject.set(x, "strictContentLength", js.undefined)
      }
    }
    
    trait OptionsInterceptors extends StObject {
      
      var Client: js.Array[typings.undici.typesDispatcherMod.default]
    }
    object OptionsInterceptors {
      
      inline def apply(Client: js.Array[typings.undici.typesDispatcherMod.default]): OptionsInterceptors = {
        val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
        __obj.asInstanceOf[OptionsInterceptors]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OptionsInterceptors] (val x: Self) extends AnyVal {
        
        inline def setClient(value: js.Array[typings.undici.typesDispatcherMod.default]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
        
        inline def setClientVarargs(value: typings.undici.typesDispatcherMod.default*): Self = StObject.set(x, "Client", js.Array(value*))
      }
    }
    
    trait SocketInfo extends StObject {
      
      var bytesRead: js.UndefOr[Double] = js.undefined
      
      var bytesWritten: js.UndefOr[Double] = js.undefined
      
      var localAddress: js.UndefOr[String] = js.undefined
      
      var localPort: js.UndefOr[Double] = js.undefined
      
      var remoteAddress: js.UndefOr[String] = js.undefined
      
      var remoteFamily: js.UndefOr[String] = js.undefined
      
      var remotePort: js.UndefOr[Double] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object SocketInfo {
      
      inline def apply(): SocketInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SocketInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
        
        inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
        
        inline def setBytesReadUndefined: Self = StObject.set(x, "bytesRead", js.undefined)
        
        inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
        
        inline def setBytesWrittenUndefined: Self = StObject.set(x, "bytesWritten", js.undefined)
        
        inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
        
        inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
        
        inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
        
        inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
        
        inline def setRemoteFamily(value: String): Self = StObject.set(x, "remoteFamily", value.asInstanceOf[js.Any])
        
        inline def setRemoteFamilyUndefined: Self = StObject.set(x, "remoteFamily", js.undefined)
        
        inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
        
        inline def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}
