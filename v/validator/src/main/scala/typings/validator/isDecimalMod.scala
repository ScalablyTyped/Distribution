package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDecimalMod {
  
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isDecimal", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isDecimal", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsDecimalOptions): Boolean = js.native
  
  type DecimalLocale = typings.validator.mod.validator.DecimalLocale
  
  type IsDecimalOptions = typings.validator.mod.validator.IsDecimalOptions
}
