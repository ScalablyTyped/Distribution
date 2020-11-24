package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isPassportNumber", JSImport.Namespace)
@js.native
object isPassportNumberMod extends js.Object {
  
  /**
    * Check if the string is a valid passport number relative to a specific country code.
    *
    * @param [countryCode] - Country code
    */
  def default(str: String): Boolean = js.native
  def default(str: String, countryCode: String): Boolean = js.native
}
