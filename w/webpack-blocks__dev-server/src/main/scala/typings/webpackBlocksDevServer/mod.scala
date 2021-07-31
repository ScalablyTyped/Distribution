package typings.webpackBlocksDevServer

import typings.std.RegExp
import typings.webpackBlocksDevServer.anon.Errors
import typings.webpackBlocksDevServer.webpackBlocksDevServerBooleans.`false`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Unit, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Unit, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(options: Options, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ContextObject extends StObject {
    
    var `match`: js.Any
    
    var parsedUrl: js.Any
    
    var request: js.Any
  }
  object ContextObject {
    
    @scala.inline
    def apply(`match`: js.Any, parsedUrl: js.Any, request: js.Any): ContextObject = {
      val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextObject]
    }
    
    @scala.inline
    implicit class ContextObjectMutableBuilder[Self <: ContextObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUrl(value: js.Any): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait HistoryOptions extends StObject {
    
    var disableDotRule: js.UndefOr[Boolean] = js.undefined
    
    var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var rewrites: js.UndefOr[RewritesObject] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object HistoryOptions {
    
    @scala.inline
    def apply(): HistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryOptions]
    }
    
    @scala.inline
    implicit class HistoryOptionsMutableBuilder[Self <: HistoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableDotRule(value: Boolean): Self = StObject.set(x, "disableDotRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDotRuleUndefined: Self = StObject.set(x, "disableDotRule", js.undefined)
      
      @scala.inline
      def setHtmlAcceptHeaders(value: js.Array[String]): Self = StObject.set(x, "htmlAcceptHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAcceptHeadersUndefined: Self = StObject.set(x, "htmlAcceptHeaders", js.undefined)
      
      @scala.inline
      def setHtmlAcceptHeadersVarargs(value: String*): Self = StObject.set(x, "htmlAcceptHeaders", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setRewrites(value: RewritesObject): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type InjectClientFunction = js.Function1[/* compilerConfig */ js.Any, Boolean]
  
  trait Options extends StObject {
    
    var after: js.UndefOr[StartMiddlewareFunction] = js.undefined
    
    var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    var before: js.UndefOr[StartMiddlewareFunction] = js.undefined
    
    var bonjour: js.UndefOr[Boolean] = js.undefined
    
    var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.undefined
    
    var disableHostCheck: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var historyApiFallback: js.UndefOr[Boolean | HistoryOptions] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hot: js.UndefOr[Boolean] = js.undefined
    
    var hotOnly: js.UndefOr[Boolean] = js.undefined
    
    var http2: js.UndefOr[Boolean] = js.undefined
    
    var https: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var injectClient: js.UndefOr[Boolean | InjectClientFunction] = js.undefined
    
    var injectHot: js.UndefOr[Boolean | InjectClientFunction] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var liveReload: js.UndefOr[Boolean] = js.undefined
    
    var mimeTypes: js.UndefOr[typings.webpackBlocksDevServer.anon.String] = js.undefined
    
    var noInfo: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean | String] = js.undefined
    
    var openPage: js.UndefOr[String] = js.undefined
    
    var overlay: js.UndefOr[Boolean | Errors] = js.undefined
    
    var pfx: js.UndefOr[String] = js.undefined
    
    var pfxPassphrase: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[js.Object | js.Array[ProxyType]] = js.undefined
    
    var public: js.UndefOr[String] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var serveIndex: js.UndefOr[Boolean] = js.undefined
    
    var setup: js.UndefOr[InjectClientFunction] = js.undefined
    
    var socket: js.UndefOr[String] = js.undefined
    
    var socketHost: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var socketPort: js.UndefOr[Double | String] = js.undefined
    
    var staticOptions: js.UndefOr[SetHeadersFunction] = js.undefined
    
    var stats: js.UndefOr[none | `errors-only` | minimal | normal | verbose | js.Object] = js.undefined
    
    var transportMode: js.UndefOr[sockjs | ws | TransportMode] = js.undefined
    
    var useLocalIp: js.UndefOr[Boolean] = js.undefined
    
    var watchContentBase: js.UndefOr[Boolean] = js.undefined
    
    var watchOptions: js.UndefOr[WatchOptions] = js.undefined
    
    var writeToDisk: js.UndefOr[Boolean | WriteToDiskFunction] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      @scala.inline
      def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value :_*))
      
      @scala.inline
      def setBefore(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBonjour(value: Boolean): Self = StObject.set(x, "bonjour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBonjourUndefined: Self = StObject.set(x, "bonjour", js.undefined)
      
      @scala.inline
      def setClientLogLevel(value: silent | trace | debug | info | warn | error | none | warning): Self = StObject.set(x, "clientLogLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientLogLevelUndefined: Self = StObject.set(x, "clientLogLevel", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setContentBase(value: Boolean | String | js.Array[String] | Double): Self = StObject.set(x, "contentBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBaseUndefined: Self = StObject.set(x, "contentBase", js.undefined)
      
      @scala.inline
      def setContentBaseVarargs(value: String*): Self = StObject.set(x, "contentBase", js.Array(value :_*))
      
      @scala.inline
      def setDisableHostCheck(value: Boolean): Self = StObject.set(x, "disableHostCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHostCheckUndefined: Self = StObject.set(x, "disableHostCheck", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHistoryApiFallback(value: Boolean | HistoryOptions): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotOnly(value: Boolean): Self = StObject.set(x, "hotOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotOnlyUndefined: Self = StObject.set(x, "hotOnly", js.undefined)
      
      @scala.inline
      def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      @scala.inline
      def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean | js.Object): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInjectClient(value: Boolean | InjectClientFunction): Self = StObject.set(x, "injectClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectClientFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "injectClient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInjectClientUndefined: Self = StObject.set(x, "injectClient", js.undefined)
      
      @scala.inline
      def setInjectHot(value: Boolean | InjectClientFunction): Self = StObject.set(x, "injectHot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectHotFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "injectHot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInjectHotUndefined: Self = StObject.set(x, "injectHot", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      @scala.inline
      def setMimeTypes(value: typings.webpackBlocksDevServer.anon.String): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean | String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenPage(value: String): Self = StObject.set(x, "openPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenPageUndefined: Self = StObject.set(x, "openPage", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean | Errors): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxPassphrase(value: String): Self = StObject.set(x, "pfxPassphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxPassphraseUndefined: Self = StObject.set(x, "pfxPassphrase", js.undefined)
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Object | js.Array[ProxyType]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setProxyVarargs(value: ProxyType*): Self = StObject.set(x, "proxy", js.Array(value :_*))
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setServeIndex(value: Boolean): Self = StObject.set(x, "serveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServeIndexUndefined: Self = StObject.set(x, "serveIndex", js.undefined)
      
      @scala.inline
      def setSetup(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketHost(value: String): Self = StObject.set(x, "socketHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketHostUndefined: Self = StObject.set(x, "socketHost", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setSocketPort(value: Double | String): Self = StObject.set(x, "socketPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPortUndefined: Self = StObject.set(x, "socketPort", js.undefined)
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setStaticOptions(value: (/* res */ js.Object, /* path */ String, /* stat */ js.Object) => Unit): Self = StObject.set(x, "staticOptions", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStaticOptionsUndefined: Self = StObject.set(x, "staticOptions", js.undefined)
      
      @scala.inline
      def setStats(value: none | `errors-only` | minimal | normal | verbose | js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setTransportMode(value: sockjs | ws | TransportMode): Self = StObject.set(x, "transportMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportModeUndefined: Self = StObject.set(x, "transportMode", js.undefined)
      
      @scala.inline
      def setUseLocalIp(value: Boolean): Self = StObject.set(x, "useLocalIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLocalIpUndefined: Self = StObject.set(x, "useLocalIp", js.undefined)
      
      @scala.inline
      def setWatchContentBase(value: Boolean): Self = StObject.set(x, "watchContentBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchContentBaseUndefined: Self = StObject.set(x, "watchContentBase", js.undefined)
      
      @scala.inline
      def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean | WriteToDiskFunction): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  type PathFunction = js.Function0[String]
  
  type ProxyFunction = js.Function3[
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* proxy */ js.Any, 
    js.UndefOr[Null | `false` | String]
  ]
  
  type ProxyType = js.Object | ProxyFunction
  
  trait RewritesObject extends StObject {
    
    var from: RegExp
    
    var to: String | RewritesToFunction
  }
  object RewritesObject {
    
    @scala.inline
    def apply(from: RegExp, to: String | RewritesToFunction): RewritesObject = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RewritesObject]
    }
    
    @scala.inline
    implicit class RewritesObjectMutableBuilder[Self <: RewritesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: RegExp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String | RewritesToFunction): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFunction1(value: /* context */ ContextObject => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  type RewritesToFunction = js.Function1[/* context */ ContextObject, String]
  
  type SetHeadersFunction = js.Function3[/* res */ js.Object, /* path */ String, /* stat */ js.Object, Unit]
  
  type StartMiddlewareFunction = js.Function2[/* app */ js.Any, /* server */ js.Any, Unit]
  
  trait TransportMode extends StObject {
    
    var client: js.UndefOr[String | PathFunction] = js.undefined
    
    var server: js.UndefOr[String | PathFunction] = js.undefined
  }
  object TransportMode {
    
    @scala.inline
    def apply(): TransportMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportMode]
    }
    
    @scala.inline
    implicit class TransportModeMutableBuilder[Self <: TransportMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: String | PathFunction): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientFunction0(value: () => String): Self = StObject.set(x, "client", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setServer(value: String | PathFunction): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerFunction0(value: () => String): Self = StObject.set(x, "server", js.Any.fromFunction0(value))
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait WatchOptions extends StObject {
    
    var aggregateTimeout: js.UndefOr[Double] = js.undefined
    
    var ignored: js.UndefOr[RegExp] = js.undefined
    
    var poll: js.UndefOr[Boolean | Double] = js.undefined
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
      
      @scala.inline
      def setIgnored(value: RegExp): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      @scala.inline
      def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    }
  }
  
  type WriteToDiskFunction = js.Function1[/* filePath */ String, Boolean]
}
