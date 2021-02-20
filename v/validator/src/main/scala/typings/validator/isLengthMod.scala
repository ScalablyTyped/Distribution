package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLengthMod {
  
  /**
    * Check if the string's length falls in a range.
    *
    * Note: this function takes into account surrogate pairs.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isLength", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isLength", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsLengthOptions): Boolean = js.native
  
  type IsLengthOptions = typings.validator.mod.validator.IsLengthOptions
}
