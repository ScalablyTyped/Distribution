package typings.titanium

import typings.titanium.Titanium.UI.View
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
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates the arrow direction of the menu popup.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.undefined
  /**
  	 * The view where the menu pop is shown at.
  	 */
  var view: View
}

object MenuPopupShowParams {
  @scala.inline
  def apply(view: View, animated: js.UndefOr[Boolean] = js.undefined, arrowDirection: Int | Double = null): MenuPopupShowParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (arrowDirection != null) __obj.updateDynamic("arrowDirection")(arrowDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupShowParams]
  }
}

