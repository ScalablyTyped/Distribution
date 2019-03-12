package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Page.ui controls.
  * @see {@link UiElement}
  * @deprecated Use {@link Xrm.Controls.Control} instead.
  */
trait Control
  extends xrmLib.XrmNs.ControlsNs.Control

object Control {
  @scala.inline
  def apply(
    getControlType: () => xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.ControlsNs.Section,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit
  ): Control = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[Control]
  }
}

