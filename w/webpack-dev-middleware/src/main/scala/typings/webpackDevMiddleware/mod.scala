package typings.webpackDevMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.memoryFs.mod.^
import typings.webpackDevMiddleware.webpackDevMiddlewareBooleans.`false`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.debug
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.error
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.info
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.silent
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.trace
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-dev-middleware", JSImport.Namespace)
  @js.native
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any
  ): WebpackDevMiddleware with NextHandleFunction = js.native
  @JSImport("webpack-dev-middleware", JSImport.Namespace)
  @js.native
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any,
    options: Options
  ): WebpackDevMiddleware with NextHandleFunction = js.native
  
  type Logger = typings.loglevel.mod.Logger
  
  type MimeTypeMap = StringDictionary[js.Array[String]]
  
  @js.native
  trait Options extends StObject {
    
    var filename: js.UndefOr[String] = js.native
    
    /**
      * Set the default file system which will be used by webpack as primary destination of generated files
      */
    var fs: js.UndefOr[^] = js.native
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFs(value: ^): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIndex(value: String | Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLogLevel(value: info | warn | error | trace | debug | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setMimeTypes(value: MimeTypeMap | OverrideMimeTypeMap): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesNull: Self = StObject.set(x, "mimeTypes", null)
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setServerSideRender(value: Boolean): Self = StObject.set(x, "serverSideRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideRenderUndefined: Self = StObject.set(x, "serverSideRender", js.undefined)
      
      @scala.inline
      def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setWatchOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ js.Any
      ): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  @js.native
  trait OverrideMimeTypeMap extends StObject {
    
    var force: Boolean = js.native
    
    var typeMap: MimeTypeMap = js.native
  }
  object OverrideMimeTypeMap {
    
    @scala.inline
    def apply(force: Boolean, typeMap: MimeTypeMap): OverrideMimeTypeMap = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverrideMimeTypeMap]
    }
    
    @scala.inline
    implicit class OverrideMimeTypeMapMutableBuilder[Self <: OverrideMimeTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeMap(value: MimeTypeMap): Self = StObject.set(x, "typeMap", value.asInstanceOf[js.Any])
    }
  }
  
  type Reporter = js.Function2[/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions, Unit]
  
  @js.native
  trait ReporterOptions extends StObject {
    
    var log: Logger = js.native
    
    var state: Boolean = js.native
    
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ] = js.native
  }
  object ReporterOptions {
    
    @scala.inline
    def apply(log: Logger, state: Boolean): ReporterOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReporterOptions]
    }
    
    @scala.inline
    implicit class ReporterOptionsMutableBuilder[Self <: ReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  @js.native
  trait WebpackDevMiddleware extends StObject {
    
    /** A function executed once the middleware has stopped watching. */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var fileSystem: ^ = js.native
    
    def getFilenameFromUrl(url: String): String | `false` = js.native
    
    /** Instructs a webpack-dev-middleware instance to recompile the bundle. e.g. after a change to the configuration. */
    def invalidate(): Unit = js.native
    def invalidate(
      callback: js.Function1[
          /* stats */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
          ], 
          Unit
        ]
    ): Unit = js.native
    
    /** Executes a callback function when the compiler bundle is valid, typically after compilation */
    def waitUntilValid(): Unit = js.native
    def waitUntilValid(
      callback: js.Function1[
          /* stats */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
          ], 
          Unit
        ]
    ): Unit = js.native
  }
}
