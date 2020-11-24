package typings.timezonecomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete", "RuleInfo")
@js.native
class RuleInfo protected ()
  extends typings.timezonecomplete.tzDatabaseMod.RuleInfo {
  /**
    * Constructor
    * @param from
    * @param toType
    * @param toYear
    * @param type
    * @param inMonth
    * @param onType
    * @param onDay
    * @param onWeekDay
    * @param atHour
    * @param atMinute
    * @param atSecond
    * @param atType
    * @param save
    * @param letter
    * @throws nothing
    */
  def this(
    /**
    * FROM column year number.
    * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
    */
  from: Double,
    /**
    * TO column type: Year for year numbers and "only" values, Max for "max" value.
    */
  toType: typings.timezonecomplete.tzDatabaseMod.ToType,
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
  onType: typings.timezonecomplete.tzDatabaseMod.OnType,
    /**
    * If onType is DayNum, the day number
    */
  onDay: Double,
    /**
    * If onType is not DayNum, the weekday
    */
  onWeekDay: typings.timezonecomplete.basicsMod.WeekDay,
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
  atType: typings.timezonecomplete.tzDatabaseMod.AtType,
    /**
    * DST offset from local standard time (NOT from UTC!)
    */
  save: typings.timezonecomplete.durationMod.Duration,
    /**
    * Character to insert in %s for time zone abbreviation
    * Note if TZ database indicates "-" this is the empty string
    */
  letter: String
  ) = this()
}
