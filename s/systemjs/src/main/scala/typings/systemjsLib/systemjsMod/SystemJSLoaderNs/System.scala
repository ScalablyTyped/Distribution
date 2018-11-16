package typings
package systemjsLib.systemjsMod.SystemJSLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends Config {
  /**
           * This represents the System base class, which can be extended or reinstantiated to create a custom System instance.
           */
  var constructor: ScalablyTyped.runtime.Instantiable0[System] = js.native
  var env: java.lang.String = js.native
  var loaderErrorStack: scala.Boolean = js.native
  /**
           * Modules list available only with trace=true
           */
  var loads: PackageList[_] = js.native
  var packageConfigPaths: js.Array[java.lang.String] = js.native
  /**
           * Specify a value of true to have SystemJS conform to the AMD-style plugin syntax, e.g. "text!some/file.txt", over the default of "some/file.txt!text".
           */
  var pluginFirst: scala.Boolean = js.native
  var version: java.lang.String = js.native
  /**
           * Enables the output of warnings to the console, including deprecation messages.
           */
  var warnings: scala.Boolean = js.native
  /**
           * In CommonJS environments, SystemJS will substitute the global require as needed by the module format being
           * loaded to ensure the correct detection paths in loaded code.
           * The CommonJS require can be recovered within these modules from System._nodeRequire.
           */
  def _nodeRequire(dep: java.lang.String): js.Any = js.native
  /**
           * For backwards-compatibility with AMD environments, set window.define = System.amdDefine.
           */
  def amdDefine(args: js.Any*): scala.Unit = js.native
  /**
           * For backwards-compatibility with AMD environments, set window.require = System.amdRequire.
           */
  def amdRequire(deps: js.Array[java.lang.String], callback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * SystemJS configuration helper function.
           * Once SystemJS has loaded, configuration can be set on SystemJS by using the configuration function System.config.
           */
  def config(config: Config): scala.Unit = js.native
  /**
           * Deletes a module from the registry by normalized name.
           */
  def delete(moduleName: java.lang.String): scala.Unit = js.native
  /**
           * Returns a module from the registry by normalized name.
           */
  def get(moduleName: java.lang.String): js.Any = js.native
  /**
           * Returns a clone of the internal SystemJS configuration in use.
           */
  def getConfig(): Config = js.native
  /**
           * Returns whether a given module exists in the registry by normalized module name.
           */
  def has(moduleName: java.lang.String): scala.Boolean = js.native
  /**
           * Loads a module by name taking an optional normalized parent name argument.
           * Promise resolves to the module value.
           */
  def `import`(moduleName: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * Loads a module by name taking an optional normalized parent name argument.
           * Promise resolves to the module value.
           */
  def `import`(moduleName: java.lang.String, normalizedParentName: java.lang.String): stdLib.Promise[_] = js.native
  /**
           * Given any object, returns true if the object is either a SystemJS module or native JavaScript module object, and false otherwise.
           * Useful for interop scenarios.
           */
  def isModule(`object`: js.Any): scala.Boolean = js.native
  /**
           * Given a plain JavaScript object, return an equivalent Module object.
           * Useful when writing a custom instantiate hook or using System.set.
           */
  def newModule(`object`: js.Any): js.Any = js.native
  def register(deps: js.Array[java.lang.String], declare: js.Function1[/* repeated */js.Any, _]): scala.Unit = js.native
  /**
           * Declaration function for defining modules of the System.register polyfill module format.
           */
  def register(
    name: java.lang.String,
    deps: js.Array[java.lang.String],
    declare: js.Function1[/* repeated */js.Any, _]
  ): scala.Unit = js.native
  def registerDynamic(
    deps: js.Array[java.lang.String],
    executingRequire: scala.Boolean,
    declare: js.Function1[/* repeated */js.Any, _]
  ): scala.Unit = js.native
  /**
           * Companion module format to System.register for non-ES6 modules.
           * Provides a <script>-injection-compatible module format that any CommonJS or Global module can be converted into for CSP compatibility.
           */
  def registerDynamic(
    name: java.lang.String,
    deps: js.Array[java.lang.String],
    executingRequire: scala.Boolean,
    declare: js.Function1[/* repeated */js.Any, _]
  ): scala.Unit = js.native
  /**
           * Resolves module name to normalized URL.
           */
  def resolve(moduleName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Resolves module name to normalized URL.
           */
  def resolve(moduleName: java.lang.String, parentName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Resolves module name to normalized URL.
           * Synchronous alternative to `SystemJS.resolve`.
           */
  def resolveSync(moduleName: java.lang.String): java.lang.String = js.native
  /**
           * Resolves module name to normalized URL.
           * Synchronous alternative to `SystemJS.resolve`.
           */
  def resolveSync(moduleName: java.lang.String, parentName: java.lang.String): java.lang.String = js.native
  /**
           * Sets a module into the registry directly and synchronously.
           * Typically used along with System.newModule to create a valid Module object:
           */
  def set(moduleName: java.lang.String, module: js.Any): scala.Unit = js.native
}

