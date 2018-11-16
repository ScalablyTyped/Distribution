package typings
package webpackLib.webpackMod.webpackNs.loaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderContext extends js.Object {
  /**
               * Hacky access to the Compilation object of webpack.
               */
  var _compilation: js.Any = js.native
  /**
               * Hacky access to the Compiler object of webpack.
               */
  var _compiler: webpackLib.webpackMod.webpackNs.Compiler = js.native
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
  var context: java.lang.String = js.native
  /**
               * A data object shared between the pitch and the normal phase.
               */
  var data: js.UndefOr[js.Any] = js.native
  /**
               * A boolean flag. It is set when in debug mode.
               */
  var debug: scala.Boolean = js.native
  /**
               * Access to the compilation's inputFileSystem property.
               */
  var fs: js.Any = js.native
  /** Flag if HMR is enabled */
  var hot: scala.Boolean = js.native
  /**
               * Passed from the last loader.
               * If you would execute the input argument as module, consider reading this variable for a shortcut (for performance).
               */
  var inputValue: js.Any = js.native
  /**
               * The index in the loaders array of the current loader.
               * In the example: in loader1: 0, in loader2: 1
               */
  var loaderIndex: scala.Double = js.native
  /**
               * loaders = [{request: string, path: string, query: string, module: function}]
               * An array of all the loaders. It is writeable in the pitch phase.
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
  var minimize: scala.Boolean = js.native
  /**
               *  A string or any object. The query of the request for the current loader.
               */
  var query: js.Any = js.native
  /**
               * The resolved request string.
               * In the example: "/abc/loader1.js?xyz!/abc/node_modules/loader2/index.js!/abc/resource.js?rrr"
               */
  var request: java.lang.String = js.native
  /**
               * The resource part of the request, including query.
               * In the example: "/abc/resource.js?rrr"
               */
  var resource: java.lang.String = js.native
  /**
               * The resource file.
               * In the example: "/abc/resource.js"
               */
  var resourcePath: java.lang.String = js.native
  /**
               * The query of the resource.
               * In the example: "?rrr"
               */
  var resourceQuery: java.lang.String = js.native
  /**
               * Starting with webpack 4, the formerly `this.options.context` is provided as `this.rootContext`.
               */
  var rootContext: java.lang.String = js.native
  /**
               * Should a SourceMap be generated.
               */
  var sourceMap: scala.Boolean = js.native
  /**
               * Target of compilation. Passed from configuration options.
               * Example values: "web", "node"
               */
  var target: webpackLib.webpackLibStrings.web | webpackLib.webpackLibStrings.webworker | webpackLib.webpackLibStrings.`async-node` | webpackLib.webpackLibStrings.node | webpackLib.webpackLibStrings.`electron-main` | webpackLib.webpackLibStrings.`electron-renderer` | webpackLib.webpackLibStrings.`node-webkit` | java.lang.String = js.native
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
  var version: java.lang.String = js.native
  /**
               * This boolean is set to true when this is compiled by webpack.
               *
               * Loaders were originally designed to also work as Babel transforms.
               * Therefore if you write a loader that works for both, you can use this property to know if
               * there is access to additional loaderContext and webpack features.
               */
  var webpack: scala.Boolean = js.native
  /**
               * Add a directory as dependency of the loader result.
               */
  def addContextDependency(directory: java.lang.String): scala.Unit = js.native
  /**
               * Adds a file as dependency of the loader result in order to make them watchable.
               * For example, html-loader uses this technique as it finds src and src-set attributes.
               * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
               */
  def addDependency(file: java.lang.String): scala.Unit = js.native
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
  def cacheable(): scala.Unit = js.native
  /**
               *  Make this loader result cacheable. By default it's not cacheable.
               *  A cacheable loader must have a deterministic result, when inputs and dependencies haven't changed.
               *  This means the loader shouldn't have other dependencies than specified with this.addDependency.
               *  Most loaders are deterministic and cacheable.
               */
  def cacheable(flag: scala.Boolean): scala.Unit = js.native
  def callback(): scala.Unit = js.native
  def callback(err: js.UndefOr[scala.Nothing], content: java.lang.String): scala.Unit = js.native
  def callback(
    err: js.UndefOr[scala.Nothing],
    content: java.lang.String,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def callback(err: js.UndefOr[scala.Nothing], content: nodeLib.Buffer): scala.Unit = js.native
  def callback(
    err: js.UndefOr[scala.Nothing],
    content: nodeLib.Buffer,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def callback(err: nodeLib.Error): scala.Unit = js.native
  def callback(err: nodeLib.Error, content: java.lang.String): scala.Unit = js.native
  def callback(
    err: nodeLib.Error,
    content: java.lang.String,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def callback(err: nodeLib.Error, content: nodeLib.Buffer): scala.Unit = js.native
  def callback(
    err: nodeLib.Error,
    content: nodeLib.Buffer,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def callback(err: scala.Null, content: java.lang.String): scala.Unit = js.native
  def callback(
    err: scala.Null,
    content: java.lang.String,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def callback(err: scala.Null, content: nodeLib.Buffer): scala.Unit = js.native
  def callback(
    err: scala.Null,
    content: nodeLib.Buffer,
    sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  /**
               * Remove all dependencies of the loader result. Even initial dependencies and these of other loaders. Consider using pitch.
               */
  def clearDependencies(): scala.Unit = js.native
  /**
               * Adds a file as dependency of the loader result in order to make them watchable.
               * For example, html-loader uses this technique as it finds src and src-set attributes.
               * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
               */
  def dependency(file: java.lang.String): scala.Unit = js.native
  /**
               * Emit a error.
               */
  def emitError(message: java.lang.String): scala.Unit = js.native
  /**
               * Emit a error.
               */
  def emitError(message: nodeLib.Error): scala.Unit = js.native
  /**
               * Emit a file. This is webpack-specific.
               */
  def emitFile(name: java.lang.String, content: java.lang.String, sourceMap: js.Any): scala.Unit = js.native
  /**
               * Emit a file. This is webpack-specific.
               */
  def emitFile(name: java.lang.String, content: nodeLib.Buffer, sourceMap: js.Any): scala.Unit = js.native
  /**
               * Emit a warning.
               */
  def emitWarning(message: java.lang.String): scala.Unit = js.native
  /**
               * Emit a warning.
               */
  def emitWarning(message: nodeLib.Error): scala.Unit = js.native
  /**
               * Execute some code fragment like a module.
               *
               * Don't use require(this.resourcePath), use this function to make loaders chainable!
               *
               */
  def exec(code: java.lang.String, filename: java.lang.String): js.Any = js.native
  /**
               * Resolves the given request to a module, applies all configured loaders and calls
               * back with the generated source, the sourceMap and the module instance (usually an
               * instance of NormalModule). Use this function if you need to know the source code
               * of another module to generate the result.
               */
  def loadModule(
    request: java.lang.String,
    callback: js.Function4[
      /* err */ nodeLib.Error | scala.Null, 
      /* source */ java.lang.String, 
      /* sourceMap */ sourceDashMapLib.sourceDashMapMod.RawSourceMap, 
      /* module */ webpackLib.webpackMod.webpackNs.Module, 
      scala.Unit
    ]
  ): js.Any = js.native
  /**
               * Resolve a request like a require expression.
               */
  def resolve(
    context: java.lang.String,
    request: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ java.lang.String, scala.Unit]
  ): js.Any = js.native
  /**
               * Resolve a request like a require expression.
               */
  def resolveSync(context: java.lang.String, request: java.lang.String): java.lang.String = js.native
}

