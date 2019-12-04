package typings.validator

import typings.validator.validatorMod.validator.IsNumericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isNumeric", JSImport.Namespace)
@js.native
object libIsNumericMod extends js.Object {
  /**
    * Check if the string contains only numbers.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsNumericOptions): Boolean = js.native
}

