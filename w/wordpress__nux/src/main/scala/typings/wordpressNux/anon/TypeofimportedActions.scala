package typings.wordpressNux.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def disableTips(): Unit = js.native
  def dismissTip(id: String): Unit = js.native
  def enableTips(): Unit = js.native
  def triggerGuide(tipIds: js.Array[String]): Unit = js.native
}

object TypeofimportedActions {
  @scala.inline
  def apply(
    disableTips: () => Unit,
    dismissTip: String => Unit,
    enableTips: () => Unit,
    triggerGuide: js.Array[String] => Unit
  ): TypeofimportedActions = {
    val __obj = js.Dynamic.literal(disableTips = js.Any.fromFunction0(disableTips), dismissTip = js.Any.fromFunction1(dismissTip), enableTips = js.Any.fromFunction0(enableTips), triggerGuide = js.Any.fromFunction1(triggerGuide))
    __obj.asInstanceOf[TypeofimportedActions]
  }
  @scala.inline
  implicit class TypeofimportedActionsOps[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableTips(value: () => Unit): Self = this.set("disableTips", js.Any.fromFunction0(value))
    @scala.inline
    def setDismissTip(value: String => Unit): Self = this.set("dismissTip", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableTips(value: () => Unit): Self = this.set("enableTips", js.Any.fromFunction0(value))
    @scala.inline
    def setTriggerGuide(value: js.Array[String] => Unit): Self = this.set("triggerGuide", js.Any.fromFunction1(value))
  }
  
}

