package typings.timezoneDashSupport.srcMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezone-support/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertDateToTime(date: Date): Time = js.native
  def convertTimeToDate(time: Time): Date = js.native
  def findTimeZone(name: String): TimeZoneInfo = js.native
  def getUTCOffset(date: DateInput, timeZone: TimeZoneInfo): TimeZoneOffset = js.native
  def getUnixTime(time: Time): Double = js.native
  def getUnixTime(time: Time, timeZone: TimeZoneInfo): Double = js.native
  def getZonedTime(date: DateInput, timeZone: TimeZoneInfo): Time = js.native
  def listTimeZones(): js.Array[String] = js.native
  def setTimeZone(time: Date, timeZone: TimeZoneInfo): Time = js.native
  def setTimeZone(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo): Time = js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
}

