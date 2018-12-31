package typings
package timezoneDashJsLib.timezoneDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezone-js", "Date")
@js.native
class Date () extends js.Object {
  // Note due to naming conflict I have not found a way to introduce the constructor
  // that takes a regular Date object. Instead, I defined it to take an Object.
  def this(date: js.Object) = this()
  def this(timezone: java.lang.String) = this()
  def this(utcMillis: scala.Double) = this()
  def this(date: js.Object, timezone: java.lang.String) = this()
  def this(time: java.lang.String, timezone: java.lang.String) = this()
  def this(utcMillis: scala.Double, timezone: java.lang.String) = this()
  def this(year: js.UndefOr[scala.Double], month: js.UndefOr[scala.Double], day: js.UndefOr[scala.Double], hour: js.UndefOr[scala.Double], minute: js.UndefOr[scala.Double], second: js.UndefOr[scala.Double], millisecond: js.UndefOr[scala.Double], timezone: js.UndefOr[java.lang.String]) = this()
  def getDate(): scala.Double = js.native
  def getDay(): scala.Double = js.native
  def getFullYear(): scala.Double = js.native
  def getHours(): scala.Double = js.native
  def getMilliseconds(): scala.Double = js.native
  def getMinutes(): scala.Double = js.native
  def getMonth(): scala.Double = js.native
  def getSeconds(): scala.Double = js.native
  def getTime(): scala.Double = js.native
  def getTimezoneOffset(): scala.Double = js.native
  def getUTCDate(): scala.Double = js.native
  def getUTCDay(): scala.Double = js.native
  def getUTCFullYear(): scala.Double = js.native
  def getUTCHours(): scala.Double = js.native
  def getUTCMilliseconds(): scala.Double = js.native
  def getUTCMinutes(): scala.Double = js.native
  def getUTCMonth(): scala.Double = js.native
  def getUTCSeconds(): scala.Double = js.native
  def setDate(date: scala.Double): scala.Double = js.native
  def setFullYear(year: scala.Double): scala.Double = js.native
  def setFullYear(year: scala.Double, month: scala.Double): scala.Double = js.native
  def setFullYear(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  // Note the setters have a non-void return type. Date has them as well, according to TypeScript 
  def setMilliseconds(ms: scala.Double): scala.Double = js.native
  def setMinutes(min: scala.Double): scala.Double = js.native
  def setMinutes(min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  def setMonth(month: scala.Double): scala.Double = js.native
  def setMonth(month: scala.Double, date: scala.Double): scala.Double = js.native
  def setSeconds(sec: scala.Double): scala.Double = js.native
  def setSeconds(sec: scala.Double, ms: scala.Double): scala.Double = js.native
  def setTime(time: scala.Double): scala.Double = js.native
  def setTimezone(timezone: java.lang.String): scala.Unit = js.native
  def setUTCDate(date: scala.Double): scala.Double = js.native
  def setUTCFullYear(year: scala.Double): scala.Double = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double): scala.Double = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  def setUTCMilliseconds(ms: scala.Double): scala.Double = js.native
  def setUTCMinutes(min: scala.Double): scala.Double = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  def setUTCMonth(month: scala.Double): scala.Double = js.native
  def setUTCMonth(month: scala.Double, date: scala.Double): scala.Double = js.native
  def setUTCSeconds(sec: scala.Double): scala.Double = js.native
  def setUTCSeconds(sec: scala.Double, ms: scala.Double): scala.Double = js.native
  def toDateString(): java.lang.String = js.native
  def toISOString(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toJSON(key: js.Any): java.lang.String = js.native
  def toLocaleDateString(): java.lang.String = js.native
  def toLocaleTimeString(): java.lang.String = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toTimeString(): java.lang.String = js.native
  def toUTCString(): java.lang.String = js.native
}

