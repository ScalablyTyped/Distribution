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
  def apply(getLabel: () => java.lang.String, setLabel: java.lang.String => scala.Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[UiLabelElement]
  }
}

