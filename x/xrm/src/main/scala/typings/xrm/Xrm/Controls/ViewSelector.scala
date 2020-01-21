package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.LookupValue
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
  def getCurrentView(): LookupValue
  /**
    * Use this method to determine whether the view selector is visible.
    * @returns true if visible, false if not.
    */
  def isVisible(): Boolean
  /**
    * Use this method to set the current view.
    * @param viewSelectorItem The view selector item.
    */
  def setCurrentView(viewSelectorItem: LookupValue): Unit
}

object ViewSelector {
  @scala.inline
  def apply(getCurrentView: () => LookupValue, isVisible: () => Boolean, setCurrentView: LookupValue => Unit): ViewSelector = {
    val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), isVisible = js.Any.fromFunction0(isVisible), setCurrentView = js.Any.fromFunction1(setCurrentView))
  
    __obj.asInstanceOf[ViewSelector]
  }
}

