package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value updated.
  * @deprecated Use {@link Xrm.Controls.UiCanSetVisibleElement} instead.
  */
trait UiCanSetVisibleElement
  extends xrmLib.XrmNs.ControlsNs.UiCanSetVisibleElement

object UiCanSetVisibleElement {
  @scala.inline
  def apply(setVisible: scala.Boolean => scala.Unit): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
}

