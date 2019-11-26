package typings.validator

import typings.validator.validatorMod.validator.IsFloatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isFloat", JSImport.Namespace)
@js.native
object libIsFloatMod extends js.Object {
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsFloatOptions): Boolean = js.native
}

