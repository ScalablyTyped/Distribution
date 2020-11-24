package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.mod.ServerOptions
import typings.httpProxyMiddleware.mod.Filter
import typings.httpProxyMiddleware.mod.LogProvider
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import typings.node.tlsMod.TlsOptions
import typings.std.Error
import typings.webpackDevServer.webpackDevServerBooleans.`false`
import typings.webpackDevServer.webpackDevServerStrings.debug
import typings.webpackDevServer.webpackDevServerStrings.error
import typings.webpackDevServer.webpackDevServerStrings.info
import typings.webpackDevServer.webpackDevServerStrings.silent
import typings.webpackDevServer.webpackDevServerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  path :string | std.Array<string> | undefined,   context :string | std.Array<string> | http-proxy-middleware.http-proxy-middleware.Filter | undefined} & http-proxy-middleware.http-proxy-middleware.Config */
@js.native
trait ProxyConfigArrayItem extends js.Object {
  
  var agent: js.UndefOr[Agent] = js.native
  
  var auth: js.UndefOr[String] = js.native
  
  var autoRewrite: js.UndefOr[Boolean] = js.native
  
  var buffer: js.UndefOr[Readable] = js.native
  
  var changeOrigin: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[String | js.Array[String] | Filter] = js.native
  
  var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  
  var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
  
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  var forward: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var hostRewrite: js.UndefOr[String] = js.native
  
  var ignorePath: js.UndefOr[Boolean] = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.native
  
  var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.native
  
  var onClose: js.UndefOr[
    js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
  ] = js.native
  
  var onError: js.UndefOr[
    js.Function3[/* err */ Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.native
  
  var onProxyReq: js.UndefOr[
    js.Function3[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.native
  
  var onProxyReqWs: js.UndefOr[
    js.Function5[
      /* proxyReq */ ClientRequest, 
      /* req */ IncomingMessage, 
      /* socket */ Socket, 
      /* options */ ServerOptions, 
      /* head */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onProxyRes: js.UndefOr[
    js.Function3[
      /* proxyRes */ IncomingMessage, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      Unit
    ]
  ] = js.native
  
  var path: js.UndefOr[String | js.Array[String]] = js.native
  
  var pathRewrite: js.UndefOr[
    StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
  ] = js.native
  
  var prependPath: js.UndefOr[Boolean] = js.native
  
  var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
  
  var protocolRewrite: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    */
  var proxyHost: js.UndefOr[js.Any] = js.native
  
  /**
    * @deprecated
    */
  var proxyTable: js.UndefOr[js.Any] = js.native
  
  var proxyTimeout: js.UndefOr[Double] = js.native
  
  var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var selfHandleResponse: js.UndefOr[Boolean] = js.native
  
  var ssl: js.UndefOr[TlsOptions] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var toProxy: js.UndefOr[Boolean] = js.native
  
  var ws: js.UndefOr[Boolean] = js.native
  
  var xfwd: js.UndefOr[Boolean] = js.native
}
object ProxyConfigArrayItem {
  
  @scala.inline
  def apply(): ProxyConfigArrayItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigArrayItem]
  }
  
  @scala.inline
  implicit class ProxyConfigArrayItemOps[Self <: ProxyConfigArrayItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAutoRewrite(value: Boolean): Self = this.set("autoRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRewrite: Self = this.set("autoRewrite", js.undefined)
    
    @scala.inline
    def setBuffer(value: Readable): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setChangeOrigin(value: Boolean): Self = this.set("changeOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeOrigin: Self = this.set("changeOrigin", js.undefined)
    
    @scala.inline
    def setContextFunction2(value: (/* pathname */ String, /* req */ IncomingMessage) => Boolean): Self = this.set("context", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextVarargs(value: String*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: String | js.Array[String] | Filter): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = this.set("cookieDomainRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomainRewrite: Self = this.set("cookieDomainRewrite", js.undefined)
    
    @scala.inline
    def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = this.set("cookiePathRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookiePathRewrite: Self = this.set("cookiePathRewrite", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setForward(value: String): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHostRewrite(value: String): Self = this.set("hostRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostRewrite: Self = this.set("hostRewrite", js.undefined)
    
    @scala.inline
    def setIgnorePath(value: Boolean): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setLogLevel(value: debug | info | warn | error | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogProvider(value: /* provider */ LogProvider => LogProvider): Self = this.set("logProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogProvider: Self = this.set("logProvider", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Unit): Self = this.set("onClose", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* err */ Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = this.set("onError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* proxySocket */ Socket => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnProxyReq(value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = this.set("onProxyReq", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnProxyReq: Self = this.set("onProxyReq", js.undefined)
    
    @scala.inline
    def setOnProxyReqWs(
      value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ ServerOptions, /* head */ js.Any) => Unit
    ): Self = this.set("onProxyReqWs", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnProxyReqWs: Self = this.set("onProxyReqWs", js.undefined)
    
    @scala.inline
    def setOnProxyRes(
      value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit
    ): Self = this.set("onProxyRes", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnProxyRes: Self = this.set("onProxyRes", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathRewriteFunction2(value: (/* path */ String, /* req */ IncomingMessage) => String): Self = this.set("pathRewrite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPathRewrite(
      value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
    ): Self = this.set("pathRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRewrite: Self = this.set("pathRewrite", js.undefined)
    
    @scala.inline
    def setPrependPath(value: Boolean): Self = this.set("prependPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrependPath: Self = this.set("prependPath", js.undefined)
    
    @scala.inline
    def setPreserveHeaderKeyCase(value: Boolean): Self = this.set("preserveHeaderKeyCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveHeaderKeyCase: Self = this.set("preserveHeaderKeyCase", js.undefined)
    
    @scala.inline
    def setProtocolRewrite(value: String): Self = this.set("protocolRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolRewrite: Self = this.set("protocolRewrite", js.undefined)
    
    @scala.inline
    def setProxyHost(value: js.Any): Self = this.set("proxyHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyHost: Self = this.set("proxyHost", js.undefined)
    
    @scala.inline
    def setProxyTable(value: js.Any): Self = this.set("proxyTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyTable: Self = this.set("proxyTable", js.undefined)
    
    @scala.inline
    def setProxyTimeout(value: Double): Self = this.set("proxyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyTimeout: Self = this.set("proxyTimeout", js.undefined)
    
    @scala.inline
    def setRouterFunction1(value: /* req */ IncomingMessage => String): Self = this.set("router", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRouter(value: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSelfHandleResponse(value: Boolean): Self = this.set("selfHandleResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfHandleResponse: Self = this.set("selfHandleResponse", js.undefined)
    
    @scala.inline
    def setSsl(value: TlsOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setToProxy(value: Boolean): Self = this.set("toProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToProxy: Self = this.set("toProxy", js.undefined)
    
    @scala.inline
    def setWs(value: Boolean): Self = this.set("ws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
    
    @scala.inline
    def setXfwd(value: Boolean): Self = this.set("xfwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXfwd: Self = this.set("xfwd", js.undefined)
  }
}
