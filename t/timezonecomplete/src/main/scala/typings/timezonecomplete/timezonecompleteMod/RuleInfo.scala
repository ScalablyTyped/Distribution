package typings.timezonecomplete.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "RuleInfo")
@js.native
class RuleInfo protected ()
  extends typings.timezonecomplete.distLibTzDashDatabaseMod.RuleInfo {
  def this(
    /**
    * FROM column year number.
    * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
    */
  from: Double,
    /**
    * TO column type: Year for year numbers and "only" values, Max for "max" value.
    */
  toType: typings.timezonecomplete.distLibTzDashDatabaseMod.ToType,
    /**
    * If TO column is a year, the year number. If TO column is "only", the FROM year.
    */
  toYear: Double,
    /**
    * TYPE column, not used so far
    */
  `type`: String,
    /**
    * IN column month number 1-12
    */
  inMonth: Double,
    /**
    * ON column type
    */
  onType: typings.timezonecomplete.distLibTzDashDatabaseMod.OnType,
    /**
    * If onType is DayNum, the day number
    */
  onDay: Double,
    /**
    * If onType is not DayNum, the weekday
    */
  onWeekDay: typings.timezonecomplete.distLibBasicsMod.WeekDay,
    /**
    * AT column hour
    */
  atHour: Double,
    /**
    * AT column minute
    */
  atMinute: Double,
    /**
    * AT column second
    */
  atSecond: Double,
    /**
    * AT column type
    */
  atType: typings.timezonecomplete.distLibTzDashDatabaseMod.AtType,
    /**
    * DST offset from local standard time (NOT from UTC!)
    */
  save: typings.timezonecomplete.distLibDurationMod.Duration,
    /**
    * Character to insert in %s for time zone abbreviation
    * Note if TZ database indicates "-" this is the empty string
    */
  letter: String
  ) = this()
}

