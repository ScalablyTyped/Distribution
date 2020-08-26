package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the disabled value read.
  */
@js.native
trait UiCanGetDisabledElement extends js.Object {
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): Boolean = js.native
}

object UiCanGetDisabledElement {
  @scala.inline
  def apply(getDisabled: () => Boolean): UiCanGetDisabledElement = {
    val __obj = js.Dynamic.literal(getDisabled = js.Any.fromFunction0(getDisabled))
    __obj.asInstanceOf[UiCanGetDisabledElement]
  }
  @scala.inline
  implicit class UiCanGetDisabledElementOps[Self <: UiCanGetDisabledElement] (val x: Self) extends AnyVal {
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
    def setGetDisabled(value: () => Boolean): Self = this.set("getDisabled", js.Any.fromFunction0(value))
  }
  
}

