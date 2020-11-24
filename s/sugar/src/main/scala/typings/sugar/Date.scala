package typings.sugar

import typings.sugar.sugarjs.Date.DateCreateOptions
import typings.sugar.sugarjs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
  def addDays(n: Double): Date = js.native
  def addDays(n: Double, reset: Boolean): Date = js.native
  
  def addHours(n: Double): Date = js.native
  def addHours(n: Double, reset: Boolean): Date = js.native
  
  def addMilliseconds(n: Double): Date = js.native
  def addMilliseconds(n: Double, reset: Boolean): Date = js.native
  
  def addMinutes(n: Double): Date = js.native
  def addMinutes(n: Double, reset: Boolean): Date = js.native
  
  def addMonths(n: Double): Date = js.native
  def addMonths(n: Double, reset: Boolean): Date = js.native
  
  def addSeconds(n: Double): Date = js.native
  def addSeconds(n: Double, reset: Boolean): Date = js.native
  
  def addWeeks(n: Double): Date = js.native
  def addWeeks(n: Double, reset: Boolean): Date = js.native
  
  def addYears(n: Double): Date = js.native
  def addYears(n: Double, reset: Boolean): Date = js.native
  
  def advance(milliseconds: Double): Date = js.native
  def advance(set: java.lang.String): Date = js.native
  def advance(set: java.lang.String, reset: Boolean): Date = js.native
  def advance(set: js.Object): Date = js.native
  def advance(set: js.Object, reset: Boolean): Date = js.native
  def advance(year: Double, month: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double
  ): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def advance(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def advance(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): Date = js.native
  
  def beginningOfDay(): Date = js.native
  def beginningOfDay(localeCode: java.lang.String): Date = js.native
  
  def beginningOfISOWeek(): Date = js.native
  
  def beginningOfMonth(): Date = js.native
  def beginningOfMonth(localeCode: java.lang.String): Date = js.native
  
  def beginningOfWeek(): Date = js.native
  def beginningOfWeek(localeCode: java.lang.String): Date = js.native
  
  def beginningOfYear(): Date = js.native
  def beginningOfYear(localeCode: java.lang.String): Date = js.native
  
  def daysAgo(): Double = js.native
  
  def daysFromNow(): Double = js.native
  
  def daysInMonth(): Double = js.native
  
  def daysSince(d: java.lang.String): Double = js.native
  def daysSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def daysSince(d: Double): Double = js.native
  def daysSince(d: Double, options: DateCreateOptions): Double = js.native
  def daysSince(d: Date): Double = js.native
  def daysSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def daysUntil(): Double = js.native
  def daysUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def daysUntil(d: java.lang.String): Double = js.native
  def daysUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def daysUntil(d: Double): Double = js.native
  def daysUntil(d: Double, options: DateCreateOptions): Double = js.native
  def daysUntil(d: Date): Double = js.native
  def daysUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def endOfDay(): Date = js.native
  def endOfDay(localeCode: java.lang.String): Date = js.native
  
  def endOfISOWeek(): Date = js.native
  
  def endOfMonth(): Date = js.native
  def endOfMonth(localeCode: java.lang.String): Date = js.native
  
  def endOfWeek(): Date = js.native
  def endOfWeek(localeCode: java.lang.String): Date = js.native
  
  def endOfYear(): Date = js.native
  def endOfYear(localeCode: java.lang.String): Date = js.native
  
  def format(): java.lang.String = js.native
  def format(f: js.UndefOr[scala.Nothing], localeCode: java.lang.String): java.lang.String = js.native
  def format(f: java.lang.String): java.lang.String = js.native
  def format(f: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  
  def full(): java.lang.String = js.native
  def full(localeCode: java.lang.String): java.lang.String = js.native
  
  def get(d: java.lang.String): Date = js.native
  def get(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def get(d: Double): Date = js.native
  def get(d: Double, options: DateCreateOptions): Date = js.native
  def get(d: Date): Date = js.native
  def get(d: Date, options: DateCreateOptions): Date = js.native
  
  def getISOWeek(): Double = js.native
  
  def getUTCOffset(): java.lang.String = js.native
  def getUTCOffset(iso: Boolean): java.lang.String = js.native
  
  def getUTCWeekday(): Double = js.native
  
  def getWeekday(): Double = js.native
  
  def hoursAgo(): Double = js.native
  
  def hoursFromNow(): Double = js.native
  
  def hoursSince(d: java.lang.String): Double = js.native
  def hoursSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def hoursSince(d: Double): Double = js.native
  def hoursSince(d: Double, options: DateCreateOptions): Double = js.native
  def hoursSince(d: Date): Double = js.native
  def hoursSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def hoursUntil(): Double = js.native
  def hoursUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def hoursUntil(d: java.lang.String): Double = js.native
  def hoursUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def hoursUntil(d: Double): Double = js.native
  def hoursUntil(d: Double, options: DateCreateOptions): Double = js.native
  def hoursUntil(d: Date): Double = js.native
  def hoursUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def is(d: java.lang.String): Boolean = js.native
  def is(d: java.lang.String, margin: Double): Boolean = js.native
  def is(d: Double): Boolean = js.native
  def is(d: Double, margin: Double): Boolean = js.native
  def is(d: Date): Boolean = js.native
  def is(d: Date, margin: Double): Boolean = js.native
  
  def isAfter(d: java.lang.String): Boolean = js.native
  def isAfter(d: java.lang.String, margin: Double): Boolean = js.native
  def isAfter(d: Double): Boolean = js.native
  def isAfter(d: Double, margin: Double): Boolean = js.native
  def isAfter(d: Date): Boolean = js.native
  def isAfter(d: Date, margin: Double): Boolean = js.native
  
  def isBefore(d: java.lang.String): Boolean = js.native
  def isBefore(d: java.lang.String, margin: Double): Boolean = js.native
  def isBefore(d: Double): Boolean = js.native
  def isBefore(d: Double, margin: Double): Boolean = js.native
  def isBefore(d: Date): Boolean = js.native
  def isBefore(d: Date, margin: Double): Boolean = js.native
  
  def isBetween(d1: java.lang.String, d2: java.lang.String): Boolean = js.native
  def isBetween(d1: java.lang.String, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(d1: java.lang.String, d2: Double): Boolean = js.native
  def isBetween(d1: java.lang.String, d2: Double, margin: Double): Boolean = js.native
  def isBetween(d1: java.lang.String, d2: Date): Boolean = js.native
  def isBetween(d1: java.lang.String, d2: Date, margin: Double): Boolean = js.native
  def isBetween(d1: Double, d2: java.lang.String): Boolean = js.native
  def isBetween(d1: Double, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(d1: Double, d2: Double): Boolean = js.native
  def isBetween(d1: Double, d2: Double, margin: Double): Boolean = js.native
  def isBetween(d1: Double, d2: Date): Boolean = js.native
  def isBetween(d1: Double, d2: Date, margin: Double): Boolean = js.native
  def isBetween(d1: Date, d2: java.lang.String): Boolean = js.native
  def isBetween(d1: Date, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(d1: Date, d2: Double): Boolean = js.native
  def isBetween(d1: Date, d2: Double, margin: Double): Boolean = js.native
  def isBetween(d1: Date, d2: Date): Boolean = js.native
  def isBetween(d1: Date, d2: Date, margin: Double): Boolean = js.native
  
  def isFriday(): Boolean = js.native
  
  def isFuture(): Boolean = js.native
  
  def isLastMonth(): Boolean = js.native
  def isLastMonth(localeCode: java.lang.String): Boolean = js.native
  
  def isLastWeek(): Boolean = js.native
  def isLastWeek(localeCode: java.lang.String): Boolean = js.native
  
  def isLastYear(): Boolean = js.native
  def isLastYear(localeCode: java.lang.String): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  def isMonday(): Boolean = js.native
  
  def isNextMonth(): Boolean = js.native
  def isNextMonth(localeCode: java.lang.String): Boolean = js.native
  
  def isNextWeek(): Boolean = js.native
  def isNextWeek(localeCode: java.lang.String): Boolean = js.native
  
  def isNextYear(): Boolean = js.native
  def isNextYear(localeCode: java.lang.String): Boolean = js.native
  
  def isPast(): Boolean = js.native
  
  def isSaturday(): Boolean = js.native
  
  def isSunday(): Boolean = js.native
  
  def isThisMonth(): Boolean = js.native
  def isThisMonth(localeCode: java.lang.String): Boolean = js.native
  
  def isThisWeek(): Boolean = js.native
  def isThisWeek(localeCode: java.lang.String): Boolean = js.native
  
  def isThisYear(): Boolean = js.native
  def isThisYear(localeCode: java.lang.String): Boolean = js.native
  
  def isThursday(): Boolean = js.native
  
  def isToday(): Boolean = js.native
  
  def isTomorrow(): Boolean = js.native
  
  def isTuesday(): Boolean = js.native
  
  def isUTC(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def isWednesday(): Boolean = js.native
  
  def isWeekday(): Boolean = js.native
  
  def isWeekend(): Boolean = js.native
  
  def isYesterday(): Boolean = js.native
  
  def iso(): java.lang.String = js.native
  
  def long(): java.lang.String = js.native
  def long(localeCode: java.lang.String): java.lang.String = js.native
  
  def medium(): java.lang.String = js.native
  def medium(localeCode: java.lang.String): java.lang.String = js.native
  
  def millisecondsAgo(): Double = js.native
  
  def millisecondsFromNow(): Double = js.native
  
  def millisecondsSince(d: java.lang.String): Double = js.native
  def millisecondsSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def millisecondsSince(d: Double): Double = js.native
  def millisecondsSince(d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsSince(d: Date): Double = js.native
  def millisecondsSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def millisecondsUntil(): Double = js.native
  def millisecondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def millisecondsUntil(d: java.lang.String): Double = js.native
  def millisecondsUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(d: Double): Double = js.native
  def millisecondsUntil(d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(d: Date): Double = js.native
  def millisecondsUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def minutesAgo(): Double = js.native
  
  def minutesFromNow(): Double = js.native
  
  def minutesSince(d: java.lang.String): Double = js.native
  def minutesSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def minutesSince(d: Double): Double = js.native
  def minutesSince(d: Double, options: DateCreateOptions): Double = js.native
  def minutesSince(d: Date): Double = js.native
  def minutesSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def minutesUntil(): Double = js.native
  def minutesUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def minutesUntil(d: java.lang.String): Double = js.native
  def minutesUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def minutesUntil(d: Double): Double = js.native
  def minutesUntil(d: Double, options: DateCreateOptions): Double = js.native
  def minutesUntil(d: Date): Double = js.native
  def minutesUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def monthsAgo(): Double = js.native
  
  def monthsFromNow(): Double = js.native
  
  def monthsSince(d: java.lang.String): Double = js.native
  def monthsSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def monthsSince(d: Double): Double = js.native
  def monthsSince(d: Double, options: DateCreateOptions): Double = js.native
  def monthsSince(d: Date): Double = js.native
  def monthsSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def monthsUntil(): Double = js.native
  def monthsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def monthsUntil(d: java.lang.String): Double = js.native
  def monthsUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def monthsUntil(d: Double): Double = js.native
  def monthsUntil(d: Double, options: DateCreateOptions): Double = js.native
  def monthsUntil(d: Date): Double = js.native
  def monthsUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def relative(): java.lang.String = js.native
  def relative(
    localeCode: js.UndefOr[scala.Nothing],
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
  ): java.lang.String = js.native
  def relative(localeCode: java.lang.String): java.lang.String = js.native
  def relative(
    localeCode: java.lang.String,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
  ): java.lang.String = js.native
  def relative(
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
  ): java.lang.String = js.native
  
  def relativeTo(d: java.lang.String): java.lang.String = js.native
  def relativeTo(d: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(d: Double): java.lang.String = js.native
  def relativeTo(d: Double, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(d: Date): java.lang.String = js.native
  def relativeTo(d: Date, localeCode: java.lang.String): java.lang.String = js.native
  
  def reset(): Date = js.native
  def reset(unit: js.UndefOr[scala.Nothing], localeCode: java.lang.String): Date = js.native
  def reset(unit: java.lang.String): Date = js.native
  def reset(unit: java.lang.String, localeCode: java.lang.String): Date = js.native
  
  def rewind(milliseconds: Double): Date = js.native
  def rewind(set: java.lang.String): Date = js.native
  def rewind(set: java.lang.String, reset: Boolean): Date = js.native
  def rewind(set: js.Object): Date = js.native
  def rewind(set: js.Object, reset: Boolean): Date = js.native
  def rewind(year: Double, month: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double
  ): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def rewind(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def rewind(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): Date = js.native
  
  def secondsAgo(): Double = js.native
  
  def secondsFromNow(): Double = js.native
  
  def secondsSince(d: java.lang.String): Double = js.native
  def secondsSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def secondsSince(d: Double): Double = js.native
  def secondsSince(d: Double, options: DateCreateOptions): Double = js.native
  def secondsSince(d: Date): Double = js.native
  def secondsSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def secondsUntil(): Double = js.native
  def secondsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def secondsUntil(d: java.lang.String): Double = js.native
  def secondsUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def secondsUntil(d: Double): Double = js.native
  def secondsUntil(d: Double, options: DateCreateOptions): Double = js.native
  def secondsUntil(d: Date): Double = js.native
  def secondsUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def set(milliseconds: Double): Date = js.native
  def set(set: js.Object): Date = js.native
  def set(set: js.Object, reset: Boolean): Date = js.native
  def set(year: Double, month: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double
  ): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: js.UndefOr[scala.Nothing], hour: Double, minute: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: js.UndefOr[scala.Nothing],
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: Double, hour: js.UndefOr[scala.Nothing], minute: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: Double,
    hour: js.UndefOr[scala.Nothing],
    minute: Double,
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def set(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: js.UndefOr[scala.Nothing],
    second: Double
  ): Date = js.native
  def set(year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def set(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double): Date = js.native
  
  def setISOWeek(num: Double): Unit = js.native
  
  def setUTC(): Date = js.native
  def setUTC(on: Boolean): Date = js.native
  
  def setWeekday(dow: Double): Unit = js.native
  
  def short(): java.lang.String = js.native
  def short(localeCode: java.lang.String): java.lang.String = js.native
  
  def weeksAgo(): Double = js.native
  
  def weeksFromNow(): Double = js.native
  
  def weeksSince(d: java.lang.String): Double = js.native
  def weeksSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def weeksSince(d: Double): Double = js.native
  def weeksSince(d: Double, options: DateCreateOptions): Double = js.native
  def weeksSince(d: Date): Double = js.native
  def weeksSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def weeksUntil(): Double = js.native
  def weeksUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def weeksUntil(d: java.lang.String): Double = js.native
  def weeksUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def weeksUntil(d: Double): Double = js.native
  def weeksUntil(d: Double, options: DateCreateOptions): Double = js.native
  def weeksUntil(d: Date): Double = js.native
  def weeksUntil(d: Date, options: DateCreateOptions): Double = js.native
  
  def yearsAgo(): Double = js.native
  
  def yearsFromNow(): Double = js.native
  
  def yearsSince(d: java.lang.String): Double = js.native
  def yearsSince(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def yearsSince(d: Double): Double = js.native
  def yearsSince(d: Double, options: DateCreateOptions): Double = js.native
  def yearsSince(d: Date): Double = js.native
  def yearsSince(d: Date, options: DateCreateOptions): Double = js.native
  
  def yearsUntil(): Double = js.native
  def yearsUntil(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def yearsUntil(d: java.lang.String): Double = js.native
  def yearsUntil(d: java.lang.String, options: DateCreateOptions): Double = js.native
  def yearsUntil(d: Double): Double = js.native
  def yearsUntil(d: Double, options: DateCreateOptions): Double = js.native
  def yearsUntil(d: Date): Double = js.native
  def yearsUntil(d: Date, options: DateCreateOptions): Double = js.native
}
