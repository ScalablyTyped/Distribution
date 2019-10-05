package typings.suitescript

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiStringToDate")
@js.native
object nlapiStringToDate extends js.Object {
  /**
    * Convert a String into a Date object.
    *
    * @param {string} str date string in the user's date format, timeofday format, or datetime format
    * @param {string} format format type to use: date|datetime|timeofday with date being the default
    * @return {date}
    *
    * @since 2005.0
    * @param str
    * @param format
    * @return
    */
  def apply(str: String): Date = js.native
  def apply(str: String, format: String): Date = js.native
}

