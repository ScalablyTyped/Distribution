package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isDecimal", JSImport.Namespace)
@js.native
object isDecimalMod extends js.Object {
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsDecimalOptions): Boolean = js.native
  type DecimalLocale = typings.validator.mod.validator.DecimalLocale
  type IsDecimalOptions = typings.validator.mod.validator.IsDecimalOptions
}

