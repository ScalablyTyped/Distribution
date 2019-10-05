package typings.titanium.Titanium.UI.iOS

import typings.titanium.MenuPopupHideParams
import typings.titanium.MenuPopupShowParams
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A menu popup provides the ability to create custom tooltip options using the `items` property
			 * covering the native `UIMenuController` class.
			 * See also:
			 * * [iOS Developer Library: UIMenuController](https://developer.apple.com/documentation/uikit/uimenucontroller)
			 */
@js.native
trait MenuPopup extends Proxy {
  /**
  				 * The items of the menu popup.
  				 */
  var items: String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
  				 */
  def getItems(): String = js.native
  /**
  				 * Hides the menu popup.
  				 */
  def hide(): Unit = js.native
  def hide(params: MenuPopupHideParams): Unit = js.native
  /**
  				 * Indicates whether the menu popup is currently visible.
  				 */
  def isVisible(): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
  				 */
  def setItems(items: String): Unit = js.native
  /**
  				 * Shows the menu popup.
  				 */
  def show(params: MenuPopupShowParams): Unit = js.native
}

