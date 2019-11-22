package typings.validator.validatorMod.default

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator", "matches")
@js.native
object matches extends js.Object {
  def apply(str: String, pattern: String): Boolean = js.native
  def apply(str: String, pattern: String, modifiers: String): Boolean = js.native
  def apply(str: String, pattern: RegExp): Boolean = js.native
}

