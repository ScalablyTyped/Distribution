package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/rtrim", JSImport.Namespace)
@js.native
object rtrimMod extends js.Object {
  /**
    * Trim characters from the right-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  def default(input: String): String = js.native
  def default(input: String, chars: String): String = js.native
}

