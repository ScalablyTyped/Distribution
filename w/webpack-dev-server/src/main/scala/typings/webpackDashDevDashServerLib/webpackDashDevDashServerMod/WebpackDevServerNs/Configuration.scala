package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Configuration extends js.Object {
  /** Provides the ability to execute custom middleware after all other middleware internally within the server. */
  var after: js.UndefOr[js.Function1[/* app */ expressLib.expressMod.eNs.Application, scala.Unit]] = js.undefined
  /** This option allows you to whitelist services that are allowed to access the dev server. */
  var allowedHosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Provides the ability to execute custom middleware prior to all other middleware internally within the server. */
  var before: js.UndefOr[js.Function1[/* app */ expressLib.expressMod.eNs.Application, scala.Unit]] = js.undefined
  /** This option broadcasts the server via ZeroConf networking on start. */
  var bonjour: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When using inline mode, the console in your DevTools will show you messages e.g. before reloading,
           * before an error or when Hot Module Replacement is enabled. This may be too verbose.
           */
  var clientLogLevel: js.UndefOr[
    webpackDashDevDashServerLib.webpackDashDevDashServerLibStrings.none | webpackDashDevDashServerLib.webpackDashDevDashServerLibStrings.error | webpackDashDevDashServerLib.webpackDashDevDashServerLibStrings.warning | webpackDashDevDashServerLib.webpackDashDevDashServerLibStrings.info
  ] = js.undefined
  /** Enable gzip compression for everything served. */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Tell the server where to serve content from. This is only necessary if you want to serve static files.
           * devServer.publicPath will be used to determine where the bundles should be served from, and takes precedence.
           */
  var contentBase: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
           * When set to true this option bypasses host checking.
           * THIS IS NOT RECOMMENDED as apps that do not check the host are vulnerable to DNS rebinding attacks.
           */
  var disableHostCheck: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This option lets you reduce the compilations in lazy mode.
           * By default in lazy mode, every request results in a new compilation.
           * With filename, it's possible to only compile when a certain file is requested.
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Adds headers to all responses. */
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** When using the HTML5 History API, the index.html page will likely have to be served in place of any 404 responses. */
  var historyApiFallback: js.UndefOr[scala.Boolean | HistoryApiFallbackConfig] = js.undefined
  /** Specify a host to use. By default this is localhost. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Enable webpack's Hot Module Replacement feature. */
  var hot: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables Hot Module Replacement (see devServer.hot) without page refresh as fallback in case of build failures. */
  var hotOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** By default dev-server will be served over HTTP. It can optionally be served over HTTP/2 with HTTPS. */
  var https: js.UndefOr[scala.Boolean | nodeLib.httpsMod.ServerOptions] = js.undefined
  /** The filename that is considered the index file. */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Toggle between the dev-server's two different modes.
           * By default the application will be served with inline mode enabled.
           * This means that a script will be inserted in your bundle to take care of live reloading,
           * and build messages will appear in the browser console.
           */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When lazy is enabled, the dev-server will only compile the bundle when it gets requested.
           * This means that webpack will not watch any file changes.
           */
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * With noInfo enabled, messages like the webpack bundle information that is shown
           * when starting up and after each save,will be hidden.
           * Errors and warnings will still be shown.
           */
  var noInfo: js.UndefOr[scala.Boolean] = js.undefined
  /** When open is enabled, the dev server will open the browser. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify a page to navigate to when opening the browser. */
  var openPage: js.UndefOr[java.lang.String] = js.undefined
  /** Shows a full-screen overlay in the browser when there are compiler errors or warnings. Disabled by default. */
  var overlay: js.UndefOr[scala.Boolean | webpackDashDevDashServerLib.Anon_Warnings] = js.undefined
  /** When used via the CLI, a path to an SSL .pfx file. If used in options, it should be the bytestream of the .pfx file. */
  var pfx: js.UndefOr[java.lang.String] = js.undefined
  /** The passphrase to a SSL PFX file. */
  var pfxPassphrase: js.UndefOr[java.lang.String] = js.undefined
  /** Specify a port number to listen for requests on. */
  var port: js.UndefOr[scala.Double] = js.undefined
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
  var public: js.UndefOr[java.lang.String] = js.undefined
  /** The bundled files will be available in the browser under this path. */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * With quiet enabled, nothing except the initial startup information will be written to the console.
           * This also means that errors or warnings from webpack are not visible.
           */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Here you can access the Express app object and add your own custom middleware to it. */
  var setup: js.UndefOr[js.Function1[/* app */ expressLib.expressMod.eNs.Application, scala.Unit]] = js.undefined
  /** The Unix socket to listen to (instead of a host). */
  var socket: js.UndefOr[java.lang.String] = js.undefined
  /** It is possible to configure advanced options for serving static files from contentBase. */
  var staticOptions: js.UndefOr[serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions] = js.undefined
  /**
           * This option lets you precisely control what bundle information gets displayed.
           * This can be a nice middle ground if you want some bundle information, but not all of it.
           */
  var stats: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Stats] = js.undefined
  /** This option lets the browser open with your local IP. */
  var useLocalIp: js.UndefOr[scala.Boolean] = js.undefined
  /** Tell the server to watch the files served by the devServer.contentBase option. File changes will trigger a full page reload. */
  var watchContentBase: js.UndefOr[scala.Boolean] = js.undefined
  /** Control options related to watching the files. */
  var watchOptions: js.UndefOr[webpackLib.webpackMod.webpackNs.WatchOptions] = js.undefined
}

