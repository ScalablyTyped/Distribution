package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBooleanMod {
  
  /**
    * Convert the input string to a boolean.
    * Everything except for `'0'`, `'false'` and `''` returns `true`.
    *
    * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
    */
  @JSImport("validator/lib/toBoolean", JSImport.Default)
  @js.native
  def default(input: String): Boolean = js.native
  @JSImport("validator/lib/toBoolean", JSImport.Default)
  @js.native
  def default(input: String, strict: Boolean): Boolean = js.native
}
