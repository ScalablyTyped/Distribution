package typings.sugar.sugarjsNs.DateNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Date
import typings.sugar.sugarjsNs.Locale
import typings.sugar.sugarjsNs.Range
import typings.sugar.sugarjsNs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[Date]]
     with Instantiable2[
      (/* d */ Date) | (/* d */ Double) | (/* d */ String), 
      /* options */ DateCreateOptions, 
      Chainable[Date]
    ]
     with Instantiable1[(/* d */ Date) | (/* d */ Double) | (/* d */ String), Chainable[Date]] {
  def apply(): Chainable[Date] = js.native
  def apply(d: String): Chainable[Date] = js.native
  def apply(d: String, options: DateCreateOptions): Chainable[Date] = js.native
  def apply(d: Double): Chainable[Date] = js.native
  def apply(d: Double, options: DateCreateOptions): Chainable[Date] = js.native
  def apply(d: Date): Chainable[Date] = js.native
  def apply(d: Date, options: DateCreateOptions): Chainable[Date] = js.native
  def addDays(instance: Date, n: Double): Date = js.native
  def addDays(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addHours(instance: Date, n: Double): Date = js.native
  def addHours(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addLocale(localeCode: String, `def`: js.Object): Locale = js.native
  def addMilliseconds(instance: Date, n: Double): Date = js.native
  def addMilliseconds(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addMinutes(instance: Date, n: Double): Date = js.native
  def addMinutes(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addMonths(instance: Date, n: Double): Date = js.native
  def addMonths(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addSeconds(instance: Date, n: Double): Date = js.native
  def addSeconds(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addWeeks(instance: Date, n: Double): Date = js.native
  def addWeeks(instance: Date, n: Double, reset: Boolean): Date = js.native
  def addYears(instance: Date, n: Double): Date = js.native
  def addYears(instance: Date, n: Double, reset: Boolean): Date = js.native
  def advance(instance: Date, milliseconds: Double): Date = js.native
  def advance(instance: Date, set: String): Date = js.native
  def advance(instance: Date, set: String, reset: Boolean): Date = js.native
  def advance(instance: Date, set: js.Object): Date = js.native
  def advance(instance: Date, set: js.Object, reset: Boolean): Date = js.native
  def advance(instance: Date, year: Double, month: Double): Date = js.native
  def advance(instance: Date, year: Double, month: Double, day: Double): Date = js.native
  def advance(instance: Date, year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def advance(instance: Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def advance(
    instance: Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def beginningOfDay(instance: Date): Date = js.native
  def beginningOfDay(instance: Date, localeCode: String): Date = js.native
  def beginningOfISOWeek(instance: Date): Date = js.native
  def beginningOfMonth(instance: Date): Date = js.native
  def beginningOfMonth(instance: Date, localeCode: String): Date = js.native
  def beginningOfWeek(instance: Date): Date = js.native
  def beginningOfWeek(instance: Date, localeCode: String): Date = js.native
  def beginningOfYear(instance: Date): Date = js.native
  def beginningOfYear(instance: Date, localeCode: String): Date = js.native
  def clone(instance: Date): Date = js.native
  def create(): Date = js.native
  def create(d: String): Date = js.native
  def create(d: String, options: DateCreateOptions): Date = js.native
  def create(d: Double): Date = js.native
  def create(d: Double, options: DateCreateOptions): Date = js.native
  def create(d: Date): Date = js.native
  def create(d: Date, options: DateCreateOptions): Date = js.native
  def daysAgo(instance: Date): Double = js.native
  def daysFromNow(instance: Date): Double = js.native
  def daysInMonth(instance: Date): Double = js.native
  def daysSince(instance: Date, d: String): Double = js.native
  def daysSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def daysSince(instance: Date, d: Double): Double = js.native
  def daysSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysSince(instance: Date, d: Date): Double = js.native
  def daysSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: Date): Double = js.native
  def daysUntil(instance: Date, d: String): Double = js.native
  def daysUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: Date, d: Double): Double = js.native
  def daysUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: Date, d: Date): Double = js.native
  def daysUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def endOfDay(instance: Date): Date = js.native
  def endOfDay(instance: Date, localeCode: String): Date = js.native
  def endOfISOWeek(instance: Date): Date = js.native
  def endOfMonth(instance: Date): Date = js.native
  def endOfMonth(instance: Date, localeCode: String): Date = js.native
  def endOfWeek(instance: Date): Date = js.native
  def endOfWeek(instance: Date, localeCode: String): Date = js.native
  def endOfYear(instance: Date): Date = js.native
  def endOfYear(instance: Date, localeCode: String): Date = js.native
  def format(instance: Date): String = js.native
  def format(instance: Date, f: String): String = js.native
  def format(instance: Date, f: String, localeCode: String): String = js.native
  def full(instance: Date): String = js.native
  def full(instance: Date, localeCode: String): String = js.native
  def get(instance: Date, d: String): Date = js.native
  def get(instance: Date, d: String, options: DateCreateOptions): Date = js.native
  def get(instance: Date, d: Double): Date = js.native
  def get(instance: Date, d: Double, options: DateCreateOptions): Date = js.native
  def get(instance: Date, d: Date): Date = js.native
  def get(instance: Date, d: Date, options: DateCreateOptions): Date = js.native
  def getAllLocaleCodes(): js.Array[String] = js.native
  def getAllLocales(): js.Array[Locale] = js.native
  def getISOWeek(instance: Date): Double = js.native
  def getLocale(): Locale = js.native
  def getLocale(localeCode: String): Locale = js.native
  def getOption[T](name: String): T = js.native
  def getUTCOffset(instance: Date): String = js.native
  def getUTCOffset(instance: Date, iso: Boolean): String = js.native
  def getUTCWeekday(instance: Date): Double = js.native
  def getWeekday(instance: Date): Double = js.native
  def hoursAgo(instance: Date): Double = js.native
  def hoursFromNow(instance: Date): Double = js.native
  def hoursSince(instance: Date, d: String): Double = js.native
  def hoursSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: Date, d: Double): Double = js.native
  def hoursSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: Date, d: Date): Double = js.native
  def hoursSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: Date): Double = js.native
  def hoursUntil(instance: Date, d: String): Double = js.native
  def hoursUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: Date, d: Double): Double = js.native
  def hoursUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: Date, d: Date): Double = js.native
  def hoursUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def is(instance: Date, d: String): Boolean = js.native
  def is(instance: Date, d: String, margin: Double): Boolean = js.native
  def is(instance: Date, d: Double): Boolean = js.native
  def is(instance: Date, d: Double, margin: Double): Boolean = js.native
  def is(instance: Date, d: Date): Boolean = js.native
  def is(instance: Date, d: Date, margin: Double): Boolean = js.native
  def isAfter(instance: Date, d: String): Boolean = js.native
  def isAfter(instance: Date, d: String, margin: Double): Boolean = js.native
  def isAfter(instance: Date, d: Double): Boolean = js.native
  def isAfter(instance: Date, d: Double, margin: Double): Boolean = js.native
  def isAfter(instance: Date, d: Date): Boolean = js.native
  def isAfter(instance: Date, d: Date, margin: Double): Boolean = js.native
  def isBefore(instance: Date, d: String): Boolean = js.native
  def isBefore(instance: Date, d: String, margin: Double): Boolean = js.native
  def isBefore(instance: Date, d: Double): Boolean = js.native
  def isBefore(instance: Date, d: Double, margin: Double): Boolean = js.native
  def isBefore(instance: Date, d: Date): Boolean = js.native
  def isBefore(instance: Date, d: Date, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: String): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: Double): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: Date): Boolean = js.native
  def isBetween(instance: Date, d1: String, d2: Date, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: String): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: Date): Boolean = js.native
  def isBetween(instance: Date, d1: Double, d2: Date, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: String): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: Date): Boolean = js.native
  def isBetween(instance: Date, d1: Date, d2: Date, margin: Double): Boolean = js.native
  def isFriday(instance: Date): Boolean = js.native
  def isFuture(instance: Date): Boolean = js.native
  def isLastMonth(instance: Date): Boolean = js.native
  def isLastMonth(instance: Date, localeCode: String): Boolean = js.native
  def isLastWeek(instance: Date): Boolean = js.native
  def isLastWeek(instance: Date, localeCode: String): Boolean = js.native
  def isLastYear(instance: Date): Boolean = js.native
  def isLastYear(instance: Date, localeCode: String): Boolean = js.native
  def isLeapYear(instance: Date): Boolean = js.native
  def isMonday(instance: Date): Boolean = js.native
  def isNextMonth(instance: Date): Boolean = js.native
  def isNextMonth(instance: Date, localeCode: String): Boolean = js.native
  def isNextWeek(instance: Date): Boolean = js.native
  def isNextWeek(instance: Date, localeCode: String): Boolean = js.native
  def isNextYear(instance: Date): Boolean = js.native
  def isNextYear(instance: Date, localeCode: String): Boolean = js.native
  def isPast(instance: Date): Boolean = js.native
  def isSaturday(instance: Date): Boolean = js.native
  def isSunday(instance: Date): Boolean = js.native
  def isThisMonth(instance: Date): Boolean = js.native
  def isThisMonth(instance: Date, localeCode: String): Boolean = js.native
  def isThisWeek(instance: Date): Boolean = js.native
  def isThisWeek(instance: Date, localeCode: String): Boolean = js.native
  def isThisYear(instance: Date): Boolean = js.native
  def isThisYear(instance: Date, localeCode: String): Boolean = js.native
  def isThursday(instance: Date): Boolean = js.native
  def isToday(instance: Date): Boolean = js.native
  def isTomorrow(instance: Date): Boolean = js.native
  def isTuesday(instance: Date): Boolean = js.native
  def isUTC(instance: Date): Boolean = js.native
  def isValid(instance: Date): Boolean = js.native
  def isWednesday(instance: Date): Boolean = js.native
  def isWeekday(instance: Date): Boolean = js.native
  def isWeekend(instance: Date): Boolean = js.native
  def isYesterday(instance: Date): Boolean = js.native
  def iso(instance: Date): String = js.native
  def long(instance: Date): String = js.native
  def long(instance: Date, localeCode: String): String = js.native
  def medium(instance: Date): String = js.native
  def medium(instance: Date, localeCode: String): String = js.native
  def millisecondsAgo(instance: Date): Double = js.native
  def millisecondsFromNow(instance: Date): Double = js.native
  def millisecondsSince(instance: Date, d: String): Double = js.native
  def millisecondsSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: Date, d: Double): Double = js.native
  def millisecondsSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: Date, d: Date): Double = js.native
  def millisecondsSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: Date): Double = js.native
  def millisecondsUntil(instance: Date, d: String): Double = js.native
  def millisecondsUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: Date, d: Double): Double = js.native
  def millisecondsUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: Date, d: Date): Double = js.native
  def millisecondsUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def minutesAgo(instance: Date): Double = js.native
  def minutesFromNow(instance: Date): Double = js.native
  def minutesSince(instance: Date, d: String): Double = js.native
  def minutesSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: Date, d: Double): Double = js.native
  def minutesSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: Date, d: Date): Double = js.native
  def minutesSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: Date): Double = js.native
  def minutesUntil(instance: Date, d: String): Double = js.native
  def minutesUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: Date, d: Double): Double = js.native
  def minutesUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: Date, d: Date): Double = js.native
  def minutesUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def monthsAgo(instance: Date): Double = js.native
  def monthsFromNow(instance: Date): Double = js.native
  def monthsSince(instance: Date, d: String): Double = js.native
  def monthsSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: Date, d: Double): Double = js.native
  def monthsSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: Date, d: Date): Double = js.native
  def monthsSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: Date): Double = js.native
  def monthsUntil(instance: Date, d: String): Double = js.native
  def monthsUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: Date, d: Double): Double = js.native
  def monthsUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: Date, d: Date): Double = js.native
  def monthsUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def range(): Range = js.native
  def range(start: String): Range = js.native
  def range(start: String, end: String): Range = js.native
  def range(start: String, end: Date): Range = js.native
  def range(start: Date): Range = js.native
  def range(start: Date, end: String): Range = js.native
  def range(start: Date, end: Date): Range = js.native
  def relative(instance: Date): String = js.native
  def relative(instance: Date, localeCode: String): String = js.native
  def relative(
    instance: Date,
    localeCode: String,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, String]
  ): String = js.native
  def relative(
    instance: Date,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, String]
  ): String = js.native
  def relativeTo(instance: Date, d: String): String = js.native
  def relativeTo(instance: Date, d: String, localeCode: String): String = js.native
  def relativeTo(instance: Date, d: Double): String = js.native
  def relativeTo(instance: Date, d: Double, localeCode: String): String = js.native
  def relativeTo(instance: Date, d: Date): String = js.native
  def relativeTo(instance: Date, d: Date, localeCode: String): String = js.native
  def removeLocale(localeCode: String): Locale = js.native
  def reset(instance: Date): Date = js.native
  def reset(instance: Date, unit: String): Date = js.native
  def reset(instance: Date, unit: String, localeCode: String): Date = js.native
  def rewind(instance: Date, milliseconds: Double): Date = js.native
  def rewind(instance: Date, set: String): Date = js.native
  def rewind(instance: Date, set: String, reset: Boolean): Date = js.native
  def rewind(instance: Date, set: js.Object): Date = js.native
  def rewind(instance: Date, set: js.Object, reset: Boolean): Date = js.native
  def rewind(instance: Date, year: Double, month: Double): Date = js.native
  def rewind(instance: Date, year: Double, month: Double, day: Double): Date = js.native
  def rewind(instance: Date, year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def rewind(instance: Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def rewind(
    instance: Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def secondsAgo(instance: Date): Double = js.native
  def secondsFromNow(instance: Date): Double = js.native
  def secondsSince(instance: Date, d: String): Double = js.native
  def secondsSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: Date, d: Double): Double = js.native
  def secondsSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: Date, d: Date): Double = js.native
  def secondsSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: Date): Double = js.native
  def secondsUntil(instance: Date, d: String): Double = js.native
  def secondsUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: Date, d: Double): Double = js.native
  def secondsUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: Date, d: Date): Double = js.native
  def secondsUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def set(instance: Date, milliseconds: Double): Date = js.native
  def set(instance: Date, set: js.Object): Date = js.native
  def set(instance: Date, set: js.Object, reset: Boolean): Date = js.native
  def set(instance: Date, year: Double, month: Double): Date = js.native
  def set(instance: Date, year: Double, month: Double, day: Double): Date = js.native
  def set(instance: Date, year: Double, month: Double, day: Double, hour: Double): Date = js.native
  def set(instance: Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): Date = js.native
  def set(
    instance: Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): Date = js.native
  def setISOWeek(instance: Date, num: Double): Unit = js.native
  def setLocale(localeCode: String): Locale = js.native
  def setOption(name: String, value: js.Any): Unit = js.native
  def setOption(options: DateOptions): Unit = js.native
  def setUTC(instance: Date): Date = js.native
  def setUTC(instance: Date, on: Boolean): Date = js.native
  def setWeekday(instance: Date, dow: Double): Unit = js.native
  def short(instance: Date): String = js.native
  def short(instance: Date, localeCode: String): String = js.native
  def weeksAgo(instance: Date): Double = js.native
  def weeksFromNow(instance: Date): Double = js.native
  def weeksSince(instance: Date, d: String): Double = js.native
  def weeksSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: Date, d: Double): Double = js.native
  def weeksSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: Date, d: Date): Double = js.native
  def weeksSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: Date): Double = js.native
  def weeksUntil(instance: Date, d: String): Double = js.native
  def weeksUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: Date, d: Double): Double = js.native
  def weeksUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: Date, d: Date): Double = js.native
  def weeksUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def yearsAgo(instance: Date): Double = js.native
  def yearsFromNow(instance: Date): Double = js.native
  def yearsSince(instance: Date, d: String): Double = js.native
  def yearsSince(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: Date, d: Double): Double = js.native
  def yearsSince(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: Date, d: Date): Double = js.native
  def yearsSince(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: Date): Double = js.native
  def yearsUntil(instance: Date, d: String): Double = js.native
  def yearsUntil(instance: Date, d: String, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: Date, d: Double): Double = js.native
  def yearsUntil(instance: Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: Date, d: Date): Double = js.native
  def yearsUntil(instance: Date, d: Date, options: DateCreateOptions): Double = js.native
}

