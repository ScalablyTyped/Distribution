package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setContentOffset](Titanium.UI.ScrollView.setContentOffset) method.
  */
trait contentOffsetOption extends js.Object {
  /**
  	 * Determines whether the scroll view's content area change is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object contentOffsetOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): contentOffsetOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[contentOffsetOption]
  }
}

