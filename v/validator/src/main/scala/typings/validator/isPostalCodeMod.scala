package typings.validator

import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPostalCodeMod {
  
  @JSImport("validator/lib/isPostalCode", JSImport.Default)
  @js.native
  def default(str: String, locale: typings.validator.mod.validator.PostalCodeLocale): Boolean = js.native
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @JSImport("validator/lib/isPostalCode", JSImport.Default)
  @js.native
  def default_any(str: String, locale: any): Boolean = js.native
  
  type PostalCodeLocale = typings.validator.mod.validator.PostalCodeLocale
}
