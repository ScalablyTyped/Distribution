package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for focusable UI elements.
  * @deprecated Use {@link Xrm.Controls.UiFocusable} instead.
  */
trait UiFocusable
  extends xrmLib.XrmNs.ControlsNs.UiFocusable

object UiFocusable {
  @scala.inline
  def apply(setFocus: js.Function0[scala.Unit]): UiFocusable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.asInstanceOf[UiFocusable]
  }
}

