package typings.xrm.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value updated.
  */
trait UiCanSetVisibleElement extends js.Object {
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}

object UiCanSetVisibleElement {
  @scala.inline
  def apply(setVisible: Boolean => Unit): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
}

