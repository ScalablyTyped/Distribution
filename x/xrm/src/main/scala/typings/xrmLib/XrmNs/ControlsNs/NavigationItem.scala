package typings
package xrmLib.XrmNs.ControlsNs

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
  def getId(): java.lang.String
}

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

