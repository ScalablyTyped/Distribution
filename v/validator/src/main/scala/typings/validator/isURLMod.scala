package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isURL", JSImport.Namespace)
@js.native
object isURLMod extends js.Object {
  
  /**
    * Check if the string is an URL.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsURLOptions): Boolean = js.native
  
  type IsURLOptions = typings.validator.mod.validator.IsURLOptions
}
