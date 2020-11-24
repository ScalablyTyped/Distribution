package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the disabled value updated.
  */
@js.native
trait UiCanSetDisabledElement extends js.Object {
  
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit = js.native
}
object UiCanSetDisabledElement {
  
  @scala.inline
  def apply(setDisabled: Boolean => Unit): UiCanSetDisabledElement = {
    val __obj = js.Dynamic.literal(setDisabled = js.Any.fromFunction1(setDisabled))
    __obj.asInstanceOf[UiCanSetDisabledElement]
  }
  
  @scala.inline
  implicit class UiCanSetDisabledElementOps[Self <: UiCanSetDisabledElement] (val x: Self) extends AnyVal {
    
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
    def setSetDisabled(value: Boolean => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
  }
}
