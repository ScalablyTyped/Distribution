package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for standard UI elements.
  * @deprecated Use {@link Xrm.Controls.UiStandardElement} instead.
  */
trait UiStandardElement
  extends xrmLib.XrmNs.ControlsNs.UiStandardElement

object UiStandardElement {
  @scala.inline
  def apply(
    getLabel: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[UiStandardElement]
  }
}

