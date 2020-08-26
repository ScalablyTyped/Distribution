package typings.wordpressDependencyExtractionWebpackPlugin.mod

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
}

