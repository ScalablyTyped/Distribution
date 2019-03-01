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
  def apply(getLabel: js.Function0[java.lang.String], setLabel: js.Function1[java.lang.String, scala.Unit]): UiLabelElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.asInstanceOf[UiLabelElement]
  }
}

