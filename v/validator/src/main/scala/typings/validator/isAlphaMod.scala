package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isAlpha", JSImport.Namespace)
@js.native
object isAlphaMod extends js.Object {
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: typings.validator.mod.validator.AlphaLocale): Boolean = js.native
  
  type AlphaLocale = typings.validator.mod.validator.AlphaLocale
}
