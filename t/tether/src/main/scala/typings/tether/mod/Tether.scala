package typings.tether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
@js.native
trait Tether extends js.Object {
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def position(): Unit = js.native
  def setOptions(options: ITetherOptions): Unit = js.native
}

object Tether {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    position: () => Unit,
    setOptions: ITetherOptions => Unit
  ): Tether = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), position = js.Any.fromFunction0(position), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Tether]
  }
  @scala.inline
  implicit class TetherOps[Self <: Tether] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setPosition(value: () => Unit): Self = this.set("position", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOptions(value: ITetherOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
  
}

