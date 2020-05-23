package typings.webpackEnv.global

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds nonce to all scripts that webpack loads.
  *
  * To activate the feature a __webpack_nonce__ variable needs to be set in your entry script.
  */
@JSGlobal("__webpack_nonce__")
@js.native
object webpackNonce extends TopLevel[String]

