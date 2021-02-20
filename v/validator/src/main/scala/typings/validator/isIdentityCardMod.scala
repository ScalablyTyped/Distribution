package typings.validator

import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIdentityCardMod {
  
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  @JSImport("validator/lib/isIdentityCard", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isIdentityCard", JSImport.Default)
  @js.native
  def default(str: String, locale: typings.validator.mod.validator.IdentityCardLocale): Boolean = js.native
  @JSImport("validator/lib/isIdentityCard", JSImport.Default)
  @js.native
  def default_any(str: String, locale: any): Boolean = js.native
  
  type IdentityCardLocale = typings.validator.mod.validator.IdentityCardLocale
}
