package typings.wordpressComponents.noticeMod.Notice

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonAction
  extends BaseAction
     with Action {
  var onClick: MouseEventHandler[HTMLButtonElement] = js.native
}

object ButtonAction {
  @scala.inline
  def apply(label: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): ButtonAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonAction]
  }
  @scala.inline
  implicit class ButtonActionOps[Self <: ButtonAction] (val x: Self) extends AnyVal {
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
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
  }
  
}

