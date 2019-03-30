package typings
package tzDashOffsetLib.tzDashOffsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tz-offset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def offsetOf(timezone: Timezone): scala.Double = js.native
  def removeOffset(date: stdLib.Date): scala.Double = js.native
  def timeAt(date: stdLib.Date, timezone: Timezone): stdLib.Date = js.native
}

