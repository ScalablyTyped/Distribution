package typings.webpackEnv.global

import typings.node.NodeModule
import typings.node.NodeRequire
import typings.webpackEnv.NodeJS.Process
import typings.webpackEnv.WebpackModuleApi.RequireLambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Equals the config option debug
    */
  var DEBUG: Boolean = js.native
  var module: NodeModule = js.native
  /**
    * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
    */
  @JSName("__non_webpack_require__")
  var nonWebpackRequire: js.Any = js.native
  var process: Process = js.native
  var require: NodeRequire = js.native
  /**
    * The resource query of the current module.
    *
    * e.g. __resourceQuery === "?test" // Inside "file.js?test"
    */
  @JSName("__resourceQuery")
  var resourceQuery: String = js.native
  /**
    * The internal chunk loading function
    *
    * @param chunkId The id for the chunk to load.
    * @param callback A callback function called once the chunk is loaded.
    */
  @JSName("__webpack_chunk_load__")
  var webpackChunkLoad: js.Function2[
    /* chunkId */ js.Any, 
    /* callback */ js.Function1[/* require */ RequireLambda, Unit], 
    Unit
  ] = js.native
  /**
    * Access to the hash of the compilation.
    *
    * Only available with the HotModuleReplacementPlugin or the ExtendedAPIPlugin
    */
  @JSName("__webpack_hash__")
  var webpackHash: js.Any = js.native
  /**
    * Access to the internal object of all modules.
    */
  @JSName("__webpack_modules__")
  var webpackModules: js.Array[js.Any] = js.native
  /**
    * Adds nonce to all scripts that webpack loads.
    *
    * To activate the feature a __webpack_nonce__ variable needs to be set in your entry script.
    */
  @JSName("__webpack_nonce__")
  var webpackNonce: String = js.native
  /**
    * Equals the config options output.publicPath.
    */
  @JSName("__webpack_public_path__")
  var webpackPublicPath: String = js.native
  /**
    * The raw require function. This expression isn’t parsed by the Parser for dependencies.
    */
  @JSName("__webpack_require__")
  var webpackRequire: js.Any = js.native
}

