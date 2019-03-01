package typings
package systemjsLib.systemjsMod.SystemJSLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /**
  * For custom config names
  */
/* customName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Set the Babel transpiler options when System.transpiler is set to babel.
    */
  // TODO: Import BabelCore.TransformOptions
  var babelOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The baseURL provides a special mechanism for loading modules relative to a standard reference URL.
    */
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * undles allow a collection of modules to be downloaded together as a package whenever any module from that collection is requested.
    * Useful for splitting an application into sub-modules for production. Use with the SystemJS Builder.
    */
  var bundles: js.UndefOr[ModulesList] = js.undefined
  /**
    * Backwards-compatibility mode for the loader to automatically add '.js' extensions when not present to module requests.
    * This allows code written for SystemJS 0.16 or less to work easily in the latest version:
    */
  var defaultJSExtensions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An alternative to bundling providing a solution to the latency issue of progressively loading dependencies.
    * When a module specified in depCache is loaded, asynchronous loading of its pre-cached dependency list begins in parallel.
    */
  var depCache: js.UndefOr[ModulesList] = js.undefined
  /**
    * The map option is similar to paths, but acts very early in the normalization process.
    * It allows you to map a module alias to a location or package:
    */
  var map: js.UndefOr[ConfigMap] = js.undefined
  /**
    * Module meta provides an API for SystemJS to understand how to load modules correctly.
    * Meta is how we set the module format of a module, or know how to shim dependencies of a global script.
    */
  var meta: js.UndefOr[ConfigMeta] = js.undefined
  /**
    * Packages provide a convenience for setting meta and map configuration that is specific to a common path.
    * In addition packages allow for setting contextual map configuration which only applies within the package itself.
    * This allows for full dependency encapsulation without always needing to have all dependencies in a global namespace.
    */
  var packages: js.UndefOr[PackageList[PackageConfig]] = js.undefined
  /**
    * The ES6 Module Loader paths implementation, applied after normalization and supporting subpaths via wildcards.
    * It is usually advisable to use map configuration over paths unless you need strict control over normalized module names.
    */
  var paths: js.UndefOr[PackageList[java.lang.String]] = js.undefined
  var trace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the Traceur compilation options.
    */
  var traceurOptions: js.UndefOr[TraceurOptions] = js.undefined
  /**
    * Sets the module name of the transpiler to be used for loading ES6 modules.
    */
  var transpiler: js.UndefOr[Transpiler] = js.undefined
  /**
    * Sets the TypeScript transpiler options.
    */
  // TODO: Import Typescript.CompilerOptions
  var typescriptOptions: js.UndefOr[systemjsLib.Anon_Key] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /**
    * For custom config names
    */
  /* customName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    babelOptions: js.Any = null,
    baseURL: java.lang.String = null,
    bundles: ModulesList = null,
    defaultJSExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    depCache: ModulesList = null,
    map: ConfigMap = null,
    meta: ConfigMeta = null,
    packages: PackageList[PackageConfig] = null,
    paths: PackageList[java.lang.String] = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    traceurOptions: TraceurOptions = null,
    transpiler: Transpiler = null,
    typescriptOptions: systemjsLib.Anon_Key = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (babelOptions != null) __obj.updateDynamic("babelOptions")(babelOptions)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (!js.isUndefined(defaultJSExtensions)) __obj.updateDynamic("defaultJSExtensions")(defaultJSExtensions)
    if (depCache != null) __obj.updateDynamic("depCache")(depCache)
    if (map != null) __obj.updateDynamic("map")(map)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (traceurOptions != null) __obj.updateDynamic("traceurOptions")(traceurOptions)
    if (transpiler != null) __obj.updateDynamic("transpiler")(transpiler)
    if (typescriptOptions != null) __obj.updateDynamic("typescriptOptions")(typescriptOptions)
    __obj.asInstanceOf[Config]
  }
}

