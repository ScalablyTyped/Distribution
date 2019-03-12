package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements with labels.
  */
trait UiLabelElement extends js.Object {
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): java.lang.String
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: java.lang.String): scala.Unit
}

object UiLabelElement {
  @scala.inline
  def apply(getLabel: () => java.lang.String, setLabel: java.lang.String => scala.Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[UiLabelElement]
  }
}

