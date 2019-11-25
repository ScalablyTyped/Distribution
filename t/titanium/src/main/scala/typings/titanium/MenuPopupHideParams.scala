package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for hiding a menu popup with <Titanium.UI.iOS.MenuPopup.hide>.
  */
trait MenuPopupHideParams extends js.Object {
  /**
  	 * Determines whether the menu popup should be opened or closed animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object MenuPopupHideParams {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): MenuPopupHideParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupHideParams]
  }
}

