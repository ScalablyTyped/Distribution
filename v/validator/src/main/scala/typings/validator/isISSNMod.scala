package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISSNMod {
  
  /**
    * Check if the string is an [ISSN](https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isISSN", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isISSN", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsISSNOptions): Boolean = js.native
  
  type IsISSNOptions = typings.validator.mod.validator.IsISSNOptions
}
