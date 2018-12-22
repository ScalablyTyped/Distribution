package typings
package sugarLib.sugarjsNs.DateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with org.scalablytyped.runtime.Instantiable0[Chainable[stdLib.Date]]
     with org.scalablytyped.runtime.Instantiable2[
      (/* d */ stdLib.Date) | (/* d */ scala.Double) | (/* d */ java.lang.String), 
      /* options */ DateCreateOptions, 
      Chainable[stdLib.Date]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* d */ stdLib.Date) | (/* d */ scala.Double) | (/* d */ java.lang.String), 
      Chainable[stdLib.Date]
    ] {
  def apply(): Chainable[stdLib.Date] = js.native
  def apply(d: java.lang.String): Chainable[stdLib.Date] = js.native
  def apply(d: java.lang.String, options: DateCreateOptions): Chainable[stdLib.Date] = js.native
  def apply(d: scala.Double): Chainable[stdLib.Date] = js.native
  def apply(d: scala.Double, options: DateCreateOptions): Chainable[stdLib.Date] = js.native
  def apply(d: stdLib.Date): Chainable[stdLib.Date] = js.native
  def apply(d: stdLib.Date, options: DateCreateOptions): Chainable[stdLib.Date] = js.native
  def addDays(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addDays(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addHours(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addHours(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addLocale(localeCode: java.lang.String, `def`: js.Object): sugarLib.sugarjsNs.Locale = js.native
  def addMilliseconds(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addMilliseconds(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addMinutes(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addMinutes(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addMonths(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addMonths(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addSeconds(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addSeconds(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addWeeks(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addWeeks(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def addYears(instance: stdLib.Date, n: scala.Double): stdLib.Date = js.native
  def addYears(instance: stdLib.Date, n: scala.Double, reset: scala.Boolean): stdLib.Date = js.native
  def advance(instance: stdLib.Date, milliseconds: scala.Double): stdLib.Date = js.native
  def advance(instance: stdLib.Date, set: java.lang.String): stdLib.Date = js.native
  def advance(instance: stdLib.Date, set: java.lang.String, reset: scala.Boolean): stdLib.Date = js.native
  def advance(instance: stdLib.Date, set: js.Object): stdLib.Date = js.native
  def advance(instance: stdLib.Date, set: js.Object, reset: scala.Boolean): stdLib.Date = js.native
  def advance(instance: stdLib.Date, year: scala.Double, month: scala.Double): stdLib.Date = js.native
  def advance(instance: stdLib.Date, year: scala.Double, month: scala.Double, day: scala.Double): stdLib.Date = js.native
  def advance(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double
  ): stdLib.Date = js.native
  def advance(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): stdLib.Date = js.native
  def advance(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): stdLib.Date = js.native
  def beginningOfDay(instance: stdLib.Date): stdLib.Date = js.native
  def beginningOfDay(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def beginningOfISOWeek(instance: stdLib.Date): stdLib.Date = js.native
  def beginningOfMonth(instance: stdLib.Date): stdLib.Date = js.native
  def beginningOfMonth(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def beginningOfWeek(instance: stdLib.Date): stdLib.Date = js.native
  def beginningOfWeek(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def beginningOfYear(instance: stdLib.Date): stdLib.Date = js.native
  def beginningOfYear(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def clone(instance: stdLib.Date): stdLib.Date = js.native
  def create(): stdLib.Date = js.native
  def create(d: java.lang.String): stdLib.Date = js.native
  def create(d: java.lang.String, options: DateCreateOptions): stdLib.Date = js.native
  def create(d: scala.Double): stdLib.Date = js.native
  def create(d: scala.Double, options: DateCreateOptions): stdLib.Date = js.native
  def create(d: stdLib.Date): stdLib.Date = js.native
  def create(d: stdLib.Date, options: DateCreateOptions): stdLib.Date = js.native
  def daysAgo(instance: stdLib.Date): scala.Double = js.native
  def daysFromNow(instance: stdLib.Date): scala.Double = js.native
  def daysInMonth(instance: stdLib.Date): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def daysSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def daysUntil(instance: stdLib.Date): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def daysUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def endOfDay(instance: stdLib.Date): stdLib.Date = js.native
  def endOfDay(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def endOfISOWeek(instance: stdLib.Date): stdLib.Date = js.native
  def endOfMonth(instance: stdLib.Date): stdLib.Date = js.native
  def endOfMonth(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def endOfWeek(instance: stdLib.Date): stdLib.Date = js.native
  def endOfWeek(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def endOfYear(instance: stdLib.Date): stdLib.Date = js.native
  def endOfYear(instance: stdLib.Date, localeCode: java.lang.String): stdLib.Date = js.native
  def format(instance: stdLib.Date): java.lang.String = js.native
  def format(instance: stdLib.Date, f: java.lang.String): java.lang.String = js.native
  def format(instance: stdLib.Date, f: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  def full(instance: stdLib.Date): java.lang.String = js.native
  def full(instance: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def get(instance: stdLib.Date, d: java.lang.String): stdLib.Date = js.native
  def get(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): stdLib.Date = js.native
  def get(instance: stdLib.Date, d: scala.Double): stdLib.Date = js.native
  def get(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): stdLib.Date = js.native
  def get(instance: stdLib.Date, d: stdLib.Date): stdLib.Date = js.native
  def get(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): stdLib.Date = js.native
  def getAllLocaleCodes(): js.Array[java.lang.String] = js.native
  def getAllLocales(): js.Array[sugarLib.sugarjsNs.Locale] = js.native
  def getISOWeek(instance: stdLib.Date): scala.Double = js.native
  def getLocale(): sugarLib.sugarjsNs.Locale = js.native
  def getLocale(localeCode: java.lang.String): sugarLib.sugarjsNs.Locale = js.native
  def getOption[T](name: java.lang.String): T = js.native
  def getUTCOffset(instance: stdLib.Date): java.lang.String = js.native
  def getUTCOffset(instance: stdLib.Date, iso: scala.Boolean): java.lang.String = js.native
  def getUTCWeekday(instance: stdLib.Date): scala.Double = js.native
  def getWeekday(instance: stdLib.Date): scala.Double = js.native
  def hoursAgo(instance: stdLib.Date): scala.Double = js.native
  def hoursFromNow(instance: stdLib.Date): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def hoursSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def hoursUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def is(instance: stdLib.Date, d: java.lang.String): scala.Boolean = js.native
  def is(instance: stdLib.Date, d: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def is(instance: stdLib.Date, d: scala.Double): scala.Boolean = js.native
  def is(instance: stdLib.Date, d: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def is(instance: stdLib.Date, d: stdLib.Date): scala.Boolean = js.native
  def is(instance: stdLib.Date, d: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: java.lang.String): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: scala.Double): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: stdLib.Date): scala.Boolean = js.native
  def isAfter(instance: stdLib.Date, d: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: java.lang.String): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: scala.Double): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: stdLib.Date): scala.Boolean = js.native
  def isBefore(instance: stdLib.Date, d: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: java.lang.String): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: stdLib.Date): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: java.lang.String, d2: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: java.lang.String): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: stdLib.Date): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: scala.Double, d2: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: java.lang.String): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: java.lang.String, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: scala.Double, margin: scala.Double): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: stdLib.Date): scala.Boolean = js.native
  def isBetween(instance: stdLib.Date, d1: stdLib.Date, d2: stdLib.Date, margin: scala.Double): scala.Boolean = js.native
  def isFriday(instance: stdLib.Date): scala.Boolean = js.native
  def isFuture(instance: stdLib.Date): scala.Boolean = js.native
  def isLastMonth(instance: stdLib.Date): scala.Boolean = js.native
  def isLastMonth(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isLastWeek(instance: stdLib.Date): scala.Boolean = js.native
  def isLastWeek(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isLastYear(instance: stdLib.Date): scala.Boolean = js.native
  def isLastYear(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isLeapYear(instance: stdLib.Date): scala.Boolean = js.native
  def isMonday(instance: stdLib.Date): scala.Boolean = js.native
  def isNextMonth(instance: stdLib.Date): scala.Boolean = js.native
  def isNextMonth(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isNextWeek(instance: stdLib.Date): scala.Boolean = js.native
  def isNextWeek(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isNextYear(instance: stdLib.Date): scala.Boolean = js.native
  def isNextYear(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isPast(instance: stdLib.Date): scala.Boolean = js.native
  def isSaturday(instance: stdLib.Date): scala.Boolean = js.native
  def isSunday(instance: stdLib.Date): scala.Boolean = js.native
  def isThisMonth(instance: stdLib.Date): scala.Boolean = js.native
  def isThisMonth(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isThisWeek(instance: stdLib.Date): scala.Boolean = js.native
  def isThisWeek(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isThisYear(instance: stdLib.Date): scala.Boolean = js.native
  def isThisYear(instance: stdLib.Date, localeCode: java.lang.String): scala.Boolean = js.native
  def isThursday(instance: stdLib.Date): scala.Boolean = js.native
  def isToday(instance: stdLib.Date): scala.Boolean = js.native
  def isTomorrow(instance: stdLib.Date): scala.Boolean = js.native
  def isTuesday(instance: stdLib.Date): scala.Boolean = js.native
  def isUTC(instance: stdLib.Date): scala.Boolean = js.native
  def isValid(instance: stdLib.Date): scala.Boolean = js.native
  def isWednesday(instance: stdLib.Date): scala.Boolean = js.native
  def isWeekday(instance: stdLib.Date): scala.Boolean = js.native
  def isWeekend(instance: stdLib.Date): scala.Boolean = js.native
  def isYesterday(instance: stdLib.Date): scala.Boolean = js.native
  def iso(instance: stdLib.Date): java.lang.String = js.native
  def long(instance: stdLib.Date): java.lang.String = js.native
  def long(instance: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def medium(instance: stdLib.Date): java.lang.String = js.native
  def medium(instance: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def millisecondsAgo(instance: stdLib.Date): scala.Double = js.native
  def millisecondsFromNow(instance: stdLib.Date): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def millisecondsSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def millisecondsUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def minutesAgo(instance: stdLib.Date): scala.Double = js.native
  def minutesFromNow(instance: stdLib.Date): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def minutesSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def minutesUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def monthsAgo(instance: stdLib.Date): scala.Double = js.native
  def monthsFromNow(instance: stdLib.Date): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def monthsSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def monthsUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def range(): sugarLib.sugarjsNs.Range = js.native
  def range(start: java.lang.String): sugarLib.sugarjsNs.Range = js.native
  def range(start: java.lang.String, end: java.lang.String): sugarLib.sugarjsNs.Range = js.native
  def range(start: java.lang.String, end: stdLib.Date): sugarLib.sugarjsNs.Range = js.native
  def range(start: stdLib.Date): sugarLib.sugarjsNs.Range = js.native
  def range(start: stdLib.Date, end: java.lang.String): sugarLib.sugarjsNs.Range = js.native
  def range(start: stdLib.Date, end: stdLib.Date): sugarLib.sugarjsNs.Range = js.native
  def relative(instance: stdLib.Date): java.lang.String = js.native
  def relative(instance: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def relative(
    instance: stdLib.Date,
    localeCode: java.lang.String,
    relativeFn: js.Function4[
      /* num */ scala.Double, 
      /* unit */ scala.Double, 
      /* ms */ scala.Double, 
      /* loc */ sugarLib.sugarjsNs.Locale, 
      java.lang.String
    ]
  ): java.lang.String = js.native
  def relative(
    instance: stdLib.Date,
    relativeFn: js.Function4[
      /* num */ scala.Double, 
      /* unit */ scala.Double, 
      /* ms */ scala.Double, 
      /* loc */ sugarLib.sugarjsNs.Locale, 
      java.lang.String
    ]
  ): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: java.lang.String, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: scala.Double): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: scala.Double, localeCode: java.lang.String): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: stdLib.Date): java.lang.String = js.native
  def relativeTo(instance: stdLib.Date, d: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def removeLocale(localeCode: java.lang.String): sugarLib.sugarjsNs.Locale = js.native
  def reset(instance: stdLib.Date): stdLib.Date = js.native
  def reset(instance: stdLib.Date, unit: java.lang.String): stdLib.Date = js.native
  def reset(instance: stdLib.Date, unit: java.lang.String, localeCode: java.lang.String): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, milliseconds: scala.Double): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, set: java.lang.String): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, set: java.lang.String, reset: scala.Boolean): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, set: js.Object): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, set: js.Object, reset: scala.Boolean): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, year: scala.Double, month: scala.Double): stdLib.Date = js.native
  def rewind(instance: stdLib.Date, year: scala.Double, month: scala.Double, day: scala.Double): stdLib.Date = js.native
  def rewind(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double
  ): stdLib.Date = js.native
  def rewind(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): stdLib.Date = js.native
  def rewind(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): stdLib.Date = js.native
  def secondsAgo(instance: stdLib.Date): scala.Double = js.native
  def secondsFromNow(instance: stdLib.Date): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def secondsSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def secondsUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def set(instance: stdLib.Date, milliseconds: scala.Double): stdLib.Date = js.native
  def set(instance: stdLib.Date, set: js.Object): stdLib.Date = js.native
  def set(instance: stdLib.Date, set: js.Object, reset: scala.Boolean): stdLib.Date = js.native
  def set(instance: stdLib.Date, year: scala.Double, month: scala.Double): stdLib.Date = js.native
  def set(instance: stdLib.Date, year: scala.Double, month: scala.Double, day: scala.Double): stdLib.Date = js.native
  def set(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double
  ): stdLib.Date = js.native
  def set(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): stdLib.Date = js.native
  def set(
    instance: stdLib.Date,
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): stdLib.Date = js.native
  def setISOWeek(instance: stdLib.Date, num: scala.Double): scala.Unit = js.native
  def setLocale(localeCode: java.lang.String): sugarLib.sugarjsNs.Locale = js.native
  def setOption(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOption(options: DateOptions): scala.Unit = js.native
  def setUTC(instance: stdLib.Date): stdLib.Date = js.native
  def setUTC(instance: stdLib.Date, on: scala.Boolean): stdLib.Date = js.native
  def setWeekday(instance: stdLib.Date, dow: scala.Double): scala.Unit = js.native
  def short(instance: stdLib.Date): java.lang.String = js.native
  def short(instance: stdLib.Date, localeCode: java.lang.String): java.lang.String = js.native
  def weeksAgo(instance: stdLib.Date): scala.Double = js.native
  def weeksFromNow(instance: stdLib.Date): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def weeksSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def weeksUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def yearsAgo(instance: stdLib.Date): scala.Double = js.native
  def yearsFromNow(instance: stdLib.Date): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def yearsSince(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: java.lang.String): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: java.lang.String, options: DateCreateOptions): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: scala.Double): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: scala.Double, options: DateCreateOptions): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: stdLib.Date): scala.Double = js.native
  def yearsUntil(instance: stdLib.Date, d: stdLib.Date, options: DateCreateOptions): scala.Double = js.native
}

