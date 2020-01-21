package typings.webpackEnv

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates a require function that is not parsed by webpack. Can be used to do cool stuff with a global require function if available.
  */
@JSGlobal("__non_webpack_require__")
@js.native
object nonWebpackRequire
  extends TopLevel[js.Any]

