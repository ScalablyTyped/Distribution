package typings.timezonecomplete.timezonecompleteMod

import typings.timezonecomplete.distLibBasicsMod.TimeComponentOpts
import typings.timezonecomplete.distLibBasicsMod.TimeComponents
import typings.timezonecomplete.distLibLocaleMod.Locale
import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import typings.timezonecomplete.distLibParseMod.AwareTimeStruct
import typings.timezonecomplete.distLibPeriodMod.PeriodJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LOCALE: Locale = js.native
  val ERA_NAMES_ABBREVIATED: js.Tuple2[String, String] = js.native
  val ERA_NAMES_NARROW: js.Tuple2[String, String] = js.native
  val ERA_NAMES_WIDE: js.Tuple2[String, String] = js.native
  val LONG_MONTH_NAMES: js.Array[String] = js.native
  val LONG_WEEKDAY_NAMES: js.Array[String] = js.native
  val MONTH_LETTERS: js.Array[String] = js.native
  val QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  val QUARTER_LETTER: String = js.native
  val QUARTER_WORD: String = js.native
  val SHORT_MONTH_NAMES: js.Array[String] = js.native
  val SHORT_WEEKDAY_NAMES: js.Array[String] = js.native
  val STAND_ALONE_LONG_MONTH_NAMES: js.Array[String] = js.native
  val STAND_ALONE_MONTH_LETTERS: js.Array[String] = js.native
  val STAND_ALONE_QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  val STAND_ALONE_QUARTER_LETTER: String = js.native
  val STAND_ALONE_QUARTER_WORD: String = js.native
  val STAND_ALONE_SHORT_MONTH_NAMES: js.Array[String] = js.native
  val WEEKDAY_LETTERS: js.Array[String] = js.native
  val WEEKDAY_TWO_LETTERS: js.Array[String] = js.native
  def abs(d: typings.timezonecomplete.distLibDurationMod.Duration): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = js.native
  def dayOfYear(year: Double, month: Double, day: Double): Double = js.native
  def days(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def daysInMonth(year: Double, month: Double): Double = js.native
  def daysInYear(year: Double): Double = js.native
  def firstWeekDayOfMonth(year: Double, month: Double, weekDay: typings.timezonecomplete.distLibBasicsMod.WeekDay): Double = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String
  ): String = js.native
  def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def hours(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def isDateTime(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean = js.native
  def isDuration(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ Boolean = js.native
  def isLeapYear(year: Double): Boolean = js.native
  def isPeriod(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean = js.native
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean = js.native
  def isValidOffsetString(s: String): Boolean = js.native
  def isValidPeriodJson(json: PeriodJson): Boolean = js.native
  def lastWeekDayOfMonth(year: Double, month: Double, weekDay: typings.timezonecomplete.distLibBasicsMod.WeekDay): Double = js.native
  def local(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = js.native
  def max(
    d1: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    d2: typings.timezonecomplete.distLibDatetimeMod.DateTime
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def max(
    d1: typings.timezonecomplete.distLibDurationMod.Duration,
    d2: typings.timezonecomplete.distLibDurationMod.Duration
  ): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def milliseconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def min(
    d1: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    d2: typings.timezonecomplete.distLibDatetimeMod.DateTime
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def min(
    d1: typings.timezonecomplete.distLibDurationMod.Duration,
    d2: typings.timezonecomplete.distLibDurationMod.Duration
  ): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def minutes(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def months(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def now(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def now(timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def nowLocal(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def nowUtc(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def parse(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: js.UndefOr[scala.Nothing],
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def parseable(dateTimeString: String, formatString: String): Boolean = js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
  def periodDstToString(p: typings.timezonecomplete.distLibPeriodMod.PeriodDst): String = js.native
  def secondOfDay(hour: Double, minute: Double, second: Double): Double = js.native
  def seconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def stringToTimeUnit(s: String): typings.timezonecomplete.distLibBasicsMod.TimeUnit = js.native
  def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = js.native
  def timeToUnixNoLeapSecs(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = js.native
  def timeUnitToMilliseconds(unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit): Double = js.native
  def timeUnitToString(unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit): String = js.native
  def timeUnitToString(unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit, amount: Double): String = js.native
  def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = js.native
  def utc(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = js.native
  def weekDayNoLeapSecs(unixMillis: Double): typings.timezonecomplete.distLibBasicsMod.WeekDay = js.native
  def weekDayOnOrAfter(
    year: Double,
    month: Double,
    day: Double,
    weekDay: typings.timezonecomplete.distLibBasicsMod.WeekDay
  ): Double = js.native
  def weekDayOnOrBefore(
    year: Double,
    month: Double,
    day: Double,
    weekDay: typings.timezonecomplete.distLibBasicsMod.WeekDay
  ): Double = js.native
  def weekNumber(year: Double, month: Double, day: Double): Double = js.native
  def weekOfMonth(year: Double, month: Double, day: Double): Double = js.native
  def years(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  def zone(name: String): typings.timezonecomplete.distLibTimezoneMod.TimeZone = js.native
  def zone(name: String, dst: Boolean): typings.timezonecomplete.distLibTimezoneMod.TimeZone = js.native
  def zone(offset: Double): typings.timezonecomplete.distLibTimezoneMod.TimeZone = js.native
}

