package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isISO8601", JSImport.Namespace)
@js.native
object isISO8601Mod extends js.Object {
  
  /**
    * Check if the string is a valid [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsISO8601Options): Boolean = js.native
  
  type IsISO8601Options = typings.validator.mod.validator.IsISO8601Options
}
