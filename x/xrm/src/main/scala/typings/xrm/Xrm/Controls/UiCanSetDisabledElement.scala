package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the disabled value updated.
  */
trait UiCanSetDisabledElement extends js.Object {
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit
}

object UiCanSetDisabledElement {
  @scala.inline
  def apply(setDisabled: Boolean => Unit): UiCanSetDisabledElement = {
    val __obj = js.Dynamic.literal(setDisabled = js.Any.fromFunction1(setDisabled))
    __obj.asInstanceOf[UiCanSetDisabledElement]
  }
}

