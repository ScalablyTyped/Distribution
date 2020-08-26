package typings.wordpressDependencyExtractionWebpackPlugin.mod

import typings.std.Set
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
@js.native
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
  var externalizedDeps: Set[String] = js.native
  var externalsPlugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any = js.native
  /** @type {Options} */
  var options: Options = js.native
  /**
    * @param {WebpackCompiler} compiler
    * @return {void}
    */
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  ): Unit = js.native
  /**
    * @param {Parameters<WebpackExternalsFunction>[0]} _context
    * @param {Parameters<WebpackExternalsFunction>[1]} request
    * @param {Parameters<WebpackExternalsFunction>[2]} callback
    */
  def externalizeWpDeps(
    _context: js.Any,
    request: js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any
  ): Unit = js.native
  /**
    * @param {string} request
    * @return {string} Transformed request
    */
  def mapRequestToDependency(request: String): String = js.native
  /**
    * @param {Object} asset
    * @return {string} Stringified asset
    */
  def stringify(asset: js.Object): String = js.native
}

object DependencyExtractionWebpackPlugin {
  @scala.inline
  def apply(
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any => Unit,
    externalizeWpDeps: (js.Any, js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any) => Unit,
    externalizedDeps: Set[String],
    externalsPlugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any,
    mapRequestToDependency: String => String,
    options: Options,
    stringify: js.Object => String
  ): DependencyExtractionWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), externalizeWpDeps = js.Any.fromFunction3(externalizeWpDeps), externalizedDeps = externalizedDeps.asInstanceOf[js.Any], externalsPlugin = externalsPlugin.asInstanceOf[js.Any], mapRequestToDependency = js.Any.fromFunction1(mapRequestToDependency), options = options.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[DependencyExtractionWebpackPlugin]
  }
  @scala.inline
  implicit class DependencyExtractionWebpackPluginOps[Self <: DependencyExtractionWebpackPlugin] (val x: Self) extends AnyVal {
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
    def setApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any => Unit
    ): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setExternalizeWpDeps(
      value: (js.Any, js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsFunctionCallback */ js.Any) => Unit
    ): Self = this.set("externalizeWpDeps", js.Any.fromFunction3(value))
    @scala.inline
    def setExternalizedDeps(value: Set[String]): Self = this.set("externalizedDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalsPlugin(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.ExternalsPlugin */ js.Any
    ): Self = this.set("externalsPlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapRequestToDependency(value: String => String): Self = this.set("mapRequestToDependency", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringify(value: js.Object => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
  
}

