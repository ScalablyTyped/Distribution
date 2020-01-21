package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIn", JSImport.Namespace)
@js.native
object isInMod extends js.Object {
  /**
    * Check if the string is in a array of allowed values.
    *
    * @param values - Allowed values.
    */
  def default(str: String, values: js.Array[_]): Boolean = js.native
}

