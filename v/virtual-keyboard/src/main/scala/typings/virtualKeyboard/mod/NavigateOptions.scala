package typings.virtualKeyboard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateOptions extends js.Object {
  var focusClass: js.UndefOr[String] = js.native
  var position: js.UndefOr[js.Array[Double]] = js.native
  var rowLooping: js.UndefOr[Boolean] = js.native
  var toggleMode: js.UndefOr[Boolean] = js.native
}

object NavigateOptions {
  @scala.inline
  def apply(): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions]
  }
  @scala.inline
  implicit class NavigateOptionsOps[Self <: NavigateOptions] (val x: Self) extends AnyVal {
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
    def setFocusClass(value: String): Self = this.set("focusClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusClass: Self = this.set("focusClass", js.undefined)
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRowLooping(value: Boolean): Self = this.set("rowLooping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowLooping: Self = this.set("rowLooping", js.undefined)
    @scala.inline
    def setToggleMode(value: Boolean): Self = this.set("toggleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleMode: Self = this.set("toggleMode", js.undefined)
  }
  
}

