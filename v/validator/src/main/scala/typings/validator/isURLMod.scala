package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isURLMod {
  
  /**
    * Check if the string is an URL.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isURL", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isURL", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsURLOptions): Boolean = js.native
  
  type IsURLOptions = typings.validator.mod.validator.IsURLOptions
}
