package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for focusable UI elements.
  */
trait UiFocusable extends js.Object {
  /**
    * Sets focus on the element.
    */
  def setFocus(): scala.Unit
}

object UiFocusable {
  @scala.inline
  def apply(setFocus: js.Function0[scala.Unit]): UiFocusable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.asInstanceOf[UiFocusable]
  }
}

