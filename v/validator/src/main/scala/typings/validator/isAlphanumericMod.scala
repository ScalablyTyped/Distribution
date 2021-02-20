package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAlphanumericMod {
  
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  @JSImport("validator/lib/isAlphanumeric", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isAlphanumeric", JSImport.Default)
  @js.native
  def default(str: String, locale: typings.validator.mod.validator.AlphanumericLocale): Boolean = js.native
  
  type AlphanumericLocale = typings.validator.mod.validator.AlphanumericLocale
}
