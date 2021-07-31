package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripLowMod {
  
  @JSImport("validator/lib/stripLow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Remove characters with a numerical value < `32` and `127`, mostly control characters.
    * Unicode-safe in JavaScript.
    *
    * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
    */
  @scala.inline
  def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(input: String, keep_new_lines: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], keep_new_lines.asInstanceOf[js.Any])).asInstanceOf[String]
}
