package typings.webpackBlocksDevServer.mod

import typings.webpackBlocksDevServer.anon.Errors
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.`errors-only`
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.debug
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.error
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.info
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.minimal
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.none
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.normal
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.silent
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.sockjs
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.trace
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.verbose
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.warn
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.warning
import typings.webpackBlocksDevServer.webpackBlocksDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var after: js.UndefOr[StartMiddlewareFunction] = js.native
  
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  
  var before: js.UndefOr[StartMiddlewareFunction] = js.native
  
  var bonjour: js.UndefOr[Boolean] = js.native
  
  var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.native
  
  var disableHostCheck: js.UndefOr[Boolean] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var historyApiFallback: js.UndefOr[Boolean | HistoryOptions] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hot: js.UndefOr[Boolean] = js.native
  
  var hotOnly: js.UndefOr[Boolean] = js.native
  
  var http2: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean | js.Object] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var injectClient: js.UndefOr[Boolean | InjectClientFunction] = js.native
  
  var injectHot: js.UndefOr[Boolean | InjectClientFunction] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var liveReload: js.UndefOr[Boolean] = js.native
  
  var mimeTypes: js.UndefOr[typings.webpackBlocksDevServer.anon.String] = js.native
  
  var noInfo: js.UndefOr[Boolean] = js.native
  
  var open: js.UndefOr[Boolean | String] = js.native
  
  var openPage: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[Boolean | Errors] = js.native
  
  var pfx: js.UndefOr[String] = js.native
  
  var pfxPassphrase: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var proxy: js.UndefOr[js.Object | js.Array[ProxyType]] = js.native
  
  var public: js.UndefOr[String] = js.native
  
  var publicPath: js.UndefOr[String] = js.native
  
  var quiet: js.UndefOr[Boolean] = js.native
  
  var serveIndex: js.UndefOr[Boolean] = js.native
  
  var setup: js.UndefOr[InjectClientFunction] = js.native
  
  var socket: js.UndefOr[String] = js.native
  
  var socketHost: js.UndefOr[String] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var socketPort: js.UndefOr[Double | String] = js.native
  
  var staticOptions: js.UndefOr[SetHeadersFunction] = js.native
  
  var stats: js.UndefOr[none | `errors-only` | minimal | normal | verbose | js.Object] = js.native
  
  var transportMode: js.UndefOr[sockjs | ws | TransportMode] = js.native
  
  var useLocalIp: js.UndefOr[Boolean] = js.native
  
  var watchContentBase: js.UndefOr[Boolean] = js.native
  
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  
  var writeToDisk: js.UndefOr[Boolean | WriteToDiskFunction] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = this.set("after", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAllowedHostsVarargs(value: String*): Self = this.set("allowedHosts", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHosts(value: js.Array[String]): Self = this.set("allowedHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHosts: Self = this.set("allowedHosts", js.undefined)
    
    @scala.inline
    def setBefore(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBonjour(value: Boolean): Self = this.set("bonjour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBonjour: Self = this.set("bonjour", js.undefined)
    
    @scala.inline
    def setClientLogLevel(value: silent | trace | debug | info | warn | error | none | warning): Self = this.set("clientLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientLogLevel: Self = this.set("clientLogLevel", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setContentBaseVarargs(value: String*): Self = this.set("contentBase", js.Array(value :_*))
    
    @scala.inline
    def setContentBase(value: Boolean | String | js.Array[String] | Double): Self = this.set("contentBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentBase: Self = this.set("contentBase", js.undefined)
    
    @scala.inline
    def setDisableHostCheck(value: Boolean): Self = this.set("disableHostCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHostCheck: Self = this.set("disableHostCheck", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHistoryApiFallback(value: Boolean | HistoryOptions): Self = this.set("historyApiFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryApiFallback: Self = this.set("historyApiFallback", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHot(value: Boolean): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHot: Self = this.set("hot", js.undefined)
    
    @scala.inline
    def setHotOnly(value: Boolean): Self = this.set("hotOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotOnly: Self = this.set("hotOnly", js.undefined)
    
    @scala.inline
    def setHttp2(value: Boolean): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean | js.Object): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setInjectClientFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = this.set("injectClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInjectClient(value: Boolean | InjectClientFunction): Self = this.set("injectClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectClient: Self = this.set("injectClient", js.undefined)
    
    @scala.inline
    def setInjectHotFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = this.set("injectHot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInjectHot(value: Boolean | InjectClientFunction): Self = this.set("injectHot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectHot: Self = this.set("injectHot", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLiveReload(value: Boolean): Self = this.set("liveReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveReload: Self = this.set("liveReload", js.undefined)
    
    @scala.inline
    def setMimeTypes(value: typings.webpackBlocksDevServer.anon.String): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setNoInfo(value: Boolean): Self = this.set("noInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInfo: Self = this.set("noInfo", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean | String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenPage(value: String): Self = this.set("openPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenPage: Self = this.set("openPage", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean | Errors): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPfxPassphrase(value: String): Self = this.set("pfxPassphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfxPassphrase: Self = this.set("pfxPassphrase", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProxyVarargs(value: ProxyType*): Self = this.set("proxy", js.Array(value :_*))
    
    @scala.inline
    def setProxy(value: js.Object | js.Array[ProxyType]): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setServeIndex(value: Boolean): Self = this.set("serveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeIndex: Self = this.set("serveIndex", js.undefined)
    
    @scala.inline
    def setSetup(value: /* compilerConfig */ js.Any => Boolean): Self = this.set("setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setSocket(value: String): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setSocketHost(value: String): Self = this.set("socketHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketHost: Self = this.set("socketHost", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setSocketPort(value: Double | String): Self = this.set("socketPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPort: Self = this.set("socketPort", js.undefined)
    
    @scala.inline
    def setStaticOptions(value: (/* res */ js.Object, /* path */ String, /* stat */ js.Object) => Unit): Self = this.set("staticOptions", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStaticOptions: Self = this.set("staticOptions", js.undefined)
    
    @scala.inline
    def setStats(value: none | `errors-only` | minimal | normal | verbose | js.Object): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setTransportMode(value: sockjs | ws | TransportMode): Self = this.set("transportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportMode: Self = this.set("transportMode", js.undefined)
    
    @scala.inline
    def setUseLocalIp(value: Boolean): Self = this.set("useLocalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalIp: Self = this.set("useLocalIp", js.undefined)
    
    @scala.inline
    def setWatchContentBase(value: Boolean): Self = this.set("watchContentBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchContentBase: Self = this.set("watchContentBase", js.undefined)
    
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
    
    @scala.inline
    def setWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = this.set("writeToDisk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteToDisk(value: Boolean | WriteToDiskFunction): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
  }
}
