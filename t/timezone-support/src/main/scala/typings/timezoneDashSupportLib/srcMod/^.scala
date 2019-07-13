package typings
package timezoneDashSupportLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezone-support/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertDateToTime(date: stdLib.Date): Time = js.native
  def convertTimeToDate(time: Time): stdLib.Date = js.native
  def findTimeZone(name: java.lang.String): TimeZoneInfo = js.native
  def getUTCOffset(date: DateInput, timeZone: TimeZoneInfo): TimeZoneOffset = js.native
  def getUnixTime(time: Time): scala.Double = js.native
  def getUnixTime(time: Time, timeZone: TimeZoneInfo): scala.Double = js.native
  def getZonedTime(date: DateInput, timeZone: TimeZoneInfo): Time = js.native
  def listTimeZones(): js.Array[java.lang.String] = js.native
  def setTimeZone(time: stdLib.Date, timeZone: TimeZoneInfo): Time = js.native
  def setTimeZone(time: stdLib.Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo): Time = js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
}

