package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAlphaMod {
  
  @JSImport("validator/lib/isAlpha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  @scala.inline
  def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(str: String, locale: typings.validator.mod.validator.AlphaLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type AlphaLocale = typings.validator.mod.validator.AlphaLocale
}
