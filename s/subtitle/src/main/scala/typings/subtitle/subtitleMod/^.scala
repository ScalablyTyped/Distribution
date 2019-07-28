package typings.subtitle.subtitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subtitle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(srtOrVtt: String): js.Array[subTitleType] = js.native
  def resync(captions: js.Array[subTitleType], time: Double): js.Array[subTitleType] = js.native
  def stringify(captions: js.Array[subTitleType]): String = js.native
  def toMs(timestamp: String): Double = js.native
  def toSrtTime(timestamp: Double): String = js.native
  def toVttTime(timestamp: Double): String = js.native
}

