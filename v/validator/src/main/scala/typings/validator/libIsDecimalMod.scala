package typings.validator

import typings.validator.validatorMod.validator.IsDecimalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isDecimal", JSImport.Namespace)
@js.native
object libIsDecimalMod extends js.Object {
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsDecimalOptions): Boolean = js.native
}

