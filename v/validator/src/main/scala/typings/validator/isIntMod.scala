package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isInt", JSImport.Namespace)
@js.native
object isIntMod extends js.Object {
  /**
    * Check if the string is an integer.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsIntOptions): Boolean = js.native
  type IsIntOptions = typings.validator.mod.validator.IsIntOptions
}

