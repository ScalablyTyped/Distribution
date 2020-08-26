package typings.uifabricReactHooks.useBooleanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUseBooleanCallbacks extends js.Object {
  /** Set the value to false. Always has the same identity. */
  def setFalse(): Unit = js.native
  /** Set the value to true. Always has the same identity. */
  def setTrue(): Unit = js.native
  /** Toggle the value. Always has the same identity. */
  def toggle(): Unit = js.native
}

object IUseBooleanCallbacks {
  @scala.inline
  def apply(setFalse: () => Unit, setTrue: () => Unit, toggle: () => Unit): IUseBooleanCallbacks = {
    val __obj = js.Dynamic.literal(setFalse = js.Any.fromFunction0(setFalse), setTrue = js.Any.fromFunction0(setTrue), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[IUseBooleanCallbacks]
  }
  @scala.inline
  implicit class IUseBooleanCallbacksOps[Self <: IUseBooleanCallbacks] (val x: Self) extends AnyVal {
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
    def setSetFalse(value: () => Unit): Self = this.set("setFalse", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTrue(value: () => Unit): Self = this.set("setTrue", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

