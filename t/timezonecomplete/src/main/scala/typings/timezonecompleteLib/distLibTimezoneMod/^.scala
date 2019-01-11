package typings
package timezonecompleteLib.distLibTimezoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timezone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isTimeZone(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ scala.Boolean = js.native
  def local(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def utc(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(name: java.lang.String): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(name: java.lang.String, dst: scala.Boolean): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(offset: scala.Double): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
}

