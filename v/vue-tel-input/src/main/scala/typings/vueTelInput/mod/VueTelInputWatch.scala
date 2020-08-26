package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputWatch extends js.Object {
  def state(value: js.Any): Unit = js.native
  def value(): Unit = js.native
}

object VueTelInputWatch {
  @scala.inline
  def apply(state: js.Any => Unit, value: () => Unit): VueTelInputWatch = {
    val __obj = js.Dynamic.literal(state = js.Any.fromFunction1(state), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[VueTelInputWatch]
  }
  @scala.inline
  implicit class VueTelInputWatchOps[Self <: VueTelInputWatch] (val x: Self) extends AnyVal {
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
    def setState(value: js.Any => Unit): Self = this.set("state", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: () => Unit): Self = this.set("value", js.Any.fromFunction0(value))
  }
  
}

