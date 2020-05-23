package typings.webpackDevMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Options.Stats
import typings.webpack.mod.Options.WatchOptions
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.debug
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.error
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.info
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.silent
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.trace
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Set the default file system which will be used by webpack as primary destination of generated files
    */
  var fs: js.UndefOr[typings.memoryFs.mod.^] = js.undefined
  /** This property allows a user to pass custom HTTP headers on each request. eg. { "X-Custom-Header": "yes" } */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The index path for web server, defaults to "index.html".
    * If falsy (but not undefined), the server will not respond to requests to the root URL.
    */
  var index: js.UndefOr[String | Boolean] = js.undefined
  /**
    * This option instructs the module to operate in 'lazy' mode,
    * meaning that it won't recompile when files change, but rather on each request.
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  /** This property defines the level of messages that the module will log */
  var logLevel: js.UndefOr[info | warn | error | trace | debug | silent] = js.undefined
  /**
    * If true the log output of the module will be prefixed by a timestamp in the HH:mm:ss format.
    * @default false
    */
  var logTime: js.UndefOr[Boolean] = js.undefined
  /**
    * In the rare event that a user would like to provide a custom logging interface,
    * this property allows the user to assign one
    */
  var logger: js.UndefOr[Logger] = js.undefined
  /**
    * This property allows a user to pass the list of HTTP request methods accepted by the server.
    * @default [ 'GET', 'HEAD' ]
    */
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * This property allows a user to register custom mime types or extension mappings
    * @default null
    */
  var mimeTypes: js.UndefOr[MimeTypeMap | OverrideMimeTypeMap | Null] = js.undefined
  /** The public path that the middleware is bound to */
  var publicPath: String
  /** Allows users to provide a custom reporter to handle logging within the module */
  var reporter: js.UndefOr[Reporter | Null] = js.undefined
  /** Instructs the module to enable or disable the server-side rendering mode */
  var serverSideRender: js.UndefOr[Boolean] = js.undefined
  /** Options for formatting statistics displayed during and after compile */
  var stats: js.UndefOr[Stats] = js.undefined
  /** The module accepts an Object containing options for file watching, which is passed directly to the compiler provided */
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  /**
    * If true, the option will instruct the module to write files to the configured location on disk as specified in your webpack config file
    * This option also accepts a Function value, which can be used to filter which files are written to disk
    */
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filename */ String, Boolean])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    publicPath: String,
    filename: String = null,
    fs: typings.memoryFs.mod.^ = null,
    headers: StringDictionary[String] = null,
    index: String | Boolean = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    logLevel: info | warn | error | trace | debug | silent = null,
    logTime: js.UndefOr[Boolean] = js.undefined,
    logger: Logger = null,
    methods: js.Array[String] = null,
    mimeTypes: js.UndefOr[Null | MimeTypeMap | OverrideMimeTypeMap] = js.undefined,
    reporter: js.UndefOr[
      Null | ((/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit)
    ] = js.undefined,
    serverSideRender: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    watchOptions: WatchOptions = null,
    writeToDisk: Boolean | (js.Function1[/* filename */ String, Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal(publicPath = publicPath.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(reporter)) __obj.updateDynamic("reporter")(if (reporter != null) js.Any.fromFunction2(reporter.asInstanceOf[(/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit]) else null)
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender.get.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

