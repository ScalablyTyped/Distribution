package typings.webpackServe.mod

import typings.node.httpsMod.ServerOptions
import typings.webpackServe.webpackServeStrings.debug
import typings.webpackServe.webpackServeStrings.error
import typings.webpackServe.webpackServeStrings.info
import typings.webpackServe.webpackServeStrings.silent
import typings.webpackServe.webpackServeStrings.trace
import typings.webpackServe.webpackServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Addon to webpack-serve that allows access to the Koa server instance */
  var add: js.UndefOr[
    js.Function3[/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ this.type, Unit]
  ] = js.native
  
  /** Copy the server URL to the clipboard when the server is started */
  var clipboard: js.UndefOr[Boolean] = js.native
  
  /** Custom instance of a webpack compiler */
  var compiler: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ] = js.native
  
  /** Webpack configuration for creating a new webpack compiler instance */
  var config: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
  ] = js.native
  
  /** A path or array of paths where content will be served from */
  var content: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Options for webpack-dev-middleware */
  var devMiddleware: js.UndefOr[typings.webpackDevMiddleware.mod.Options] = js.native
  
  /** The host the server will listen on */
  var host: js.UndefOr[String] = js.native
  
  /** Options for webpack-hot-client */
  var hotClient: js.UndefOr[typings.webpackHotClient.mod.Options | Boolean] = js.native
  
  /** Enable HTTP2 support */
  var http2: js.UndefOr[Boolean] = js.native
  
  /** Configuration object for the server to use HTTPS */
  var https: js.UndefOr[ServerOptions] = js.native
  
  /** Level of information for webpack-serve to output */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
  
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[Boolean] = js.native
  
  /** Object of subscribers to webpack-serve bus events */
  var on: js.UndefOr[OnOptions] = js.native
  
  /** Open the browser when started */
  var open: js.UndefOr[OpenOptions | Boolean] = js.native
  
  /** Port that the server listens on */
  var port: js.UndefOr[Double] = js.native
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
    def setAdd(value: (/* app */ InitializedKoa, /* middleware */ Middleware, Options) => Unit): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setClipboard(value: Boolean): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setCompiler(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
    ): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: String*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: String | js.Array[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDevMiddleware(value: typings.webpackDevMiddleware.mod.Options): Self = this.set("devMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevMiddleware: Self = this.set("devMiddleware", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHotClient(value: typings.webpackHotClient.mod.Options | Boolean): Self = this.set("hotClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotClient: Self = this.set("hotClient", js.undefined)
    
    @scala.inline
    def setHttp2(value: Boolean): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setHttps(value: ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setLogLevel(value: trace | debug | info | warn | error | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogTime(value: Boolean): Self = this.set("logTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTime: Self = this.set("logTime", js.undefined)
    
    @scala.inline
    def setOn(value: OnOptions): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOpen(value: OpenOptions | Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
