package typings
package titaniumLib

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
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Animation to hide the current window.
  	 */
  var transitionFrom: js.UndefOr[titaniumLib.TitaniumNs.UINs.Animation] = js.undefined
  /**
  	 * Animation to show the new window.
  	 */
  var transitionTo: js.UndefOr[titaniumLib.TitaniumNs.UINs.Animation] = js.undefined
}

object transitionAnimationParam {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    transitionFrom: titaniumLib.TitaniumNs.UINs.Animation = null,
    transitionTo: titaniumLib.TitaniumNs.UINs.Animation = null
  ): transitionAnimationParam = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (transitionFrom != null) __obj.updateDynamic("transitionFrom")(transitionFrom)
    if (transitionTo != null) __obj.updateDynamic("transitionTo")(transitionTo)
    __obj.asInstanceOf[transitionAnimationParam]
  }
}

