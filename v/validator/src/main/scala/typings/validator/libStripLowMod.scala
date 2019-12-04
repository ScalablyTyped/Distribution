package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/stripLow", JSImport.Namespace)
@js.native
object libStripLowMod extends js.Object {
  /**
    * Remove characters with a numerical value < `32` and `127`, mostly control characters.
    * Unicode-safe in JavaScript.
    *
    * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
    */
  def default(input: String): String = js.native
  def default(input: String, keep_new_lines: Boolean): String = js.native
}

