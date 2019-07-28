package typings.sugarDashCore.sugarjsNs.DateNs

import typings.std.IntlNs.DateTimeFormatOptions
import typings.sugarDashCore.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def getDate(): SugarDefaultChainable[Double] = js.native
  def getDay(): SugarDefaultChainable[Double] = js.native
  def getFullYear(): SugarDefaultChainable[Double] = js.native
  def getHours(): SugarDefaultChainable[Double] = js.native
  def getMilliseconds(): SugarDefaultChainable[Double] = js.native
  def getMinutes(): SugarDefaultChainable[Double] = js.native
  def getMonth(): SugarDefaultChainable[Double] = js.native
  def getSeconds(): SugarDefaultChainable[Double] = js.native
  def getTime(): SugarDefaultChainable[Double] = js.native
  def getTimezoneOffset(): SugarDefaultChainable[Double] = js.native
  def getUTCDate(): SugarDefaultChainable[Double] = js.native
  def getUTCDay(): SugarDefaultChainable[Double] = js.native
  def getUTCFullYear(): SugarDefaultChainable[Double] = js.native
  def getUTCHours(): SugarDefaultChainable[Double] = js.native
  def getUTCMilliseconds(): SugarDefaultChainable[Double] = js.native
  def getUTCMinutes(): SugarDefaultChainable[Double] = js.native
  def getUTCMonth(): SugarDefaultChainable[Double] = js.native
  def getUTCSeconds(): SugarDefaultChainable[Double] = js.native
  def setDate(date: Double): SugarDefaultChainable[Double] = js.native
  def setFullYear(year: Double): SugarDefaultChainable[Double] = js.native
  def setFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
  def setFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
  def setHours(hours: Double): SugarDefaultChainable[Double] = js.native
  def setHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
  def setHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
  def setHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def setMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
  def setMinutes(min: Double): SugarDefaultChainable[Double] = js.native
  def setMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
  def setMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def setMonth(month: Double): SugarDefaultChainable[Double] = js.native
  def setMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
  def setSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
  def setSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def setTime(time: Double): SugarDefaultChainable[Double] = js.native
  def setUTCDate(date: Double): SugarDefaultChainable[Double] = js.native
  def setUTCFullYear(year: Double): SugarDefaultChainable[Double] = js.native
  def setUTCFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
  def setUTCFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
  def setUTCHours(hours: Double): SugarDefaultChainable[Double] = js.native
  def setUTCHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMinutes(min: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMonth(month: Double): SugarDefaultChainable[Double] = js.native
  def setUTCMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
  def setUTCSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
  def setUTCSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
  def toDateString(): SugarDefaultChainable[String] = js.native
  def toISOString(): SugarDefaultChainable[String] = js.native
  def toJSON(): SugarDefaultChainable[String] = js.native
  def toJSON(key: js.Any): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleDateString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: String): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
  def toLocaleTimeString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
  def toTimeString(): SugarDefaultChainable[String] = js.native
  def toUTCString(): SugarDefaultChainable[String] = js.native
}

