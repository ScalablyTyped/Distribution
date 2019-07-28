package typings.vegaDashLite.buildSrcDatetimeMod

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
  var date: js.UndefOr[Double] = js.undefined
  /**
    * Value representing the day of a week.  This can be one of: (1) integer value -- `1` represents Monday; (2) case-insensitive day name (e.g., `"Monday"`);  (3) case-insensitive, 3-character short day name (e.g., `"Mon"`).   <br/> **Warning:** A DateTime definition object with `day`** should not be combined with `year`, `quarter`, `month`, or `date`.
    */
  var day: js.UndefOr[Day | String] = js.undefined
  /**
    * Integer value representing the hour of a day from 0-23.
    * @minimum 0
    * @maximum 23
    * @TJS-type integer
    */
  var hours: js.UndefOr[Double] = js.undefined
  /**
    * Integer value representing the millisecond segment of time.
    * @minimum 0
    * @maximum 999
    * @TJS-type integer
    */
  var milliseconds: js.UndefOr[Double] = js.undefined
  /**
    * Integer value representing the minute segment of time from 0-59.
    * @minimum 0
    * @maximum 59
    * @TJS-type integer
    */
  var minutes: js.UndefOr[Double] = js.undefined
  /** One of: (1) integer value representing the month from `1`-`12`. `1` represents January;  (2) case-insensitive month name (e.g., `"January"`);  (3) case-insensitive, 3-character short month name (e.g., `"Jan"`). */
  var month: js.UndefOr[Month | String] = js.undefined
  /**
    * Integer value representing the quarter of the year (from 1-4).
    * @minimum 1
    * @maximum 4
    * @TJS-type integer
    */
  var quarter: js.UndefOr[Double] = js.undefined
  /**
    * Integer value representing the second segment (0-59) of a time value
    * @minimum 0
    * @maximum 59
    * @TJS-type integer
    */
  var seconds: js.UndefOr[Double] = js.undefined
  /**
    * A boolean flag indicating if date time is in utc time. If false, the date time is in local time
    */
  var utc: js.UndefOr[Boolean] = js.undefined
  /**
    * Integer value representing the year.
    * @TJS-type integer
    */
  var year: js.UndefOr[Double] = js.undefined
}

object DateTime {
  @scala.inline
  def apply(
    date: Int | Double = null,
    day: Day | String = null,
    hours: Int | Double = null,
    milliseconds: Int | Double = null,
    minutes: Int | Double = null,
    month: Month | String = null,
    quarter: Int | Double = null,
    seconds: Int | Double = null,
    utc: js.UndefOr[Boolean] = js.undefined,
    year: Int | Double = null
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

