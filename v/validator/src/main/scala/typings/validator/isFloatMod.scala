package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isFloat", JSImport.Namespace)
@js.native
object isFloatMod extends js.Object {
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsFloatOptions): Boolean = js.native
  type FloatLocale = typings.validator.mod.validator.FloatLocale
  type IsFloatOptions = typings.validator.mod.validator.IsFloatOptions
}

