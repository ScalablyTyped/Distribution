package typings.atWordpressNux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimported_actions extends js.Object {
  def disableTips(): Unit
  def dismissTip(id: String): Unit
  def enableTips(): Unit
  def triggerGuide(tipIds: js.Array[String]): Unit
}

object Typeofimported_actions {
  @scala.inline
  def apply(
    disableTips: () => Unit,
    dismissTip: String => Unit,
    enableTips: () => Unit,
    triggerGuide: js.Array[String] => Unit
  ): Typeofimported_actions = {
    val __obj = js.Dynamic.literal(disableTips = js.Any.fromFunction0(disableTips), dismissTip = js.Any.fromFunction1(dismissTip), enableTips = js.Any.fromFunction0(enableTips), triggerGuide = js.Any.fromFunction1(triggerGuide))
  
    __obj.asInstanceOf[Typeofimported_actions]
  }
}

