package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for showing a menu popup with <Titanium.UI.iOS.MenuPopup.show>.
  */
trait MenuPopupShowParams extends js.Object {
  /**
  	 * Determines whether the menu popup should be opened or closed animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates the arrow direction of the menu popup.
  	 */
  var arrowDirection: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The view where the menu pop is shown at.
  	 */
  var view: titaniumLib.TitaniumNs.UINs.View
}

object MenuPopupShowParams {
  @scala.inline
  def apply(
    view: titaniumLib.TitaniumNs.UINs.View,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    arrowDirection: scala.Int | scala.Double = null
  ): MenuPopupShowParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(view)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (arrowDirection != null) __obj.updateDynamic("arrowDirection")(arrowDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupShowParams]
  }
}

