package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setZoomScale](Titanium.UI.ScrollView.setZoomScale) method.
  */
trait zoomScaleOption extends js.Object {
  /**
  	 * Determines whether the scroll view's zooming is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object zoomScaleOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): zoomScaleOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[zoomScaleOption]
  }
}

