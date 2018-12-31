package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "RuleInfo")
@js.native
class RuleInfo protected ()
  extends timezonecompleteLib.distLibTzDashDatabaseMod.RuleInfo {
  def this(/**
    * FROM column year number.
    * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
    */
  from: scala.Double, /**
    * TO column type: Year for year numbers and "only" values, Max for "max" value.
    */
  toType: timezonecompleteLib.distLibTzDashDatabaseMod.ToType, /**
    * If TO column is a year, the year number. If TO column is "only", the FROM year.
    */
  toYear: scala.Double, /**
    * TYPE column, not used so far
    */
  `type`: java.lang.String, /**
    * IN column month number 1-12
    */
  inMonth: scala.Double, /**
    * ON column type
    */
  onType: timezonecompleteLib.distLibTzDashDatabaseMod.OnType, /**
    * If onType is DayNum, the day number
    */
  onDay: scala.Double, /**
    * If onType is not DayNum, the weekday
    */
  onWeekDay: timezonecompleteLib.distLibBasicsMod.WeekDay, /**
    * AT column hour
    */
  atHour: scala.Double, /**
    * AT column minute
    */
  atMinute: scala.Double, /**
    * AT column second
    */
  atSecond: scala.Double, /**
    * AT column type
    */
  atType: timezonecompleteLib.distLibTzDashDatabaseMod.AtType, /**
    * DST offset from local standard time (NOT from UTC!)
    */
  save: timezonecompleteLib.distLibDurationMod.Duration, /**
    * Character to insert in %s for time zone abbreviation
    * Note if TZ database indicates "-" this is the empty string
    */
  letter: java.lang.String) = this()
}

