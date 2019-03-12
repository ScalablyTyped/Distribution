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
    getId: () => java.lang.String,
    getLabel: () => java.lang.String,
    getVisible: () => scala.Boolean,
    setFocus: () => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): NavigationItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), getVisible = js.Any.fromFunction0(getVisible), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[NavigationItem]
  }
}

