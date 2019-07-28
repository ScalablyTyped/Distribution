package typings.vegaDashLite.buildSrcTimeunitMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/timeunit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TIMEUNITS: js.Array[TimeUnit] = js.native
  val TIMEUNIT_PARTS: js.Array[LocalSingleTimeUnit] = js.native
  def containsTimeUnit(fullTimeUnit: TimeUnit, timeUnit: TimeUnit): Boolean = js.native
  def convert(unit: TimeUnit, date: Date): Date = js.native
  def fieldExpr(fullTimeUnit: TimeUnit, field: String): String = js.native
  def formatExpression(timeUnit: TimeUnit, field: String, shortTimeLabels: Boolean, isUTCScale: Boolean): String = js.native
  def getLocalTimeUnit(t: UtcTimeUnit): LocalTimeUnit = js.native
  def getTimeUnitParts(timeUnit: TimeUnit): js.Array[_] = js.native
  def isLocalSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ Boolean = js.native
  def isTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ Boolean = js.native
  def isUTCTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ Boolean = js.native
  def isUtcSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ Boolean = js.native
  def normalizeTimeUnit(timeUnit: TimeUnit): TimeUnit = js.native
}

