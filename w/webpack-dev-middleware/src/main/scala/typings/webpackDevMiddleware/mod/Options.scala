package typings.webpackDevMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.debug
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.error
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.info
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.silent
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.trace
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Set the default file system which will be used by webpack as primary destination of generated files
    */
  var fs: js.UndefOr[typings.memoryFs.mod.^] = js.native
  
  /** This property allows a user to pass custom HTTP headers on each request. eg. { "X-Custom-Header": "yes" } */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The index path for web server, defaults to "index.html".
    * If falsy (but not undefined), the server will not respond to requests to the root URL.
    */
  var index: js.UndefOr[String | Boolean] = js.native
  
  /**
    * This option instructs the module to operate in 'lazy' mode,
    * meaning that it won't recompile when files change, but rather on each request.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /** This property defines the level of messages that the module will log */
  var logLevel: js.UndefOr[info | warn | error | trace | debug | silent] = js.native
  
  /**
    * If true the log output of the module will be prefixed by a timestamp in the HH:mm:ss format.
    * @default false
    */
  var logTime: js.UndefOr[Boolean] = js.native
  
  /**
    * In the rare event that a user would like to provide a custom logging interface,
    * this property allows the user to assign one
    */
  var logger: js.UndefOr[Logger] = js.native
  
  /**
    * This property allows a user to pass the list of HTTP request methods accepted by the server.
    * @default [ 'GET', 'HEAD' ]
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This property allows a user to register custom mime types or extension mappings
    * @default null
    */
  var mimeTypes: js.UndefOr[MimeTypeMap | OverrideMimeTypeMap | Null] = js.native
  
  /** The public path that the middleware is bound to */
  var publicPath: js.UndefOr[String] = js.native
  
  /** Allows users to provide a custom reporter to handle logging within the module */
  var reporter: js.UndefOr[Reporter | Null] = js.native
  
  /** Instructs the module to enable or disable the server-side rendering mode */
  var serverSideRender: js.UndefOr[Boolean] = js.native
  
  /** Options for formatting statistics displayed during and after compile */
  var stats: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
  ] = js.native
  
  /** The module accepts an Object containing options for file watching, which is passed directly to the compiler provided */
  var watchOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ js.Any
  ] = js.native
  
  /**
    * If true, the option will instruct the module to write files to the configured location on disk as specified in your webpack config file
    * This option also accepts a Function value, which can be used to filter which files are written to disk
    */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filename */ String, Boolean])] = js.native
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFs(value: typings.memoryFs.mod.^): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIndex(value: String | Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setLogLevel(value: info | warn | error | trace | debug | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogTime(value: Boolean): Self = this.set("logTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTime: Self = this.set("logTime", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setMimeTypes(value: MimeTypeMap | OverrideMimeTypeMap): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setMimeTypesNull: Self = this.set("mimeTypes", null)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = this.set("reporter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setReporterNull: Self = this.set("reporter", null)
    
    @scala.inline
    def setServerSideRender(value: Boolean): Self = this.set("serverSideRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideRender: Self = this.set("serverSideRender", js.undefined)
    
    @scala.inline
    def setStats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setWatchOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ js.Any
    ): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
    
    @scala.inline
    def setWriteToDiskFunction1(value: /* filename */ String => Boolean): Self = this.set("writeToDisk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteToDisk(value: Boolean | (js.Function1[/* filename */ String, Boolean])): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
  }
}
