package typings.validator

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/toDate", JSImport.Namespace)
@js.native
object libToDateMod extends js.Object {
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  def default(input: String): Date | Null = js.native
}

