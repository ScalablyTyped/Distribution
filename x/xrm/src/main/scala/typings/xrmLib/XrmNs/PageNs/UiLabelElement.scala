package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements with labels.
  * @deprecated Use {@link Xrm.Controls.UiLabelElement} instead.
  */
trait UiLabelElement
  extends xrmLib.XrmNs.ControlsNs.UiLabelElement

object UiLabelElement {
  @scala.inline
  def apply(getLabel: js.Function0[java.lang.String], setLabel: js.Function1[java.lang.String, scala.Unit]): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = getLabel, setLabel = setLabel)
  
    __obj.asInstanceOf[UiLabelElement]
  }
}

