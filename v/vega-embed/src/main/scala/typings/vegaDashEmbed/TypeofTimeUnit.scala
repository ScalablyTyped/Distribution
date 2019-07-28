package typings.vegaDashEmbed

import typings.std.Date
import typings.vegaDashEmbed.vegaDashEmbedStrings.date
import typings.vegaDashEmbed.vegaDashEmbedStrings.day
import typings.vegaDashEmbed.vegaDashEmbedStrings.hours
import typings.vegaDashEmbed.vegaDashEmbedStrings.hoursminutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.hoursminutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.milliseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.minutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.minutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.month
import typings.vegaDashEmbed.vegaDashEmbedStrings.monthdate
import typings.vegaDashEmbed.vegaDashEmbedStrings.quarter
import typings.vegaDashEmbed.vegaDashEmbedStrings.quartermonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.seconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.secondsmilliseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcdate
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcday
import typings.vegaDashEmbed.vegaDashEmbedStrings.utchours
import typings.vegaDashEmbed.vegaDashEmbedStrings.utchoursminutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.utchoursminutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcmilliseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcminutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcminutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcmonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcmonthdate
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcquarter
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcquartermonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcsecondsmilliseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyear
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearmonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearmonthdate
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearmonthdatehours
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearmonthdatehoursminutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearmonthdatehoursminutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearquarter
import typings.vegaDashEmbed.vegaDashEmbedStrings.utcyearquartermonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.year
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearmonth
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearmonthdate
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearmonthdatehours
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearmonthdatehoursminutes
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearmonthdatehoursminutesseconds
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearquarter
import typings.vegaDashEmbed.vegaDashEmbedStrings.yearquartermonth
import typings.vegaDashLite.buildSrcTimeunitMod.LocalSingleTimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.LocalTimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.UtcTimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTimeUnit extends js.Object {
  val DATE: date
  val DAY: day
  val HOURS: hours
  val HOURSMINUTES: hoursminutes
  val HOURSMINUTESSECONDS: hoursminutesseconds
  val MILLISECONDS: milliseconds
  val MINUTES: minutes
  val MINUTESSECONDS: minutesseconds
  val MONTH: month
  val MONTHDATE: monthdate
  val QUARTER: quarter
  val QUARTERMONTH: quartermonth
  val SECONDS: seconds
  val SECONDSMILLISECONDS: secondsmilliseconds
  val UTCDATE: utcdate
  val UTCDAY: utcday
  val UTCHOURS: utchours
  val UTCHOURSMINUTES: utchoursminutes
  val UTCHOURSMINUTESSECONDS: utchoursminutesseconds
  val UTCMILLISECONDS: utcmilliseconds
  val UTCMINUTES: utcminutes
  val UTCMINUTESSECONDS: utcminutesseconds
  val UTCMONTH: utcmonth
  val UTCMONTHDATE: utcmonthdate
  val UTCQUARTER: utcquarter
  val UTCQUARTERMONTH: utcquartermonth
  val UTCSECONDS: utcseconds
  val UTCSECONDSMILLISECONDS: utcsecondsmilliseconds
  val UTCYEAR: utcyear
  val UTCYEARMONTH: utcyearmonth
  val UTCYEARMONTHDATE: utcyearmonthdate
  val UTCYEARMONTHDATEHOURS: utcyearmonthdatehours
  val UTCYEARMONTHDATEHOURSMINUTES: utcyearmonthdatehoursminutes
  val UTCYEARMONTHDATEHOURSMINUTESSECONDS: utcyearmonthdatehoursminutesseconds
  val UTCYEARQUARTER: utcyearquarter
  val UTCYEARQUARTERMONTH: utcyearquartermonth
  val YEAR: year
  val YEARMONTH: yearmonth
  val YEARMONTHDATE: yearmonthdate
  val YEARMONTHDATEHOURS: yearmonthdatehours
  val YEARMONTHDATEHOURSMINUTES: yearmonthdatehoursminutes
  val YEARMONTHDATEHOURSMINUTESSECONDS: yearmonthdatehoursminutesseconds
  val YEARQUARTER: yearquarter
  val YEARQUARTERMONTH: yearquartermonth
}

trait TypeoftimeUnit extends js.Object {
  val TIMEUNITS: js.Array[TimeUnit]
  val TIMEUNIT_PARTS: js.Array[LocalSingleTimeUnit]
  val TimeUnitNs: TypeofTimeUnit
  def containsTimeUnit(fullTimeUnit: TimeUnit, timeUnit: TimeUnit): Boolean
  def convert(unit: TimeUnit, date: Date): Date
  def fieldExpr(fullTimeUnit: TimeUnit, field: String): String
  def formatExpression(timeUnit: TimeUnit, field: String, shortTimeLabels: Boolean, isUTCScale: Boolean): String
  def getLocalTimeUnit(t: UtcTimeUnit): LocalTimeUnit
  def getTimeUnitParts(timeUnit: TimeUnit): js.Array[_]
  def isLocalSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ Boolean
  def isTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ Boolean
  def isUTCTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ Boolean
  def isUtcSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ Boolean
  def normalizeTimeUnit(timeUnit: TimeUnit): TimeUnit
}

object TypeofTimeUnit {
  @scala.inline
  def apply(
    DATE: date,
    DAY: day,
    HOURS: hours,
    HOURSMINUTES: hoursminutes,
    HOURSMINUTESSECONDS: hoursminutesseconds,
    MILLISECONDS: milliseconds,
    MINUTES: minutes,
    MINUTESSECONDS: minutesseconds,
    MONTH: month,
    MONTHDATE: monthdate,
    QUARTER: quarter,
    QUARTERMONTH: quartermonth,
    SECONDS: seconds,
    SECONDSMILLISECONDS: secondsmilliseconds,
    UTCDATE: utcdate,
    UTCDAY: utcday,
    UTCHOURS: utchours,
    UTCHOURSMINUTES: utchoursminutes,
    UTCHOURSMINUTESSECONDS: utchoursminutesseconds,
    UTCMILLISECONDS: utcmilliseconds,
    UTCMINUTES: utcminutes,
    UTCMINUTESSECONDS: utcminutesseconds,
    UTCMONTH: utcmonth,
    UTCMONTHDATE: utcmonthdate,
    UTCQUARTER: utcquarter,
    UTCQUARTERMONTH: utcquartermonth,
    UTCSECONDS: utcseconds,
    UTCSECONDSMILLISECONDS: utcsecondsmilliseconds,
    UTCYEAR: utcyear,
    UTCYEARMONTH: utcyearmonth,
    UTCYEARMONTHDATE: utcyearmonthdate,
    UTCYEARMONTHDATEHOURS: utcyearmonthdatehours,
    UTCYEARMONTHDATEHOURSMINUTES: utcyearmonthdatehoursminutes,
    UTCYEARMONTHDATEHOURSMINUTESSECONDS: utcyearmonthdatehoursminutesseconds,
    UTCYEARQUARTER: utcyearquarter,
    UTCYEARQUARTERMONTH: utcyearquartermonth,
    YEAR: year,
    YEARMONTH: yearmonth,
    YEARMONTHDATE: yearmonthdate,
    YEARMONTHDATEHOURS: yearmonthdatehours,
    YEARMONTHDATEHOURSMINUTES: yearmonthdatehoursminutes,
    YEARMONTHDATEHOURSMINUTESSECONDS: yearmonthdatehoursminutesseconds,
    YEARQUARTER: yearquarter,
    YEARQUARTERMONTH: yearquartermonth
  ): TypeofTimeUnit = {
    val __obj = js.Dynamic.literal(DATE = DATE, DAY = DAY, HOURS = HOURS, HOURSMINUTES = HOURSMINUTES, HOURSMINUTESSECONDS = HOURSMINUTESSECONDS, MILLISECONDS = MILLISECONDS, MINUTES = MINUTES, MINUTESSECONDS = MINUTESSECONDS, MONTH = MONTH, MONTHDATE = MONTHDATE, QUARTER = QUARTER, QUARTERMONTH = QUARTERMONTH, SECONDS = SECONDS, SECONDSMILLISECONDS = SECONDSMILLISECONDS, UTCDATE = UTCDATE, UTCDAY = UTCDAY, UTCHOURS = UTCHOURS, UTCHOURSMINUTES = UTCHOURSMINUTES, UTCHOURSMINUTESSECONDS = UTCHOURSMINUTESSECONDS, UTCMILLISECONDS = UTCMILLISECONDS, UTCMINUTES = UTCMINUTES, UTCMINUTESSECONDS = UTCMINUTESSECONDS, UTCMONTH = UTCMONTH, UTCMONTHDATE = UTCMONTHDATE, UTCQUARTER = UTCQUARTER, UTCQUARTERMONTH = UTCQUARTERMONTH, UTCSECONDS = UTCSECONDS, UTCSECONDSMILLISECONDS = UTCSECONDSMILLISECONDS, UTCYEAR = UTCYEAR, UTCYEARMONTH = UTCYEARMONTH, UTCYEARMONTHDATE = UTCYEARMONTHDATE, UTCYEARMONTHDATEHOURS = UTCYEARMONTHDATEHOURS, UTCYEARMONTHDATEHOURSMINUTES = UTCYEARMONTHDATEHOURSMINUTES, UTCYEARMONTHDATEHOURSMINUTESSECONDS = UTCYEARMONTHDATEHOURSMINUTESSECONDS, UTCYEARQUARTER = UTCYEARQUARTER, UTCYEARQUARTERMONTH = UTCYEARQUARTERMONTH, YEAR = YEAR, YEARMONTH = YEARMONTH, YEARMONTHDATE = YEARMONTHDATE, YEARMONTHDATEHOURS = YEARMONTHDATEHOURS, YEARMONTHDATEHOURSMINUTES = YEARMONTHDATEHOURSMINUTES, YEARMONTHDATEHOURSMINUTESSECONDS = YEARMONTHDATEHOURSMINUTESSECONDS, YEARQUARTER = YEARQUARTER, YEARQUARTERMONTH = YEARQUARTERMONTH)
  
    __obj.asInstanceOf[TypeofTimeUnit]
  }
}

object TypeoftimeUnit {
  @scala.inline
  def apply(
    TIMEUNITS: js.Array[TimeUnit],
    TIMEUNIT_PARTS: js.Array[LocalSingleTimeUnit],
    TimeUnitNs: TypeofTimeUnit,
    containsTimeUnit: (TimeUnit, TimeUnit) => Boolean,
    convert: (TimeUnit, Date) => Date,
    fieldExpr: (TimeUnit, String) => String,
    formatExpression: (TimeUnit, String, Boolean, Boolean) => String,
    getLocalTimeUnit: UtcTimeUnit => LocalTimeUnit,
    getTimeUnitParts: TimeUnit => js.Array[_],
    isLocalSingleTimeUnit: String => /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ Boolean,
    isTimeUnit: String => /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ Boolean,
    isUTCTimeUnit: String => /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ Boolean,
    isUtcSingleTimeUnit: String => /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ Boolean,
    normalizeTimeUnit: TimeUnit => TimeUnit
  ): TypeoftimeUnit = {
    val __obj = js.Dynamic.literal(TIMEUNITS = TIMEUNITS, TIMEUNIT_PARTS = TIMEUNIT_PARTS, TimeUnitNs = TimeUnitNs, containsTimeUnit = js.Any.fromFunction2(containsTimeUnit), convert = js.Any.fromFunction2(convert), fieldExpr = js.Any.fromFunction2(fieldExpr), formatExpression = js.Any.fromFunction4(formatExpression), getLocalTimeUnit = js.Any.fromFunction1(getLocalTimeUnit), getTimeUnitParts = js.Any.fromFunction1(getTimeUnitParts), isLocalSingleTimeUnit = js.Any.fromFunction1(isLocalSingleTimeUnit), isTimeUnit = js.Any.fromFunction1(isTimeUnit), isUTCTimeUnit = js.Any.fromFunction1(isUTCTimeUnit), isUtcSingleTimeUnit = js.Any.fromFunction1(isUtcSingleTimeUnit), normalizeTimeUnit = js.Any.fromFunction1(normalizeTimeUnit))
  
    __obj.asInstanceOf[TypeoftimeUnit]
  }
}

