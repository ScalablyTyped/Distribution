package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/escape", JSImport.Namespace)
@js.native
object libEscapeMod extends js.Object {
  /**
    * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
    */
  def default(input: String): String = js.native
}

