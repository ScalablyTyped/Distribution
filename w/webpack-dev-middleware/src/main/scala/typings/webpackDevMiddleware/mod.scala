package typings.webpackDevMiddleware

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.std.NonNullable
import typings.std.Record
import typings.std.ReturnType
import typings.webpack.mod.CallbackFunction
import typings.webpack.mod.StatsOptions
import typings.webpackDevMiddleware.anon.CreateReadStream
import typings.webpackDevMiddleware.anon.FnCallName
import typings.webpackDevMiddleware.anon.Key
import typings.webpackDevMiddleware.anon.Webpack
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-only`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-warnings`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.detailed
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.minimal
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.none
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.normal
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.summary
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").MultiCompiler} MultiCompiler */
  /** @typedef {import("webpack").Configuration} Configuration */
  /** @typedef {import("webpack").Stats} Stats */
  /** @typedef {import("webpack").MultiStats} MultiStats */
  /** @typedef {import("fs").ReadStream} ReadStream */
  /**
    * @typedef {Object} ExtendedServerResponse
    * @property {{ webpack?: { devMiddleware?: Context<IncomingMessage, ServerResponse> } }} [locals]
    */
  /** @typedef {import("http").IncomingMessage} IncomingMessage */
  /** @typedef {import("http").ServerResponse & ExtendedServerResponse} ServerResponse */
  /**
    * @callback NextFunction
    * @param {any} [err]
    * @return {void}
    */
  /**
    * @typedef {NonNullable<Configuration["watchOptions"]>} WatchOptions
    */
  /**
    * @typedef {Compiler["watching"]} Watching
    */
  /**
    * @typedef {ReturnType<Compiler["watch"]>} MultiWatching
    */
  /**
    * @typedef {Compiler["outputFileSystem"] & { createReadStream?: import("fs").createReadStream, statSync?: import("fs").statSync, lstat?: import("fs").lstat, readFileSync?: import("fs").readFileSync }} OutputFileSystem
    */
  /** @typedef {ReturnType<Compiler["getInfrastructureLogger"]>} Logger */
  /**
    * @callback Callback
    * @param {Stats | MultiStats} [stats]
    */
  /**
    * @typedef {Object} ResponseData
    * @property {string | Buffer | ReadStream} data
    * @property {number} byteLength
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @callback ModifyResponseData
    * @param {RequestInternal} req
    * @param {ResponseInternal} res
    * @param {string | Buffer | ReadStream} data
    * @param {number} byteLength
    * @return {ResponseData}
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @typedef {Object} Context
    * @property {boolean} state
    * @property {Stats | MultiStats | undefined} stats
    * @property {Callback[]} callbacks
    * @property {Options<RequestInternal, ResponseInternal>} options
    * @property {Compiler | MultiCompiler} compiler
    * @property {Watching | MultiWatching} watching
    * @property {Logger} logger
    * @property {OutputFileSystem} outputFileSystem
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @typedef {Record<string, string | number> | Array<{ key: string, value: number | string }> | ((req: RequestInternal, res: ResponseInternal, context: Context<RequestInternal, ResponseInternal>) =>  void | undefined | Record<string, string | number>) | undefined} Headers
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @typedef {Object} Options
    * @property {{[key: string]: string}} [mimeTypes]
    * @property {string | undefined} [mimeTypeDefault]
    * @property {boolean | ((targetPath: string) => boolean)} [writeToDisk]
    * @property {string} [methods]
    * @property {Headers<RequestInternal, ResponseInternal>} [headers]
    * @property {NonNullable<Configuration["output"]>["publicPath"]} [publicPath]
    * @property {Configuration["stats"]} [stats]
    * @property {boolean} [serverSideRender]
    * @property {OutputFileSystem} [outputFileSystem]
    * @property {boolean | string} [index]
    * @property {ModifyResponseData<RequestInternal, ResponseInternal>} [modifyResponseData]
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @callback Middleware
    * @param {RequestInternal} req
    * @param {ResponseInternal} res
    * @param {NextFunction} next
    * @return {Promise<void>}
    */
  /**
    * @callback GetFilenameFromUrl
    * @param {string} url
    * @returns {string | undefined}
    */
  /**
    * @callback WaitUntilValid
    * @param {Callback} callback
    */
  /**
    * @callback Invalidate
    * @param {Callback} callback
    */
  /**
    * @callback Close
    * @param {(err: Error | null | undefined) => void} callback
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @typedef {Object} AdditionalMethods
    * @property {GetFilenameFromUrl} getFilenameFromUrl
    * @property {WaitUntilValid} waitUntilValid
    * @property {Invalidate} invalidate
    * @property {Close} close
    * @property {Context<RequestInternal, ResponseInternal>} context
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @typedef {Middleware<RequestInternal, ResponseInternal> & AdditionalMethods<RequestInternal, ResponseInternal>} API
    */
  /**
    * @template {IncomingMessage} RequestInternal
    * @template {ServerResponse} ResponseInternal
    * @param {Compiler | MultiCompiler} compiler
    * @param {Options<RequestInternal, ResponseInternal>} [options]
    * @returns {API<RequestInternal, ResponseInternal>}
    */
  inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](compiler: Compiler): API[RequestInternal, ResponseInternal] = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[API[RequestInternal, ResponseInternal]]
  inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](compiler: Compiler, options: Options[RequestInternal, ResponseInternal]): API[RequestInternal, ResponseInternal] = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[API[RequestInternal, ResponseInternal]]
  inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](compiler: MultiCompiler): API[RequestInternal, ResponseInternal] = ^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any]).asInstanceOf[API[RequestInternal, ResponseInternal]]
  inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](compiler: MultiCompiler, options: Options[RequestInternal, ResponseInternal]): API[RequestInternal, ResponseInternal] = (^.asInstanceOf[js.Dynamic].apply(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[API[RequestInternal, ResponseInternal]]
  
  @JSImport("webpack-dev-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait API[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */]
    extends Middleware[RequestInternal, ResponseInternal]
       with AdditionalMethods[RequestInternal, ResponseInternal] {
    
    /* InferMemberOverrides */
    override def apply(arg1: RequestInternal, arg2: ResponseInternal, arg3: /* next */ NextFunction): js.Promise[Unit] = js.native
  }
  
  trait AdditionalMethods[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] extends StObject {
    
    def close(callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Any
    @JSName("close")
    var close_Original: Close
    
    var context: Context[RequestInternal, ResponseInternal]
    
    def getFilenameFromUrl(url: String): js.UndefOr[String]
    @JSName("getFilenameFromUrl")
    var getFilenameFromUrl_Original: GetFilenameFromUrl
    
    def invalidate(callback: Callback): Any
    @JSName("invalidate")
    var invalidate_Original: Invalidate
    
    def waitUntilValid(callback: Callback): Any
    @JSName("waitUntilValid")
    var waitUntilValid_Original: WaitUntilValid
  }
  object AdditionalMethods {
    
    inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](
      close: /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit] => Any,
      context: Context[RequestInternal, ResponseInternal],
      getFilenameFromUrl: /* url */ String => js.UndefOr[String],
      invalidate: /* callback */ Callback => Any,
      waitUntilValid: /* callback */ Callback => Any
    ): AdditionalMethods[RequestInternal, ResponseInternal] = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), context = context.asInstanceOf[js.Any], getFilenameFromUrl = js.Any.fromFunction1(getFilenameFromUrl), invalidate = js.Any.fromFunction1(invalidate), waitUntilValid = js.Any.fromFunction1(waitUntilValid))
      __obj.asInstanceOf[AdditionalMethods[RequestInternal, ResponseInternal]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalMethods[?, ?], RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] (val x: Self & (AdditionalMethods[RequestInternal, ResponseInternal])) extends AnyVal {
      
      inline def setClose(value: /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit] => Any): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setContext(value: Context[RequestInternal, ResponseInternal]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setGetFilenameFromUrl(value: /* url */ String => js.UndefOr[String]): Self = StObject.set(x, "getFilenameFromUrl", js.Any.fromFunction1(value))
      
      inline def setInvalidate(value: /* callback */ Callback => Any): Self = StObject.set(x, "invalidate", js.Any.fromFunction1(value))
      
      inline def setWaitUntilValid(value: /* callback */ Callback => Any): Self = StObject.set(x, "waitUntilValid", js.Any.fromFunction1(value))
    }
  }
  
  type Callback = js.Function1[
    /* stats */ js.UndefOr[typings.webpack.mod.Stats | typings.webpack.mod.MultiStats], 
    Any
  ]
  
  type Close = js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], Any]
  
  type Compiler = typings.webpack.mod.Compiler
  
  type Configuration = typings.webpack.mod.Configuration
  
  trait Context[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] extends StObject {
    
    var callbacks: js.Array[Callback]
    
    var compiler: Compiler | MultiCompiler
    
    var logger: Logger
    
    var options: Options[RequestInternal, ResponseInternal]
    
    var outputFileSystem: OutputFileSystem
    
    var state: Boolean
    
    var stats: js.UndefOr[Stats | MultiStats] = js.undefined
    
    var watching: Watching | MultiWatching
  }
  object Context {
    
    inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](
      callbacks: js.Array[Callback],
      compiler: Compiler | MultiCompiler,
      logger: Logger,
      options: Options[RequestInternal, ResponseInternal],
      outputFileSystem: OutputFileSystem,
      state: Boolean,
      watching: Watching | MultiWatching
    ): Context[RequestInternal, ResponseInternal] = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outputFileSystem = outputFileSystem.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[RequestInternal, ResponseInternal]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context[?, ?], RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] (val x: Self & (Context[RequestInternal, ResponseInternal])) extends AnyVal {
      
      inline def setCallbacks(value: js.Array[Callback]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: Callback*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setCompiler(value: Compiler | MultiCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options[RequestInternal, ResponseInternal]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOutputFileSystem(value: OutputFileSystem): Self = StObject.set(x, "outputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats | MultiStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWatching(value: Watching | MultiWatching): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendedServerResponse extends StObject {
    
    var locals: js.UndefOr[Webpack] = js.undefined
  }
  object ExtendedServerResponse {
    
    inline def apply(): ExtendedServerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedServerResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedServerResponse] (val x: Self) extends AnyVal {
      
      inline def setLocals(value: Webpack): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    }
  }
  
  type GetFilenameFromUrl = js.Function1[/* url */ String, js.UndefOr[String]]
  
  type Headers[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] = js.UndefOr[
    (Record[String, String | Double]) | js.Array[Key] | (js.Function3[
      /* req */ RequestInternal, 
      /* res */ ResponseInternal, 
      /* context */ Context[RequestInternal, ResponseInternal], 
      js.UndefOr[Unit | (Record[String, String | Double])]
    ])
  ]
  
  type IncomingMessage = typings.node.httpMod.IncomingMessage
  
  type Invalidate = js.Function1[/* callback */ Callback, Any]
  
  type Logger = ReturnType[FnCallName]
  
  type Middleware[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] = js.Function3[
    /* req */ RequestInternal, 
    /* res */ ResponseInternal, 
    /* next */ NextFunction, 
    js.Promise[Unit]
  ]
  
  type ModifyResponseData[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] = js.Function4[
    /* req */ RequestInternal, 
    /* res */ ResponseInternal, 
    /* data */ String | Buffer | ReadStream, 
    /* byteLength */ Double, 
    ResponseData
  ]
  
  type MultiCompiler = typings.webpack.mod.MultiCompiler
  
  type MultiStats = typings.webpack.mod.MultiStats
  
  type MultiWatching = ReturnType[
    js.Function2[
      /* watchOptions */ typings.webpack.mod.WatchOptions, 
      /* handler */ CallbackFunction[typings.webpack.mod.Stats], 
      typings.webpack.mod.Watching
    ]
  ]
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[Any], Unit]
  
  trait Options[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] extends StObject {
    
    var headers: js.UndefOr[typings.std.Headers] = js.undefined
    
    var index: js.UndefOr[String | Boolean] = js.undefined
    
    var methods: js.UndefOr[String] = js.undefined
    
    var mimeTypeDefault: js.UndefOr[String] = js.undefined
    
    var mimeTypes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var modifyResponseData: js.UndefOr[ModifyResponseData[RequestInternal, ResponseInternal]] = js.undefined
    
    var outputFileSystem: js.UndefOr[OutputFileSystem] = js.undefined
    
    var publicPath: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<webpack.webpack.Output | undefined>['publicPath'] */ js.Any
      ] = js.undefined
    
    var serverSideRender: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[
        Boolean | StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
      ] = js.undefined
    
    var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* targetPath */ String, Boolean])] = js.undefined
  }
  object Options {
    
    inline def apply[RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */](): Options[RequestInternal, ResponseInternal] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[RequestInternal, ResponseInternal]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?], RequestInternal /* <: typings.node.httpMod.IncomingMessage */, ResponseInternal /* <: ServerResponse */] (val x: Self & (Options[RequestInternal, ResponseInternal])) extends AnyVal {
      
      inline def setHeaders(value: typings.std.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIndex(value: String | Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMethods(value: String): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMimeTypeDefault(value: String): Self = StObject.set(x, "mimeTypeDefault", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeDefaultUndefined: Self = StObject.set(x, "mimeTypeDefault", js.undefined)
      
      inline def setMimeTypes(value: StringDictionary[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setModifyResponseData(
        value: (RequestInternal, ResponseInternal, /* data */ String | Buffer | ReadStream, /* byteLength */ Double) => ResponseData
      ): Self = StObject.set(x, "modifyResponseData", js.Any.fromFunction4(value))
      
      inline def setModifyResponseDataUndefined: Self = StObject.set(x, "modifyResponseData", js.undefined)
      
      inline def setOutputFileSystem(value: OutputFileSystem): Self = StObject.set(x, "outputFileSystem", value.asInstanceOf[js.Any])
      
      inline def setOutputFileSystemUndefined: Self = StObject.set(x, "outputFileSystem", js.undefined)
      
      inline def setPublicPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<webpack.webpack.Output | undefined>['publicPath'] */ js.Any
      ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setServerSideRender(value: Boolean): Self = StObject.set(x, "serverSideRender", value.asInstanceOf[js.Any])
      
      inline def setServerSideRenderUndefined: Self = StObject.set(x, "serverSideRender", js.undefined)
      
      inline def setStats(
        value: Boolean | StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWriteToDisk(value: Boolean | (js.Function1[/* targetPath */ String, Boolean])): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskFunction1(value: /* targetPath */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  type OutputFileSystem = typings.webpack.mod.OutputFileSystem & CreateReadStream
  
  type ReadStream = typings.node.fsMod.ReadStream
  
  trait ResponseData extends StObject {
    
    var byteLength: Double
    
    var data: String | Buffer | ReadStream
  }
  object ResponseData {
    
    inline def apply(byteLength: Double, data: String | Buffer | ReadStream): ResponseData = {
      val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
      
      inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      inline def setData(value: String | Buffer | ReadStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type Schema = typings.schemaUtils.declarationsValidateMod.Schema
  
  @js.native
  trait ServerResponse
    extends typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
       with ExtendedServerResponse
  
  type Stats = typings.webpack.mod.Stats
  
  type WaitUntilValid = js.Function1[/* callback */ Callback, Any]
  
  type WatchOptions = NonNullable[js.UndefOr[typings.webpack.mod.WatchOptions]]
  
  type Watching = typings.webpack.mod.Watching
}
