package typings.xrm.Xrm.Controls

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
  def getLabel(): String
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit
}

object UiLabelElement {
  @scala.inline
  def apply(getLabel: () => String, setLabel: String => Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[UiLabelElement]
  }
}

