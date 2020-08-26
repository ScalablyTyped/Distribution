package typings.sugarCore.sugarjs

import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.Date")
@js.native
object Date extends js.Object {
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
    def setFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setTime(time: Double): SugarDefaultChainable[Double] = js.native
    def setUTCDate(date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMonth(month: Double): SugarDefaultChainable[Double] = js.native
    def setUTCMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
    def setUTCSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
    def setUTCSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
    def toDateString(): SugarDefaultChainable[java.lang.String] = js.native
    def toISOString(): SugarDefaultChainable[java.lang.String] = js.native
    def toJSON(): SugarDefaultChainable[java.lang.String] = js.native
    def toJSON(key: js.Any): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: js.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleDateString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: java.lang.String, options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: js.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleTimeString(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toTimeString(): SugarDefaultChainable[java.lang.String] = js.native
    def toUTCString(): SugarDefaultChainable[java.lang.String] = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}

