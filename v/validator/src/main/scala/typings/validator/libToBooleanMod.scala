package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/toBoolean", JSImport.Namespace)
@js.native
object libToBooleanMod extends js.Object {
  /**
    * Convert the input string to a boolean.
    * Everything except for `'0'`, `'false'` and `''` returns `true`.
    *
    * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
    */
  def default(input: String): Boolean = js.native
  def default(input: String, strict: Boolean): Boolean = js.native
}

