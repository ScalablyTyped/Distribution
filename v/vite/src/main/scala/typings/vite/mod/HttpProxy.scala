package typings.vite.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.nodeColonhttpMod.ClientRequest
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Stream
import typings.vite.anon.PartialUrl
import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.close
import typings.vite.viteStrings.econnreset
import typings.vite.viteStrings.end
import typings.vite.viteStrings.error
import typings.vite.viteStrings.proxyReq
import typings.vite.viteStrings.proxyReqWs
import typings.vite.viteStrings.proxyRes
import typings.vite.viteStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HttpProxy {
  
  @JSImport("vite", "HttpProxy.Server")
  @js.native
  /**
    * Creates the proxy server with specified options.
    * @param options - Config object passed to the proxy
    */
  open class Server () extends EventEmitter {
    def this(options: typings.vite.mod.HttpProxy.ServerOptions) = this()
    
    def addListener(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * A function that closes the inner webserver and stops listening on given port
      */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * A function that wraps the object in a webserver, for your convenience
      * @param port - Port to listen on
      */
    def listen(port: Double): Server = js.native
    
    def on(event: String, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(
      event: close,
      listener: js.Function3[/* proxyRes */ IncomingMessage, /* proxySocket */ Socket, /* proxyHead */ Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_econnreset(
      event: econnreset,
      listener: js.Function4[
          /* err */ js.Error, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
          /* target */ ProxyTargetUrl, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_end(
      event: end,
      listener: js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
          /* proxyRes */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: ErrorCallback): this.type = js.native
    @JSName("on")
    def on_proxyReq(
      event: proxyReq,
      listener: js.Function4[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
          /* options */ typings.vite.mod.HttpProxy.ServerOptions, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_proxyReqWs(
      event: proxyReqWs,
      listener: js.Function5[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* socket */ Socket, 
          /* options */ typings.vite.mod.HttpProxy.ServerOptions, 
          /* head */ Any, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_proxyRes(
      event: proxyRes,
      listener: js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_start(
      event: start,
      listener: js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
          /* target */ ProxyTargetUrl, 
          Unit
        ]
    ): this.type = js.native
    
    def once(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Used for proxying regular HTTP(S) requests
      * @param req - Client request.
      * @param res - Client response.
      * @param options - Additional options.
      */
    def web(req: IncomingMessage, res: ServerResponse[typings.node.httpMod.IncomingMessage]): Unit = js.native
    def web(
      req: IncomingMessage,
      res: ServerResponse[typings.node.httpMod.IncomingMessage],
      options: Unit,
      callback: ErrorCallback
    ): Unit = js.native
    def web(
      req: IncomingMessage,
      res: ServerResponse[typings.node.httpMod.IncomingMessage],
      options: typings.vite.mod.HttpProxy.ServerOptions
    ): Unit = js.native
    def web(
      req: IncomingMessage,
      res: ServerResponse[typings.node.httpMod.IncomingMessage],
      options: typings.vite.mod.HttpProxy.ServerOptions,
      callback: ErrorCallback
    ): Unit = js.native
    
    /**
      * Used for proxying regular HTTP(S) requests
      * @param req - Client request.
      * @param socket - Client socket.
      * @param head - Client head.
      * @param options - Additional options.
      */
    def ws(req: IncomingMessage, socket: Any, head: Any): Unit = js.native
    def ws(req: IncomingMessage, socket: Any, head: Any, options: Unit, callback: ErrorCallback): Unit = js.native
    def ws(req: IncomingMessage, socket: Any, head: Any, options: typings.vite.mod.HttpProxy.ServerOptions): Unit = js.native
    def ws(
      req: IncomingMessage,
      socket: Any,
      head: Any,
      options: typings.vite.mod.HttpProxy.ServerOptions,
      callback: ErrorCallback
    ): Unit = js.native
  }
  /* static members */
  object Server {
    
    @JSImport("vite", "HttpProxy.Server")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates the proxy server with specified options.
      * @param options - Config object passed to the proxy
      * @returns Proxy object with handlers for `ws` and `web` requests
      */
    inline def createProxy(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")().asInstanceOf[Server]
    inline def createProxy(options: typings.vite.mod.HttpProxy.ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
    
    /**
      * Creates the proxy server with specified options.
      * @param options - Config object passed to the proxy
      * @returns Proxy object with handlers for `ws` and `web` requests
      */
    inline def createProxyServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxyServer")().asInstanceOf[Server]
    inline def createProxyServer(options: typings.vite.mod.HttpProxy.ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxyServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
    
    /**
      * Creates the proxy server with specified options.
      * @param options - Config object passed to the proxy
      * @returns Proxy object with handlers for `ws` and `web` requests
      */
    inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
    inline def createServer(options: typings.vite.mod.HttpProxy.ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  }
  
  type ErrorCallback = js.Function4[
    /* err */ js.Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[typings.node.httpMod.IncomingMessage], 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    Unit
  ]
  
  type ProxyTarget = ProxyTargetUrl | ProxyTargetDetailed
  
  trait ProxyTargetDetailed extends StObject {
    
    var ca: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[Buffer | String] = js.undefined
    
    var port: Double
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
  }
  object ProxyTargetDetailed {
    
    inline def apply(host: String, port: Double): ProxyTargetDetailed = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyTargetDetailed]
    }
    
    extension [Self <: ProxyTargetDetailed](x: Self) {
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: Buffer | String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  type ProxyTargetUrl = String | PartialUrl
  
  trait ServerOptions extends StObject {
    
    /** Object to be passed to http(s).request. */
    var agent: js.UndefOr[Any] = js.undefined
    
    /** Basic authentication i.e. 'user:password' to compute an Authorization header. */
    var auth: js.UndefOr[String] = js.undefined
    
    /** Rewrites the location host/ port on (301 / 302 / 307 / 308) redirects based on requested host/ port.Default: false. */
    var autoRewrite: js.UndefOr[Boolean] = js.undefined
    
    /** Buffer */
    var buffer: js.UndefOr[Stream] = js.undefined
    
    /** Changes the origin of the host header to the target URL. */
    var changeOrigin: js.UndefOr[Boolean] = js.undefined
    
    /** rewrites domain of set-cookie headers. */
    var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
    
    /** rewrites path of set-cookie headers. Default: false */
    var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.undefined
    
    /** Specify whether you want to follow redirects. Default: false */
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    /** URL string to be parsed with the url module. */
    var forward: js.UndefOr[ProxyTargetUrl] = js.undefined
    
    /** object with extra headers to be added to target requests. */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Rewrites the location hostname on (301 / 302 / 307 / 308) redirects, Default: null. */
    var hostRewrite: js.UndefOr[String] = js.undefined
    
    /** Specify whether you want to ignore the proxy path of the incoming request. */
    var ignorePath: js.UndefOr[Boolean] = js.undefined
    
    /** Local interface string to bind for outgoing connections. */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /** Specify whether you want to prepend the target's path to the proxy path. */
    var prependPath: js.UndefOr[Boolean] = js.undefined
    
    /** specify whether you want to keep letter case of response header key */
    var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.undefined
    
    /** Rewrites the location protocol on (301 / 302 / 307 / 308) redirects to 'http' or 'https'.Default: null. */
    var protocolRewrite: js.UndefOr[String] = js.undefined
    
    /** Timeout (in milliseconds) when proxy receives no response from target. Default: 120000 (2 minutes) */
    var proxyTimeout: js.UndefOr[Double] = js.undefined
    
    /** Verify SSL certificate. */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, none of the webOutgoing passes are called and it's your responsibility to appropriately return the response by listening and acting on the proxyRes event */
    var selfHandleResponse: js.UndefOr[Boolean] = js.undefined
    
    /** Object to be passed to https.createServer(). */
    var ssl: js.UndefOr[Any] = js.undefined
    
    /** URL string to be parsed with the url module. */
    var target: js.UndefOr[ProxyTarget] = js.undefined
    
    /** Timeout (in milliseconds) for incoming requests */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** Explicitly specify if we are proxying to another proxy. */
    var toProxy: js.UndefOr[Boolean] = js.undefined
    
    /** If you want to proxy websockets. */
    var ws: js.UndefOr[Boolean] = js.undefined
    
    /** Adds x- forward headers. */
    var xfwd: js.UndefOr[Boolean] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): typings.vite.mod.HttpProxy.ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vite.mod.HttpProxy.ServerOptions]
    }
    
    extension [Self <: typings.vite.mod.HttpProxy.ServerOptions](x: Self) {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setAutoRewrite(value: Boolean): Self = StObject.set(x, "autoRewrite", value.asInstanceOf[js.Any])
      
      inline def setAutoRewriteUndefined: Self = StObject.set(x, "autoRewrite", js.undefined)
      
      inline def setBuffer(value: Stream): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      inline def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      inline def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookieDomainRewrite", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainRewriteUndefined: Self = StObject.set(x, "cookieDomainRewrite", js.undefined)
      
      inline def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookiePathRewrite", value.asInstanceOf[js.Any])
      
      inline def setCookiePathRewriteUndefined: Self = StObject.set(x, "cookiePathRewrite", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setForward(value: ProxyTargetUrl): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
      
      inline def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
      
      inline def setIgnorePath(value: Boolean): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setPrependPath(value: Boolean): Self = StObject.set(x, "prependPath", value.asInstanceOf[js.Any])
      
      inline def setPrependPathUndefined: Self = StObject.set(x, "prependPath", js.undefined)
      
      inline def setPreserveHeaderKeyCase(value: Boolean): Self = StObject.set(x, "preserveHeaderKeyCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveHeaderKeyCaseUndefined: Self = StObject.set(x, "preserveHeaderKeyCase", js.undefined)
      
      inline def setProtocolRewrite(value: String): Self = StObject.set(x, "protocolRewrite", value.asInstanceOf[js.Any])
      
      inline def setProtocolRewriteUndefined: Self = StObject.set(x, "protocolRewrite", js.undefined)
      
      inline def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      inline def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSelfHandleResponse(value: Boolean): Self = StObject.set(x, "selfHandleResponse", value.asInstanceOf[js.Any])
      
      inline def setSelfHandleResponseUndefined: Self = StObject.set(x, "selfHandleResponse", js.undefined)
      
      inline def setSsl(value: Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setTarget(value: ProxyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setToProxy(value: Boolean): Self = StObject.set(x, "toProxy", value.asInstanceOf[js.Any])
      
      inline def setToProxyUndefined: Self = StObject.set(x, "toProxy", js.undefined)
      
      inline def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      inline def setXfwd(value: Boolean): Self = StObject.set(x, "xfwd", value.asInstanceOf[js.Any])
      
      inline def setXfwdUndefined: Self = StObject.set(x, "xfwd", js.undefined)
    }
  }
}
