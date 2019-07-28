package typings.timezonecomplete.distLibTimezoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timezone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean = js.native
  def local(): TimeZone = js.native
  def utc(): TimeZone = js.native
  def zone(name: String): TimeZone = js.native
  def zone(name: String, dst: Boolean): TimeZone = js.native
  def zone(offset: Double): TimeZone = js.native
}

