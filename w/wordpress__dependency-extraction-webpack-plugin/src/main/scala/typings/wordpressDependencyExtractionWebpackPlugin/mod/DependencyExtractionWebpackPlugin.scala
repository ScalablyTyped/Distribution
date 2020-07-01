package typings.wordpressDependencyExtractionWebpackPlugin.mod

import typings.std.Set
import typings.webpack.mod.Compiler_
import typings.webpack.mod.ExternalsFunctionCallback
import typings.webpack.mod.ExternalsPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map module request to an external.
  *
  * @callback RequestToExternal
  *
  * @param {string} request Module request.
  *
  * @return {string|string[]|void} Return `undefined` to ignore the request.
  *                                     Return `string|string[]` to map the request to an external.
  */
/**
  * Map module request to a script handle.
  *
  * @callback RequestToHandle
  *
  * @param {string} request Module request.
  *
  * @return {string|void} Return `undefined` to use the same name as the module.
  *                            Return `string` to map the request to a specific script handle.
  */
/**
  * @typedef AssetData
  *
  * @property {string}   version      String representing a particular build
  * @property {string[]} dependencies The script dependencies
  */
/**
  * @typedef Options
  *
  * @property {boolean}                     injectPolyfill      Force wp-polyfill to be included in each entry point's dependency list. This is like importing `@wordpress/polyfill` for each entry point.
  * @property {boolean}                     useDefaults         Set to `false` to disable the default WordPress script request handling.
  * @property {'php'|'json'}                outputFormat        The output format for the generated asset file.
  * @property {RequestToExternal|undefined} [requestToExternal] Map module requests to an external.
  * @property {RequestToHandle|undefined}   [requestToHandle]   Map module requests to a script handle.
  * @property {string|null}                 combinedOutputFile  This option is useful only when the combineAssets option is enabled. It allows providing a custom output file for the generated single assets file. It's possible to provide a path that is relative to the output directory.
  * @property {boolean|undefined}           combineAssets       By default, one asset file is created for each entry point. When this flag is set to true, all information about assets is combined into a single assets.(json|php) file generated in the output directory.
  */
trait DependencyExtractionWebpackPlugin extends js.Object {
  /**
    * Track requests that are externalized.
    *
    * Because we don't have a closed set of dependencies, we need to track what has
    * been externalized so we can recognize them in a later phase when the dependency
    * lists are generated.
    *
    * @type {Set<string>}
    */
  var externalizedDeps: Set[String]
  var externalsPlugin: ExternalsPlugin
  /** @type {Options} */
  var options: Options
  /**
    * @param {WebpackCompiler} compiler
    * @return {void}
    */
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
  /**
    * @param {Parameters<WebpackExternalsFunction>[0]} _context
    * @param {Parameters<WebpackExternalsFunction>[1]} request
    * @param {Parameters<WebpackExternalsFunction>[2]} callback
    */
  def externalizeWpDeps(_context: js.Any, request: js.Any, callback: ExternalsFunctionCallback): Unit
  /**
    * @param {string} request
    * @return {string} Transformed request
    */
  def mapRequestToDependency(request: String): String
  /**
    * @param {Object} asset
    * @return {string} Stringified asset
    */
  def stringify(asset: js.Object): String
}

object DependencyExtractionWebpackPlugin {
  @scala.inline
  def apply(
    apply: Compiler_ => Unit,
    externalizeWpDeps: (js.Any, js.Any, ExternalsFunctionCallback) => Unit,
    externalizedDeps: Set[String],
    externalsPlugin: ExternalsPlugin,
    mapRequestToDependency: String => String,
    options: Options,
    stringify: js.Object => String
  ): DependencyExtractionWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), externalizeWpDeps = js.Any.fromFunction3(externalizeWpDeps), externalizedDeps = externalizedDeps.asInstanceOf[js.Any], externalsPlugin = externalsPlugin.asInstanceOf[js.Any], mapRequestToDependency = js.Any.fromFunction1(mapRequestToDependency), options = options.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[DependencyExtractionWebpackPlugin]
  }
}

