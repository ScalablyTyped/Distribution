package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setContentInsets](Titanium.UI.ListView.setContentInsets) method.
  */
trait ListViewContentInsetOption extends js.Object {
  /**
  	 * Determines whether the list view's content inset change is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The duration in `milliseconds` for animation while the content inset is  being changed.
  	 */
  var duration: js.UndefOr[Double] = js.undefined
}

object ListViewContentInsetOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, duration: Int | Double = null): ListViewContentInsetOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewContentInsetOption]
  }
}

