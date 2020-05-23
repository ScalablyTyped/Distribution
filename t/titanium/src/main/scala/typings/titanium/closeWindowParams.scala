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
    activityEnterAnimation: js.UndefOr[Double] = js.undefined,
    activityExitAnimation: js.UndefOr[Double] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationStyle: js.UndefOr[Double] = js.undefined
  ): closeWindowParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activityEnterAnimation)) __obj.updateDynamic("activityEnterAnimation")(activityEnterAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(activityExitAnimation)) __obj.updateDynamic("activityExitAnimation")(activityExitAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationStyle)) __obj.updateDynamic("animationStyle")(animationStyle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[closeWindowParams]
  }
}

