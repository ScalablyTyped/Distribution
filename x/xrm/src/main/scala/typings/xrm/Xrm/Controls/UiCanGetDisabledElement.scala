package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the disabled value read.
  */
trait UiCanGetDisabledElement extends js.Object {
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): Boolean
}

object UiCanGetDisabledElement {
  @scala.inline
  def apply(getDisabled: () => Boolean): UiCanGetDisabledElement = {
    val __obj = js.Dynamic.literal(getDisabled = js.Any.fromFunction0(getDisabled))
    __obj.asInstanceOf[UiCanGetDisabledElement]
  }
}

