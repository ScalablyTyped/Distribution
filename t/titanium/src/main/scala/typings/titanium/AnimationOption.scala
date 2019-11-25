package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter to enable animation to [hide](Titanium.UI.View.hide) and [show](Titanium.UI.View.show).
  */
trait AnimationOption extends js.Object {
  /**
  	 * Determines whether to enable a circular reveal animation.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object AnimationOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): AnimationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOption]
  }
}

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

