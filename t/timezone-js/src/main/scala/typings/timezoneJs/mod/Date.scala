package typings.timezoneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezone-js", "Date")
@js.native
class Date () extends js.Object {
  // Note due to naming conflict I have not found a way to introduce the constructor
  // that takes a regular Date object. Instead, I defined it to take an Object.
  def this(date: js.Object) = this()
  def this(timezone: String) = this()
  def this(utcMillis: Double) = this()
  def this(date: js.Object, timezone: String) = this()
  def this(time: String, timezone: String) = this()
  def this(utcMillis: Double, timezone: String) = this()
  def this(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double],
    timezone: js.UndefOr[String]
  ) = this()
  
  def getDate(): Double = js.native
  
  def getDay(): Double = js.native
  
  def getFullYear(): Double = js.native
  
  def getHours(): Double = js.native
  
  def getMilliseconds(): Double = js.native
  
  def getMinutes(): Double = js.native
  
  def getMonth(): Double = js.native
  
  def getSeconds(): Double = js.native
  
  def getTime(): Double = js.native
  
  def getTimezoneOffset(): Double = js.native
  
  def getUTCDate(): Double = js.native
  
  def getUTCDay(): Double = js.native
  
  def getUTCFullYear(): Double = js.native
  
  def getUTCHours(): Double = js.native
  
  def getUTCMilliseconds(): Double = js.native
  
  def getUTCMinutes(): Double = js.native
  
  def getUTCMonth(): Double = js.native
  
  def getUTCSeconds(): Double = js.native
  
  def setDate(date: Double): Double = js.native
  
  def setFullYear(year: Double): Double = js.native
  def setFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): Double = js.native
  def setFullYear(year: Double, month: Double): Double = js.native
  def setFullYear(year: Double, month: Double, date: Double): Double = js.native
  
  def setHours(hours: Double): Double = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): Double = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): Double = js.native
  def setHours(hours: Double, min: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: Double): Double = js.native
  def setHours(hours: Double, min: Double, sec: Double, ms: Double): Double = js.native
  
  // Note the setters have a non-void return type. Date has them as well, according to TypeScript 
  def setMilliseconds(ms: Double): Double = js.native
  
  def setMinutes(min: Double): Double = js.native
  def setMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setMinutes(min: Double, sec: Double): Double = js.native
  def setMinutes(min: Double, sec: Double, ms: Double): Double = js.native
  
  def setMonth(month: Double): Double = js.native
  def setMonth(month: Double, date: Double): Double = js.native
  
  def setSeconds(sec: Double): Double = js.native
  def setSeconds(sec: Double, ms: Double): Double = js.native
  
  def setTime(time: Double): Double = js.native
  
  def setTimezone(timezone: String): Unit = js.native
  
  def setUTCDate(date: Double): Double = js.native
  
  def setUTCFullYear(year: Double): Double = js.native
  def setUTCFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): Double = js.native
  def setUTCFullYear(year: Double, month: Double): Double = js.native
  def setUTCFullYear(year: Double, month: Double, date: Double): Double = js.native
  
  def setUTCHours(hours: Double): Double = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): Double = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double): Double = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): Double = js.native
  
  def setUTCMilliseconds(ms: Double): Double = js.native
  
  def setUTCMinutes(min: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: Double): Double = js.native
  def setUTCMinutes(min: Double, sec: Double, ms: Double): Double = js.native
  
  def setUTCMonth(month: Double): Double = js.native
  def setUTCMonth(month: Double, date: Double): Double = js.native
  
  def setUTCSeconds(sec: Double): Double = js.native
  def setUTCSeconds(sec: Double, ms: Double): Double = js.native
  
  def toDateString(): String = js.native
  
  def toISOString(): String = js.native
  
  def toJSON(): String = js.native
  def toJSON(key: js.Any): String = js.native
  
  def toLocaleDateString(): String = js.native
  
  def toLocaleTimeString(): String = js.native
  
  def toString(format: String): String = js.native
  
  def toTimeString(): String = js.native
  
  def toUTCString(): String = js.native
}
