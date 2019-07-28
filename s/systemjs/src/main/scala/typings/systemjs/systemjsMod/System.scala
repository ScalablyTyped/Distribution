package typings.systemjs.systemjsMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends Config {
  /**
    * This represents the System base class, which can be extended or reinstantiated to create a custom System instance.
    */
  var constructor: Instantiable0[System] = js.native
  var env: String = js.native
  var loaderErrorStack: Boolean = js.native
  /**
    * Modules list available only with trace=true
    */
  var loads: PackageList[_] = js.native
  var packageConfigPaths: js.Array[String] = js.native
  /**
    * Specify a value of true to have SystemJS conform to the AMD-style plugin syntax, e.g. "text!some/file.txt", over the default of "some/file.txt!text".
    */
  var pluginFirst: Boolean = js.native
  var version: String = js.native
  /**
    * Enables the output of warnings to the console, including deprecation messages.
    */
  var warnings: Boolean = js.native
  /**
    * In CommonJS environments, SystemJS will substitute the global require as needed by the module format being
    * loaded to ensure the correct detection paths in loaded code.
    * The CommonJS require can be recovered within these modules from System._nodeRequire.
    */
  def _nodeRequire(dep: String): js.Any = js.native
  /**
    * For backwards-compatibility with AMD environments, set window.define = System.amdDefine.
    */
  def amdDefine(args: js.Any*): Unit = js.native
  /**
    * For backwards-compatibility with AMD environments, set window.require = System.amdRequire.
    */
  def amdRequire(deps: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * SystemJS configuration helper function.
    * Once SystemJS has loaded, configuration can be set on SystemJS by using the configuration function System.config.
    */
  def config(config: Config): Unit = js.native
  /**
    * Deletes a module from the registry by normalized name.
    */
  def delete(moduleName: String): Unit = js.native
  /**
    * Returns a module from the registry by normalized name.
    */
  def get(moduleName: String): js.Any = js.native
  /**
    * Returns a clone of the internal SystemJS configuration in use.
    */
  def getConfig(): Config = js.native
  /**
    * Returns whether a given module exists in the registry by normalized module name.
    */
  def has(moduleName: String): Boolean = js.native
  /**
    * Loads a module by name taking an optional normalized parent name argument.
    * Promise resolves to the module value.
    */
  def `import`(moduleName: String): js.Promise[_] = js.native
  def `import`(moduleName: String, normalizedParentName: String): js.Promise[_] = js.native
  /**
    * Given any object, returns true if the object is either a SystemJS module or native JavaScript module object, and false otherwise.
    * Useful for interop scenarios.
    */
  def isModule(`object`: js.Any): Boolean = js.native
  /**
    * Given a plain JavaScript object, return an equivalent Module object.
    * Useful when writing a custom instantiate hook or using System.set.
    */
  def newModule(`object`: js.Any): js.Any = js.native
  def register(deps: js.Array[String], declare: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    * Declaration function for defining modules of the System.register polyfill module format.
    */
  def register(name: String, deps: js.Array[String], declare: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def registerDynamic(deps: js.Array[String], executingRequire: Boolean, declare: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    * Companion module format to System.register for non-ES6 modules.
    * Provides a <script>-injection-compatible module format that any CommonJS or Global module can be converted into for CSP compatibility.
    */
  def registerDynamic(
    name: String,
    deps: js.Array[String],
    executingRequire: Boolean,
    declare: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /**
    * Resolves module name to normalized URL.
    */
  def resolve(moduleName: String): js.Promise[String] = js.native
  def resolve(moduleName: String, parentName: String): js.Promise[String] = js.native
  /**
    * Resolves module name to normalized URL.
    * Synchronous alternative to `SystemJS.resolve`.
    */
  def resolveSync(moduleName: String): String = js.native
  def resolveSync(moduleName: String, parentName: String): String = js.native
  /**
    * Sets a module into the registry directly and synchronously.
    * Typically used along with System.newModule to create a valid Module object:
    */
  def set(moduleName: String, module: js.Any): Unit = js.native
}

