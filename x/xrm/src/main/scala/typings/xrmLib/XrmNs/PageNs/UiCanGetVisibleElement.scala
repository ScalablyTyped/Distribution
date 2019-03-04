package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value read.
  * @deprecated Use {@link Xrm.Controls.UiCanGetVisibleElement} instead.
  */
trait UiCanGetVisibleElement
  extends xrmLib.XrmNs.ControlsNs.UiCanGetVisibleElement

object UiCanGetVisibleElement {
  @scala.inline
  def apply(getVisible: js.Function0[scala.Boolean]): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = getVisible)
  
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
}

