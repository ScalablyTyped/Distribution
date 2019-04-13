package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LOCALE: timezonecompleteLib.distLibLocaleMod.Locale = js.native
  val ERA_NAMES_ABBREVIATED: js.Tuple2[java.lang.String, java.lang.String] = js.native
  val ERA_NAMES_NARROW: js.Tuple2[java.lang.String, java.lang.String] = js.native
  val ERA_NAMES_WIDE: js.Tuple2[java.lang.String, java.lang.String] = js.native
  val LONG_MONTH_NAMES: js.Array[java.lang.String] = js.native
  val LONG_WEEKDAY_NAMES: js.Array[java.lang.String] = js.native
  val MONTH_LETTERS: js.Array[java.lang.String] = js.native
  val QUARTER_ABBREVIATIONS: js.Array[java.lang.String] = js.native
  val QUARTER_LETTER: java.lang.String = js.native
  val QUARTER_WORD: java.lang.String = js.native
  val SHORT_MONTH_NAMES: js.Array[java.lang.String] = js.native
  val SHORT_WEEKDAY_NAMES: js.Array[java.lang.String] = js.native
  val STAND_ALONE_LONG_MONTH_NAMES: js.Array[java.lang.String] = js.native
  val STAND_ALONE_MONTH_LETTERS: js.Array[java.lang.String] = js.native
  val STAND_ALONE_QUARTER_ABBREVIATIONS: js.Array[java.lang.String] = js.native
  val STAND_ALONE_QUARTER_LETTER: java.lang.String = js.native
  val STAND_ALONE_QUARTER_WORD: java.lang.String = js.native
  val STAND_ALONE_SHORT_MONTH_NAMES: js.Array[java.lang.String] = js.native
  val WEEKDAY_LETTERS: js.Array[java.lang.String] = js.native
  val WEEKDAY_TWO_LETTERS: js.Array[java.lang.String] = js.native
  def abs(d: timezonecompleteLib.distLibDurationMod.Duration): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, scala.Double]): scala.Double = js.native
  def dayOfYear(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def days(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def daysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  def daysInYear(year: scala.Double): scala.Double = js.native
  def firstWeekDayOfMonth(year: scala.Double, month: scala.Double, weekDay: timezonecompleteLib.distLibBasicsMod.WeekDay): scala.Double = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: java.lang.String
  ): java.lang.String = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: java.lang.String,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): java.lang.String = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: scala.Null,
    formatString: java.lang.String
  ): java.lang.String = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: scala.Null,
    formatString: java.lang.String,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): java.lang.String = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    formatString: java.lang.String
  ): java.lang.String = js.native
  def format(
    dateTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    utcTime: timezonecompleteLib.distLibBasicsMod.TimeStruct,
    localZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    formatString: java.lang.String,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): java.lang.String = js.native
  def hours(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def isDateTime(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ scala.Boolean = js.native
  def isDuration(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ scala.Boolean = js.native
  def isLeapYear(year: scala.Double): scala.Boolean = js.native
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ scala.Boolean = js.native
  def isValidOffsetString(s: java.lang.String): scala.Boolean = js.native
  def lastWeekDayOfMonth(year: scala.Double, month: scala.Double, weekDay: timezonecompleteLib.distLibBasicsMod.WeekDay): scala.Double = js.native
  def local(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def max(
    d1: timezonecompleteLib.distLibDatetimeMod.DateTime,
    d2: timezonecompleteLib.distLibDatetimeMod.DateTime
  ): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def max(
    d1: timezonecompleteLib.distLibDurationMod.Duration,
    d2: timezonecompleteLib.distLibDurationMod.Duration
  ): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def milliseconds(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def min(
    d1: timezonecompleteLib.distLibDatetimeMod.DateTime,
    d2: timezonecompleteLib.distLibDatetimeMod.DateTime
  ): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def min(
    d1: timezonecompleteLib.distLibDurationMod.Duration,
    d2: timezonecompleteLib.distLibDurationMod.Duration
  ): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def minutes(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def months(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def now(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def now(timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def nowLocal(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def nowUtc(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def parse(dateTimeString: java.lang.String, formatString: java.lang.String): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: scala.Boolean
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: scala.Null,
    allowTrailing: scala.Boolean
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: scala.Null,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    allowTrailing: scala.Boolean
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parse(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    overrideZone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): timezonecompleteLib.distLibParseMod.AwareTimeStruct = js.native
  def parseable(dateTimeString: java.lang.String, formatString: java.lang.String): scala.Boolean = js.native
  def parseable(dateTimeString: java.lang.String, formatString: java.lang.String, allowTrailing: scala.Boolean): scala.Boolean = js.native
  def parseable(
    dateTimeString: java.lang.String,
    formatString: java.lang.String,
    allowTrailing: scala.Boolean,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): scala.Boolean = js.native
  def periodDstToString(p: timezonecompleteLib.distLibPeriodMod.PeriodDst): java.lang.String = js.native
  def secondOfDay(hour: scala.Double, minute: scala.Double, second: scala.Double): scala.Double = js.native
  def seconds(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def stringToTimeUnit(s: java.lang.String): timezonecompleteLib.distLibBasicsMod.TimeUnit = js.native
  def timeToUnixNoLeapSecs(components: timezonecompleteLib.distLibBasicsMod.TimeComponentOpts): scala.Double = js.native
  def timeToUnixNoLeapSecs(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double,
    milli: scala.Double
  ): scala.Double = js.native
  def timeUnitToMilliseconds(unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): scala.Double = js.native
  def timeUnitToString(unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): java.lang.String = js.native
  def timeUnitToString(unit: timezonecompleteLib.distLibBasicsMod.TimeUnit, amount: scala.Double): java.lang.String = js.native
  def unixToTimeNoLeapSecs(unixMillis: scala.Double): timezonecompleteLib.distLibBasicsMod.TimeComponents = js.native
  def utc(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def weekDayNoLeapSecs(unixMillis: scala.Double): timezonecompleteLib.distLibBasicsMod.WeekDay = js.native
  def weekDayOnOrAfter(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    weekDay: timezonecompleteLib.distLibBasicsMod.WeekDay
  ): scala.Double = js.native
  def weekDayOnOrBefore(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    weekDay: timezonecompleteLib.distLibBasicsMod.WeekDay
  ): scala.Double = js.native
  def weekNumber(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def weekOfMonth(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def years(n: scala.Double): timezonecompleteLib.distLibDurationMod.Duration = js.native
  def zone(name: java.lang.String): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(name: java.lang.String, dst: scala.Boolean): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(offset: scala.Double): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
}

