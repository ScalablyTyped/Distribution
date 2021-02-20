package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISO8601Mod {
  
  /**
    * Check if the string is a valid [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isISO8601", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isISO8601", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsISO8601Options): Boolean = js.native
  
  type IsISO8601Options = typings.validator.mod.validator.IsISO8601Options
}
