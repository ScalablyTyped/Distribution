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
    getControlType: js.Function0[xrmLib.XrmNs.ControlsNs.ControlType | java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.ControlsNs.Section],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): Control = {
    val __obj = js.Dynamic.literal(getControlType = getControlType, getLabel = getLabel, getName = getName, getParent = getParent, getVisible = getVisible, setLabel = setLabel)
  
    __obj.asInstanceOf[Control]
  }
}

