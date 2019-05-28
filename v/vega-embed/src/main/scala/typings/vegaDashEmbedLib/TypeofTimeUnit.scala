package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTimeUnit extends js.Object {
  val DATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.date
  val DAY: vegaDashEmbedLib.vegaDashEmbedLibStrings.day
  val HOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.hours
  val HOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.hoursminutes
  val HOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.hoursminutesseconds
  val MILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.milliseconds
  val MINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.minutes
  val MINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.minutesseconds
  val MONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.month
  val MONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.monthdate
  val QUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.quarter
  val QUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.quartermonth
  val SECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.seconds
  val SECONDSMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.secondsmilliseconds
  val UTCDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcdate
  val UTCDAY: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcday
  val UTCHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchours
  val UTCHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchoursminutes
  val UTCHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchoursminutesseconds
  val UTCMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmilliseconds
  val UTCMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcminutes
  val UTCMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcminutesseconds
  val UTCMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmonth
  val UTCMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmonthdate
  val UTCQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcquarter
  val UTCQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcquartermonth
  val UTCSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcseconds
  val UTCSECONDSMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcsecondsmilliseconds
  val UTCYEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyear
  val UTCYEARMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonth
  val UTCYEARMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdate
  val UTCYEARMONTHDATEHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehours
  val UTCYEARMONTHDATEHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehoursminutes
  val UTCYEARMONTHDATEHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehoursminutesseconds
  val UTCYEARQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearquarter
  val UTCYEARQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearquartermonth
  val YEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.year
  val YEARMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonth
  val YEARMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdate
  val YEARMONTHDATEHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehours
  val YEARMONTHDATEHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehoursminutes
  val YEARMONTHDATEHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehoursminutesseconds
  val YEARQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearquarter
  val YEARQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearquartermonth
}

trait TypeoftimeUnit extends js.Object {
  val TIMEUNITS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit]
  val TIMEUNIT_PARTS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.LocalSingleTimeUnit]
  val TimeUnitNs: TypeofTimeUnit
  def containsTimeUnit(
    fullTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
  ): scala.Boolean
  def convert(unit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, date: stdLib.Date): stdLib.Date
  def fieldExpr(fullTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, field: java.lang.String): java.lang.String
  def formatExpression(
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit,
    field: java.lang.String,
    shortTimeLabels: scala.Boolean,
    isUTCScale: scala.Boolean
  ): java.lang.String
  def getLocalTimeUnit(t: vegaDashLiteLib.buildSrcTimeunitMod.UtcTimeUnit): vegaDashLiteLib.buildSrcTimeunitMod.LocalTimeUnit
  def getTimeUnitParts(timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit): js.Array[_]
  def isLocalSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ scala.Boolean
  def isTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ scala.Boolean
  def isUTCTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ scala.Boolean
  def isUtcSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ scala.Boolean
  def normalizeTimeUnit(timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit): vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
}

object TypeofTimeUnit {
  @scala.inline
  def apply(
    DATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.date,
    DAY: vegaDashEmbedLib.vegaDashEmbedLibStrings.day,
    HOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.hours,
    HOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.hoursminutes,
    HOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.hoursminutesseconds,
    MILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.milliseconds,
    MINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.minutes,
    MINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.minutesseconds,
    MONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.month,
    MONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.monthdate,
    QUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.quarter,
    QUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.quartermonth,
    SECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.seconds,
    SECONDSMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.secondsmilliseconds,
    UTCDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcdate,
    UTCDAY: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcday,
    UTCHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchours,
    UTCHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchoursminutes,
    UTCHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utchoursminutesseconds,
    UTCMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmilliseconds,
    UTCMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcminutes,
    UTCMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcminutesseconds,
    UTCMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmonth,
    UTCMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcmonthdate,
    UTCQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcquarter,
    UTCQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcquartermonth,
    UTCSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcseconds,
    UTCSECONDSMILLISECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcsecondsmilliseconds,
    UTCYEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyear,
    UTCYEARMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonth,
    UTCYEARMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdate,
    UTCYEARMONTHDATEHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehours,
    UTCYEARMONTHDATEHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehoursminutes,
    UTCYEARMONTHDATEHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearmonthdatehoursminutesseconds,
    UTCYEARQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearquarter,
    UTCYEARQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.utcyearquartermonth,
    YEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.year,
    YEARMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonth,
    YEARMONTHDATE: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdate,
    YEARMONTHDATEHOURS: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehours,
    YEARMONTHDATEHOURSMINUTES: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehoursminutes,
    YEARMONTHDATEHOURSMINUTESSECONDS: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearmonthdatehoursminutesseconds,
    YEARQUARTER: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearquarter,
    YEARQUARTERMONTH: vegaDashEmbedLib.vegaDashEmbedLibStrings.yearquartermonth
  ): TypeofTimeUnit = {
    val __obj = js.Dynamic.literal(DATE = DATE, DAY = DAY, HOURS = HOURS, HOURSMINUTES = HOURSMINUTES, HOURSMINUTESSECONDS = HOURSMINUTESSECONDS, MILLISECONDS = MILLISECONDS, MINUTES = MINUTES, MINUTESSECONDS = MINUTESSECONDS, MONTH = MONTH, MONTHDATE = MONTHDATE, QUARTER = QUARTER, QUARTERMONTH = QUARTERMONTH, SECONDS = SECONDS, SECONDSMILLISECONDS = SECONDSMILLISECONDS, UTCDATE = UTCDATE, UTCDAY = UTCDAY, UTCHOURS = UTCHOURS, UTCHOURSMINUTES = UTCHOURSMINUTES, UTCHOURSMINUTESSECONDS = UTCHOURSMINUTESSECONDS, UTCMILLISECONDS = UTCMILLISECONDS, UTCMINUTES = UTCMINUTES, UTCMINUTESSECONDS = UTCMINUTESSECONDS, UTCMONTH = UTCMONTH, UTCMONTHDATE = UTCMONTHDATE, UTCQUARTER = UTCQUARTER, UTCQUARTERMONTH = UTCQUARTERMONTH, UTCSECONDS = UTCSECONDS, UTCSECONDSMILLISECONDS = UTCSECONDSMILLISECONDS, UTCYEAR = UTCYEAR, UTCYEARMONTH = UTCYEARMONTH, UTCYEARMONTHDATE = UTCYEARMONTHDATE, UTCYEARMONTHDATEHOURS = UTCYEARMONTHDATEHOURS, UTCYEARMONTHDATEHOURSMINUTES = UTCYEARMONTHDATEHOURSMINUTES, UTCYEARMONTHDATEHOURSMINUTESSECONDS = UTCYEARMONTHDATEHOURSMINUTESSECONDS, UTCYEARQUARTER = UTCYEARQUARTER, UTCYEARQUARTERMONTH = UTCYEARQUARTERMONTH, YEAR = YEAR, YEARMONTH = YEARMONTH, YEARMONTHDATE = YEARMONTHDATE, YEARMONTHDATEHOURS = YEARMONTHDATEHOURS, YEARMONTHDATEHOURSMINUTES = YEARMONTHDATEHOURSMINUTES, YEARMONTHDATEHOURSMINUTESSECONDS = YEARMONTHDATEHOURSMINUTESSECONDS, YEARQUARTER = YEARQUARTER, YEARQUARTERMONTH = YEARQUARTERMONTH)
  
    __obj.asInstanceOf[TypeofTimeUnit]
  }
}

object TypeoftimeUnit {
  @scala.inline
  def apply(
    TIMEUNITS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit],
    TIMEUNIT_PARTS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.LocalSingleTimeUnit],
    TimeUnitNs: TypeofTimeUnit,
    containsTimeUnit: (vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit) => scala.Boolean,
    convert: (vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, stdLib.Date) => stdLib.Date,
    fieldExpr: (vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, java.lang.String) => java.lang.String,
    formatExpression: (vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, java.lang.String, scala.Boolean, scala.Boolean) => java.lang.String,
    getLocalTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.UtcTimeUnit => vegaDashLiteLib.buildSrcTimeunitMod.LocalTimeUnit,
    getTimeUnitParts: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit => js.Array[_],
    isLocalSingleTimeUnit: java.lang.String => /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ scala.Boolean,
    isTimeUnit: java.lang.String => /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ scala.Boolean,
    isUTCTimeUnit: java.lang.String => /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ scala.Boolean,
    isUtcSingleTimeUnit: java.lang.String => /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ scala.Boolean,
    normalizeTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit => vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
  ): TypeoftimeUnit = {
    val __obj = js.Dynamic.literal(TIMEUNITS = TIMEUNITS, TIMEUNIT_PARTS = TIMEUNIT_PARTS, TimeUnitNs = TimeUnitNs, containsTimeUnit = js.Any.fromFunction2(containsTimeUnit), convert = js.Any.fromFunction2(convert), fieldExpr = js.Any.fromFunction2(fieldExpr), formatExpression = js.Any.fromFunction4(formatExpression), getLocalTimeUnit = js.Any.fromFunction1(getLocalTimeUnit), getTimeUnitParts = js.Any.fromFunction1(getTimeUnitParts), isLocalSingleTimeUnit = js.Any.fromFunction1(isLocalSingleTimeUnit), isTimeUnit = js.Any.fromFunction1(isTimeUnit), isUTCTimeUnit = js.Any.fromFunction1(isUTCTimeUnit), isUtcSingleTimeUnit = js.Any.fromFunction1(isUtcSingleTimeUnit), normalizeTimeUnit = js.Any.fromFunction1(normalizeTimeUnit))
  
    __obj.asInstanceOf[TypeoftimeUnit]
  }
}

