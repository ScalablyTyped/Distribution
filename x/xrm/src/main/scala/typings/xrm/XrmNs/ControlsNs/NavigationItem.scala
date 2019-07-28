package typings.xrm.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a navigation item.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-navigation External Link: formContext.ui.navigation item (Client API reference)}
  */
trait NavigationItem
  extends UiStandardElement
     with UiFocusable {
  /**
    * Gets the name of the item.
    * @returns The identifier.
    */
  def getId(): String
}

object NavigationItem {
  @scala.inline
  def apply(
    getId: () => String,
    getLabel: () => String,
    getVisible: () => Boolean,
    setFocus: () => Unit,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): NavigationItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), getVisible = js.Any.fromFunction0(getVisible), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[NavigationItem]
  }
}

