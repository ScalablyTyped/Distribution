package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

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
trait MenuPopup
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The items of the menu popup.
  				 */
  var items: java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
  				 */
  def getItems(): java.lang.String = js.native
  /**
  				 * Hides the menu popup.
  				 */
  def hide(): scala.Unit = js.native
  /**
  				 * Hides the menu popup.
  				 */
  def hide(params: titaniumLib.MenuPopupHideParams): scala.Unit = js.native
  /**
  				 * Indicates whether the menu popup is currently visible.
  				 */
  def isVisible(): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.MenuPopup.items> property.
  				 */
  def setItems(items: java.lang.String): scala.Unit = js.native
  /**
  				 * Shows the menu popup.
  				 */
  def show(params: titaniumLib.MenuPopupShowParams): scala.Unit = js.native
}

