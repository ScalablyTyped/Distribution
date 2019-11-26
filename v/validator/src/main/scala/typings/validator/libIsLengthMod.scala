package typings.validator

import typings.validator.validatorMod.validator.IsLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isLength", JSImport.Namespace)
@js.native
object libIsLengthMod extends js.Object {
  /**
    * Check if the string's length falls in a range.
    *
    * Note: this function takes into account surrogate pairs.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsLengthOptions): Boolean = js.native
}

