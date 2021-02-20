package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFloatMod {
  
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isFloat", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isFloat", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsFloatOptions): Boolean = js.native
  
  type FloatLocale = typings.validator.mod.validator.FloatLocale
  
  type IsFloatOptions = typings.validator.mod.validator.IsFloatOptions
}
