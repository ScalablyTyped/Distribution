package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainsTimeUnit extends js.Object {
  val TIMEUNITS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit]
  val TIMEUNIT_PARTS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.LocalSingleTimeUnit]
  val TimeUnitNs: Anon_DATE
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

object Anon_ContainsTimeUnit {
  @scala.inline
  def apply(
    TIMEUNITS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit],
    TIMEUNIT_PARTS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.LocalSingleTimeUnit],
    TimeUnitNs: Anon_DATE,
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
  ): Anon_ContainsTimeUnit = {
    val __obj = js.Dynamic.literal(TIMEUNITS = TIMEUNITS, TIMEUNIT_PARTS = TIMEUNIT_PARTS, TimeUnitNs = TimeUnitNs, containsTimeUnit = js.Any.fromFunction2(containsTimeUnit), convert = js.Any.fromFunction2(convert), fieldExpr = js.Any.fromFunction2(fieldExpr), formatExpression = js.Any.fromFunction4(formatExpression), getLocalTimeUnit = js.Any.fromFunction1(getLocalTimeUnit), getTimeUnitParts = js.Any.fromFunction1(getTimeUnitParts), isLocalSingleTimeUnit = js.Any.fromFunction1(isLocalSingleTimeUnit), isTimeUnit = js.Any.fromFunction1(isTimeUnit), isUTCTimeUnit = js.Any.fromFunction1(isUTCTimeUnit), isUtcSingleTimeUnit = js.Any.fromFunction1(isUtcSingleTimeUnit), normalizeTimeUnit = js.Any.fromFunction1(normalizeTimeUnit))
  
    __obj.asInstanceOf[Anon_ContainsTimeUnit]
  }
}

