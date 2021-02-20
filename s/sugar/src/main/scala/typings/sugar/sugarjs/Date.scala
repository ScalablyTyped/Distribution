package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def addDays(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addDays(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addHours(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addHours(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addMilliseconds(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addMilliseconds(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addMinutes(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addMinutes(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addMonths(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addMonths(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addSeconds(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addSeconds(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addWeeks(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addWeeks(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def addYears(n: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def addYears(n: Double, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def advance(milliseconds: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(set: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(set: java.lang.String, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(set: js.Object): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(set: js.Object, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def beginningOfDay(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def beginningOfDay(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def beginningOfISOWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def beginningOfMonth(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def beginningOfMonth(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def beginningOfWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def beginningOfWeek(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def beginningOfYear(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def beginningOfYear(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def daysAgo(): SugarDefaultChainable[Double] = js.native
    
    def daysFromNow(): SugarDefaultChainable[Double] = js.native
    
    def daysInMonth(): SugarDefaultChainable[Double] = js.native
    
    def daysSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def daysSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysSince(d: Double): SugarDefaultChainable[Double] = js.native
    def daysSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def daysSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def daysUntil(): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def daysUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def endOfDay(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def endOfDay(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def endOfISOWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def endOfMonth(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def endOfMonth(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def endOfWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def endOfWeek(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def endOfYear(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def endOfYear(localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def format(): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: js.UndefOr[scala.Nothing], localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def format(f: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def full(): SugarDefaultChainable[java.lang.String] = js.native
    def full(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def get(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def get(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def get(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def get(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def get(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def get(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def getDate(): SugarDefaultChainable[Double] = js.native
    
    def getDay(): SugarDefaultChainable[Double] = js.native
    
    def getFullYear(): SugarDefaultChainable[Double] = js.native
    
    def getHours(): SugarDefaultChainable[Double] = js.native
    
    def getISOWeek(): SugarDefaultChainable[Double] = js.native
    
    def getMilliseconds(): SugarDefaultChainable[Double] = js.native
    
    def getMinutes(): SugarDefaultChainable[Double] = js.native
    
    def getMonth(): SugarDefaultChainable[Double] = js.native
    
    def getSeconds(): SugarDefaultChainable[Double] = js.native
    
    def getTime(): SugarDefaultChainable[Double] = js.native
    
    def getTimezoneOffset(): SugarDefaultChainable[Double] = js.native
    
    def getUTCDate(): SugarDefaultChainable[Double] = js.native
    
    def getUTCDay(): SugarDefaultChainable[Double] = js.native
    
    def getUTCFullYear(): SugarDefaultChainable[Double] = js.native
    
    def getUTCHours(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMilliseconds(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMinutes(): SugarDefaultChainable[Double] = js.native
    
    def getUTCMonth(): SugarDefaultChainable[Double] = js.native
    
    def getUTCOffset(): SugarDefaultChainable[java.lang.String] = js.native
    def getUTCOffset(iso: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def getUTCSeconds(): SugarDefaultChainable[Double] = js.native
    
    def getUTCWeekday(): SugarDefaultChainable[Double] = js.native
    
    def getWeekday(): SugarDefaultChainable[Double] = js.native
    
    def hoursAgo(): SugarDefaultChainable[Double] = js.native
    
    def hoursFromNow(): SugarDefaultChainable[Double] = js.native
    
    def hoursSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: Double): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def hoursSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def hoursUntil(): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def hoursUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def is(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def is(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def is(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def is(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isAfter(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isAfter(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isBefore(d: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBefore(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isBetween(d1: java.lang.String, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: java.lang.String, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: Double, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: java.lang.String, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
    def isBetween(d1: typings.sugar.Date, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isFriday(): SugarDefaultChainable[Boolean] = js.native
    
    def isFuture(): SugarDefaultChainable[Boolean] = js.native
    
    def isLastMonth(): SugarDefaultChainable[Boolean] = js.native
    def isLastMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLastWeek(): SugarDefaultChainable[Boolean] = js.native
    def isLastWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLastYear(): SugarDefaultChainable[Boolean] = js.native
    def isLastYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isLeapYear(): SugarDefaultChainable[Boolean] = js.native
    
    def isMonday(): SugarDefaultChainable[Boolean] = js.native
    
    def isNextMonth(): SugarDefaultChainable[Boolean] = js.native
    def isNextMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isNextWeek(): SugarDefaultChainable[Boolean] = js.native
    def isNextWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isNextYear(): SugarDefaultChainable[Boolean] = js.native
    def isNextYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isPast(): SugarDefaultChainable[Boolean] = js.native
    
    def isSaturday(): SugarDefaultChainable[Boolean] = js.native
    
    def isSunday(): SugarDefaultChainable[Boolean] = js.native
    
    def isThisMonth(): SugarDefaultChainable[Boolean] = js.native
    def isThisMonth(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThisWeek(): SugarDefaultChainable[Boolean] = js.native
    def isThisWeek(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThisYear(): SugarDefaultChainable[Boolean] = js.native
    def isThisYear(localeCode: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    
    def isThursday(): SugarDefaultChainable[Boolean] = js.native
    
    def isToday(): SugarDefaultChainable[Boolean] = js.native
    
    def isTomorrow(): SugarDefaultChainable[Boolean] = js.native
    
    def isTuesday(): SugarDefaultChainable[Boolean] = js.native
    
    def isUTC(): SugarDefaultChainable[Boolean] = js.native
    
    def isValid(): SugarDefaultChainable[Boolean] = js.native
    
    def isWednesday(): SugarDefaultChainable[Boolean] = js.native
    
    def isWeekday(): SugarDefaultChainable[Boolean] = js.native
    
    def isWeekend(): SugarDefaultChainable[Boolean] = js.native
    
    def isYesterday(): SugarDefaultChainable[Boolean] = js.native
    
    def iso(): SugarDefaultChainable[java.lang.String] = js.native
    
    def long(): SugarDefaultChainable[java.lang.String] = js.native
    def long(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def medium(): SugarDefaultChainable[java.lang.String] = js.native
    def medium(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def millisecondsAgo(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def millisecondsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def millisecondsUntil(): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def millisecondsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def minutesAgo(): SugarDefaultChainable[Double] = js.native
    
    def minutesFromNow(): SugarDefaultChainable[Double] = js.native
    
    def minutesSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: Double): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def minutesSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def minutesUntil(): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def minutesUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def monthsAgo(): SugarDefaultChainable[Double] = js.native
    
    def monthsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def monthsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def monthsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def monthsUntil(): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def monthsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def relative(): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      localeCode: js.UndefOr[scala.Nothing],
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def relative(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      localeCode: java.lang.String,
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def relative(
      relativeFn: js.Function4[
          /* num */ Double, 
          /* unit */ Double, 
          /* ms */ Double, 
          /* loc */ Locale, 
          SugarDefaultChainable[java.lang.String]
        ]
    ): SugarDefaultChainable[java.lang.String] = js.native
    
    def relativeTo(d: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: Double): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: Double, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: typings.sugar.Date): SugarDefaultChainable[java.lang.String] = js.native
    def relativeTo(d: typings.sugar.Date, localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def reset(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def reset(unit: js.UndefOr[scala.Nothing], localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def reset(unit: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def reset(unit: java.lang.String, localeCode: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def rewind(milliseconds: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(set: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(set: java.lang.String, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(set: js.Object): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(set: js.Object, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondsAgo(): SugarDefaultChainable[Double] = js.native
    
    def secondsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def secondsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def secondsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def secondsUntil(): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def secondsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def set(milliseconds: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(set: js.Object): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(set: js.Object, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double, minute: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def set(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def setDate(date: Double): SugarDefaultChainable[Double] = js.native
    
    def setFullYear(year: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setISOWeek(num: Double): SugarDefaultChainable[Unit] = js.native
    
    def setMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setTime(time: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTC(): SugarDefaultChainable[typings.sugar.Date] = js.native
    def setUTC(on: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def setUTCDate(date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCFullYear(year: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    
    def setUTCSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    
    def setWeekday(dow: Double): SugarDefaultChainable[Unit] = js.native
    
    def short(): SugarDefaultChainable[java.lang.String] = js.native
    def short(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def toDateString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toISOString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toJSON(): SugarDefaultChainable[java.lang.String] = js.native
    def toJSON(key: js.Any): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleDateString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: typings.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typings.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: typings.sugar.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toUTCString(): SugarDefaultChainable[java.lang.String] = js.native
    
    def weeksAgo(): SugarDefaultChainable[Double] = js.native
    
    def weeksFromNow(): SugarDefaultChainable[Double] = js.native
    
    def weeksSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: Double): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def weeksSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def weeksUntil(): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def weeksUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def yearsAgo(): SugarDefaultChainable[Double] = js.native
    
    def yearsFromNow(): SugarDefaultChainable[Double] = js.native
    
    def yearsSince(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: Double): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def yearsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    
    def yearsUntil(): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: java.lang.String): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: Double): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
    def yearsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[typings.sugar.Date]]
       with Instantiable1[
          (/* d */ typings.sugar.Date) | (/* d */ Double) | (/* d */ java.lang.String), 
          Chainable[typings.sugar.Date]
        ]
       with Instantiable2[
          js.UndefOr[(/* d */ typings.sugar.Date) | (/* d */ Double) | (/* d */ java.lang.String)], 
          /* options */ DateCreateOptions, 
          Chainable[typings.sugar.Date]
        ] {
    
    def apply(): Chainable[typings.sugar.Date] = js.native
    def apply(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
    def apply(d: java.lang.String): Chainable[typings.sugar.Date] = js.native
    def apply(d: java.lang.String, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
    def apply(d: Double): Chainable[typings.sugar.Date] = js.native
    def apply(d: Double, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
    def apply(d: typings.sugar.Date): Chainable[typings.sugar.Date] = js.native
    def apply(d: typings.sugar.Date, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
    
    def addDays(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addDays(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addHours(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addHours(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addLocale(localeCode: java.lang.String, `def`: js.Object): Locale = js.native
    
    def addMilliseconds(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addMilliseconds(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addMinutes(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addMinutes(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addMonths(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addMonths(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addSeconds(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addSeconds(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addWeeks(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addWeeks(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def addYears(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
    def addYears(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
    
    def advance(instance: typings.sugar.Date, milliseconds: Double): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, set: java.lang.String): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, set: java.lang.String, reset: Boolean): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, set: js.Object): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, set: js.Object, reset: Boolean): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, year: Double, month: Double): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, year: Double, month: Double, day: Double): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def advance(instance: typings.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def advance(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    
    def beginningOfDay(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def beginningOfDay(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def beginningOfISOWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
    
    def beginningOfMonth(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def beginningOfMonth(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def beginningOfWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def beginningOfWeek(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def beginningOfYear(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def beginningOfYear(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def clone(instance: typings.sugar.Date): typings.sugar.Date = js.native
    
    def create(): typings.sugar.Date = js.native
    def create(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): typings.sugar.Date = js.native
    def create(d: java.lang.String): typings.sugar.Date = js.native
    def create(d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def create(d: Double): typings.sugar.Date = js.native
    def create(d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def create(d: typings.sugar.Date): typings.sugar.Date = js.native
    def create(d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def daysAgo(instance: typings.sugar.Date): Double = js.native
    
    def daysFromNow(instance: typings.sugar.Date): Double = js.native
    
    def daysInMonth(instance: typings.sugar.Date): Double = js.native
    
    def daysSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def daysSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def daysSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def daysSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def daysSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def daysSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def daysUntil(instance: typings.sugar.Date): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def daysUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def endOfDay(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def endOfDay(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def endOfISOWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
    
    def endOfMonth(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def endOfMonth(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def endOfWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def endOfWeek(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def endOfYear(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def endOfYear(instance: typings.sugar.Date, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def format(instance: typings.sugar.Date): java.lang.String = js.native
    def format(instance: typings.sugar.Date, f: js.UndefOr[scala.Nothing], localeCode: java.lang.String): java.lang.String = js.native
    def format(instance: typings.sugar.Date, f: java.lang.String): java.lang.String = js.native
    def format(instance: typings.sugar.Date, f: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
    
    def full(instance: typings.sugar.Date): java.lang.String = js.native
    def full(instance: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def get(instance: typings.sugar.Date, d: java.lang.String): typings.sugar.Date = js.native
    def get(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def get(instance: typings.sugar.Date, d: Double): typings.sugar.Date = js.native
    def get(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def get(instance: typings.sugar.Date, d: typings.sugar.Date): typings.sugar.Date = js.native
    def get(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def getAllLocaleCodes(): typings.sugar.Array[java.lang.String] = js.native
    
    def getAllLocales(): typings.sugar.Array[Locale] = js.native
    
    def getISOWeek(instance: typings.sugar.Date): Double = js.native
    
    def getLocale(): Locale = js.native
    def getLocale(localeCode: java.lang.String): Locale = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def getUTCOffset(instance: typings.sugar.Date): java.lang.String = js.native
    def getUTCOffset(instance: typings.sugar.Date, iso: Boolean): java.lang.String = js.native
    
    def getUTCWeekday(instance: typings.sugar.Date): Double = js.native
    
    def getWeekday(instance: typings.sugar.Date): Double = js.native
    
    def hoursAgo(instance: typings.sugar.Date): Double = js.native
    
    def hoursFromNow(instance: typings.sugar.Date): Double = js.native
    
    def hoursSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def hoursSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def hoursSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def hoursSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def hoursSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def hoursSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def hoursUntil(instance: typings.sugar.Date): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def hoursUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def is(instance: typings.sugar.Date, d: java.lang.String): Boolean = js.native
    def is(instance: typings.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def is(instance: typings.sugar.Date, d: Double): Boolean = js.native
    def is(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def is(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
    def is(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
    
    def isAfter(instance: typings.sugar.Date, d: java.lang.String): Boolean = js.native
    def isAfter(instance: typings.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def isAfter(instance: typings.sugar.Date, d: Double): Boolean = js.native
    def isAfter(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def isAfter(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
    def isAfter(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
    
    def isBefore(instance: typings.sugar.Date, d: java.lang.String): Boolean = js.native
    def isBefore(instance: typings.sugar.Date, d: java.lang.String, margin: Double): Boolean = js.native
    def isBefore(instance: typings.sugar.Date, d: Double): Boolean = js.native
    def isBefore(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
    def isBefore(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
    def isBefore(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
    
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: java.lang.String): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: java.lang.String, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: Double, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: typings.sugar.Date): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: java.lang.String, d2: typings.sugar.Date, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: java.lang.String): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: java.lang.String, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: Double, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: typings.sugar.Date): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: Double, d2: typings.sugar.Date, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: java.lang.String): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: java.lang.String, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: Double, margin: Double): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: typings.sugar.Date): Boolean = js.native
    def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: typings.sugar.Date, margin: Double): Boolean = js.native
    
    def isFriday(instance: typings.sugar.Date): Boolean = js.native
    
    def isFuture(instance: typings.sugar.Date): Boolean = js.native
    
    def isLastMonth(instance: typings.sugar.Date): Boolean = js.native
    def isLastMonth(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLastWeek(instance: typings.sugar.Date): Boolean = js.native
    def isLastWeek(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLastYear(instance: typings.sugar.Date): Boolean = js.native
    def isLastYear(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isLeapYear(instance: typings.sugar.Date): Boolean = js.native
    
    def isMonday(instance: typings.sugar.Date): Boolean = js.native
    
    def isNextMonth(instance: typings.sugar.Date): Boolean = js.native
    def isNextMonth(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isNextWeek(instance: typings.sugar.Date): Boolean = js.native
    def isNextWeek(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isNextYear(instance: typings.sugar.Date): Boolean = js.native
    def isNextYear(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isPast(instance: typings.sugar.Date): Boolean = js.native
    
    def isSaturday(instance: typings.sugar.Date): Boolean = js.native
    
    def isSunday(instance: typings.sugar.Date): Boolean = js.native
    
    def isThisMonth(instance: typings.sugar.Date): Boolean = js.native
    def isThisMonth(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThisWeek(instance: typings.sugar.Date): Boolean = js.native
    def isThisWeek(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThisYear(instance: typings.sugar.Date): Boolean = js.native
    def isThisYear(instance: typings.sugar.Date, localeCode: java.lang.String): Boolean = js.native
    
    def isThursday(instance: typings.sugar.Date): Boolean = js.native
    
    def isToday(instance: typings.sugar.Date): Boolean = js.native
    
    def isTomorrow(instance: typings.sugar.Date): Boolean = js.native
    
    def isTuesday(instance: typings.sugar.Date): Boolean = js.native
    
    def isUTC(instance: typings.sugar.Date): Boolean = js.native
    
    def isValid(instance: typings.sugar.Date): Boolean = js.native
    
    def isWednesday(instance: typings.sugar.Date): Boolean = js.native
    
    def isWeekday(instance: typings.sugar.Date): Boolean = js.native
    
    def isWeekend(instance: typings.sugar.Date): Boolean = js.native
    
    def isYesterday(instance: typings.sugar.Date): Boolean = js.native
    
    def iso(instance: typings.sugar.Date): java.lang.String = js.native
    
    def long(instance: typings.sugar.Date): java.lang.String = js.native
    def long(instance: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def medium(instance: typings.sugar.Date): java.lang.String = js.native
    def medium(instance: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def millisecondsAgo(instance: typings.sugar.Date): Double = js.native
    
    def millisecondsFromNow(instance: typings.sugar.Date): Double = js.native
    
    def millisecondsSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def millisecondsSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def millisecondsSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def millisecondsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def millisecondsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def millisecondsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def millisecondsUntil(instance: typings.sugar.Date): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def millisecondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def minutesAgo(instance: typings.sugar.Date): Double = js.native
    
    def minutesFromNow(instance: typings.sugar.Date): Double = js.native
    
    def minutesSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def minutesSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def minutesSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def minutesSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def minutesSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def minutesSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def minutesUntil(instance: typings.sugar.Date): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def minutesUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def monthsAgo(instance: typings.sugar.Date): Double = js.native
    
    def monthsFromNow(instance: typings.sugar.Date): Double = js.native
    
    def monthsSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def monthsSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def monthsSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def monthsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def monthsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def monthsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def monthsUntil(instance: typings.sugar.Date): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def monthsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def range(): Range = js.native
    def range(start: js.UndefOr[scala.Nothing], end: java.lang.String): Range = js.native
    def range(start: js.UndefOr[scala.Nothing], end: typings.sugar.Date): Range = js.native
    def range(start: java.lang.String): Range = js.native
    def range(start: java.lang.String, end: java.lang.String): Range = js.native
    def range(start: java.lang.String, end: typings.sugar.Date): Range = js.native
    def range(start: typings.sugar.Date): Range = js.native
    def range(start: typings.sugar.Date, end: java.lang.String): Range = js.native
    def range(start: typings.sugar.Date, end: typings.sugar.Date): Range = js.native
    
    def relative(instance: typings.sugar.Date): java.lang.String = js.native
    def relative(
      instance: typings.sugar.Date,
      localeCode: js.UndefOr[scala.Nothing],
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    def relative(instance: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    def relative(
      instance: typings.sugar.Date,
      localeCode: java.lang.String,
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    def relative(
      instance: typings.sugar.Date,
      relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
    ): java.lang.String = js.native
    
    def relativeTo(instance: typings.sugar.Date, d: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typings.sugar.Date, d: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typings.sugar.Date, d: Double): java.lang.String = js.native
    def relativeTo(instance: typings.sugar.Date, d: Double, localeCode: java.lang.String): java.lang.String = js.native
    def relativeTo(instance: typings.sugar.Date, d: typings.sugar.Date): java.lang.String = js.native
    def relativeTo(instance: typings.sugar.Date, d: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def removeLocale(localeCode: java.lang.String): Locale = js.native
    
    def reset(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def reset(instance: typings.sugar.Date, unit: js.UndefOr[scala.Nothing], localeCode: java.lang.String): typings.sugar.Date = js.native
    def reset(instance: typings.sugar.Date, unit: java.lang.String): typings.sugar.Date = js.native
    def reset(instance: typings.sugar.Date, unit: java.lang.String, localeCode: java.lang.String): typings.sugar.Date = js.native
    
    def rewind(instance: typings.sugar.Date, milliseconds: Double): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, set: java.lang.String): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, set: java.lang.String, reset: Boolean): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, set: js.Object): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, set: js.Object, reset: Boolean): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, year: Double, month: Double): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, year: Double, month: Double, day: Double): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(instance: typings.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def rewind(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    
    def secondsAgo(instance: typings.sugar.Date): Double = js.native
    
    def secondsFromNow(instance: typings.sugar.Date): Double = js.native
    
    def secondsSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def secondsSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def secondsSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def secondsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def secondsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def secondsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def secondsUntil(instance: typings.sugar.Date): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def secondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def set(instance: typings.sugar.Date, milliseconds: Double): typings.sugar.Date = js.native
    def set(instance: typings.sugar.Date, set: js.Object): typings.sugar.Date = js.native
    def set(instance: typings.sugar.Date, set: js.Object, reset: Boolean): typings.sugar.Date = js.native
    def set(instance: typings.sugar.Date, year: Double, month: Double): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: js.UndefOr[scala.Nothing],
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def set(instance: typings.sugar.Date, year: Double, month: Double, day: Double): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: js.UndefOr[scala.Nothing],
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    def set(instance: typings.sugar.Date, year: Double, month: Double, day: Double, hour: Double): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: js.UndefOr[scala.Nothing],
      second: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double
    ): typings.sugar.Date = js.native
    def set(
      instance: typings.sugar.Date,
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double
    ): typings.sugar.Date = js.native
    
    def setISOWeek(instance: typings.sugar.Date, num: Double): Unit = js.native
    
    def setLocale(localeCode: java.lang.String): Locale = js.native
    
    def setOption(name: java.lang.String, value: js.Any): Unit = js.native
    def setOption(options: DateOptions): Unit = js.native
    
    def setUTC(instance: typings.sugar.Date): typings.sugar.Date = js.native
    def setUTC(instance: typings.sugar.Date, on: Boolean): typings.sugar.Date = js.native
    
    def setWeekday(instance: typings.sugar.Date, dow: Double): Unit = js.native
    
    def short(instance: typings.sugar.Date): java.lang.String = js.native
    def short(instance: typings.sugar.Date, localeCode: java.lang.String): java.lang.String = js.native
    
    def weeksAgo(instance: typings.sugar.Date): Double = js.native
    
    def weeksFromNow(instance: typings.sugar.Date): Double = js.native
    
    def weeksSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def weeksSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def weeksSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def weeksSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def weeksSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def weeksSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def weeksUntil(instance: typings.sugar.Date): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def weeksUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def yearsAgo(instance: typings.sugar.Date): Double = js.native
    
    def yearsFromNow(instance: typings.sugar.Date): Double = js.native
    
    def yearsSince(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def yearsSince(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def yearsSince(instance: typings.sugar.Date, d: Double): Double = js.native
    def yearsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def yearsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def yearsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
    
    def yearsUntil(instance: typings.sugar.Date): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: java.lang.String): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
    def yearsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  }
  
  @js.native
  trait DateCreateOptions extends StObject {
    
    @JSName("clone")
    var clone_FDateCreateOptions: js.UndefOr[Boolean] = js.native
    
    var fromUTC: js.UndefOr[Boolean] = js.native
    
    var future: js.UndefOr[Boolean] = js.native
    
    var locale: js.UndefOr[java.lang.String] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var past: js.UndefOr[Boolean] = js.native
    
    var setUTC: js.UndefOr[Boolean] = js.native
  }
  object DateCreateOptions {
    
    @scala.inline
    def apply(): DateCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateCreateOptions]
    }
    
    @scala.inline
    implicit class DateCreateOptionsMutableBuilder[Self <: DateCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setFromUTC(value: Boolean): Self = StObject.set(x, "fromUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUTCUndefined: Self = StObject.set(x, "fromUTC", js.undefined)
      
      @scala.inline
      def setFuture(value: Boolean): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPast(value: Boolean): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      @scala.inline
      def setSetUTC(value: Boolean): Self = StObject.set(x, "setUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUTCUndefined: Self = StObject.set(x, "setUTC", js.undefined)
    }
  }
  
  @js.native
  trait DateOptions extends StObject {
    
    var newDateInternal: typings.sugar.Function = js.native
  }
  object DateOptions {
    
    @scala.inline
    def apply(newDateInternal: typings.sugar.Function): DateOptions = {
      val __obj = js.Dynamic.literal(newDateInternal = newDateInternal.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateOptions]
    }
    
    @scala.inline
    implicit class DateOptionsMutableBuilder[Self <: DateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewDateInternal(value: typings.sugar.Function): Self = StObject.set(x, "newDateInternal", value.asInstanceOf[js.Any])
    }
  }
}
