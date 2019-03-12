package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
  * of the grid control.
  * @deprecated Use {@link Xrm.Controls.ViewSelector} instead.
  */
trait ViewSelector
  extends xrmLib.XrmNs.ControlsNs.ViewSelector

object ViewSelector {
  @scala.inline
  def apply(
    getCurrentView: () => xrmLib.XrmNs.ControlsNs.ViewSelectorItem,
    isVisible: () => scala.Boolean,
    setCurrentView: xrmLib.XrmNs.ControlsNs.ViewSelectorItem => scala.Unit
  ): ViewSelector = {
    val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), isVisible = js.Any.fromFunction0(isVisible), setCurrentView = js.Any.fromFunction1(setCurrentView))
  
    __obj.asInstanceOf[ViewSelector]
  }
}

