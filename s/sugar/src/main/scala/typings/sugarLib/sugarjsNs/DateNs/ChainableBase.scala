package typings
package sugarLib.sugarjsNs.DateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def addDays(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addDays(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addHours(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addHours(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMilliseconds(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMilliseconds(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMinutes(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMinutes(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMonths(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addMonths(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addSeconds(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addSeconds(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addWeeks(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addWeeks(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addYears(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def addYears(n: scala.Double, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(milliseconds: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(set: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(set: java.lang.String, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(set: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(set: js.Object, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(year: scala.Double, month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(year: scala.Double, month: scala.Double, day: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def advance(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfDay(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfDay(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfISOWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfMonth(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfWeek(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfYear(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def beginningOfYear(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysInMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def endOfDay(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfDay(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfISOWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfMonth(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfWeek(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfYear(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def endOfYear(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def format(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def format(f: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def format(f: java.lang.String, localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def full(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def full(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def get(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def get(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def get(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def get(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def get(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def get(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def getDate(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getDay(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getFullYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getHours(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getISOWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getMilliseconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getMinutes(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getSeconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getTime(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getTimezoneOffset(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCDate(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCDay(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCFullYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCHours(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCMilliseconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCMinutes(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCOffset(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def getUTCOffset(iso: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def getUTCSeconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getUTCWeekday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def getWeekday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def is(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def is(d: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def is(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def is(d: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def is(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def is(d: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isAfter(d: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBefore(d: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: java.lang.String, d2: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: scala.Double, d2: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: java.lang.String, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: scala.Double, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBetween(d1: stdLib.Date, d2: stdLib.Date, margin: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isFriday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isFuture(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastMonth(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastWeek(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLastYear(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLeapYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isMonday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextMonth(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextWeek(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNextYear(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isPast(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isSaturday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isSunday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisMonth(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisMonth(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisWeek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisWeek(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisYear(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThisYear(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThursday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isToday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isTomorrow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isTuesday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isUTC(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isValid(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isWednesday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isWeekday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isWeekend(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isYesterday(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def iso(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def long(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def long(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def medium(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def medium(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def millisecondsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def relative(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relative(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relative(
    localeCode: java.lang.String,
    relativeFn: js.Function4[
      /* num */ scala.Double, 
      /* unit */ scala.Double, 
      /* ms */ scala.Double, 
      /* loc */ sugarLib.sugarjsNs.Locale, 
      sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relative(
    relativeFn: js.Function4[
      /* num */ scala.Double, 
      /* unit */ scala.Double, 
      /* ms */ scala.Double, 
      /* loc */ sugarLib.sugarjsNs.Locale, 
      sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: java.lang.String, localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: scala.Double, localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def relativeTo(d: stdLib.Date, localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def reset(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def reset(unit: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def reset(unit: java.lang.String, localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(milliseconds: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(set: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(set: java.lang.String, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(set: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(set: js.Object, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(year: scala.Double, month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(year: scala.Double, month: scala.Double, day: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def rewind(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def set(milliseconds: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(set: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(set: js.Object, reset: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(year: scala.Double, month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(year: scala.Double, month: scala.Double, day: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def set(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double
  ): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def setDate(date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setFullYear(year: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setFullYear(year: scala.Double, month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setFullYear(year: scala.Double, month: scala.Double, date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setHours(hours: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setHours(hours: scala.Double, min: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setISOWeek(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def setMilliseconds(ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setMinutes(min: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setMinutes(min: scala.Double, sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setMonth(month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setMonth(month: scala.Double, date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setSeconds(sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setSeconds(sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setTime(time: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTC(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def setUTC(on: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def setUTCDate(date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCFullYear(year: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double, date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCHours(hours: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMilliseconds(ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMinutes(min: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMonth(month: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCMonth(month: scala.Double, date: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCSeconds(sec: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setUTCSeconds(sec: scala.Double, ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def setWeekday(dow: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def short(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def short(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toDateString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toISOString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toJSON(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toJSON(key: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleDateString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleDateString(locales: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleDateString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleTimeString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleTimeString(locales: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleTimeString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toTimeString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toUTCString(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def weeksAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsSince(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: java.lang.String, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: scala.Double, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsUntil(d: stdLib.Date, options: DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
}

