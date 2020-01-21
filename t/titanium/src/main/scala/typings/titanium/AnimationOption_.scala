package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter to enable animation to [hide](Titanium.UI.View.hide) and [show](Titanium.UI.View.show).
  */
trait AnimationOption_ extends js.Object {
  /**
  	 * Determines whether to enable a circular reveal animation.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object AnimationOption_ {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): AnimationOption_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOption_]
  }
}

