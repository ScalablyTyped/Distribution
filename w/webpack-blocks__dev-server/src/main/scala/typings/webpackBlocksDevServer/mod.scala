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
  
  inline def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  inline def apply(options: Unit, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(options: Unit, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(options: Options, entry: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(options: Options, entry: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("@webpack-blocks/dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ContextObject extends StObject {
    
    var `match`: js.Any
    
    var parsedUrl: js.Any
    
    var request: js.Any
  }
  object ContextObject {
    
    inline def apply(`match`: js.Any, parsedUrl: js.Any, request: js.Any): ContextObject = {
      val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextObject]
    }
    
    extension [Self <: ContextObject](x: Self) {
      
      inline def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setParsedUrl(value: js.Any): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
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
    
    inline def apply(): HistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryOptions]
    }
    
    extension [Self <: HistoryOptions](x: Self) {
      
      inline def setDisableDotRule(value: Boolean): Self = StObject.set(x, "disableDotRule", value.asInstanceOf[js.Any])
      
      inline def setDisableDotRuleUndefined: Self = StObject.set(x, "disableDotRule", js.undefined)
      
      inline def setHtmlAcceptHeaders(value: js.Array[String]): Self = StObject.set(x, "htmlAcceptHeaders", value.asInstanceOf[js.Any])
      
      inline def setHtmlAcceptHeadersUndefined: Self = StObject.set(x, "htmlAcceptHeaders", js.undefined)
      
      inline def setHtmlAcceptHeadersVarargs(value: String*): Self = StObject.set(x, "htmlAcceptHeaders", js.Array(value :_*))
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setRewrites(value: RewritesObject): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfter(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value :_*))
      
      inline def setBefore(value: (/* app */ js.Any, /* server */ js.Any) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBonjour(value: Boolean): Self = StObject.set(x, "bonjour", value.asInstanceOf[js.Any])
      
      inline def setBonjourUndefined: Self = StObject.set(x, "bonjour", js.undefined)
      
      inline def setClientLogLevel(value: silent | trace | debug | info | warn | error | none | warning): Self = StObject.set(x, "clientLogLevel", value.asInstanceOf[js.Any])
      
      inline def setClientLogLevelUndefined: Self = StObject.set(x, "clientLogLevel", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setContentBase(value: Boolean | String | js.Array[String] | Double): Self = StObject.set(x, "contentBase", value.asInstanceOf[js.Any])
      
      inline def setContentBaseUndefined: Self = StObject.set(x, "contentBase", js.undefined)
      
      inline def setContentBaseVarargs(value: String*): Self = StObject.set(x, "contentBase", js.Array(value :_*))
      
      inline def setDisableHostCheck(value: Boolean): Self = StObject.set(x, "disableHostCheck", value.asInstanceOf[js.Any])
      
      inline def setDisableHostCheckUndefined: Self = StObject.set(x, "disableHostCheck", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHistoryApiFallback(value: Boolean | HistoryOptions): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
      
      inline def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setHotOnly(value: Boolean): Self = StObject.set(x, "hotOnly", value.asInstanceOf[js.Any])
      
      inline def setHotOnlyUndefined: Self = StObject.set(x, "hotOnly", js.undefined)
      
      inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setHttps(value: Boolean | js.Object): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInjectClient(value: Boolean | InjectClientFunction): Self = StObject.set(x, "injectClient", value.asInstanceOf[js.Any])
      
      inline def setInjectClientFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "injectClient", js.Any.fromFunction1(value))
      
      inline def setInjectClientUndefined: Self = StObject.set(x, "injectClient", js.undefined)
      
      inline def setInjectHot(value: Boolean | InjectClientFunction): Self = StObject.set(x, "injectHot", value.asInstanceOf[js.Any])
      
      inline def setInjectHotFunction1(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "injectHot", js.Any.fromFunction1(value))
      
      inline def setInjectHotUndefined: Self = StObject.set(x, "injectHot", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      inline def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      inline def setMimeTypes(value: typings.webpackBlocksDevServer.anon.String): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      inline def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      inline def setOpen(value: Boolean | String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenPage(value: String): Self = StObject.set(x, "openPage", value.asInstanceOf[js.Any])
      
      inline def setOpenPageUndefined: Self = StObject.set(x, "openPage", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlay(value: Boolean | Errors): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxPassphrase(value: String): Self = StObject.set(x, "pfxPassphrase", value.asInstanceOf[js.Any])
      
      inline def setPfxPassphraseUndefined: Self = StObject.set(x, "pfxPassphrase", js.undefined)
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxy(value: js.Object | js.Array[ProxyType]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setProxyVarargs(value: ProxyType*): Self = StObject.set(x, "proxy", js.Array(value :_*))
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setServeIndex(value: Boolean): Self = StObject.set(x, "serveIndex", value.asInstanceOf[js.Any])
      
      inline def setServeIndexUndefined: Self = StObject.set(x, "serveIndex", js.undefined)
      
      inline def setSetup(value: /* compilerConfig */ js.Any => Boolean): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketHost(value: String): Self = StObject.set(x, "socketHost", value.asInstanceOf[js.Any])
      
      inline def setSocketHostUndefined: Self = StObject.set(x, "socketHost", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setSocketPort(value: Double | String): Self = StObject.set(x, "socketPort", value.asInstanceOf[js.Any])
      
      inline def setSocketPortUndefined: Self = StObject.set(x, "socketPort", js.undefined)
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setStaticOptions(value: (/* res */ js.Object, /* path */ String, /* stat */ js.Object) => Unit): Self = StObject.set(x, "staticOptions", js.Any.fromFunction3(value))
      
      inline def setStaticOptionsUndefined: Self = StObject.set(x, "staticOptions", js.undefined)
      
      inline def setStats(value: none | `errors-only` | minimal | normal | verbose | js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setTransportMode(value: sockjs | ws | TransportMode): Self = StObject.set(x, "transportMode", value.asInstanceOf[js.Any])
      
      inline def setTransportModeUndefined: Self = StObject.set(x, "transportMode", js.undefined)
      
      inline def setUseLocalIp(value: Boolean): Self = StObject.set(x, "useLocalIp", value.asInstanceOf[js.Any])
      
      inline def setUseLocalIpUndefined: Self = StObject.set(x, "useLocalIp", js.undefined)
      
      inline def setWatchContentBase(value: Boolean): Self = StObject.set(x, "watchContentBase", value.asInstanceOf[js.Any])
      
      inline def setWatchContentBaseUndefined: Self = StObject.set(x, "watchContentBase", js.undefined)
      
      inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
      
      inline def setWriteToDisk(value: Boolean | WriteToDiskFunction): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
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
    
    inline def apply(from: RegExp, to: String | RewritesToFunction): RewritesObject = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RewritesObject]
    }
    
    extension [Self <: RewritesObject](x: Self) {
      
      inline def setFrom(value: RegExp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String | RewritesToFunction): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToFunction1(value: /* context */ ContextObject => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
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
    
    inline def apply(): TransportMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportMode]
    }
    
    extension [Self <: TransportMode](x: Self) {
      
      inline def setClient(value: String | PathFunction): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientFunction0(value: () => String): Self = StObject.set(x, "client", js.Any.fromFunction0(value))
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setServer(value: String | PathFunction): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerFunction0(value: () => String): Self = StObject.set(x, "server", js.Any.fromFunction0(value))
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait WatchOptions extends StObject {
    
    var aggregateTimeout: js.UndefOr[Double] = js.undefined
    
    var ignored: js.UndefOr[RegExp] = js.undefined
    
    var poll: js.UndefOr[Boolean | Double] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      inline def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
      
      inline def setIgnored(value: RegExp): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    }
  }
  
  type WriteToDiskFunction = js.Function1[/* filePath */ String, Boolean]
}
