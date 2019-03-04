package typings
package webpackDashEnvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Equals the config option debug
    */
  var DEBUG: scala.Boolean = js.native
  /**
    * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
    */
  var __non_webpack_require__ : js.Any = js.native
  /**
    * The resource query of the current module.
    *
    * e.g. __resourceQuery === "?test" // Inside "file.js?test"
    */
  var __resourceQuery: java.lang.String = js.native
  /**
    * The internal chunk loading function
    *
    * @param chunkId The id for the chunk to load.
    * @param callback A callback function called once the chunk is loaded.
    */
  var __webpack_chunk_load__ : js.Function2[
    /* chunkId */ js.Any, 
    /* callback */ js.Function1[
      /* require */ webpackDashEnvLib.underscoreUnderscoreWebpackModuleApiNs.RequireLambda, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  /**
    * Access to the hash of the compilation.
    *
    * Only available with the HotModuleReplacementPlugin or the ExtendedAPIPlugin
    */
  var __webpack_hash__ : js.Any = js.native
  /**
    * Access to the internal object of all modules.
    */
  var __webpack_modules__ : js.Array[js.Any] = js.native
  /**
    * Equals the config options output.publicPath.
    */
  var __webpack_public_path__ : java.lang.String = js.native
  /**
    * The raw require function. This expression isn’t parsed by the Parser for dependencies.
    */
  var __webpack_require__ : js.Any = js.native
  var module: webpackDashEnvLib.NodeModule = js.native
  var process: webpackDashEnvLib.NodeJSNs.Process = js.native
  var require: webpackDashEnvLib.NodeRequire = js.native
}

