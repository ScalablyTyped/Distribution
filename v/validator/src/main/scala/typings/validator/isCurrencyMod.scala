package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isCurrency", JSImport.Namespace)
@js.native
object isCurrencyMod extends js.Object {
  /**
    * Check if the string is a valid currency amount.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsCurrencyOptions): Boolean = js.native
  type IsCurrencyOptions = typings.validator.mod.validator.IsCurrencyOptions
}

