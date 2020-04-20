package typings.titanium

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
  var activityEnterAnimation: js.UndefOr[Double] = js.undefined
  /**
  	 * Animation resource to use for the outgoing activity.
  	 */
  var activityExitAnimation: js.UndefOr[Double] = js.undefined
  /**
  	 * Determines whether to use an animated effect when the window is closed. Defaults to `true` on Android, `false` on iOS.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * duration of the animation in milliseconds
  	 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Transition type to use during a transition animation.
  	 */
  var animationStyle: js.UndefOr[Double] = js.undefined
}

object closeWindowParams {
  @scala.inline
  def apply(
    activityEnterAnimation: Int | Double = null,
    activityExitAnimation: Int | Double = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationStyle: Int | Double = null
  ): closeWindowParams = {
    val __obj = js.Dynamic.literal()
    if (activityEnterAnimation != null) __obj.updateDynamic("activityEnterAnimation")(activityEnterAnimation.asInstanceOf[js.Any])
    if (activityExitAnimation != null) __obj.updateDynamic("activityExitAnimation")(activityExitAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationStyle != null) __obj.updateDynamic("animationStyle")(animationStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[closeWindowParams]
  }
}

