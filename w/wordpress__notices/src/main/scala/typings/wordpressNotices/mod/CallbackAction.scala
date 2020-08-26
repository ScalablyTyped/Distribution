package typings.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackAction extends Action {
  var label: String = js.native
  def callback(): Unit = js.native
}

object CallbackAction {
  @scala.inline
  def apply(callback: () => Unit, label: String): CallbackAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackAction]
  }
  @scala.inline
  implicit class CallbackActionOps[Self <: CallbackAction] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

