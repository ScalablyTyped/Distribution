package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isByteLengthMod {
  
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isByteLength", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isByteLength", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsByteLengthOptions): Boolean = js.native
  
  type IsByteLengthOptions = typings.validator.mod.validator.IsByteLengthOptions
}
