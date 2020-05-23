package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
trait TabContainer extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the child DOM element that receives tab focus.
    **/
  var childFocus: HTMLElement
  /**
    * Gets or sets the tab index of this container.
    **/
  var tabIndex: Double
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this TabContainer. Call this method when the TabContainer is no longer needed. After calling this method, the TabContainer becomes unusable.
    **/
  def dispose(): Unit
}

object TabContainer {
  @scala.inline
  def apply(childFocus: HTMLElement, dispose: () => Unit, tabIndex: Double): TabContainer = {
    val __obj = js.Dynamic.literal(childFocus = childFocus.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContainer]
  }
}

