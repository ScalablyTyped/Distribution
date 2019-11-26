package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAfter", JSImport.Namespace)
@js.native
object libIsAfterMod extends js.Object {
  /**
    * Check if the string is a date that's after the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  def default(str: String): Boolean = js.native
  def default(str: String, date: String): Boolean = js.native
}

