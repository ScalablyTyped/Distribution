package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a navigation item.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  * @deprecated Use {@link Xrm.Controls.NavigationItem} instead.
  */
trait NavigationItem
  extends xrmLib.XrmNs.ControlsNs.NavigationItem

object NavigationItem {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setFocus: js.Function0[scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): NavigationItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[NavigationItem]
  }
}

