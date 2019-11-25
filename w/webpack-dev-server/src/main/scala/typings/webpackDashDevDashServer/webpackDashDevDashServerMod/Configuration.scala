package typings.webpackDashDevDashServer.webpackDashDevDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod.Options
import typings.express.expressMod.Application
import typings.node.httpsMod.ServerOptions
import typings.serveDashStatic.serveDashStaticMod.ServeStaticOptions
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Options.Stats
import typings.webpack.webpackMod.WatchOptions
import typings.webpackDashDevDashServer.Anon_Errors
import typings.webpackDashDevDashServer.Anon_TypeMap
import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.error
import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.info
import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.none
import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Provides the ability to execute custom middleware after all other middleware internally within the server. */
  var after: js.UndefOr[
    js.Function3[/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler, Unit]
  ] = js.undefined
  /** This option allows you to whitelist services that are allowed to access the dev server. */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
  /** Provides the ability to execute custom middleware prior to all other middleware internally within the server. */
  var before: js.UndefOr[
    js.Function3[/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler, Unit]
  ] = js.undefined
  /** This option broadcasts the server via ZeroConf networking on start. */
  var bonjour: js.UndefOr[Boolean] = js.undefined
  /**
    * When using inline mode, the console in your DevTools will show you messages e.g. before reloading,
    * before an error or when Hot Module Replacement is enabled. This may be too verbose.
    */
  var clientLogLevel: js.UndefOr[none | error | warning | info] = js.undefined
  /** Enable gzip compression for everything served. */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * Tell the server where to serve content from. This is only necessary if you want to serve static files.
    * devServer.publicPath will be used to determine where the bundles should be served from, and takes precedence.
    */
  var contentBase: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  /**
    * When set to true this option bypasses host checking.
    * THIS IS NOT RECOMMENDED as apps that do not check the host are vulnerable to DNS rebinding attacks.
    */
  var disableHostCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * This option lets you reduce the compilations in lazy mode.
    * By default in lazy mode, every request results in a new compilation.
    * With filename, it's possible to only compile when a certain file is requested.
    */
  var filename: js.UndefOr[String] = js.undefined
  /** Adds headers to all responses. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** When using the HTML5 History API, the index.html page will likely have to be served in place of any 404 responses. */
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
  /** Specify a host to use. By default this is localhost. */
  var host: js.UndefOr[String] = js.undefined
  /** Enable webpack's Hot Module Replacement feature. */
  var hot: js.UndefOr[Boolean] = js.undefined
  /** Enables Hot Module Replacement (see devServer.hot) without page refresh as fallback in case of build failures. */
  var hotOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Serve over HTTP/2 using spdy. This option is ignored for Node 10.0.0 and above,
    * as spdy is broken for those versions. The dev server will migrate over to Node's
    * built-in HTTP/2 once Express supports it.
    */
  var http2: js.UndefOr[Boolean] = js.undefined
  /** By default dev-server will be served over HTTP. It can optionally be served over HTTP/2 with HTTPS. */
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  /** The filename that is considered the index file. */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Tells devServer to inject a client. Setting devServer.injectClient to true will result
    * in always injecting a client. It is possible to provide a function to inject conditionally
    */
  var injectClient: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler, Boolean])] = js.undefined
  /**
    * Tells devServer to inject a Hot Module Replacement. Setting devServer.injectHot
    * to true will result in always injecting. It is possible to provide a function to
    * inject conditionally
    */
  var injectHot: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler, Boolean])] = js.undefined
  /**
    * Toggle between the dev-server's two different modes.
    * By default the application will be served with inline mode enabled.
    * This means that a script will be inserted in your bundle to take care of live reloading,
    * and build messages will appear in the browser console.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * When lazy is enabled, the dev-server will only compile the bundle when it gets requested.
    * This means that webpack will not watch any file changes.
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the dev-server will reload/refresh the page when file changes are detected.
    */
  var liveReload: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows dev-server to register custom mime types.
    */
  var mimeTypes: js.UndefOr[StringDictionary[js.Array[String]] | Anon_TypeMap] = js.undefined
  /**
    * With noInfo enabled, messages like the webpack bundle information that is shown
    * when starting up and after each save,will be hidden.
    * Errors and warnings will still be shown.
    */
  var noInfo: js.UndefOr[Boolean] = js.undefined
  /** When open is enabled, the dev server will open the browser. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** Specify a page to navigate to when opening the browser. */
  var openPage: js.UndefOr[String] = js.undefined
  /** Shows a full-screen overlay in the browser when there are compiler errors or warnings. Disabled by default. */
  var overlay: js.UndefOr[Boolean | Anon_Errors] = js.undefined
  /** When used via the CLI, a path to an SSL .pfx file. If used in options, it should be the bytestream of the .pfx file. */
  var pfx: js.UndefOr[String] = js.undefined
  /** The passphrase to a SSL PFX file. */
  var pfxPassphrase: js.UndefOr[String] = js.undefined
  /** Specify a port number to listen for requests on. */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Proxying some URLs can be useful when you have a separate API backend development server
    * and you want to send API requests on the same domain.
    */
  var proxy: js.UndefOr[ProxyConfigMap | ProxyConfigArray] = js.undefined
  /**
    * When using inline mode and you're proxying dev-server,
    * the inline client script does not always know where to connect to.
    * It will try to guess the URL of the server based on window.location, but if that fails you'll need to use this.
    */
  var public: js.UndefOr[String] = js.undefined
  /** The bundled files will be available in the browser under this path. */
  var publicPath: js.UndefOr[String] = js.undefined
  /**
    * With quiet enabled, nothing except the initial startup information will be written to the console.
    * This also means that errors or warnings from webpack are not visible.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  /**
    * Tells dev-server to use serveIndex middleware when enabled.
    */
  var serveIndex: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Here you can access the Express app object and add your own custom middleware to it. */
  var setup: js.UndefOr[js.Function2[/* app */ Application, /* server */ WebpackDevServer, Unit]] = js.undefined
  /**
    * Tells clients connected to devServer to use provided socket host.
    */
  var sockHost: js.UndefOr[String] = js.undefined
  /** The path at which to connect to the reloading socket. */
  var sockPath: js.UndefOr[String] = js.undefined
  /** The Unix socket to listen to (instead of a host). */
  var socket: js.UndefOr[String] = js.undefined
  /** It is possible to configure advanced options for serving static files from contentBase. */
  var staticOptions: js.UndefOr[ServeStaticOptions] = js.undefined
  /**
    * This option lets you precisely control what bundle information gets displayed.
    * This can be a nice middle ground if you want some bundle information, but not all of it.
    */
  var stats: js.UndefOr[Stats] = js.undefined
  /** This option lets the browser open with your local IP. */
  var useLocalIp: js.UndefOr[Boolean] = js.undefined
  /** Tell the server to watch the files served by the devServer.contentBase option. File changes will trigger a full page reload. */
  var watchContentBase: js.UndefOr[Boolean] = js.undefined
  /** Control options related to watching the files. */
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  /** Tells devServer to write generated assets to the disk. */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filePath */ String, Boolean])] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    after: (/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler) => Unit = null,
    allowedHosts: js.Array[String] = null,
    before: (/* app */ Application, /* server */ WebpackDevServer, /* compiler */ Compiler) => Unit = null,
    bonjour: js.UndefOr[Boolean] = js.undefined,
    clientLogLevel: none | error | warning | info = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    contentBase: Boolean | String | js.Array[String] = null,
    disableHostCheck: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    headers: StringDictionary[String] = null,
    historyApiFallback: Boolean | Options = null,
    host: String = null,
    hot: js.UndefOr[Boolean] = js.undefined,
    hotOnly: js.UndefOr[Boolean] = js.undefined,
    http2: js.UndefOr[Boolean] = js.undefined,
    https: Boolean | ServerOptions = null,
    index: String = null,
    injectClient: Boolean | (js.Function1[/* compilerConfig */ Compiler, Boolean]) = null,
    injectHot: Boolean | (js.Function1[/* compilerConfig */ Compiler, Boolean]) = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    liveReload: js.UndefOr[Boolean] = js.undefined,
    mimeTypes: StringDictionary[js.Array[String]] | Anon_TypeMap = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    openPage: String = null,
    overlay: Boolean | Anon_Errors = null,
    pfx: String = null,
    pfxPassphrase: String = null,
    port: Int | Double = null,
    proxy: ProxyConfigMap | ProxyConfigArray = null,
    public: String = null,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    serveIndex: js.UndefOr[Boolean] = js.undefined,
    setup: (/* app */ Application, /* server */ WebpackDevServer) => Unit = null,
    sockHost: String = null,
    sockPath: String = null,
    socket: String = null,
    staticOptions: ServeStaticOptions = null,
    stats: Stats = null,
    useLocalIp: js.UndefOr[Boolean] = js.undefined,
    watchContentBase: js.UndefOr[Boolean] = js.undefined,
    watchOptions: WatchOptions = null,
    writeToDisk: Boolean | (js.Function1[/* filePath */ String, Boolean]) = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (allowedHosts != null) __obj.updateDynamic("allowedHosts")(allowedHosts.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3(before))
    if (!js.isUndefined(bonjour)) __obj.updateDynamic("bonjour")(bonjour.asInstanceOf[js.Any])
    if (clientLogLevel != null) __obj.updateDynamic("clientLogLevel")(clientLogLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (contentBase != null) __obj.updateDynamic("contentBase")(contentBase.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHostCheck)) __obj.updateDynamic("disableHostCheck")(disableHostCheck.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (historyApiFallback != null) __obj.updateDynamic("historyApiFallback")(historyApiFallback.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot.asInstanceOf[js.Any])
    if (!js.isUndefined(hotOnly)) __obj.updateDynamic("hotOnly")(hotOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(http2)) __obj.updateDynamic("http2")(http2.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (injectClient != null) __obj.updateDynamic("injectClient")(injectClient.asInstanceOf[js.Any])
    if (injectHot != null) __obj.updateDynamic("injectHot")(injectHot.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(liveReload)) __obj.updateDynamic("liveReload")(liveReload.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openPage != null) __obj.updateDynamic("openPage")(openPage.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (pfxPassphrase != null) __obj.updateDynamic("pfxPassphrase")(pfxPassphrase.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (!js.isUndefined(serveIndex)) __obj.updateDynamic("serveIndex")(serveIndex.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2(setup))
    if (sockHost != null) __obj.updateDynamic("sockHost")(sockHost.asInstanceOf[js.Any])
    if (sockPath != null) __obj.updateDynamic("sockPath")(sockPath.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (staticOptions != null) __obj.updateDynamic("staticOptions")(staticOptions.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalIp)) __obj.updateDynamic("useLocalIp")(useLocalIp.asInstanceOf[js.Any])
    if (!js.isUndefined(watchContentBase)) __obj.updateDynamic("watchContentBase")(watchContentBase.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

