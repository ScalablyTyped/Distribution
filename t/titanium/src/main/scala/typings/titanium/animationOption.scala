package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setShowMasterInPortrait](Titanium.UI.iOS.SplitWindow.setShowMasterInPortrait) and
  * [setMasterIsOverlayed](Titanium.UI.iOS.SplitWindow.setMasterIsOverlayed) methods.
  */
trait animationOption extends js.Object {
  /**
  	 * Determines whether the change is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object animationOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): animationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[animationOption]
  }
}

