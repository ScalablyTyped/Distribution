package typings.webpackEnv

import typings.node.NodeModule
import typings.node.NodeRequire
import typings.webpackEnv.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Equals the config option debug
    */
  @JSGlobal("DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  inline def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  /**
    * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
    */
  @JSGlobal("__non_webpack_require__")
  @js.native
  def nonWebpackRequire: Any = js.native
  
  inline def nonWebpackRequire_=(x: Any): Unit = js.Dynamic.global.updateDynamic("__non_webpack_require__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  /**
    * The resource query of the current module.
    *
    * e.g. __resourceQuery === "?test" // Inside "file.js?test"
    */
  @JSGlobal("__resourceQuery")
  @js.native
  def resourceQuery: String = js.native
  
  inline def resourceQuery_=(x: String): Unit = js.Dynamic.global.updateDynamic("__resourceQuery")(x.asInstanceOf[js.Any])
  
  /**
    * The internal chunk loading function
    *
    * @param chunkId The id for the chunk to load.
    */
  @JSGlobal("__webpack_chunk_load__")
  @js.native
  def webpackChunkLoad: js.Function1[/* chunkId */ Any, js.Promise[Any]] = js.native
  
  inline def webpackChunkLoad_=(x: js.Function1[/* chunkId */ Any, js.Promise[Any]]): Unit = js.Dynamic.global.updateDynamic("__webpack_chunk_load__")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the hash of the compilation.
    *
    * Only available with the HotModuleReplacementPlugin or the ExtendedAPIPlugin
    */
  @JSGlobal("__webpack_hash__")
  @js.native
  def webpackHash: Any = js.native
  
  inline def webpackHash_=(x: Any): Unit = js.Dynamic.global.updateDynamic("__webpack_hash__")(x.asInstanceOf[js.Any])
  
  /**
    * Initializes the shared scope. Fills it with known provided modules from this build and all remotes
    */
  @JSGlobal("__webpack_init_sharing__")
  @js.native
  def webpackInitSharing: js.Function1[/* scope */ String, js.Promise[Unit]] = js.native
  
  inline def webpackInitSharing_=(x: js.Function1[/* scope */ String, js.Promise[Unit]]): Unit = js.Dynamic.global.updateDynamic("__webpack_init_sharing__")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the internal object of all modules.
    */
  @JSGlobal("__webpack_modules__")
  @js.native
  def webpackModules: js.Array[Any] = js.native
  
  inline def webpackModules_=(x: js.Array[Any]): Unit = js.Dynamic.global.updateDynamic("__webpack_modules__")(x.asInstanceOf[js.Any])
  
  /**
    * Adds nonce to all scripts that webpack loads.
    *
    * To activate the feature a __webpack_nonce__ variable needs to be set in your entry script.
    */
  @JSGlobal("__webpack_nonce__")
  @js.native
  def webpackNonce: String = js.native
  
  inline def webpackNonce_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_nonce__")(x.asInstanceOf[js.Any])
  
  /**
    * Equals the config options output.publicPath.
    */
  @JSGlobal("__webpack_public_path__")
  @js.native
  def webpackPublicPath: String = js.native
  
  inline def webpackPublicPath_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_public_path__")(x.asInstanceOf[js.Any])
  
  /**
    * The raw require function. This expression isn’t parsed by the Parser for dependencies.
    */
  @JSGlobal("__webpack_require__")
  @js.native
  def webpackRequire: Any = js.native
  
  inline def webpackRequire_=(x: Any): Unit = js.Dynamic.global.updateDynamic("__webpack_require__")(x.asInstanceOf[js.Any])
}
