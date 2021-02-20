package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNumericMod {
  
  /**
    * Check if the string contains only numbers.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isNumeric", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isNumeric", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsNumericOptions): Boolean = js.native
  
  type IsNumericOptions = typings.validator.mod.validator.IsNumericOptions
}
