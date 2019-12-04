package typings.validator

import typings.validator.validatorMod.validator.AlphanumericLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlphanumeric", JSImport.Namespace)
@js.native
object libIsAlphanumericMod extends js.Object {
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: AlphanumericLocale): Boolean = js.native
}

