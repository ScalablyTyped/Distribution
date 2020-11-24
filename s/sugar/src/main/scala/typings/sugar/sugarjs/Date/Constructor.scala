package typings.sugar.sugarjs.Date

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.sugar.Array
import typings.sugar.sugarjs.Locale
import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[typings.sugar.Date]]
     with Instantiable1[
      (/* d */ typings.sugar.Date) | (/* d */ Double) | (/* d */ String), 
      Chainable[typings.sugar.Date]
    ]
     with Instantiable2[
      js.UndefOr[(/* d */ typings.sugar.Date) | (/* d */ Double) | (/* d */ String)], 
      /* options */ DateCreateOptions, 
      Chainable[typings.sugar.Date]
    ] {
  
  def apply(): Chainable[typings.sugar.Date] = js.native
  def apply(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
  def apply(d: String): Chainable[typings.sugar.Date] = js.native
  def apply(d: String, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
  def apply(d: Double): Chainable[typings.sugar.Date] = js.native
  def apply(d: Double, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
  def apply(d: typings.sugar.Date): Chainable[typings.sugar.Date] = js.native
  def apply(d: typings.sugar.Date, options: DateCreateOptions): Chainable[typings.sugar.Date] = js.native
  
  def addDays(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
  def addDays(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
  
  def addHours(instance: typings.sugar.Date, n: Double): typings.sugar.Date = js.native
  def addHours(instance: typings.sugar.Date, n: Double, reset: Boolean): typings.sugar.Date = js.native
  
  def addLocale(localeCode: String, `def`: js.Object): Locale = js.native
  
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
  def advance(instance: typings.sugar.Date, set: String): typings.sugar.Date = js.native
  def advance(instance: typings.sugar.Date, set: String, reset: Boolean): typings.sugar.Date = js.native
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
  def beginningOfDay(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def beginningOfISOWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
  
  def beginningOfMonth(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def beginningOfMonth(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def beginningOfWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def beginningOfWeek(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def beginningOfYear(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def beginningOfYear(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def clone(instance: typings.sugar.Date): typings.sugar.Date = js.native
  
  def create(): typings.sugar.Date = js.native
  def create(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): typings.sugar.Date = js.native
  def create(d: String): typings.sugar.Date = js.native
  def create(d: String, options: DateCreateOptions): typings.sugar.Date = js.native
  def create(d: Double): typings.sugar.Date = js.native
  def create(d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
  def create(d: typings.sugar.Date): typings.sugar.Date = js.native
  def create(d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
  
  def daysAgo(instance: typings.sugar.Date): Double = js.native
  
  def daysFromNow(instance: typings.sugar.Date): Double = js.native
  
  def daysInMonth(instance: typings.sugar.Date): Double = js.native
  
  def daysSince(instance: typings.sugar.Date, d: String): Double = js.native
  def daysSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def daysSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def daysSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def daysSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def daysUntil(instance: typings.sugar.Date): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def daysUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def endOfDay(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def endOfDay(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def endOfISOWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
  
  def endOfMonth(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def endOfMonth(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def endOfWeek(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def endOfWeek(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def endOfYear(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def endOfYear(instance: typings.sugar.Date, localeCode: String): typings.sugar.Date = js.native
  
  def format(instance: typings.sugar.Date): String = js.native
  def format(instance: typings.sugar.Date, f: js.UndefOr[scala.Nothing], localeCode: String): String = js.native
  def format(instance: typings.sugar.Date, f: String): String = js.native
  def format(instance: typings.sugar.Date, f: String, localeCode: String): String = js.native
  
  def full(instance: typings.sugar.Date): String = js.native
  def full(instance: typings.sugar.Date, localeCode: String): String = js.native
  
  def get(instance: typings.sugar.Date, d: String): typings.sugar.Date = js.native
  def get(instance: typings.sugar.Date, d: String, options: DateCreateOptions): typings.sugar.Date = js.native
  def get(instance: typings.sugar.Date, d: Double): typings.sugar.Date = js.native
  def get(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
  def get(instance: typings.sugar.Date, d: typings.sugar.Date): typings.sugar.Date = js.native
  def get(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
  
  def getAllLocaleCodes(): Array[String] = js.native
  
  def getAllLocales(): Array[Locale] = js.native
  
  def getISOWeek(instance: typings.sugar.Date): Double = js.native
  
  def getLocale(): Locale = js.native
  def getLocale(localeCode: String): Locale = js.native
  
  def getOption[T](name: String): T = js.native
  
  def getUTCOffset(instance: typings.sugar.Date): String = js.native
  def getUTCOffset(instance: typings.sugar.Date, iso: Boolean): String = js.native
  
  def getUTCWeekday(instance: typings.sugar.Date): Double = js.native
  
  def getWeekday(instance: typings.sugar.Date): Double = js.native
  
  def hoursAgo(instance: typings.sugar.Date): Double = js.native
  
  def hoursFromNow(instance: typings.sugar.Date): Double = js.native
  
  def hoursSince(instance: typings.sugar.Date, d: String): Double = js.native
  def hoursSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def hoursSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def hoursSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def hoursUntil(instance: typings.sugar.Date): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def hoursUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def is(instance: typings.sugar.Date, d: String): Boolean = js.native
  def is(instance: typings.sugar.Date, d: String, margin: Double): Boolean = js.native
  def is(instance: typings.sugar.Date, d: Double): Boolean = js.native
  def is(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
  def is(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
  def is(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
  
  def isAfter(instance: typings.sugar.Date, d: String): Boolean = js.native
  def isAfter(instance: typings.sugar.Date, d: String, margin: Double): Boolean = js.native
  def isAfter(instance: typings.sugar.Date, d: Double): Boolean = js.native
  def isAfter(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
  def isAfter(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
  def isAfter(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
  
  def isBefore(instance: typings.sugar.Date, d: String): Boolean = js.native
  def isBefore(instance: typings.sugar.Date, d: String, margin: Double): Boolean = js.native
  def isBefore(instance: typings.sugar.Date, d: Double): Boolean = js.native
  def isBefore(instance: typings.sugar.Date, d: Double, margin: Double): Boolean = js.native
  def isBefore(instance: typings.sugar.Date, d: typings.sugar.Date): Boolean = js.native
  def isBefore(instance: typings.sugar.Date, d: typings.sugar.Date, margin: Double): Boolean = js.native
  
  def isBetween(instance: typings.sugar.Date, d1: String, d2: String): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: String, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: String, d2: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: String, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: String, d2: typings.sugar.Date): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: String, d2: typings.sugar.Date, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: String): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: typings.sugar.Date): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: Double, d2: typings.sugar.Date, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: String): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: String, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: Double, margin: Double): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: typings.sugar.Date): Boolean = js.native
  def isBetween(instance: typings.sugar.Date, d1: typings.sugar.Date, d2: typings.sugar.Date, margin: Double): Boolean = js.native
  
  def isFriday(instance: typings.sugar.Date): Boolean = js.native
  
  def isFuture(instance: typings.sugar.Date): Boolean = js.native
  
  def isLastMonth(instance: typings.sugar.Date): Boolean = js.native
  def isLastMonth(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isLastWeek(instance: typings.sugar.Date): Boolean = js.native
  def isLastWeek(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isLastYear(instance: typings.sugar.Date): Boolean = js.native
  def isLastYear(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isLeapYear(instance: typings.sugar.Date): Boolean = js.native
  
  def isMonday(instance: typings.sugar.Date): Boolean = js.native
  
  def isNextMonth(instance: typings.sugar.Date): Boolean = js.native
  def isNextMonth(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isNextWeek(instance: typings.sugar.Date): Boolean = js.native
  def isNextWeek(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isNextYear(instance: typings.sugar.Date): Boolean = js.native
  def isNextYear(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isPast(instance: typings.sugar.Date): Boolean = js.native
  
  def isSaturday(instance: typings.sugar.Date): Boolean = js.native
  
  def isSunday(instance: typings.sugar.Date): Boolean = js.native
  
  def isThisMonth(instance: typings.sugar.Date): Boolean = js.native
  def isThisMonth(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isThisWeek(instance: typings.sugar.Date): Boolean = js.native
  def isThisWeek(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
  def isThisYear(instance: typings.sugar.Date): Boolean = js.native
  def isThisYear(instance: typings.sugar.Date, localeCode: String): Boolean = js.native
  
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
  
  def iso(instance: typings.sugar.Date): String = js.native
  
  def long(instance: typings.sugar.Date): String = js.native
  def long(instance: typings.sugar.Date, localeCode: String): String = js.native
  
  def medium(instance: typings.sugar.Date): String = js.native
  def medium(instance: typings.sugar.Date, localeCode: String): String = js.native
  
  def millisecondsAgo(instance: typings.sugar.Date): Double = js.native
  
  def millisecondsFromNow(instance: typings.sugar.Date): Double = js.native
  
  def millisecondsSince(instance: typings.sugar.Date, d: String): Double = js.native
  def millisecondsSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def millisecondsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def millisecondsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def millisecondsUntil(instance: typings.sugar.Date): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def millisecondsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def minutesAgo(instance: typings.sugar.Date): Double = js.native
  
  def minutesFromNow(instance: typings.sugar.Date): Double = js.native
  
  def minutesSince(instance: typings.sugar.Date, d: String): Double = js.native
  def minutesSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def minutesSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def minutesSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def minutesUntil(instance: typings.sugar.Date): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def minutesUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def monthsAgo(instance: typings.sugar.Date): Double = js.native
  
  def monthsFromNow(instance: typings.sugar.Date): Double = js.native
  
  def monthsSince(instance: typings.sugar.Date, d: String): Double = js.native
  def monthsSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def monthsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def monthsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def monthsUntil(instance: typings.sugar.Date): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def monthsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def range(): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: String): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: typings.sugar.Date): Range = js.native
  def range(start: String): Range = js.native
  def range(start: String, end: String): Range = js.native
  def range(start: String, end: typings.sugar.Date): Range = js.native
  def range(start: typings.sugar.Date): Range = js.native
  def range(start: typings.sugar.Date, end: String): Range = js.native
  def range(start: typings.sugar.Date, end: typings.sugar.Date): Range = js.native
  
  def relative(instance: typings.sugar.Date): String = js.native
  def relative(
    instance: typings.sugar.Date,
    localeCode: js.UndefOr[scala.Nothing],
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, String]
  ): String = js.native
  def relative(instance: typings.sugar.Date, localeCode: String): String = js.native
  def relative(
    instance: typings.sugar.Date,
    localeCode: String,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, String]
  ): String = js.native
  def relative(
    instance: typings.sugar.Date,
    relativeFn: js.Function4[/* num */ Double, /* unit */ Double, /* ms */ Double, /* loc */ Locale, String]
  ): String = js.native
  
  def relativeTo(instance: typings.sugar.Date, d: String): String = js.native
  def relativeTo(instance: typings.sugar.Date, d: String, localeCode: String): String = js.native
  def relativeTo(instance: typings.sugar.Date, d: Double): String = js.native
  def relativeTo(instance: typings.sugar.Date, d: Double, localeCode: String): String = js.native
  def relativeTo(instance: typings.sugar.Date, d: typings.sugar.Date): String = js.native
  def relativeTo(instance: typings.sugar.Date, d: typings.sugar.Date, localeCode: String): String = js.native
  
  def removeLocale(localeCode: String): Locale = js.native
  
  def reset(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def reset(instance: typings.sugar.Date, unit: js.UndefOr[scala.Nothing], localeCode: String): typings.sugar.Date = js.native
  def reset(instance: typings.sugar.Date, unit: String): typings.sugar.Date = js.native
  def reset(instance: typings.sugar.Date, unit: String, localeCode: String): typings.sugar.Date = js.native
  
  def rewind(instance: typings.sugar.Date, milliseconds: Double): typings.sugar.Date = js.native
  def rewind(instance: typings.sugar.Date, set: String): typings.sugar.Date = js.native
  def rewind(instance: typings.sugar.Date, set: String, reset: Boolean): typings.sugar.Date = js.native
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
  
  def secondsSince(instance: typings.sugar.Date, d: String): Double = js.native
  def secondsSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def secondsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def secondsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def secondsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def secondsUntil(instance: typings.sugar.Date): Double = js.native
  def secondsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def secondsUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def secondsUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
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
  
  def setLocale(localeCode: String): Locale = js.native
  
  def setOption(name: String, value: js.Any): Unit = js.native
  def setOption(options: DateOptions): Unit = js.native
  
  def setUTC(instance: typings.sugar.Date): typings.sugar.Date = js.native
  def setUTC(instance: typings.sugar.Date, on: Boolean): typings.sugar.Date = js.native
  
  def setWeekday(instance: typings.sugar.Date, dow: Double): Unit = js.native
  
  def short(instance: typings.sugar.Date): String = js.native
  def short(instance: typings.sugar.Date, localeCode: String): String = js.native
  
  def weeksAgo(instance: typings.sugar.Date): Double = js.native
  
  def weeksFromNow(instance: typings.sugar.Date): Double = js.native
  
  def weeksSince(instance: typings.sugar.Date, d: String): Double = js.native
  def weeksSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def weeksSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def weeksSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def weeksUntil(instance: typings.sugar.Date): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def weeksUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def yearsAgo(instance: typings.sugar.Date): Double = js.native
  
  def yearsFromNow(instance: typings.sugar.Date): Double = js.native
  
  def yearsSince(instance: typings.sugar.Date, d: String): Double = js.native
  def yearsSince(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: typings.sugar.Date, d: Double): Double = js.native
  def yearsSince(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsSince(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def yearsSince(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
  
  def yearsUntil(instance: typings.sugar.Date): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: String): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: String, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: Double): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: Double, options: DateCreateOptions): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: typings.sugar.Date): Double = js.native
  def yearsUntil(instance: typings.sugar.Date, d: typings.sugar.Date, options: DateCreateOptions): Double = js.native
}
