package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isJSON", JSImport.Namespace)
@js.native
object isJSONMod extends js.Object {
  /**
    * Check if the string is valid JSON (note: uses `JSON.parse`).
    */
  def default(str: String): Boolean = js.native
}

