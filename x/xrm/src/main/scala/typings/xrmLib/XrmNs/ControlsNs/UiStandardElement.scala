package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for standard UI elements.
  */
trait UiStandardElement
  extends UiCanGetVisibleElement
     with UiLabelElement {
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: scala.Boolean): scala.Unit
}

object UiStandardElement {
  @scala.inline
  def apply(
    getLabel: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal(getLabel = getLabel, getVisible = getVisible, setLabel = setLabel, setVisible = setVisible)
  
    __obj.asInstanceOf[UiStandardElement]
  }
}

