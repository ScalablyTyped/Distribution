package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIntMod {
  
  /**
    * Check if the string is an integer.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isInt", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isInt", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsIntOptions): Boolean = js.native
  
  type IsIntOptions = typings.validator.mod.validator.IsIntOptions
}
