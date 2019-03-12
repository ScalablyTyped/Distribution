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
    getLabel: () => java.lang.String,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[UiStandardElement]
  }
}

