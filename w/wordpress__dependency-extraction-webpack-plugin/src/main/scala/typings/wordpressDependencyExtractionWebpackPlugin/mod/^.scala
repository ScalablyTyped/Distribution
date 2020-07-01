package typings.wordpressDependencyExtractionWebpackPlugin.mod

import typings.std.Set
import typings.webpack.mod.Compiler_
import typings.webpack.mod.ExternalsFunctionCallback
import typings.webpack.mod.ExternalsPlugin
import typings.wordpressDependencyExtractionWebpackPlugin.anon.PartialOptions
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
@JSImport("@wordpress/dependency-extraction-webpack-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends DependencyExtractionWebpackPlugin {
  /**
    * @param {Partial<Options>} options
    */
  def this(options: PartialOptions) = this()
  /**
    * Track requests that are externalized.
    *
    * Because we don't have a closed set of dependencies, we need to track what has
    * been externalized so we can recognize them in a later phase when the dependency
    * lists are generated.
    *
    * @type {Set<string>}
    */
  /* CompleteClass */
  override var externalizedDeps: Set[String] = js.native
  /* CompleteClass */
  override var externalsPlugin: ExternalsPlugin = js.native
  /** @type {Options} */
  /* CompleteClass */
  override var options: Options = js.native
  /**
    * @param {WebpackCompiler} compiler
    * @return {void}
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: Compiler_): Unit = js.native
  /**
    * @param {Parameters<WebpackExternalsFunction>[0]} _context
    * @param {Parameters<WebpackExternalsFunction>[1]} request
    * @param {Parameters<WebpackExternalsFunction>[2]} callback
    */
  /* CompleteClass */
  override def externalizeWpDeps(_context: js.Any, request: js.Any, callback: ExternalsFunctionCallback): Unit = js.native
  /**
    * @param {string} request
    * @return {string} Transformed request
    */
  /* CompleteClass */
  override def mapRequestToDependency(request: String): String = js.native
  /**
    * @param {Object} asset
    * @return {string} Stringified asset
    */
  /* CompleteClass */
  override def stringify(asset: js.Object): String = js.native
}

