package typings.atWordpressNux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/nux/store/actions", JSImport.Namespace)
@js.native
object storeActionsMod extends js.Object {
  def disableTips(): Unit = js.native
  def dismissTip(id: String): Unit = js.native
  def enableTips(): Unit = js.native
  def triggerGuide(tipIds: js.Array[String]): Unit = js.native
}

