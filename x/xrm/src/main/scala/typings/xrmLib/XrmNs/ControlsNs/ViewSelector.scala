package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
  * of the grid control.
  */
trait ViewSelector extends js.Object {
  /**
    * Use this method to get a reference to the current view.
    * @returns The current view.
    */
  def getCurrentView(): ViewSelectorItem
  /**
    * Use this method to determine whether the view selector is visible.
    * @returns true if visible, false if not.
    */
  def isVisible(): scala.Boolean
  /**
    * Use this method to set the current view.
    * @param viewSelectorItem The view selector item.
    */
  def setCurrentView(viewSelectorItem: ViewSelectorItem): scala.Unit
}

object ViewSelector {
  @scala.inline
  def apply(
    getCurrentView: js.Function0[ViewSelectorItem],
    isVisible: js.Function0[scala.Boolean],
    setCurrentView: js.Function1[ViewSelectorItem, scala.Unit]
  ): ViewSelector = {
    val __obj = js.Dynamic.literal(getCurrentView = getCurrentView, isVisible = isVisible, setCurrentView = setCurrentView)
  
    __obj.asInstanceOf[ViewSelector]
  }
}

