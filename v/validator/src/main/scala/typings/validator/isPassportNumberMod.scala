package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPassportNumberMod {
  
  /**
    * Check if the string is a valid passport number relative to a specific country code.
    *
    * @param [countryCode] - Country code
    */
  @JSImport("validator/lib/isPassportNumber", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isPassportNumber", JSImport.Default)
  @js.native
  def default(str: String, countryCode: String): Boolean = js.native
}
