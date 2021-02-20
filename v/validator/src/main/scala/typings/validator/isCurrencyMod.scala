package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isCurrencyMod {
  
  /**
    * Check if the string is a valid currency amount.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isCurrency", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isCurrency", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsCurrencyOptions): Boolean = js.native
  
  type IsCurrencyOptions = typings.validator.mod.validator.IsCurrencyOptions
}
