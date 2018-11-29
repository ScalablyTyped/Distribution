package typings
package timezonecompleteLib.distLibTzDashDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/tz-database", "RuleInfo")
@js.native
class RuleInfo protected () extends js.Object {
  def this(/**
       * FROM column year number.
       * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
       */
  from: scala.Double, /**
       * TO column type: Year for year numbers and "only" values, Max for "max" value.
       */
  toType: ToType, /**
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
  onType: OnType, /**
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
  atType: AtType, /**
       * DST offset from local standard time (NOT from UTC!)
       */
  save: timezonecompleteLib.distLibDurationMod.Duration, /**
       * Character to insert in %s for time zone abbreviation
       * Note if TZ database indicates "-" this is the empty string
       */
  letter: java.lang.String) = this()
  /**
       * AT column hour
       */
  var atHour: scala.Double = js.native
  /**
       * AT column minute
       */
  var atMinute: scala.Double = js.native
  /**
       * AT column second
       */
  var atSecond: scala.Double = js.native
  /**
       * AT column type
       */
  var atType: AtType = js.native
  /**
       * FROM column year number.
       * Note, can be -10000 for NaN value (e.g. for "SystemV" rules)
       */
  var from: scala.Double = js.native
  /**
       * IN column month number 1-12
       */
  var inMonth: scala.Double = js.native
  /**
       * Character to insert in %s for time zone abbreviation
       * Note if TZ database indicates "-" this is the empty string
       */
  var letter: java.lang.String = js.native
  /**
       * If onType is DayNum, the day number
       */
  var onDay: scala.Double = js.native
  /**
       * ON column type
       */
  var onType: OnType = js.native
  /**
       * If onType is not DayNum, the weekday
       */
  var onWeekDay: timezonecompleteLib.distLibBasicsMod.WeekDay = js.native
  /**
       * DST offset from local standard time (NOT from UTC!)
       */
  var save: timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
       * TO column type: Year for year numbers and "only" values, Max for "max" value.
       */
  var toType: ToType = js.native
  /**
       * If TO column is a year, the year number. If TO column is "only", the FROM year.
       */
  var toYear: scala.Double = js.native
  /**
       * TYPE column, not used so far
       */
  var `type`: java.lang.String = js.native
  /**
       * Returns true iff this rule is applicable in the year
       */
  def applicable(year: scala.Double): scala.Boolean = js.native
  /**
       * Returns the date that the rule takes effect. Note that the time
       * is NOT adjusted for wall clock time or standard time, i.e. this.atType is
       * not taken into account
       */
  def effectiveDate(year: scala.Double): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  /**
       * Sort comparison
       * @return (first effective date is equal to other's first effective date)
       */
  def effectiveEqual(other: RuleInfo): scala.Boolean = js.native
  /**
       * Sort comparison
       * @return (first effective date is less than other's first effective date)
       */
  def effectiveLess(other: RuleInfo): scala.Boolean = js.native
  /**
       * Returns the transition moment in UTC in the given year
       *
       * @param year	The year for which to return the transition
       * @param standardOffset	The standard offset for the timezone without DST
       * @param prevRule	The previous rule
       */
  def transitionTimeUtc(year: scala.Double, standardOffset: timezonecompleteLib.distLibDurationMod.Duration): scala.Double = js.native
  /**
       * Returns the transition moment in UTC in the given year
       *
       * @param year	The year for which to return the transition
       * @param standardOffset	The standard offset for the timezone without DST
       * @param prevRule	The previous rule
       */
  def transitionTimeUtc(
    year: scala.Double,
    standardOffset: timezonecompleteLib.distLibDurationMod.Duration,
    prevRule: RuleInfo
  ): scala.Double = js.native
}

