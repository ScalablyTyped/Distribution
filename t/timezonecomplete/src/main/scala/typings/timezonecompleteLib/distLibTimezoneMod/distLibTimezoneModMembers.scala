package typings
package timezonecompleteLib.distLibTimezoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timezone", JSImport.Namespace)
@js.native
object distLibTimezoneModMembers extends js.Object {
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ scala.Boolean = js.native
  def local(): TimeZone = js.native
  def utc(): TimeZone = js.native
  def zone(name: java.lang.String): TimeZone = js.native
  def zone(name: java.lang.String, dst: scala.Boolean): TimeZone = js.native
  def zone(offset: scala.Double): TimeZone = js.native
}

