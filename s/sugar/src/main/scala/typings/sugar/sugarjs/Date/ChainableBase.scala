package typings.sugar.sugarjs.Date

import typings.std.Intl.DateTimeFormatOptions
import typings.sugar.Array
import typings.sugar.sugarjs.Locale
import typings.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainableBase[RawValue] extends js.Object {
  
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
  def advance(set: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  def advance(set: String, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
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
  def beginningOfDay(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def beginningOfISOWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def beginningOfMonth(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def beginningOfMonth(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def beginningOfWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def beginningOfWeek(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def beginningOfYear(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def beginningOfYear(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def daysAgo(): SugarDefaultChainable[Double] = js.native
  
  def daysFromNow(): SugarDefaultChainable[Double] = js.native
  
  def daysInMonth(): SugarDefaultChainable[Double] = js.native
  
  def daysSince(d: String): SugarDefaultChainable[Double] = js.native
  def daysSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def daysSince(d: Double): SugarDefaultChainable[Double] = js.native
  def daysSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def daysSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def daysSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def daysUntil(): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: String): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def daysUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def endOfDay(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def endOfDay(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def endOfISOWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def endOfMonth(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def endOfMonth(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def endOfWeek(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def endOfWeek(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def endOfYear(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def endOfYear(localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def format(): SugarDefaultChainable[String] = js.native
  def format(f: js.UndefOr[scala.Nothing], localeCode: String): SugarDefaultChainable[String] = js.native
  def format(f: String): SugarDefaultChainable[String] = js.native
  def format(f: String, localeCode: String): SugarDefaultChainable[String] = js.native
  
  def full(): SugarDefaultChainable[String] = js.native
  def full(localeCode: String): SugarDefaultChainable[String] = js.native
  
  def get(d: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  def get(d: String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
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
  
  def getUTCOffset(): SugarDefaultChainable[String] = js.native
  def getUTCOffset(iso: Boolean): SugarDefaultChainable[String] = js.native
  
  def getUTCSeconds(): SugarDefaultChainable[Double] = js.native
  
  def getUTCWeekday(): SugarDefaultChainable[Double] = js.native
  
  def getWeekday(): SugarDefaultChainable[Double] = js.native
  
  def hoursAgo(): SugarDefaultChainable[Double] = js.native
  
  def hoursFromNow(): SugarDefaultChainable[Double] = js.native
  
  def hoursSince(d: String): SugarDefaultChainable[Double] = js.native
  def hoursSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def hoursSince(d: Double): SugarDefaultChainable[Double] = js.native
  def hoursSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def hoursSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def hoursSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def hoursUntil(): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: String): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def hoursUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def is(d: String): SugarDefaultChainable[Boolean] = js.native
  def is(d: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def is(d: Double): SugarDefaultChainable[Boolean] = js.native
  def is(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def is(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def is(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  
  def isAfter(d: String): SugarDefaultChainable[Boolean] = js.native
  def isAfter(d: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isAfter(d: Double): SugarDefaultChainable[Boolean] = js.native
  def isAfter(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isAfter(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def isAfter(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  
  def isBefore(d: String): SugarDefaultChainable[Boolean] = js.native
  def isBefore(d: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBefore(d: Double): SugarDefaultChainable[Boolean] = js.native
  def isBefore(d: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBefore(d: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def isBefore(d: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  
  def isBetween(d1: String, d2: String): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: String, d2: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: String, d2: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: String, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: String, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: String, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: String): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: Double, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: String): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: String, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: Double, margin: Double): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: typings.sugar.Date): SugarDefaultChainable[Boolean] = js.native
  def isBetween(d1: typings.sugar.Date, d2: typings.sugar.Date, margin: Double): SugarDefaultChainable[Boolean] = js.native
  
  def isFriday(): SugarDefaultChainable[Boolean] = js.native
  
  def isFuture(): SugarDefaultChainable[Boolean] = js.native
  
  def isLastMonth(): SugarDefaultChainable[Boolean] = js.native
  def isLastMonth(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isLastWeek(): SugarDefaultChainable[Boolean] = js.native
  def isLastWeek(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isLastYear(): SugarDefaultChainable[Boolean] = js.native
  def isLastYear(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isLeapYear(): SugarDefaultChainable[Boolean] = js.native
  
  def isMonday(): SugarDefaultChainable[Boolean] = js.native
  
  def isNextMonth(): SugarDefaultChainable[Boolean] = js.native
  def isNextMonth(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isNextWeek(): SugarDefaultChainable[Boolean] = js.native
  def isNextWeek(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isNextYear(): SugarDefaultChainable[Boolean] = js.native
  def isNextYear(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isPast(): SugarDefaultChainable[Boolean] = js.native
  
  def isSaturday(): SugarDefaultChainable[Boolean] = js.native
  
  def isSunday(): SugarDefaultChainable[Boolean] = js.native
  
  def isThisMonth(): SugarDefaultChainable[Boolean] = js.native
  def isThisMonth(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isThisWeek(): SugarDefaultChainable[Boolean] = js.native
  def isThisWeek(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
  def isThisYear(): SugarDefaultChainable[Boolean] = js.native
  def isThisYear(localeCode: String): SugarDefaultChainable[Boolean] = js.native
  
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
  
  def iso(): SugarDefaultChainable[String] = js.native
  
  def long(): SugarDefaultChainable[String] = js.native
  def long(localeCode: String): SugarDefaultChainable[String] = js.native
  
  def medium(): SugarDefaultChainable[String] = js.native
  def medium(localeCode: String): SugarDefaultChainable[String] = js.native
  
  def millisecondsAgo(): SugarDefaultChainable[Double] = js.native
  
  def millisecondsFromNow(): SugarDefaultChainable[Double] = js.native
  
  def millisecondsSince(d: String): SugarDefaultChainable[Double] = js.native
  def millisecondsSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def millisecondsSince(d: Double): SugarDefaultChainable[Double] = js.native
  def millisecondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def millisecondsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def millisecondsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def millisecondsUntil(): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: String): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def millisecondsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def minutesAgo(): SugarDefaultChainable[Double] = js.native
  
  def minutesFromNow(): SugarDefaultChainable[Double] = js.native
  
  def minutesSince(d: String): SugarDefaultChainable[Double] = js.native
  def minutesSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def minutesSince(d: Double): SugarDefaultChainable[Double] = js.native
  def minutesSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def minutesSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def minutesSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def minutesUntil(): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: String): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def minutesUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def monthsAgo(): SugarDefaultChainable[Double] = js.native
  
  def monthsFromNow(): SugarDefaultChainable[Double] = js.native
  
  def monthsSince(d: String): SugarDefaultChainable[Double] = js.native
  def monthsSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def monthsSince(d: Double): SugarDefaultChainable[Double] = js.native
  def monthsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def monthsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def monthsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def monthsUntil(): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: String): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def monthsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  var raw: RawValue = js.native
  
  def relative(): SugarDefaultChainable[String] = js.native
  def relative(
    localeCode: js.UndefOr[scala.Nothing],
    relativeFn: js.Function4[
      /* num */ Double, 
      /* unit */ Double, 
      /* ms */ Double, 
      /* loc */ Locale, 
      SugarDefaultChainable[String]
    ]
  ): SugarDefaultChainable[String] = js.native
  def relative(localeCode: String): SugarDefaultChainable[String] = js.native
  def relative(
    localeCode: String,
    relativeFn: js.Function4[
      /* num */ Double, 
      /* unit */ Double, 
      /* ms */ Double, 
      /* loc */ Locale, 
      SugarDefaultChainable[String]
    ]
  ): SugarDefaultChainable[String] = js.native
  def relative(
    relativeFn: js.Function4[
      /* num */ Double, 
      /* unit */ Double, 
      /* ms */ Double, 
      /* loc */ Locale, 
      SugarDefaultChainable[String]
    ]
  ): SugarDefaultChainable[String] = js.native
  
  def relativeTo(d: String): SugarDefaultChainable[String] = js.native
  def relativeTo(d: String, localeCode: String): SugarDefaultChainable[String] = js.native
  def relativeTo(d: Double): SugarDefaultChainable[String] = js.native
  def relativeTo(d: Double, localeCode: String): SugarDefaultChainable[String] = js.native
  def relativeTo(d: typings.sugar.Date): SugarDefaultChainable[String] = js.native
  def relativeTo(d: typings.sugar.Date, localeCode: String): SugarDefaultChainable[String] = js.native
  
  def reset(): SugarDefaultChainable[typings.sugar.Date] = js.native
  def reset(unit: js.UndefOr[scala.Nothing], localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  def reset(unit: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  def reset(unit: String, localeCode: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  
  def rewind(milliseconds: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
  def rewind(set: String): SugarDefaultChainable[typings.sugar.Date] = js.native
  def rewind(set: String, reset: Boolean): SugarDefaultChainable[typings.sugar.Date] = js.native
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
  
  def secondsSince(d: String): SugarDefaultChainable[Double] = js.native
  def secondsSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def secondsSince(d: Double): SugarDefaultChainable[Double] = js.native
  def secondsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def secondsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def secondsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def secondsUntil(): SugarDefaultChainable[Double] = js.native
  def secondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def secondsUntil(d: String): SugarDefaultChainable[Double] = js.native
  def secondsUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
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
  
  def short(): SugarDefaultChainable[String] = js.native
  def short(localeCode: String): SugarDefaultChainable[String] = js.native
  
  def toDateString(): SugarDefaultChainable[String] = js.native
  
  def toISOString(): SugarDefaultChainable[String] = js.native
  
  def toJSON(): SugarDefaultChainable[String] = js.native
  def toJSON(key: js.Any): SugarDefaultChainable[String] = js.native
  
  def toLocaleDateString(): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  
  def toLocaleString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  
  def toLocaleTimeString(): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  
  def toTimeString(): SugarDefaultChainable[String] = js.native
  
  def toUTCString(): SugarDefaultChainable[String] = js.native
  
  def weeksAgo(): SugarDefaultChainable[Double] = js.native
  
  def weeksFromNow(): SugarDefaultChainable[Double] = js.native
  
  def weeksSince(d: String): SugarDefaultChainable[Double] = js.native
  def weeksSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def weeksSince(d: Double): SugarDefaultChainable[Double] = js.native
  def weeksSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def weeksSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def weeksSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def weeksUntil(): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: String): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def weeksUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def yearsAgo(): SugarDefaultChainable[Double] = js.native
  
  def yearsFromNow(): SugarDefaultChainable[Double] = js.native
  
  def yearsSince(d: String): SugarDefaultChainable[Double] = js.native
  def yearsSince(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def yearsSince(d: Double): SugarDefaultChainable[Double] = js.native
  def yearsSince(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def yearsSince(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def yearsSince(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  
  def yearsUntil(): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: String): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: String, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: Double): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: Double, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: typings.sugar.Date): SugarDefaultChainable[Double] = js.native
  def yearsUntil(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[Double] = js.native
}
