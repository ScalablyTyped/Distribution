package typings.webpack.mod

import typings.node.Buffer
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import typings.webpack.webpackStrings.`async-node`
import typings.webpack.webpackStrings.`electron-main`
import typings.webpack.webpackStrings.`electron-renderer`
import typings.webpack.webpackStrings.`node-webkit`
import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.node
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.production
import typings.webpack.webpackStrings.web
import typings.webpack.webpackStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "loader")
@js.native
object loader extends js.Object {
  @js.native
  trait Loader
    extends js.Function {
    /**
      * The order of chained loaders are always called from right to left.
      * But, in some cases, loaders do not care about the results of the previous loader or the resource.
      * They only care for metadata. The pitch method on the loaders is called from left to right before the loaders are called (from right to left).
      * If a loader delivers a result in the pitch method the process turns around and skips the remaining loaders,
      * continuing with the calls to the more left loaders. data can be passed between pitch and normal call.
      */
    var pitch: js.UndefOr[
        js.Function3[/* remainingRequest */ String, /* precedingRequest */ String, /* data */ js.Any, _]
      ] = js.native
    /**
      * By default, the resource file is treated as utf-8 string and passed as String to the loader.
      * By setting raw to true the loader is passed the raw Buffer.
      * Every loader is allowed to deliver its result as String or as Buffer.
      * The compiler converts them between loaders.
      */
    var raw: js.UndefOr[Boolean] = js.native
    def apply(source: String): js.UndefOr[String | Buffer | Unit] = js.native
    def apply(source: String, sourceMap: RawSourceMap): js.UndefOr[String | Buffer | Unit] = js.native
    def apply(source: Buffer): js.UndefOr[String | Buffer | Unit] = js.native
    def apply(source: Buffer, sourceMap: RawSourceMap): js.UndefOr[String | Buffer | Unit] = js.native
  }
  
  @js.native
  trait LoaderContext extends js.Object {
    /**
      * Hacky access to the Compilation object of webpack.
      */
    var _compilation: js.Any = js.native
    /**
      * Hacky access to the Compiler object of webpack.
      */
    var _compiler: Compiler_ = js.native
    /**
      * Hacky access to the Module object being loaded.
      */
    var _module: js.Any = js.native
    @JSName("callback")
    var callback_Original: loaderCallback = js.native
    /**
      *  The directory of the module. Can be used as context for resolving other stuff.
      *  In the example: /abc because resource.js is in this directory
      */
    var context: String = js.native
    /**
      * A data object shared between the pitch and the normal phase.
      */
    var data: js.UndefOr[js.Any] = js.native
    /**
      * A boolean flag. It is set when in debug mode.
      */
    var debug: Boolean = js.native
    /**
      * Access to the compilation's inputFileSystem property.
      */
    var fs: js.Any = js.native
    /** Flag if HMR is enabled */
    var hot: Boolean = js.native
    /**
      * Passed from the last loader.
      * If you would execute the input argument as module, consider reading this variable for a shortcut (for performance).
      */
    var inputValue: js.Any = js.native
    /**
      * The index in the loaders array of the current loader.
      * In the example: in loader1: 0, in loader2: 1
      */
    var loaderIndex: Double = js.native
    /**
      * An array of all the loaders. It is writeable in the pitch phase.
      * loaders = [{request: string, path: string, query: string, module: function}]
      *
      * In the example:
      * [
      *   { request: "/abc/loader1.js?xyz",
      *     path: "/abc/loader1.js",
      *     query: "?xyz",
      *     module: [Function]
      *   },
      *   { request: "/abc/node_modules/loader2/index.js",
      *     path: "/abc/node_modules/loader2/index.js",
      *     query: "",
      *     module: [Function]
      *   }
      * ]
      */
    var loaders: js.Array[_] = js.native
    /**
      * Should the result be minimized.
      */
    var minimize: Boolean = js.native
    /**
      * Which mode is webpack running.
      */
    var mode: production | development | none = js.native
    /**
      *  A string or any object. The query of the request for the current loader.
      */
    var query: js.Any = js.native
    /**
      * The resolved request string.
      * In the example: "/abc/loader1.js?xyz!/abc/node_modules/loader2/index.js!/abc/resource.js?rrr"
      */
    var request: String = js.native
    /**
      * The resource part of the request, including query.
      * In the example: "/abc/resource.js?rrr"
      */
    var resource: String = js.native
    /**
      * The resource file.
      * In the example: "/abc/resource.js"
      */
    var resourcePath: String = js.native
    /**
      * The query of the resource.
      * In the example: "?rrr"
      */
    var resourceQuery: String = js.native
    /**
      * Starting with webpack 4, the formerly `this.options.context` is provided as `this.rootContext`.
      */
    var rootContext: String = js.native
    /**
      * Should a SourceMap be generated.
      */
    var sourceMap: Boolean = js.native
    /**
      * Target of compilation. Passed from configuration options.
      * Example values: "web", "node"
      */
    var target: web | webworker | `async-node` | node | `electron-main` | `electron-renderer` | `node-webkit` | String = js.native
    /**
      * Pass values to the next loader.
      * If you know what your result exports if executed as module, set this value here (as a only element array).
      */
    var value: js.Any = js.native
    /**
      * Loader API version. Currently 2.
      * This is useful for providing backwards compatibility.
      * Using the version you can specify custom logic or fallbacks for breaking changes.
      */
    var version: String = js.native
    /**
      * This boolean is set to true when this is compiled by webpack.
      *
      * Loaders were originally designed to also work as Babel transforms.
      * Therefore if you write a loader that works for both, you can use this property to know if
      * there is access to additional loaderContext and webpack features.
      */
    var webpack: Boolean = js.native
    /**
      * Add a directory as dependency of the loader result.
      */
    def addContextDependency(directory: String): Unit = js.native
    /**
      * Adds a file as dependency of the loader result in order to make them watchable.
      * For example, html-loader uses this technique as it finds src and src-set attributes.
      * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
      */
    def addDependency(file: String): Unit = js.native
    /**
      * Make this loader async.
      */
    def async(): js.UndefOr[loaderCallback] = js.native
    /**
      *  Make this loader result cacheable. By default it's not cacheable.
      *  A cacheable loader must have a deterministic result, when inputs and dependencies haven't changed.
      *  This means the loader shouldn't have other dependencies than specified with this.addDependency.
      *  Most loaders are deterministic and cacheable.
      */
    def cacheable(): Unit = js.native
    def cacheable(flag: Boolean): Unit = js.native
    def callback(): Unit = js.native
    def callback(err: Null, content: String): Unit = js.native
    def callback(err: Null, content: String, sourceMap: RawSourceMap): Unit = js.native
    def callback(err: Null, content: Buffer): Unit = js.native
    def callback(err: Null, content: Buffer, sourceMap: RawSourceMap): Unit = js.native
    def callback(err: Error): Unit = js.native
    def callback(err: Error, content: String): Unit = js.native
    def callback(err: Error, content: String, sourceMap: RawSourceMap): Unit = js.native
    def callback(err: Error, content: Buffer): Unit = js.native
    def callback(err: Error, content: Buffer, sourceMap: RawSourceMap): Unit = js.native
    /**
      * Remove all dependencies of the loader result. Even initial dependencies and these of other loaders. Consider using pitch.
      */
    def clearDependencies(): Unit = js.native
    /**
      * Adds a file as dependency of the loader result in order to make them watchable.
      * For example, html-loader uses this technique as it finds src and src-set attributes.
      * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
      */
    def dependency(file: String): Unit = js.native
    /**
      * Emit a error.
      */
    def emitError(message: String): Unit = js.native
    def emitError(message: Error): Unit = js.native
    def emitFile(name: String, content: String, sourceMap: js.Any): Unit = js.native
    /**
      * Emit a file. This is webpack-specific.
      */
    def emitFile(name: String, content: Buffer, sourceMap: js.Any): Unit = js.native
    /**
      * Emit a warning.
      */
    def emitWarning(message: String): Unit = js.native
    def emitWarning(message: Error): Unit = js.native
    /**
      * Execute some code fragment like a module.
      *
      * Don't use require(this.resourcePath), use this function to make loaders chainable!
      *
      */
    def exec(code: String, filename: String): js.Any = js.native
    /**
      * Resolves the given request to a module, applies all configured loaders and calls
      * back with the generated source, the sourceMap and the module instance (usually an
      * instance of NormalModule). Use this function if you need to know the source code
      * of another module to generate the result.
      */
    def loadModule(
      request: String,
      callback: js.Function4[
          /* err */ Error | Null, 
          /* source */ String, 
          /* sourceMap */ RawSourceMap, 
          /* module */ Module, 
          Unit
        ]
    ): js.Any = js.native
    /**
      * Resolve a request like a require expression.
      */
    def resolve(
      context: String,
      request: String,
      callback: js.Function2[/* err */ Error, /* result */ String, Unit]
    ): js.Any = js.native
    /**
      * Resolve a request like a require expression.
      */
    def resolveSync(context: String, request: String): String = js.native
  }
  
  type loaderCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* content */ js.UndefOr[String | Buffer], 
    /* sourceMap */ js.UndefOr[RawSourceMap], 
    Unit
  ]
}

