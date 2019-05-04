package typings
package vegaDashLiteLib.buildSrcDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  /**
    * Integer value representing the date from 1-31.
    * @minimum 1
    * @maximum 31
    * @TJS-type integer
    */
  var date: js.UndefOr[scala.Double] = js.undefined
  /**
    * Value representing the day of a week.  This can be one of: (1) integer value -- `1` represents Monday; (2) case-insensitive day name (e.g., `"Monday"`);  (3) case-insensitive, 3-character short day name (e.g., `"Mon"`).   <br/> **Warning:** A DateTime definition object with `day`** should not be combined with `year`, `quarter`, `month`, or `date`.
    */
  var day: js.UndefOr[Day | java.lang.String] = js.undefined
  /**
    * Integer value representing the hour of a day from 0-23.
    * @minimum 0
    * @maximum 23
    * @TJS-type integer
    */
  var hours: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value representing the millisecond segment of time.
    * @minimum 0
    * @maximum 999
    * @TJS-type integer
    */
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value representing the minute segment of time from 0-59.
    * @minimum 0
    * @maximum 59
    * @TJS-type integer
    */
  var minutes: js.UndefOr[scala.Double] = js.undefined
  /** One of: (1) integer value representing the month from `1`-`12`. `1` represents January;  (2) case-insensitive month name (e.g., `"January"`);  (3) case-insensitive, 3-character short month name (e.g., `"Jan"`). */
  var month: js.UndefOr[Month | java.lang.String] = js.undefined
  /**
    * Integer value representing the quarter of the year (from 1-4).
    * @minimum 1
    * @maximum 4
    * @TJS-type integer
    */
  var quarter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer value representing the second segment (0-59) of a time value
    * @minimum 0
    * @maximum 59
    * @TJS-type integer
    */
  var seconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean flag indicating if date time is in utc time. If false, the date time is in local time
    */
  var utc: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Integer value representing the year.
    * @TJS-type integer
    */
  var year: js.UndefOr[scala.Double] = js.undefined
}

object DateTime {
  @scala.inline
  def apply(
    date: scala.Int | scala.Double = null,
    day: Day | java.lang.String = null,
    hours: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    month: Month | java.lang.String = null,
    quarter: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
    utc: js.UndefOr[scala.Boolean] = js.undefined,
    year: scala.Int | scala.Double = null
  ): DateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (quarter != null) __obj.updateDynamic("quarter")(quarter.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
}

