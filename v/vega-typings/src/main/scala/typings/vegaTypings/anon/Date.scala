package typings.vegaTypings.anon

import typings.vegaTypings.utilMod.Vector12
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  /**
    * The date (%x) format specifier (e.g., "%m/%d/%Y").
    */
  var date: String
  /**
    * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
    */
  var dateTime: String
  /**
    * The full names of the weekdays, starting with Sunday.
    */
  var days: Vector7[String]
  /**
    * The full names of the months (starting with January).
    */
  var months: Vector12[String]
  /**
    * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
    */
  var periods: Vector2[String]
  /**
    * The abbreviated names of the weekdays, starting with Sunday.
    */
  var shortDays: Vector7[String]
  /**
    * The abbreviated names of the months (starting with January).
    */
  var shortMonths: Vector12[String]
  /**
    * The time (%X) format specifier (e.g., "%H:%M:%S").
    */
  var time: String
}

object Date {
  @scala.inline
  def apply(
    date: String,
    dateTime: String,
    days: Vector7[String],
    months: Vector12[String],
    periods: Vector2[String],
    shortDays: Vector7[String],
    shortMonths: Vector12[String],
    time: String
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

