package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter for [setContentInsets](Titanium.UI.TableView.setContentInsets) method.
  */
trait TableViewContentInsetOption extends js.Object {
  /**
  	 * Determines whether the table view's content inset change is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The duration in `milleseconds` for animation while the content inset is  being changed.
  	 */
  var duration: js.UndefOr[Double] = js.undefined
}

object TableViewContentInsetOption {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, duration: Int | Double = null): TableViewContentInsetOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewContentInsetOption]
  }
}

