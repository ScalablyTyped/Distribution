package typings.validator

import typings.validator.mod.validator.IdentityCardLocale
import typings.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIdentityCard", JSImport.Namespace)
@js.native
object isIdentityCardMod extends js.Object {
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: IdentityCardLocale): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
}

