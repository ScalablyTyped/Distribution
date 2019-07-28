package typings.titanium

import typings.titanium.TitaniumNs.UINs.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary specifying the transition animation used with the <Titanium.UI.iOS.createTransitionAnimation> method.
  */
trait transitionAnimationParam extends js.Object {
  /**
  	 * Length of the transition in milliseconds.
  	 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  	 * Animation to hide the current window.
  	 */
  var transitionFrom: js.UndefOr[Animation] = js.undefined
  /**
  	 * Animation to show the new window.
  	 */
  var transitionTo: js.UndefOr[Animation] = js.undefined
}

object transitionAnimationParam {
  @scala.inline
  def apply(duration: Int | Double = null, transitionFrom: Animation = null, transitionTo: Animation = null): transitionAnimationParam = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (transitionFrom != null) __obj.updateDynamic("transitionFrom")(transitionFrom)
    if (transitionTo != null) __obj.updateDynamic("transitionTo")(transitionTo)
    __obj.asInstanceOf[transitionAnimationParam]
  }
}

