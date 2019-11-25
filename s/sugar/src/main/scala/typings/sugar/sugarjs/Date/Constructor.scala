package typings.sugar.sugarjs.Date

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.sugar.sugarjs.Locale
import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[typings.std.Date]]
     with Instantiable2[
      (/* d */ typings.std.Date) | (/* d */ Double) | (/* d */ java.lang.String), 
      /* options */ DateCreateOptions, 
      Chainable[typings.std.Date]
    ]
     with Instantiable1[
      (/* d */ typings.std.Date) | (/* d */ Double) | (/* d */ java.lang.String), 
      Chainable[typings.std.Date]
    ] {
  def apply(): Chainable[typings.std.Date] = js.native
  def apply(d: java.lang.String): Chainable[typings.std.Date] = js.native
  def apply(d: java.lang.String, options: DateCreateOptions): Chainable[typings.std.Date] = js.native
  def apply(d: Double): Chainable[typings.std.Date] = js.native
  def apply(d: Double, options: DateCreateOptions): Chainable[typings.std.Date] = js.native
  def apply(d: typings.std.Date): Chainable[typings.std.Date] = js.native
  def apply(d: typings.std.Date, options: DateCreateOptions): Chainable[typings.std.Date] = js.native
  def addDays(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addDays(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addHours(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addHours(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addLocale(localeCode: java.lang.String, `def`: js.Object): Locale = js.native
  def addMilliseconds(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addMilliseconds(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addMinutes(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addMinutes(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addMonths(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addMonths(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addSeconds(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addSeconds(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addWeeks(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addWeeks(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def addYears(instance: typings.std.Date, n: Double): typings.std.Date = js.native
  def addYears(instance: typings.std.Date, n: Double, reset: Boolean): typings.std.Date = js.native
  def advance(instance: typings.std.Date, milliseconds: Double): typings.std.Date = js.native
  def advance(instance: typings.std.Date, set: java.lang.String): typings.std.Date = js.native
  def advance(instance: typings.std.Date, set: java.lang.String, reset: Boolean): typings.std.Date = js.native
  def advance(instance: typings.std.Date, set: js.Object): typings.std.Date = js.native
  def advance(instance: typings.std.Date, set: js.Object, reset: Boolean): typings.std.Date = js.native
  def advance(instance: typings.std.Date, year: Double, month: Double): typings.std.Date = js.native
  def advance(instance: typings.std.Date, year: Double, month: Double, day: Double): typings.std.Date = js.native
  def advance(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double): typings.std.Date = js.native
  def advance(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.std.Date = js.native
  def advance(
    instance: typings.std.Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): typings.std.Date = js.native
  def beginningOfDay(instance: typings.std.Date): typings.std.Date = js.native
  def beginningOfDay(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def beginningOfISOWeek(instance: typings.std.Date): typings.std.Date = js.native
  def beginningOfMonth(instance: typings.std.Date): typings.std.Date = js.native
  def beginningOfMonth(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def beginningOfWeek(instance: typings.std.Date): typings.std.Date = js.native
  def beginningOfWeek(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def beginningOfYear(instance: typings.std.Date): typings.std.Date = js.native
  def beginningOfYear(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def clone(instance: typings.std.Date): typings.std.Date = js.native
  def create(): typings.std.Date = js.native
  def create(d: java.lang.String): typings.std.Date = js.native
  def create(d: java.lang.String, options: DateCreateOptions): typings.std.Date = js.native
  def create(d: Double): typings.std.Date = js.native
  def create(d: Double, options: DateCreateOptions): typings.std.Date = js.native
  def create(d: typings.std.Date): typings.std.Date = js.native
  def create(d: typings.std.Date, options: DateCreateOptions): typings.std.Date = js.native
  def daysAgo(instance: typings.std.Date): Double = js.native
  def daysFromNow(instance: typings.std.Date): Double = js.native
  def daysInMonth(instance: typings.std.Date): Double = js.native
  def daysSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def daysSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def daysSince(instance: typings.std.Date, d: Double): Double = js.native
  def daysSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def daysSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.std.Date): Double = js.native
  def daysUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def daysUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.std.Date, d: Double): Double = js.native
  def daysUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def daysUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def endOfDay(instance: typings.std.Date): typings.std.Date = js.native
  def endOfDay(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def endOfISOWeek(instance: typings.std.Date): typings.std.Date = js.native
  def endOfMonth(instance: typings.std.Date): typings.std.Date = js.native
  def endOfMonth(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def endOfWeek(instance: typings.std.Date): typings.std.Date = js.native
  def endOfWeek(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def endOfYear(instance: typings.std.Date): typings.std.Date = js.native
  def endOfYear(instance: typings.std.Date, localeCode: java.lang.String): typings.std.Date = js.native
  def format(instance: typings.std.Date): java.lang.String = js.native
  def format(instance: typings.std.Date, f: java.lang.String): java.lang.String = js.native
  def format(instance: typings.std.Date, f: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  def full(instance: typings.std.Date): java.lang.String = js.native
  def full(instance: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def get(instance: typings.std.Date, d: java.lang.String): typings.std.Date = js.native
  def get(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): typings.std.Date = js.native
  def get(instance: typings.std.Date, d: Double): typings.std.Date = js.native
  def get(instance: typings.std.Date, d: Double, options: DateCreateOptions): typings.std.Date = js.native
  def get(instance: typings.std.Date, d: typings.std.Date): typings.std.Date = js.native
  def get(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): typings.std.Date = js.native
  def getAllLocaleCodes(): js.Array[java.lang.String] = js.native
  def getAllLocales(): js.Array[Locale] = js.native
  def getISOWeek(instance: typings.std.Date): Double = js.native
  def getLocale(): Locale = js.native
  def getLocale(localeCode: java.lang.String): Locale = js.native
  def getOption[T](name: java.lang.String): T = js.native
  def getUTCOffset(instance: typings.std.Date): java.lang.String = js.native
  def getUTCOffset(instance: typings.std.Date, iso: Boolean): java.lang.String = js.native
  def getUTCWeekday(instance: typings.std.Date): Double = js.native
  def getWeekday(instance: typings.std.Date): Double = js.native
  def hoursAgo(instance: typings.std.Date): Double = js.native
  def hoursFromNow(instance: typings.std.Date): Double = js.native
  def hoursSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def hoursSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: typings.std.Date, d: Double): Double = js.native
  def hoursSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def hoursSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.std.Date): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: Double): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def hoursUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def is(instance: typings.std.Date, d: java.lang.String): Boolean = js.native
  def is(instance: typings.std.Date, d: java.lang.String, margin: Double): Boolean = js.native
  def is(instance: typings.std.Date, d: Double): Boolean = js.native
  def is(instance: typings.std.Date, d: Double, margin: Double): Boolean = js.native
  def is(instance: typings.std.Date, d: typings.std.Date): Boolean = js.native
  def is(instance: typings.std.Date, d: typings.std.Date, margin: Double): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: java.lang.String): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: java.lang.String, margin: Double): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: Double): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: Double, margin: Double): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: typings.std.Date): Boolean = js.native
  def isAfter(instance: typings.std.Date, d: typings.std.Date, margin: Double): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: java.lang.String): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: java.lang.String, margin: Double): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: Double): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: Double, margin: Double): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: typings.std.Date): Boolean = js.native
  def isBefore(instance: typings.std.Date, d: typings.std.Date, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: java.lang.String): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: typings.std.Date): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: java.lang.String, d2: typings.std.Date, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: java.lang.String): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: typings.std.Date): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: Double, d2: typings.std.Date, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: java.lang.String): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: java.lang.String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: typings.std.Date): Boolean = js.native
  def isBetween(instance: typings.std.Date, d1: typings.std.Date, d2: typings.std.Date, margin: Double): Boolean = js.native
  def isFriday(instance: typings.std.Date): Boolean = js.native
  def isFuture(instance: typings.std.Date): Boolean = js.native
  def isLastMonth(instance: typings.std.Date): Boolean = js.native
  def isLastMonth(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isLastWeek(instance: typings.std.Date): Boolean = js.native
  def isLastWeek(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isLastYear(instance: typings.std.Date): Boolean = js.native
  def isLastYear(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isLeapYear(instance: typings.std.Date): Boolean = js.native
  def isMonday(instance: typings.std.Date): Boolean = js.native
  def isNextMonth(instance: typings.std.Date): Boolean = js.native
  def isNextMonth(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isNextWeek(instance: typings.std.Date): Boolean = js.native
  def isNextWeek(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isNextYear(instance: typings.std.Date): Boolean = js.native
  def isNextYear(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isPast(instance: typings.std.Date): Boolean = js.native
  def isSaturday(instance: typings.std.Date): Boolean = js.native
  def isSunday(instance: typings.std.Date): Boolean = js.native
  def isThisMonth(instance: typings.std.Date): Boolean = js.native
  def isThisMonth(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isThisWeek(instance: typings.std.Date): Boolean = js.native
  def isThisWeek(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isThisYear(instance: typings.std.Date): Boolean = js.native
  def isThisYear(instance: typings.std.Date, localeCode: java.lang.String): Boolean = js.native
  def isThursday(instance: typings.std.Date): Boolean = js.native
  def isToday(instance: typings.std.Date): Boolean = js.native
  def isTomorrow(instance: typings.std.Date): Boolean = js.native
  def isTuesday(instance: typings.std.Date): Boolean = js.native
  def isUTC(instance: typings.std.Date): Boolean = js.native
  def isValid(instance: typings.std.Date): Boolean = js.native
  def isWednesday(instance: typings.std.Date): Boolean = js.native
  def isWeekday(instance: typings.std.Date): Boolean = js.native
  def isWeekend(instance: typings.std.Date): Boolean = js.native
  def isYesterday(instance: typings.std.Date): Boolean = js.native
  def iso(instance: typings.std.Date): java.lang.String = js.native
  def long(instance: typings.std.Date): java.lang.String = js.native
  def long(instance: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def medium(instance: typings.std.Date): java.lang.String = js.native
  def medium(instance: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def millisecondsAgo(instance: typings.std.Date): Double = js.native
  def millisecondsFromNow(instance: typings.std.Date): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: Double): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def millisecondsSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.std.Date): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: Double): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def millisecondsUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def minutesAgo(instance: typings.std.Date): Double = js.native
  def minutesFromNow(instance: typings.std.Date): Double = js.native
  def minutesSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def minutesSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: typings.std.Date, d: Double): Double = js.native
  def minutesSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def minutesSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.std.Date): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: Double): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def minutesUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def monthsAgo(instance: typings.std.Date): Double = js.native
  def monthsFromNow(instance: typings.std.Date): Double = js.native
  def monthsSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def monthsSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: typings.std.Date, d: Double): Double = js.native
  def monthsSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def monthsSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.std.Date): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: Double): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def monthsUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def range(): Range = js.native
  def range(start: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: typings.std.Date): Range = js.native
  def range(start: typings.std.Date): Range = js.native
  def range(start: typings.std.Date, end: java.lang.String): Range = js.native
  def range(start: typings.std.Date, end: typings.std.Date): Range = js.native
  def relative(instance: typings.std.Date): java.lang.String = js.native
  def relative(instance: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def relative(
    instance: typings.std.Date,
    localeCode: java.lang.String,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
  ): java.lang.String = js.native
  def relative(
    instance: typings.std.Date,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, java.lang.String]
  ): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: Double): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: Double, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: typings.std.Date): java.lang.String = js.native
  def relativeTo(instance: typings.std.Date, d: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def removeLocale(localeCode: java.lang.String): Locale = js.native
  def reset(instance: typings.std.Date): typings.std.Date = js.native
  def reset(instance: typings.std.Date, unit: java.lang.String): typings.std.Date = js.native
  def reset(instance: typings.std.Date, unit: java.lang.String, localeCode: java.lang.String): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, milliseconds: Double): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, set: java.lang.String): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, set: java.lang.String, reset: Boolean): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, set: js.Object): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, set: js.Object, reset: Boolean): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, year: Double, month: Double): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, year: Double, month: Double, day: Double): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double): typings.std.Date = js.native
  def rewind(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.std.Date = js.native
  def rewind(
    instance: typings.std.Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): typings.std.Date = js.native
  def secondsAgo(instance: typings.std.Date): Double = js.native
  def secondsFromNow(instance: typings.std.Date): Double = js.native
  def secondsSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def secondsSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: typings.std.Date, d: Double): Double = js.native
  def secondsSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def secondsSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: typings.std.Date): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: Double): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def secondsUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def set(instance: typings.std.Date, milliseconds: Double): typings.std.Date = js.native
  def set(instance: typings.std.Date, set: js.Object): typings.std.Date = js.native
  def set(instance: typings.std.Date, set: js.Object, reset: Boolean): typings.std.Date = js.native
  def set(instance: typings.std.Date, year: Double, month: Double): typings.std.Date = js.native
  def set(instance: typings.std.Date, year: Double, month: Double, day: Double): typings.std.Date = js.native
  def set(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double): typings.std.Date = js.native
  def set(instance: typings.std.Date, year: Double, month: Double, day: Double, hour: Double, minute: Double): typings.std.Date = js.native
  def set(
    instance: typings.std.Date,
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): typings.std.Date = js.native
  def setISOWeek(instance: typings.std.Date, num: Double): Unit = js.native
  def setLocale(localeCode: java.lang.String): Locale = js.native
  def setOption(name: java.lang.String, value: js.Any): Unit = js.native
  def setOption(options: DateOptions): Unit = js.native
  def setUTC(instance: typings.std.Date): typings.std.Date = js.native
  def setUTC(instance: typings.std.Date, on: Boolean): typings.std.Date = js.native
  def setWeekday(instance: typings.std.Date, dow: Double): Unit = js.native
  def short(instance: typings.std.Date): java.lang.String = js.native
  def short(instance: typings.std.Date, localeCode: java.lang.String): java.lang.String = js.native
  def weeksAgo(instance: typings.std.Date): Double = js.native
  def weeksFromNow(instance: typings.std.Date): Double = js.native
  def weeksSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def weeksSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: typings.std.Date, d: Double): Double = js.native
  def weeksSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def weeksSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.std.Date): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: Double): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def weeksUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def yearsAgo(instance: typings.std.Date): Double = js.native
  def yearsFromNow(instance: typings.std.Date): Double = js.native
  def yearsSince(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def yearsSince(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: typings.std.Date, d: Double): Double = js.native
  def yearsSince(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def yearsSince(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.std.Date): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: java.lang.String): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: java.lang.String, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: Double): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: typings.std.Date): Double = js.native
  def yearsUntil(instance: typings.std.Date, d: typings.std.Date, options: DateCreateOptions): Double = js.native
}

