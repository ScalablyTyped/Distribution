package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.close> method.
  */
trait closeWindowParams extends js.Object {
  /**
  	 * Animation resource to use for the incoming activity.
  	 */
  var activityEnterAnimation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Animation resource to use for the outgoing activity (heavyweight window).
  	 */
  var activityExitAnimation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Determines whether to use an animated effect when the window is closed.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
}

object closeWindowParams {
  @scala.inline
  def apply(
    activityEnterAnimation: scala.Int | scala.Double = null,
    activityExitAnimation: scala.Int | scala.Double = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined
  ): closeWindowParams = {
    val __obj = js.Dynamic.literal()
    if (activityEnterAnimation != null) __obj.updateDynamic("activityEnterAnimation")(activityEnterAnimation.asInstanceOf[js.Any])
    if (activityExitAnimation != null) __obj.updateDynamic("activityExitAnimation")(activityExitAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    __obj.asInstanceOf[closeWindowParams]
  }
}

