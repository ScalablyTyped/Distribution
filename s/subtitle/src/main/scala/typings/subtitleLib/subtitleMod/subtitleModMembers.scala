package typings
package subtitleLib.subtitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subtitle", JSImport.Namespace)
@js.native
object subtitleModMembers extends js.Object {
  def parse(srtOrVtt: java.lang.String): js.Array[subTitleType] = js.native
  def resync(captions: js.Array[subTitleType], time: scala.Double): js.Array[subTitleType] = js.native
  def stringify(captions: js.Array[subTitleType]): java.lang.String = js.native
  def toMs(timestamp: java.lang.String): scala.Double = js.native
  def toSrtTime(timestamp: scala.Double): java.lang.String = js.native
  def toVttTime(timestamp: scala.Double): java.lang.String = js.native
}

