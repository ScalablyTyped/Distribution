package typings.validator

import typings.validator.validatorMod.validator.PostalCodeLocale
import typings.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isPostalCode", JSImport.Namespace)
@js.native
object libIsPostalCodeMod extends js.Object {
  def default(str: String, locale: PostalCodeLocale): Boolean = js.native
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
}

