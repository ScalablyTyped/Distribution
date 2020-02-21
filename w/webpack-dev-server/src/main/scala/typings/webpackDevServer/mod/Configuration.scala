package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.Application_
import typings.node.httpsMod.ServerOptions
import typings.serveStatic.mod.ServeStaticOptions
import typings.webpack.mod.Compiler_
import typings.webpack.mod.Options.Stats
import typings.webpack.mod.WatchOptions
import typings.webpackDevServer.AnonClient
import typings.webpackDevServer.AnonClientServer
import typings.webpackDevServer.AnonClientServerObject
import typings.webpackDevServer.AnonErrors
import typings.webpackDevServer.AnonTypeMap
import typings.webpackDevServer.webpackDevServerStrings.debug
import typings.webpackDevServer.webpackDevServerStrings.error
import typings.webpackDevServer.webpackDevServerStrings.info
import typings.webpackDevServer.webpackDevServerStrings.none
import typings.webpackDevServer.webpackDevServerStrings.silent
import typings.webpackDevServer.webpackDevServerStrings.sockjs
import typings.webpackDevServer.webpackDevServerStrings.trace
import typings.webpackDevServer.webpackDevServerStrings.warn
import typings.webpackDevServer.webpackDevServerStrings.warning
import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * Provides the ability to execute custom middleware after all other
    * middleware internally within the server.
    */
  var after: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.undefined
  /**
    * This option allows you to whitelist services that are allowed to
    * access the dev server.
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provides the ability to execute custom middleware prior to all
    * other middleware internally within the server.
    */
  var before: js.UndefOr[
    js.Function3[/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_, Unit]
  ] = js.undefined
  /**
    * This option broadcasts the server via ZeroConf networking on start.
    */
  var bonjour: js.UndefOr[Boolean] = js.undefined
  /**
    * When using inline mode, the console in your DevTools will show you
    * messages e.g. before reloading, before an error or when Hot Module
    * Replacement is enabled. This may be too verbose.
    *
    * 'none' and 'warning' are going to be deprecated at the next major
    * version.
    */
  var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.undefined
  /**
    * Enable gzip compression for everything served.
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * Tell the server where to serve content from. This is only necessary
    * if you want to serve static files. devServer.publicPath will be used
    * to determine where the bundles should be served from, and takes
    * precedence.
    */
  var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.undefined
  /**
    * Tell the server at what URL to serve `devServer.contentBase`.
    * If there was a file `assets/manifest.json`,
    * it would be served at `/serve-content-base-at-this-url/manifest.json`
    */
  var contentBasePublicPath: js.UndefOr[String] = js.undefined
  /**
    * When set to true this option bypasses host checking.  THIS IS NOT
    * RECOMMENDED as apps that do not check the host are vulnerable to DNS
    * rebinding attacks.
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
  /**
    * When using the HTML5 History API, the index.html page will likely
    * have to be served in place of any 404 responses.
    */
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
  /**
    * Specify a host to use. By default this is localhost.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Enable webpack's Hot Module Replacement feature.
    * Note that webpack.HotModuleReplacementPlugin is required to fully
    * enable HMR. If webpack or webpack-dev-server are launched with the
    * --hot option, this plugin will be added automatically, so you may
    * not need to add this to your webpack.config.js.
    */
  var hot: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables Hot Module Replacement (see devServer.hot) without page
    * refresh as fallback in case of build failures.
    */
  var hotOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Serve over HTTP/2 using spdy. This option is ignored for Node 10.0.0
    * and above, as spdy is broken for those versions. The dev server will
    * migrate over to Node's built-in HTTP/2 once Express supports it.
    */
  var http2: js.UndefOr[Boolean] = js.undefined
  /**
    * By default dev-server will be served over HTTP. It can optionally be
    * served over HTTP/2 with HTTPS.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  /**
    * The filename that is considered the index file.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Tells devServer to inject a client. Setting devServer.injectClient
    * to true will result in always injecting a client. It is possible to
    * provide a function to inject conditionally
    */
  var injectClient: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])] = js.undefined
  /**
    * Tells devServer to inject a Hot Module Replacement. Setting
    * devServer.injectHot to true will result in always injecting. It is
    * possible to provide a function to inject conditionally
    */
  var injectHot: js.UndefOr[Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean])] = js.undefined
  /**
    * Toggle between the dev-server's two different modes.  By default the
    * application will be served with inline mode enabled.  This means
    * that a script will be inserted in your bundle to take care of live
    * reloading, and build messages will appear in the browser console.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * When lazy is enabled, the dev-server will only compile the bundle
    * when it gets requested.  This means that webpack will not watch any
    * file changes.
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the dev-server will reload/refresh the page when file
    * changes are detected. devServer.hot option must be disabled or
    * devServer.watchContentBase option must be enabled in order for
    * liveReload to take effect. Disable devServer.liveReload by setting
    * it to false
    */
  var liveReload: js.UndefOr[Boolean] = js.undefined
  /**
    * The object is passed to the underlying webpack-dev-middleware. See
    * [documentation](https://github.com/webpack/webpack-dev-middleware#mimetypes)
    * for usage notes.
    */
  var mimeTypes: js.UndefOr[StringDictionary[js.Array[String]] | AnonTypeMap] = js.undefined
  /**
    * With noInfo enabled, messages like the webpack bundle information
    * that is shown when starting up and after each save,will be hidden.
    * Errors and warnings will still be shown.
    */
  var noInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides an option to execute a custom function when
    * webpack-dev-server starts listening for connections on a port.
    */
  var onListening: js.UndefOr[js.Function1[/* server */ WebpackDevServer, Unit]] = js.undefined
  /** When open is enabled, the dev server will open the browser. */
  var open: js.UndefOr[Boolean | String] = js.undefined
  /** Specify a page to navigate to when opening the browser. */
  var openPage: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Shows a full-screen overlay in the browser when there are compiler
    * errors or warnings. Disabled by default.
    */
  var overlay: js.UndefOr[Boolean | AnonErrors] = js.undefined
  /**
    * When used via the CLI, a path to an SSL .pfx file. If used in
    * options, it should be the bytestream of the .pfx file.
    */
  var pfx: js.UndefOr[String] = js.undefined
  /** The passphrase to a SSL PFX file. */
  var pfxPassphrase: js.UndefOr[String] = js.undefined
  /** Specify a port number to listen for requests on. */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Proxying some URLs can be useful when you have a separate API
    * backend development server and you want to send API requests on the
    * same domain.
    *
    * The dev-server makes use of the powerful http-proxy-middleware
    * package. Check out its
    * [documentation](https://github.com/chimurai/http-proxy-middleware#options)
    * for more advanced usages. Note that some of http-proxy-middleware's
    * features do not require a target key, e.g. its router feature, but
    * you will still need to include a target key in your config here,
    * otherwise webpack-dev-server won't pass it along to
    * http-proxy-middleware).
    */
  var proxy: js.UndefOr[ProxyConfigMap | ProxyConfigArray] = js.undefined
  /**
    * When using inline mode and you're proxying dev-server, the inline
    * client script does not always know where to connect to.  It will try
    * to guess the URL of the server based on window.location, but if that
    * fails you'll need to use this.
    */
  var public: js.UndefOr[String] = js.undefined
  /**
    * The bundled files will be available in the browser under this path.
    * default is '/'
    */
  var publicPath: js.UndefOr[String] = js.undefined
  /**
    * With quiet enabled, nothing except the initial startup information
    * will be written to the console.  This also means that errors or
    * warnings from webpack are not visible.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  /**
    * Tells dev-server to use serveIndex middleware when enabled.
    *
    * serveIndex middleware generates directory listings on viewing
    * directories that don't have an index.html file.
    */
  var serveIndex: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated This option is deprecated in favor of devServer.before
    * and will be removed in v3.0.0. Here you can access the Express app
    * object and add your own custom middleware to it.
    */
  var setup: js.UndefOr[js.Function2[/* app */ Application_, /* server */ WebpackDevServer, Unit]] = js.undefined
  /**
    * Tells clients connected to devServer to use provided socket host.
    */
  var sockHost: js.UndefOr[String] = js.undefined
  /**
    * The path at which to connect to the reloading socket. Default is
    * '/sockjs-node'
    */
  var sockPath: js.UndefOr[String] = js.undefined
  /**
    * Tells clients connected to devServer to use provided socket port.
    */
  var sockPort: js.UndefOr[String | Double] = js.undefined
  /** The Unix socket to listen to (instead of a host). */
  var socket: js.UndefOr[String] = js.undefined
  /**
    * It is possible to configure advanced options for serving static
    * files from contentBase.
    *
    * This only works when using devServer.contentBase as a string.
    */
  var staticOptions: js.UndefOr[ServeStaticOptions] = js.undefined
  /**
    * This option lets you precisely control what bundle information gets
    * displayed.  This can be a nice middle ground if you want some bundle
    * information, but not all of it.
    */
  var stats: js.UndefOr[Stats] = js.undefined
  /**
    * transportMode is an experimental option, meaning its usage could
    * potentially change without warning.
    *
    * Providing a string to devServer.transportMode is a shortcut to
    * setting both devServer.transportMode.client and
    * devServer.transportMode.server to the given string value.
    *
    * This option allows us either to choose the current devServer
    * transport mode for client/server individually or to provide custom
    * client/server implementation. This allows to specify how browser or
    * other client communicates with the devServer.
    *
    * The current default mode is 'sockjs'. This mode uses SockJS-node as
    * a server, and SockJS-client on the client.
    *
    * 'ws' mode will become the default mode in the next major devServer
    * version. This mode uses ws as a server, and native WebSockets on the
    * client.
    */
  var transportMode: js.UndefOr[sockjs | ws | AnonClient | AnonClientServer | AnonClientServerObject] = js.undefined
  /** This option lets the browser open with your local IP. */
  var useLocalIp: js.UndefOr[Boolean] = js.undefined
  /**
    * Tell the server to watch the files served by the
    * devServer.contentBase option. File changes will trigger a full page
    * reload.
    */
  var watchContentBase: js.UndefOr[Boolean] = js.undefined
  /** Control options related to watching the files. */
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  /** Tells devServer to write generated assets to the disk. */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filePath */ String, Boolean])] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    after: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit = null,
    allowedHosts: js.Array[String] = null,
    before: (/* app */ Application_, /* server */ WebpackDevServer, /* compiler */ Compiler_) => Unit = null,
    bonjour: js.UndefOr[Boolean] = js.undefined,
    clientLogLevel: silent | trace | debug | info | warn | error | none | warning = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    contentBase: Boolean | String | js.Array[String] | Double = null,
    contentBasePublicPath: String = null,
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
    injectClient: Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean]) = null,
    injectHot: Boolean | (js.Function1[/* compilerConfig */ Compiler_, Boolean]) = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    liveReload: js.UndefOr[Boolean] = js.undefined,
    mimeTypes: StringDictionary[js.Array[String]] | AnonTypeMap = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    onListening: /* server */ WebpackDevServer => Unit = null,
    open: Boolean | String = null,
    openPage: String | js.Array[String] = null,
    overlay: Boolean | AnonErrors = null,
    pfx: String = null,
    pfxPassphrase: String = null,
    port: Int | Double = null,
    proxy: ProxyConfigMap | ProxyConfigArray = null,
    public: String = null,
    publicPath: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    serveIndex: js.UndefOr[Boolean] = js.undefined,
    setup: (/* app */ Application_, /* server */ WebpackDevServer) => Unit = null,
    sockHost: String = null,
    sockPath: String = null,
    sockPort: String | Double = null,
    socket: String = null,
    staticOptions: ServeStaticOptions = null,
    stats: Stats = null,
    transportMode: sockjs | ws | AnonClient | AnonClientServer | AnonClientServerObject = null,
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
    if (contentBasePublicPath != null) __obj.updateDynamic("contentBasePublicPath")(contentBasePublicPath.asInstanceOf[js.Any])
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
    if (onListening != null) __obj.updateDynamic("onListening")(js.Any.fromFunction1(onListening))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
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
    if (sockPort != null) __obj.updateDynamic("sockPort")(sockPort.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (staticOptions != null) __obj.updateDynamic("staticOptions")(staticOptions.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (transportMode != null) __obj.updateDynamic("transportMode")(transportMode.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalIp)) __obj.updateDynamic("useLocalIp")(useLocalIp.asInstanceOf[js.Any])
    if (!js.isUndefined(watchContentBase)) __obj.updateDynamic("watchContentBase")(watchContentBase.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

