package typings
package timezonecompleteLib.distLibPeriodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/period", "Period")
@js.native
class Period protected () extends js.Object {
  /**
       * Constructor
       * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
       * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
       * This is due to the enormous processing power required by these cases. They are not
       * implemented and you will get an assert.
       *
       * @param reference The reference date of the period. If the period is in Months or Years, and
       *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
       * @param interval The interval of the period
       * @param dst Specifies how to handle Daylight Saving Time. Not relevant
       *            if the time zone of the reference datetime does not have DST.
       *            Defaults to RegularLocalTime.
       */
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, interval: timezonecompleteLib.distLibDurationMod.Duration) = this()
  /**
       * Constructor
       * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
       * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
       * This is due to the enormous processing power required by these cases. They are not
       * implemented and you will get an assert.
       *
       * @param reference The reference of the period. If the period is in Months or Years, and
       *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
       * @param amount The amount of units.
       * @param unit The unit.
       * @param dst Specifies how to handle Daylight Saving Time. Not relevant
       *              if the time zone of the reference datetime does not have DST.
       *              Defaults to RegularLocalTime.
       */
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit) = this()
  /**
       * Constructor
       * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
       * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
       * This is due to the enormous processing power required by these cases. They are not
       * implemented and you will get an assert.
       *
       * @param reference The reference date of the period. If the period is in Months or Years, and
       *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
       * @param interval The interval of the period
       * @param dst Specifies how to handle Daylight Saving Time. Not relevant
       *            if the time zone of the reference datetime does not have DST.
       *            Defaults to RegularLocalTime.
       */
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, interval: timezonecompleteLib.distLibDurationMod.Duration, dst: PeriodDst) = this()
  /**
       * Constructor
       * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
       * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
       * This is due to the enormous processing power required by these cases. They are not
       * implemented and you will get an assert.
       *
       * @param reference The reference of the period. If the period is in Months or Years, and
       *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
       * @param amount The amount of units.
       * @param unit The unit.
       * @param dst Specifies how to handle Daylight Saving Time. Not relevant
       *              if the time zone of the reference datetime does not have DST.
       *              Defaults to RegularLocalTime.
       */
  def this(reference: timezonecompleteLib.distLibDatetimeMod.DateTime, amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit, dst: PeriodDst) = this()
  /**
       * DST handling
       */
  var _dst: js.Any = js.native
  /**
       * Normalized internal DST handling. If DST handling is irrelevant
       * (because the reference time zone does not have DST)
       * then it is set to RegularInterval
       */
  var _intDst: js.Any = js.native
  /**
       * Normalized interval
       */
  var _intInterval: js.Any = js.native
  /**
       * Normalized reference date, has day-of-month <= 28 for Monthly
       * period, or for Yearly period if month is February
       */
  var _intReference: js.Any = js.native
  /**
       * Interval
       */
  var _interval: js.Any = js.native
  /**
       * Reference moment of period
       */
  var _reference: js.Any = js.native
  /**
       * Normalize the values where possible - not all values
       * are convertible into one another. Weeks are converted to days.
       * E.g. more than 60 minutes is transferred to hours,
       * but seconds cannot be transferred to minutes due to leap seconds.
       * Weeks are converted back to days.
       */
  /* private */ def _calcInternalValues(): js.Any = js.native
  /**
       * Corrects the difference between _reference and _intReference.
       */
  /* private */ def _correctDay(d: js.Any): js.Any = js.native
  /**
       * Returns true if DST handling is relevant for us.
       * (i.e. if the reference time zone has DST)
       */
  /* private */ def _dstRelevant(): js.Any = js.native
  /**
       * If this._internalUnit in [Month, Year], normalizes the day-of-month
       * to <= 28.
       * @return a new date if different, otherwise the exact same object (no clone!)
       */
  /* private */ def _normalizeDay(d: js.Any): js.Any = js.native
  /**
       * If this._internalUnit in [Month, Year], normalizes the day-of-month
       * to <= 28.
       * @return a new date if different, otherwise the exact same object (no clone!)
       */
  /* private */ def _normalizeDay(d: js.Any, anymonth: js.Any): js.Any = js.native
  /**
       * The amount of units of the interval
       */
  def amount(): scala.Double = js.native
  /**
       * The dst handling mode
       */
  def dst(): PeriodDst = js.native
  /**
       * Returns true iff this period has the same effect as the given one.
       * i.e. a period of 24 hours is equal to one of 1 day if they have the same UTC reference moment
       * and same dst.
       */
  def equals(other: Period): scala.Boolean = js.native
  /**
       * The first occurrence of the period greater than
       * the given date. The given date need not be at a period boundary.
       * Pre: the fromdate and reference date must either both have timezones or not
       * @param fromDate: the date after which to return the next date
       * @return the first date matching the period after fromDate, given in the same zone as the fromDate.
       */
  def findFirst(fromDate: timezonecompleteLib.distLibDatetimeMod.DateTime): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * The last occurrence of the period less than
       * the given date. The given date need not be at a period boundary.
       * Pre: the fromdate and the period reference date must either both have timezones or not
       * @param fromDate: the date before which to return the next date
       * @return the last date matching the period before fromDate, given
       *         in the same zone as the fromDate.
       */
  def findLast(from: timezonecompleteLib.distLibDatetimeMod.DateTime): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns the next timestamp in the period. The given timestamp must
       * be at a period boundary, otherwise the answer is incorrect.
       * This function has MUCH better performance than findFirst.
       * Returns the datetime "count" times away from the given datetime.
       * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
       * @param count	Number of periods to add. Optional. Must be an integer number, may be negative.
       * @return (prev + count * period), in the same timezone as prev.
       */
  def findNext(prev: timezonecompleteLib.distLibDatetimeMod.DateTime): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns the next timestamp in the period. The given timestamp must
       * be at a period boundary, otherwise the answer is incorrect.
       * This function has MUCH better performance than findFirst.
       * Returns the datetime "count" times away from the given datetime.
       * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
       * @param count	Number of periods to add. Optional. Must be an integer number, may be negative.
       * @return (prev + count * period), in the same timezone as prev.
       */
  def findNext(prev: timezonecompleteLib.distLibDatetimeMod.DateTime, count: scala.Double): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns the previous timestamp in the period. The given timestamp must
       * be at a period boundary, otherwise the answer is incorrect.
       * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
       * @param count	Number of periods to subtract. Optional. Must be an integer number, may be negative.
       * @return (next - count * period), in the same timezone as next.
       */
  def findPrev(next: timezonecompleteLib.distLibDatetimeMod.DateTime): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns the previous timestamp in the period. The given timestamp must
       * be at a period boundary, otherwise the answer is incorrect.
       * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
       * @param count	Number of periods to subtract. Optional. Must be an integer number, may be negative.
       * @return (next - count * period), in the same timezone as next.
       */
  def findPrev(next: timezonecompleteLib.distLibDatetimeMod.DateTime, count: scala.Double): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns true iff this period was constructed with identical arguments to the other one.
       */
  def identical(other: Period): scala.Boolean = js.native
  /**
       * The interval
       */
  def interval(): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
       * Checks whether the given date is on a period boundary
       * (expensive!)
       */
  def isBoundary(occurrence: timezonecompleteLib.distLibDatetimeMod.DateTime): scala.Boolean = js.native
  /**
       * The reference date
       */
  def reference(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * DEPRECATED: old name for the reference date
       */
  def start(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
       * Returns an ISO duration string e.g.
       * 2014-01-01T12:00:00.000+01:00/P1H
       * 2014-01-01T12:00:00.000+01:00/PT1M   (one minute)
       * 2014-01-01T12:00:00.000+01:00/P1M   (one month)
       */
  def toIsoString(): java.lang.String = js.native
  /**
       * The unit of the interval
       */
  def unit(): timezonecompleteLib.distLibBasicsMod.TimeUnit = js.native
}

