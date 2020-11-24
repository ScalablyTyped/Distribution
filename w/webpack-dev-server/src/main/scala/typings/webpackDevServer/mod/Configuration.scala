package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.Application_
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.ServerOptions
import typings.serveStatic.mod.ServeStaticOptions
import typings.webpackDevServer.anon.Client
import typings.webpackDevServer.anon.ClientServer
import typings.webpackDevServer.anon.Errors
import typings.webpackDevServer.anon.Server
import typings.webpackDevServer.anon.TypeMap
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  /**
    * Provides the ability to execute custom middleware after all other
    * middleware internally within the server.
    */
  var after: js.UndefOr[
    js.Function3[
      /* app */ Application_, 
      /* server */ WebpackDevServer, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ] = js.native
  
  /**
    * This option allows you to whitelist services that are allowed to
    * access the dev server.
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Provides the ability to execute custom middleware prior to all
    * other middleware internally within the server.
    */
  var before: js.UndefOr[
    js.Function3[
      /* app */ Application_, 
      /* server */ WebpackDevServer, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ] = js.native
  
  /**
    * This option broadcasts the server via ZeroConf networking on start.
    */
  var bonjour: js.UndefOr[Boolean] = js.native
  
  /**
    * When using inline mode, the console in your DevTools will show you
    * messages e.g. before reloading, before an error or when Hot Module
    * Replacement is enabled. This may be too verbose.
    *
    * 'none' and 'warning' are going to be deprecated at the next major
    * version.
    */
  var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.native
  
  /**
    * Enable gzip compression for everything served.
    */
  var compress: js.UndefOr[Boolean] = js.native
  
  /**
    * Tell the server where to serve content from. This is only necessary
    * if you want to serve static files. devServer.publicPath will be used
    * to determine where the bundles should be served from, and takes
    * precedence.
    */
  var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.native
  
  /**
    * Tell the server at what URL to serve `devServer.contentBase`.
    * If there was a file `assets/manifest.json`,
    * it would be served at `/serve-content-base-at-this-url/manifest.json`
    */
  var contentBasePublicPath: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * When set to true this option bypasses host checking.  THIS IS NOT
    * RECOMMENDED as apps that do not check the host are vulnerable to DNS
    * rebinding attacks.
    */
  var disableHostCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * This option lets you reduce the compilations in lazy mode.
    * By default in lazy mode, every request results in a new compilation.
    * With filename, it's possible to only compile when a certain file is requested.
    */
  var filename: js.UndefOr[String] = js.native
  
  /** Adds headers to all responses. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * When using the HTML5 History API, the index.html page will likely
    * have to be served in place of any 404 responses.
    */
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
  
  /**
    * Specify a host to use. By default this is localhost.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Enable webpack's Hot Module Replacement feature.
    * Note that webpack.HotModuleReplacementPlugin is required to fully
    * enable HMR. If webpack or webpack-dev-server are launched with the
    * --hot option, this plugin will be added automatically, so you may
    * not need to add this to your webpack.config.js.
    */
  var hot: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables Hot Module Replacement (see devServer.hot) without page
    * refresh as fallback in case of build failures.
    */
  var hotOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Serve over HTTP/2 using spdy. This option is ignored for Node 10.0.0
    * and above, as spdy is broken for those versions. The dev server will
    * migrate over to Node's built-in HTTP/2 once Express supports it.
    */
  var http2: js.UndefOr[Boolean] = js.native
  
  /**
    * By default dev-server will be served over HTTP. It can optionally be
    * served over HTTP/2 with HTTPS.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  
  /**
    * The filename that is considered the index file.
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Tells devServer to inject a client. Setting devServer.injectClient
    * to true will result in always injecting a client. It is possible to
    * provide a function to inject conditionally
    */
  var injectClient: js.UndefOr[
    Boolean | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
      Boolean
    ])
  ] = js.native
  
  /**
    * Tells devServer to inject a Hot Module Replacement. Setting
    * devServer.injectHot to true will result in always injecting. It is
    * possible to provide a function to inject conditionally
    */
  var injectHot: js.UndefOr[
    Boolean | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
      Boolean
    ])
  ] = js.native
  
  /**
    * Toggle between the dev-server's two different modes.  By default the
    * application will be served with inline mode enabled.  This means
    * that a script will be inserted in your bundle to take care of live
    * reloading, and build messages will appear in the browser console.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * When lazy is enabled, the dev-server will only compile the bundle
    * when it gets requested.  This means that webpack will not watch any
    * file changes.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, the dev-server will reload/refresh the page when file
    * changes are detected. devServer.hot option must be disabled or
    * devServer.watchContentBase option must be enabled in order for
    * liveReload to take effect. Disable devServer.liveReload by setting
    * it to false
    */
  var liveReload: js.UndefOr[Boolean] = js.native
  
  /**
    * The object is passed to the underlying webpack-dev-middleware. See
    * [documentation](https://github.com/webpack/webpack-dev-middleware#mimetypes)
    * for usage notes.
    */
  var mimeTypes: js.UndefOr[StringDictionary[js.Array[String]] | TypeMap] = js.native
  
  /**
    * With noInfo enabled, messages like the webpack bundle information
    * that is shown when starting up and after each save,will be hidden.
    * Errors and warnings will still be shown.
    */
  var noInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides an option to execute a custom function when
    * webpack-dev-server starts listening for connections on a port.
    */
  var onListening: js.UndefOr[js.Function1[/* server */ WebpackDevServer, Unit]] = js.native
  
  /** When open is enabled, the dev server will open the browser. */
  var open: js.UndefOr[Boolean | String | js.Object] = js.native
  
  /** Specify a page to navigate to when opening the browser. */
  var openPage: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Shows a full-screen overlay in the browser when there are compiler
    * errors or warnings. Disabled by default.
    */
  var overlay: js.UndefOr[Boolean | Errors] = js.native
  
  /**
    * When used via the CLI, a path to an SSL .pfx file. If used in
    * options, it should be the bytestream of the .pfx file.
    */
  var pfx: js.UndefOr[String] = js.native
  
  /** The passphrase to a SSL PFX file. */
  var pfxPassphrase: js.UndefOr[String] = js.native
  
  /** Specify a port number to listen for requests on. */
  var port: js.UndefOr[Double] = js.native
  
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
  var proxy: js.UndefOr[ProxyConfigMap | ProxyConfigArray] = js.native
  
  /**
    * When using inline mode and you're proxying dev-server, the inline
    * client script does not always know where to connect to.  It will try
    * to guess the URL of the server based on window.location, but if that
    * fails you'll need to use this.
    */
  var public: js.UndefOr[String] = js.native
  
  /**
    * The bundled files will be available in the browser under this path.
    * default is '/'
    */
  var publicPath: js.UndefOr[String] = js.native
  
  /**
    * With quiet enabled, nothing except the initial startup information
    * will be written to the console.  This also means that errors or
    * warnings from webpack are not visible.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  /**
    * Tells dev-server to use serveIndex middleware when enabled.
    *
    * serveIndex middleware generates directory listings on viewing
    * directories that don't have an index.html file.
    */
  var serveIndex: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated This option is deprecated in favor of devServer.before
    * and will be removed in v3.0.0. Here you can access the Express app
    * object and add your own custom middleware to it.
    */
  var setup: js.UndefOr[js.Function2[/* app */ Application_, /* server */ WebpackDevServer, Unit]] = js.native
  
  /**
    * Tells clients connected to devServer to use provided socket host.
    */
  var sockHost: js.UndefOr[String] = js.native
  
  /**
    * The path at which to connect to the reloading socket. Default is
    * '/sockjs-node'
    */
  var sockPath: js.UndefOr[String] = js.native
  
  /**
    * Tells clients connected to devServer to use provided socket port.
    */
  var sockPort: js.UndefOr[String | Double] = js.native
  
  /** The Unix socket to listen to (instead of a host). */
  var socket: js.UndefOr[String] = js.native
  
  /**
    * It is possible to configure advanced options for serving static
    * files from contentBase.
    *
    * This only works when using devServer.contentBase as a string.
    */
  var staticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.native
  
  /**
    * This option lets you precisely control what bundle information gets
    * displayed.  This can be a nice middle ground if you want some bundle
    * information, but not all of it.
    */
  var stats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['stats'] */ js.Any
  ] = js.native
  
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
  var transportMode: js.UndefOr[sockjs | ws | Client | Server | ClientServer] = js.native
  
  /** This option lets the browser open with your local IP. */
  var useLocalIp: js.UndefOr[Boolean] = js.native
  
  /**
    * Tell the server to watch the files served by the
    * devServer.contentBase option. File changes will trigger a full page
    * reload.
    */
  var watchContentBase: js.UndefOr[Boolean] = js.native
  
  /** Control options related to watching the files. */
  var watchOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['watchOptions'] */ js.Any
  ] = js.native
  
  /** Tells devServer to write generated assets to the disk. */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filePath */ String, Boolean])] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setAfter(
      value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAllowedHostsVarargs(value: String*): Self = this.set("allowedHosts", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHosts(value: js.Array[String]): Self = this.set("allowedHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHosts: Self = this.set("allowedHosts", js.undefined)
    
    @scala.inline
    def setBefore(
      value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
    ): Self = this.set("before", js.Any.fromFunction3(value))
    
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
    def setContentBasePublicPathVarargs(value: String*): Self = this.set("contentBasePublicPath", js.Array(value :_*))
    
    @scala.inline
    def setContentBasePublicPath(value: String | js.Array[String]): Self = this.set("contentBasePublicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentBasePublicPath: Self = this.set("contentBasePublicPath", js.undefined)
    
    @scala.inline
    def setDisableHostCheck(value: Boolean): Self = this.set("disableHostCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHostCheck: Self = this.set("disableHostCheck", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHistoryApiFallback(value: Boolean | Options): Self = this.set("historyApiFallback", value.asInstanceOf[js.Any])
    
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
    def setHttps(value: Boolean | ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setInjectClientFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any => Boolean
    ): Self = this.set("injectClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInjectClient(
      value: Boolean | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
          Boolean
        ])
    ): Self = this.set("injectClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectClient: Self = this.set("injectClient", js.undefined)
    
    @scala.inline
    def setInjectHotFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any => Boolean
    ): Self = this.set("injectHot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInjectHot(
      value: Boolean | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
          Boolean
        ])
    ): Self = this.set("injectHot", value.asInstanceOf[js.Any])
    
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
    def setMimeTypes(value: StringDictionary[js.Array[String]] | TypeMap): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setNoInfo(value: Boolean): Self = this.set("noInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInfo: Self = this.set("noInfo", js.undefined)
    
    @scala.inline
    def setOnListening(value: /* server */ WebpackDevServer => Unit): Self = this.set("onListening", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnListening: Self = this.set("onListening", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean | String | js.Object): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenPageVarargs(value: String*): Self = this.set("openPage", js.Array(value :_*))
    
    @scala.inline
    def setOpenPage(value: String | js.Array[String]): Self = this.set("openPage", value.asInstanceOf[js.Any])
    
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
    def setProxyVarargs(value: ProxyConfigArrayItem*): Self = this.set("proxy", js.Array(value :_*))
    
    @scala.inline
    def setProxy(value: ProxyConfigMap | ProxyConfigArray): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
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
    def setSetup(value: (/* app */ Application_, /* server */ WebpackDevServer) => Unit): Self = this.set("setup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setSockHost(value: String): Self = this.set("sockHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockHost: Self = this.set("sockHost", js.undefined)
    
    @scala.inline
    def setSockPath(value: String): Self = this.set("sockPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockPath: Self = this.set("sockPath", js.undefined)
    
    @scala.inline
    def setSockPort(value: String | Double): Self = this.set("sockPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockPort: Self = this.set("sockPort", js.undefined)
    
    @scala.inline
    def setSocket(value: String): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = this.set("staticOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticOptions: Self = this.set("staticOptions", js.undefined)
    
    @scala.inline
    def setStats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['stats'] */ js.Any
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setTransportMode(value: sockjs | ws | Client | Server | ClientServer): Self = this.set("transportMode", value.asInstanceOf[js.Any])
    
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
    def setWatchOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['watchOptions'] */ js.Any
    ): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
    
    @scala.inline
    def setWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = this.set("writeToDisk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteToDisk(value: Boolean | (js.Function1[/* filePath */ String, Boolean])): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
  }
}
