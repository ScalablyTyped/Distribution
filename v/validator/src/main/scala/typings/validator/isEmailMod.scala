package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmailMod {
  
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isEmail", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isEmail", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsEmailOptions): Boolean = js.native
  
  type IsEmailOptions = typings.validator.mod.validator.IsEmailOptions
}
