package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional parameter to enable animation to [hide](Titanium.UI.View.hide) and [show](Titanium.UI.View.show).
  */
trait AnimationOption extends js.Object {
  /**
  	 * Determines whether to enable a circular reveal animation.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
}

/**
  * Optional parameter for [setShowMasterInPortrait](Titanium.UI.iOS.SplitWindow.setShowMasterInPortrait) and
  * [setMasterIsOverlayed](Titanium.UI.iOS.SplitWindow.setMasterIsOverlayed) methods.
  */
trait animationOption extends js.Object {
  /**
  	 * Determines whether the change is animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
}

