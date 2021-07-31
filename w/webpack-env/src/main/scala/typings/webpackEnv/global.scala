package typings.webpackEnv

import typings.node.NodeModule
import typings.node.NodeRequire
import typings.webpackEnv.NodeJS.Process
import typings.webpackEnv.WebpackModuleApi.RequireLambda
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
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  /**
    * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
    */
  @JSGlobal("__non_webpack_require__")
  @js.native
  def nonWebpackRequire: js.Any = js.native
  
  @scala.inline
  def nonWebpackRequire_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__non_webpack_require__")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  /**
    * The resource query of the current module.
    *
    * e.g. __resourceQuery === "?test" // Inside "file.js?test"
    */
  @JSGlobal("__resourceQuery")
  @js.native
  def resourceQuery: String = js.native
  
  @scala.inline
  def resourceQuery_=(x: String): Unit = js.Dynamic.global.updateDynamic("__resourceQuery")(x.asInstanceOf[js.Any])
  
  /**
    * The internal chunk loading function
    *
    * @param chunkId The id for the chunk to load.
    * @param callback A callback function called once the chunk is loaded.
    */
  @JSGlobal("__webpack_chunk_load__")
  @js.native
  def webpackChunkLoad: js.Function2[
    /* chunkId */ js.Any, 
    /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
    Unit
  ] = js.native
  
  @scala.inline
  def webpackChunkLoad_=(
    x: js.Function2[
      /* chunkId */ js.Any, 
      /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
      Unit
    ]
  ): Unit = js.Dynamic.global.updateDynamic("__webpack_chunk_load__")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the hash of the compilation.
    *
    * Only available with the HotModuleReplacementPlugin or the ExtendedAPIPlugin
    */
  @JSGlobal("__webpack_hash__")
  @js.native
  def webpackHash: js.Any = js.native
  
  @scala.inline
  def webpackHash_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__webpack_hash__")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the internal object of all modules.
    */
  @JSGlobal("__webpack_modules__")
  @js.native
  def webpackModules: js.Array[js.Any] = js.native
  
  @scala.inline
  def webpackModules_=(x: js.Array[js.Any]): Unit = js.Dynamic.global.updateDynamic("__webpack_modules__")(x.asInstanceOf[js.Any])
  
  /**
    * Adds nonce to all scripts that webpack loads.
    *
    * To activate the feature a __webpack_nonce__ variable needs to be set in your entry script.
    */
  @JSGlobal("__webpack_nonce__")
  @js.native
  def webpackNonce: String = js.native
  
  @scala.inline
  def webpackNonce_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_nonce__")(x.asInstanceOf[js.Any])
  
  /**
    * Equals the config options output.publicPath.
    */
  @JSGlobal("__webpack_public_path__")
  @js.native
  def webpackPublicPath: String = js.native
  
  @scala.inline
  def webpackPublicPath_=(x: String): Unit = js.Dynamic.global.updateDynamic("__webpack_public_path__")(x.asInstanceOf[js.Any])
  
  /**
    * The raw require function. This expression isn’t parsed by the Parser for dependencies.
    */
  @JSGlobal("__webpack_require__")
  @js.native
  def webpackRequire: js.Any = js.native
  
  @scala.inline
  def webpackRequire_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("__webpack_require__")(x.asInstanceOf[js.Any])
  
  /**
  * Declare process variable
  */
  object NodeJS
}
