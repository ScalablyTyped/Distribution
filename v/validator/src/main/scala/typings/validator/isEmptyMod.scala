package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmptyMod {
  
  /**
    * Check if the string has a length of zero.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isEmpty", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isEmpty", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsEmptyOptions): Boolean = js.native
  
  type IsEmptyOptions = typings.validator.mod.validator.IsEmptyOptions
}
