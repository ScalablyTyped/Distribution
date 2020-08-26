package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowState extends js.Object {
  /**
    * Whether the current window is focused.
    */
  val focused: Boolean = js.native
}

object WindowState {
  @scala.inline
  def apply(focused: Boolean): WindowState = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowState]
  }
  @scala.inline
  implicit class WindowStateOps[Self <: WindowState] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
  }
  
}

