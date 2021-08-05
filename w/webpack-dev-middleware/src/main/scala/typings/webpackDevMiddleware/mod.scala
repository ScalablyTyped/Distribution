package typings.webpackDevMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.webpackDevMiddleware.webpackDevMiddlewareBooleans.`false`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.debug
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.error
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.info
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.silent
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.trace
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any
  ): WebpackDevMiddleware & NextHandleFunction = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[WebpackDevMiddleware & NextHandleFunction]
  inline def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any,
    options: Options
  ): WebpackDevMiddleware & NextHandleFunction = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebpackDevMiddleware & NextHandleFunction]
  
  @JSImport("webpack-dev-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Logger = typings.loglevel.mod.Logger
  
  type MimeTypeMap = StringDictionary[js.Array[String]]
  
  trait Options extends StObject {
    
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
    var publicPath: js.UndefOr[String] = js.undefined
    
    /** Allows users to provide a custom reporter to handle logging within the module */
    var reporter: js.UndefOr[Reporter | Null] = js.undefined
    
    /** Instructs the module to enable or disable the server-side rendering mode */
    var serverSideRender: js.UndefOr[Boolean] = js.undefined
    
    /** Options for formatting statistics displayed during and after compile */
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ] = js.undefined
    
    /** The module accepts an Object containing options for file watching, which is passed directly to the compiler provided */
    var watchOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ js.Any
      ] = js.undefined
    
    /**
      * If true, the option will instruct the module to write files to the configured location on disk as specified in your webpack config file
      * This option also accepts a Function value, which can be used to filter which files are written to disk
      */
    var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filename */ String, Boolean])] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFs(value: typings.memoryFs.mod.^): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIndex(value: String | Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLogLevel(value: info | warn | error | trace | debug | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      inline def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      inline def setMimeTypes(value: MimeTypeMap | OverrideMimeTypeMap): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesNull: Self = StObject.set(x, "mimeTypes", null)
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setReporter(value: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
      
      inline def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setServerSideRender(value: Boolean): Self = StObject.set(x, "serverSideRender", value.asInstanceOf[js.Any])
      
      inline def setServerSideRenderUndefined: Self = StObject.set(x, "serverSideRender", js.undefined)
      
      inline def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWatchOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.WatchOptions */ js.Any
      ): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
      
      inline def setWriteToDisk(value: Boolean | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  trait OverrideMimeTypeMap extends StObject {
    
    var force: Boolean
    
    var typeMap: MimeTypeMap
  }
  object OverrideMimeTypeMap {
    
    inline def apply(force: Boolean, typeMap: MimeTypeMap): OverrideMimeTypeMap = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverrideMimeTypeMap]
    }
    
    extension [Self <: OverrideMimeTypeMap](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setTypeMap(value: MimeTypeMap): Self = StObject.set(x, "typeMap", value.asInstanceOf[js.Any])
    }
  }
  
  type Reporter = js.Function2[/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions, Unit]
  
  trait ReporterOptions extends StObject {
    
    var log: Logger
    
    var state: Boolean
    
    var stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ] = js.undefined
  }
  object ReporterOptions {
    
    inline def apply(log: Logger, state: Boolean): ReporterOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReporterOptions]
    }
    
    extension [Self <: ReporterOptions](x: Self) {
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  @js.native
  trait WebpackDevMiddleware extends StObject {
    
    /** A function executed once the middleware has stopped watching. */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var fileSystem: typings.memoryFs.mod.^ = js.native
    
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
