package typings.suitescript

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiDateToString")
@js.native
object nlapiDateToString extends js.Object {
  /**
    * Convert a Date object into a String
    *
    * @param {date}    d date object being converted to a string
    * @param {string} [formattype] format type to use: date|datetime|timeofday with date being the default
    * @return {string}
    *
    * @since 2005.0
    * @param d
    * @param formattype?
    * @return
    */
  def apply(d: Date): String = js.native
  def apply(d: Date, formattype: String): String = js.native
}

