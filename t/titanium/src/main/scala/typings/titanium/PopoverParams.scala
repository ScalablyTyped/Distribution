package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for <Titanium.UI.iPad.Popover.show> and <Titanium.UI.iPad.Popover.hide>.
  */
trait PopoverParams extends js.Object {
  /**
  	 * Indicates whether to animate showing or hiding the popover.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets the arrow position of the popover relative to the attached view object's dimensions
  	 * when showing the popover.
  	 */
  var rect: js.UndefOr[Dimension] = js.undefined
  /**
  	 * Attaches the popover to the specified view when showing the popover.
  	 */
  var view: View
}

object PopoverParams {
  @scala.inline
  def apply(view: View, animated: js.UndefOr[Boolean] = js.undefined, rect: Dimension = null): PopoverParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverParams]
  }
}

