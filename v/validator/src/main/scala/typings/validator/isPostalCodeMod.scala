package typings.validator

import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPostalCodeMod {
  
  @JSImport("validator/lib/isPostalCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(str: String, locale: typings.validator.mod.validator.PostalCodeLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @scala.inline
  def default_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type PostalCodeLocale = typings.validator.mod.validator.PostalCodeLocale
}
