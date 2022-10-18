package typings.timezonecomplete

import typings.timezonecomplete.distLibBasicsMod.TimeUnit
import typings.timezonecomplete.distLibBasicsMod.WeekDay
import typings.timezonecomplete.distLibDatetimeMod.DateTime
import typings.timezonecomplete.distLibDurationMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPeriodMod {
  
  @JSImport("timezonecomplete/dist/lib/period", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timezonecomplete/dist/lib/period", "Period")
  @js.native
  open class Period protected () extends StObject {
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param json period represented as JSON object
      * @throws timezonecomplete.Argument.Json for invalid JSON (missing reference, unparseable reference or interval)
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(json: PeriodJson) = this()
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
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(reference: DateTime, interval: Duration) = this()
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
      * @throws timezonecomplete.Argument.Amount for invalid amount
      * @throws timezonecomplete.Argument.Unit for invalid time unit
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      */
    def this(reference: DateTime, amount: Double, unit: TimeUnit) = this()
    def this(reference: DateTime, interval: Duration, dst: PeriodDst) = this()
    def this(reference: DateTime, amount: Double, unit: TimeUnit, dst: PeriodDst) = this()
    
    /**
      * Normalize the values where possible - not all values
      * are convertible into one another. Weeks are converted to days.
      * E.g. more than 60 minutes is transferred to hours,
      * but seconds cannot be transferred to minutes due to leap seconds.
      * Weeks are converted back to days.
      * @throws nothing
      */
    /* private */ var _calcInternalValues: Any = js.native
    
    /**
      * Corrects the difference between _reference and _intReference.
      * @throws nothing
      */
    /* private */ var _correctDay: Any = js.native
    
    /**
      * DST handling
      */
    /* private */ var _dst: Any = js.native
    
    /**
      * Returns true if DST handling is relevant for us.
      * (i.e. if the reference time zone has DST)
      * @throws nothing
      */
    /* private */ var _dstRelevant: Any = js.native
    
    /**
      * Normalized internal DST handling. If DST handling is irrelevant
      * (because the reference time zone does not have DST)
      * then it is set to RegularInterval
      */
    /* private */ var _intDst: Any = js.native
    
    /**
      * Normalized interval
      */
    /* private */ var _intInterval: Any = js.native
    
    /**
      * Normalized reference date, has day-of-month <= 28 for Monthly
      * period, or for Yearly period if month is February
      */
    /* private */ var _intReference: Any = js.native
    
    /**
      * Interval
      */
    /* private */ var _interval: Any = js.native
    
    /**
      * If this._internalUnit in [Month, Year], normalizes the day-of-month
      * to <= 28.
      * @return a new date if different, otherwise the exact same object (no clone!)
      * @throws nothing
      */
    /* private */ var _normalizeDay: Any = js.native
    
    /**
      * Reference moment of period
      */
    /* private */ var _reference: Any = js.native
    
    /**
      * The amount of units of the interval
      * @throws nothing
      */
    def amount(): Double = js.native
    
    /**
      * The dst handling mode
      * @throws nothing
      */
    def dst(): PeriodDst = js.native
    
    /**
      * Returns true iff this period has the same effect as the given one.
      * i.e. a period of 24 hours is equal to one of 1 day if they have the same UTC reference moment
      * and same dst.
      * @throws timezonecomplete.UnawareToAwareConversion if not both `other#reference()` and the reference date are both aware or unaware
      * of time zone
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def equals(other: Period): Boolean = js.native
    
    /**
      * The first occurrence of the period greater than
      * the given date. The given date need not be at a period boundary.
      * Pre: the fromdate and reference date must either both have timezones or not
      * @param fromDate: the date after which to return the next date
      * @return the first date matching the period after fromDate, given in the same zone as the fromDate.
      * @throws timezonecomplete.UnawareToAwareConversion if not both fromdate and the reference date are both aware or unaware of time zone
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def findFirst(fromDate: DateTime): DateTime = js.native
    
    /**
      * The last occurrence of the period less than
      * the given date. The given date need not be at a period boundary.
      * Pre: the fromdate and the period reference date must either both have timezones or not
      * @param fromDate: the date before which to return the next date
      * @return the last date matching the period before fromDate, given
      *         in the same zone as the fromDate.
      * @throws timezonecomplete.UnawareToAwareConversion if not both `from` and the reference date are both aware or unaware of time zone
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def findLast(from: DateTime): DateTime = js.native
    
    /**
      * Returns the next timestamp in the period. The given timestamp must
      * be at a period boundary, otherwise the answer is incorrect.
      * This function has MUCH better performance than findFirst.
      * Returns the datetime "count" times away from the given datetime.
      * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
      * @param count	Number of periods to add. Optional. Must be an integer number, may be positive or negative, default 1
      * @return (prev + count * period), in the same timezone as prev.
      * @throws timezonecomplete.Argument.Prev if prev is undefined
      * @throws timezonecomplete.Argument.Count if count is not an integer number
      */
    def findNext(prev: DateTime): DateTime = js.native
    def findNext(prev: DateTime, count: Double): DateTime = js.native
    
    /**
      * Returns the previous timestamp in the period. The given timestamp must
      * be at a period boundary, otherwise the answer is incorrect.
      * @param prev	Boundary date. Must have a time zone (any time zone) iff the period reference date has one.
      * @param count	Number of periods to subtract. Optional. Must be an integer number, may be negative.
      * @return (next - count * period), in the same timezone as next.
      * @throws timezonecomplete.Argument.Next if prev is undefined
      * @throws timezonecomplete.Argument.Count if count is not an integer number
      */
    def findPrev(next: DateTime): DateTime = js.native
    def findPrev(next: DateTime, count: Double): DateTime = js.native
    
    /**
      * Returns true iff this period was constructed with identical arguments to the other one.
      * @throws nothing
      */
    def identical(other: Period): Boolean = js.native
    
    /**
      * The interval
      * @throws nothing
      */
    def interval(): Duration = js.native
    
    /**
      * Checks whether the given date is on a period boundary
      * (expensive!)
      * @throws timezonecomplete.UnawareToAwareConversion if not both `occurrence` and the reference date are both aware or unaware of time zone
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def isBoundary(occurrence: DateTime): Boolean = js.native
    
    /**
      * Allow not using instanceof
      */
    var kind: String = js.native
    
    /**
      * The reference date
      * @throws nothing
      */
    def reference(): DateTime = js.native
    
    /**
      * DEPRECATED: old name for the reference date
      * @throws nothing
      */
    def start(): DateTime = js.native
    
    /**
      * Returns an ISO duration string e.g.
      * 2014-01-01T12:00:00.000+01:00/P1H
      * 2014-01-01T12:00:00.000+01:00/PT1M   (one minute)
      * 2014-01-01T12:00:00.000+01:00/P1M   (one month)
      * @throws nothing
      */
    def toIsoString(): String = js.native
    
    /**
      * Returns a JSON-compatible representation of this period
      * @throws nothing
      */
    def toJson(): PeriodJson = js.native
    
    /**
      * The unit of the interval
      * @throws nothing
      */
    def unit(): TimeUnit = js.native
  }
  
  @js.native
  sealed trait PeriodDst extends StObject
  @JSImport("timezonecomplete/dist/lib/period", "PeriodDst")
  @js.native
  object PeriodDst extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PeriodDst & Double] = js.native
    
    /**
      * End-of-enum marker
      */
    @js.native
    sealed trait MAX
      extends StObject
         with PeriodDst
    /* 2 */ val MAX: typings.timezonecomplete.distLibPeriodMod.PeriodDst.MAX & Double = js.native
    
    /**
      * Keep repeating in similar intervals measured in UTC,
      * unaffected by Daylight Saving Time.
      * E.g. a repetition of one hour will take one real hour
      * every time, even in a time zone with DST.
      * Leap seconds, leap days and month length
      * differences will still make the intervals different.
      */
    @js.native
    sealed trait RegularIntervals
      extends StObject
         with PeriodDst
    /* 0 */ val RegularIntervals: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularIntervals & Double = js.native
    
    /**
      * Ensure that the time at which the intervals occur stay
      * at the same place in the day, local time. So e.g.
      * a period of one day, referenceing at 8:05AM Europe/Amsterdam time
      * will always reference at 8:05 Europe/Amsterdam. This means that
      * in UTC time, some intervals will be 25 hours and some
      * 23 hours during DST changes.
      * Another example: an hourly interval will be hourly in local time,
      * skipping an hour in UTC for a DST backward change.
      */
    @js.native
    sealed trait RegularLocalTime
      extends StObject
         with PeriodDst
    /* 1 */ val RegularLocalTime: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularLocalTime & Double = js.native
  }
  
  inline def isPeriod(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPeriod")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean]
  
  inline def isValidPeriodJson(json: PeriodJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPeriodJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def periodDstToString(p: PeriodDst): String = ^.asInstanceOf[js.Dynamic].applyDynamic("periodDstToString")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timestampOnWeekTimeGreaterThanOrEqualTo(opts: WeekTimeOpts): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampOnWeekTimeGreaterThanOrEqualTo")(opts.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  inline def timestampOnWeekTimeLessThan(opts: WeekTimeOpts): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampOnWeekTimeLessThan")(opts.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  /* Rewritten from type alias, can be one of: 
    - typings.timezonecomplete.timezonecompleteStrings.regular
    - typings.timezonecomplete.timezonecompleteStrings.local
  */
  trait PeriodDstJson extends StObject
  object PeriodDstJson {
    
    inline def local: typings.timezonecomplete.timezonecompleteStrings.local = "local".asInstanceOf[typings.timezonecomplete.timezonecompleteStrings.local]
    
    inline def regular: typings.timezonecomplete.timezonecompleteStrings.regular = "regular".asInstanceOf[typings.timezonecomplete.timezonecompleteStrings.regular]
  }
  
  trait PeriodJson extends StObject {
    
    /**
      * Interval as a timezonecomplete duration string
      */
    var duration: String
    
    /**
      * Daylight saving time handling
      */
    var periodDst: PeriodDstJson
    
    /**
      * Reference date as iso timestamp + time zone
      */
    var reference: String
  }
  object PeriodJson {
    
    inline def apply(duration: String, periodDst: PeriodDstJson, reference: String): PeriodJson = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], periodDst = periodDst.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeriodJson]
    }
    
    extension [Self <: PeriodJson](x: Self) {
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPeriodDst(value: PeriodDstJson): Self = StObject.set(x, "periodDst", value.asInstanceOf[js.Any])
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  trait WeekTimeOpts extends StObject {
    
    /**
      * Desired time (hours 0-23)
      */
    var hour: Double
    
    /**
      * Desired time (milliseconds 0-999)
      */
    var millisecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired time (minutes 0-59)
      */
    var minute: js.UndefOr[Double] = js.undefined
    
    /**
      * Timestamp to use as a basis
      */
    var reference: DateTime
    
    /**
      * Desired time (seconds 0-59)
      */
    var second: js.UndefOr[Double] = js.undefined
    
    /**
      * Desired day of week
      */
    var weekday: WeekDay
  }
  object WeekTimeOpts {
    
    inline def apply(hour: Double, reference: DateTime, weekday: WeekDay): WeekTimeOpts = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekTimeOpts]
    }
    
    extension [Self <: WeekTimeOpts](x: Self) {
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setReference(value: DateTime): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setWeekday(value: WeekDay): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    }
  }
}
