package typings
package vegaDashLiteLib.buildSrcTimeunitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/timeunit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TIMEUNITS: js.Array[TimeUnit] = js.native
  val TIMEUNIT_PARTS: js.Array[LocalSingleTimeUnit] = js.native
  def containsTimeUnit(fullTimeUnit: TimeUnit, timeUnit: TimeUnit): scala.Boolean = js.native
  def convert(unit: TimeUnit, date: stdLib.Date): stdLib.Date = js.native
  def fieldExpr(fullTimeUnit: TimeUnit, field: java.lang.String): java.lang.String = js.native
  def formatExpression(
    timeUnit: TimeUnit,
    field: java.lang.String,
    shortTimeLabels: scala.Boolean,
    isUTCScale: scala.Boolean
  ): java.lang.String = js.native
  def getLocalTimeUnit(t: UtcTimeUnit): LocalTimeUnit = js.native
  def getTimeUnitParts(timeUnit: TimeUnit): js.Array[_] = js.native
  def isLocalSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ scala.Boolean = js.native
  def isTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ scala.Boolean = js.native
  def isUTCTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ scala.Boolean = js.native
  def isUtcSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ scala.Boolean = js.native
  def normalizeTimeUnit(timeUnit: TimeUnit): TimeUnit = js.native
}

