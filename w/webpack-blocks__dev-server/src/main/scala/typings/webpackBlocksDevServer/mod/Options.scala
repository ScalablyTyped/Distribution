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
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  def apply(
    after: (/* app */ js.Any, /* server */ js.Any) => Unit = null,
    allowedHosts: js.Array[String] = null,
    before: (/* app */ js.Any, /* server */ js.Any) => Unit = null,
    bonjour: js.UndefOr[Boolean] = js.undefined,
    clientLogLevel: silent | trace | debug | info | warn | error | none | warning = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    contentBase: Boolean | String | js.Array[String] | Double = null,
    disableHostCheck: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    headers: js.Object = null,
    historyApiFallback: Boolean | HistoryOptions = null,
    host: String = null,
    hot: js.UndefOr[Boolean] = js.undefined,
    hotOnly: js.UndefOr[Boolean] = js.undefined,
    http2: js.UndefOr[Boolean] = js.undefined,
    https: Boolean | js.Object = null,
    index: String = null,
    injectClient: Boolean | InjectClientFunction = null,
    injectHot: Boolean | InjectClientFunction = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    liveReload: js.UndefOr[Boolean] = js.undefined,
    mimeTypes: typings.webpackBlocksDevServer.anon.String = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    open: Boolean | String = null,
    openPage: String = null,
    overlay: Boolean | Errors = null,
    pfx: String = null,
    pfxPassphrase: String = null,
    port: js.UndefOr[Double] = js.undefined,
    proxy: js.Object | js.Array[ProxyType] = null,
    public: String = null,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    serveIndex: js.UndefOr[Boolean] = js.undefined,
    setup: /* compilerConfig */ js.Any => Boolean = null,
    socket: String = null,
    socketHost: String = null,
    socketPath: String = null,
    socketPort: Double | String = null,
    staticOptions: (/* res */ js.Object, /* path */ String, /* stat */ js.Object) => Unit = null,
    stats: none | `errors-only` | minimal | normal | verbose | js.Object = null,
    transportMode: sockjs | ws | TransportMode = null,
    useLocalIp: js.UndefOr[Boolean] = js.undefined,
    watchContentBase: js.UndefOr[Boolean] = js.undefined,
    watchOptions: WatchOptions = null,
    writeToDisk: Boolean | WriteToDiskFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction2(after))
    if (allowedHosts != null) __obj.updateDynamic("allowedHosts")(allowedHosts.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (!js.isUndefined(bonjour)) __obj.updateDynamic("bonjour")(bonjour.get.asInstanceOf[js.Any])
    if (clientLogLevel != null) __obj.updateDynamic("clientLogLevel")(clientLogLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (contentBase != null) __obj.updateDynamic("contentBase")(contentBase.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHostCheck)) __obj.updateDynamic("disableHostCheck")(disableHostCheck.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (historyApiFallback != null) __obj.updateDynamic("historyApiFallback")(historyApiFallback.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hotOnly)) __obj.updateDynamic("hotOnly")(hotOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(http2)) __obj.updateDynamic("http2")(http2.get.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (injectClient != null) __obj.updateDynamic("injectClient")(injectClient.asInstanceOf[js.Any])
    if (injectHot != null) __obj.updateDynamic("injectHot")(injectHot.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveReload)) __obj.updateDynamic("liveReload")(liveReload.get.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.get.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openPage != null) __obj.updateDynamic("openPage")(openPage.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (pfxPassphrase != null) __obj.updateDynamic("pfxPassphrase")(pfxPassphrase.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serveIndex)) __obj.updateDynamic("serveIndex")(serveIndex.get.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (socketHost != null) __obj.updateDynamic("socketHost")(socketHost.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (socketPort != null) __obj.updateDynamic("socketPort")(socketPort.asInstanceOf[js.Any])
    if (staticOptions != null) __obj.updateDynamic("staticOptions")(js.Any.fromFunction3(staticOptions))
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (transportMode != null) __obj.updateDynamic("transportMode")(transportMode.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalIp)) __obj.updateDynamic("useLocalIp")(useLocalIp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchContentBase)) __obj.updateDynamic("watchContentBase")(watchContentBase.get.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

