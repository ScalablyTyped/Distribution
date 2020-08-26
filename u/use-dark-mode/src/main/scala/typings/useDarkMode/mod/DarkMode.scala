package typings.useDarkMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DarkMode extends js.Object {
  val value: Boolean = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def toggle(): Unit = js.native
}

object DarkMode {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, toggle: () => Unit, value: Boolean): DarkMode = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), toggle = js.Any.fromFunction0(toggle), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkMode]
  }
  @scala.inline
  implicit class DarkModeOps[Self <: DarkMode] (val x: Self) extends AnyVal {
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

