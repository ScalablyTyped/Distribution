package typings.undici

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TlsOptions
import typings.node.urlMod.URL_
import typings.undici.typesConnectorMod.BuildOptions
import typings.undici.typesConnectorMod.Callback
import typings.undici.typesConnectorMod.connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  /** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
  @JSImport("undici/types/client", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Client {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: Options) = this()
    def this(url: URL_, options: Options) = this()
  }
  
  /** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
  @js.native
  trait Client
    extends typings.undici.typesDispatcherMod.^ {
    
    /** `true` after `client.close()` has been called. */
    var closed: Boolean = js.native
    
    /** `true` after `client.destroyed()` has been called or `client.close()` has been called and the client shutdown has completed. */
    var destroyed: Boolean = js.native
    
    /** Property to get and set the pipelining factor. */
    var pipelining: Double = js.native
  }
  
  trait Options extends StObject {
    
    /** The timeout after which a request will time out, in milliseconds. Monitors time between receiving body data. Use `0` to disable it entirely. Default: `30e3` milliseconds (30s). */
    var bodyTimeout: js.UndefOr[Double | Null] = js.undefined
    
    /** **/
    var connect: js.UndefOr[BuildOptions | connector | Null] = js.undefined
    
    /** The amount of time the parser will wait to receive the complete HTTP headers (Node 14 and above only). Default: `30e3` milliseconds (30s). */
    var headersTimeout: js.UndefOr[Double | Null] = js.undefined
    
    var interceptors: js.UndefOr[typings.undici.anon.Client] = js.undefined
    
    /** the maximum allowed `idleTimeout` when overridden by *keep-alive* hints from the server. Default: `600e3` milliseconds (10min). */
    var keepAliveMaxTimeout: js.UndefOr[Double | Null] = js.undefined
    
    /** the timeout after which a socket without active requests will time out. Monitors time between activity on a connected socket. This value may be overridden by *keep-alive* hints from the server. Default: `4e3` milliseconds (4s). */
    var keepAliveTimeout: js.UndefOr[Double | Null] = js.undefined
    
    /** A number subtracted from server *keep-alive* hints when overriding `idleTimeout` to account for timing inaccuracies caused by e.g. transport latency. Default: `1e3` milliseconds (1s). */
    var keepAliveTimeoutThreshold: js.UndefOr[Double | Null] = js.undefined
    
    /** The maximum length of request headers in bytes. Default: `16384` (16KiB). */
    var maxHeaderSize: js.UndefOr[Double | Null] = js.undefined
    
    /** */
    var maxRequestsPerClient: js.UndefOr[Double] = js.undefined
    
    /** Max response body size in bytes, -1 is disabled */
    var maxResponseSize: js.UndefOr[Double | Null] = js.undefined
    
    /** The amount of concurrent requests to be sent over the single TCP/TLS connection according to [RFC7230](https://tools.ietf.org/html/rfc7230#section-6.3.2). Default: `1`. */
    var pipelining: js.UndefOr[Double | Null] = js.undefined
    
    /** If `true`, an error is thrown when the request content-length header doesn't match the length of the request body. Default: `true`. */
    var strictContentLength: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated use the connect option instead */
    var tls: js.UndefOr[TlsOptions | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBodyTimeout(value: Double): Self = StObject.set(x, "bodyTimeout", value.asInstanceOf[js.Any])
      
      inline def setBodyTimeoutNull: Self = StObject.set(x, "bodyTimeout", null)
      
      inline def setBodyTimeoutUndefined: Self = StObject.set(x, "bodyTimeout", js.undefined)
      
      inline def setConnect(value: BuildOptions | connector): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectFunction1(value: /* options */ typings.undici.typesConnectorMod.Options => Socket | TLSSocket): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setConnectFunction2(value: (/* options */ typings.undici.typesConnectorMod.Options, /* callback */ Callback) => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setConnectNull: Self = StObject.set(x, "connect", null)
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setHeadersTimeout(value: Double): Self = StObject.set(x, "headersTimeout", value.asInstanceOf[js.Any])
      
      inline def setHeadersTimeoutNull: Self = StObject.set(x, "headersTimeout", null)
      
      inline def setHeadersTimeoutUndefined: Self = StObject.set(x, "headersTimeout", js.undefined)
      
      inline def setInterceptors(value: typings.undici.anon.Client): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      inline def setKeepAliveMaxTimeout(value: Double): Self = StObject.set(x, "keepAliveMaxTimeout", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMaxTimeoutNull: Self = StObject.set(x, "keepAliveMaxTimeout", null)
      
      inline def setKeepAliveMaxTimeoutUndefined: Self = StObject.set(x, "keepAliveMaxTimeout", js.undefined)
      
      inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveTimeoutNull: Self = StObject.set(x, "keepAliveTimeout", null)
      
      inline def setKeepAliveTimeoutThreshold(value: Double): Self = StObject.set(x, "keepAliveTimeoutThreshold", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveTimeoutThresholdNull: Self = StObject.set(x, "keepAliveTimeoutThreshold", null)
      
      inline def setKeepAliveTimeoutThresholdUndefined: Self = StObject.set(x, "keepAliveTimeoutThreshold", js.undefined)
      
      inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
      
      inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHeaderSizeNull: Self = StObject.set(x, "maxHeaderSize", null)
      
      inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      inline def setMaxRequestsPerClient(value: Double): Self = StObject.set(x, "maxRequestsPerClient", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestsPerClientUndefined: Self = StObject.set(x, "maxRequestsPerClient", js.undefined)
      
      inline def setMaxResponseSize(value: Double): Self = StObject.set(x, "maxResponseSize", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseSizeNull: Self = StObject.set(x, "maxResponseSize", null)
      
      inline def setMaxResponseSizeUndefined: Self = StObject.set(x, "maxResponseSize", js.undefined)
      
      inline def setPipelining(value: Double): Self = StObject.set(x, "pipelining", value.asInstanceOf[js.Any])
      
      inline def setPipeliningNull: Self = StObject.set(x, "pipelining", null)
      
      inline def setPipeliningUndefined: Self = StObject.set(x, "pipelining", js.undefined)
      
      inline def setStrictContentLength(value: Boolean): Self = StObject.set(x, "strictContentLength", value.asInstanceOf[js.Any])
      
      inline def setStrictContentLengthUndefined: Self = StObject.set(x, "strictContentLength", js.undefined)
      
      inline def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsNull: Self = StObject.set(x, "tls", null)
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
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
