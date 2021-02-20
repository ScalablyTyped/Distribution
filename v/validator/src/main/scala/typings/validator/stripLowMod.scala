package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripLowMod {
  
  /**
    * Remove characters with a numerical value < `32` and `127`, mostly control characters.
    * Unicode-safe in JavaScript.
    *
    * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
    */
  @JSImport("validator/lib/stripLow", JSImport.Default)
  @js.native
  def default(input: String): String = js.native
  @JSImport("validator/lib/stripLow", JSImport.Default)
  @js.native
  def default(input: String, keep_new_lines: Boolean): String = js.native
}
