package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.open> method.
  */
trait openWindowParams extends js.Object {
  /**
  	 * Animation resource to run on the activity (heavyweight window) being opened.
  	 */
  var activityEnterAnimation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Animation resource to run on the activity that is being put in background as a heavyweight window is being opened above it.
  	 */
  var activityExitAnimation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Determines whether to use an animated effect when the window is shown.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Window's bottom position, in platform-specific units.
  	 */
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Determines if the window is fullscreen.
  	 */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Window's height, in platform-specific units.
  	 */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Window's left position, in platform-specific units.
  	 */
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Determines whether to open the window modal in front of other windows.
  	 */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Presentation style of this modal window.
  	 */
  var modalStyle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Transition style of this modal window.
  	 */
  var modalTransitionStyle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * For modal windows, hides the nav bar (`true`) or shows the nav bar (`false`).
  	 */
  var navBarHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Window's right position, in platform-specific units.
  	 */
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Window's top position, in platform-specific units.
  	 */
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Transition style of this non-modal window.
  	 */
  var transition: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Window's width, in platform-specific units.
  	 */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object openWindowParams {
  @scala.inline
  def apply(
    activityEnterAnimation: scala.Int | scala.Double = null,
    activityExitAnimation: scala.Int | scala.Double = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    bottom: scala.Double | java.lang.String = null,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    left: scala.Double | java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    modalStyle: scala.Int | scala.Double = null,
    modalTransitionStyle: scala.Int | scala.Double = null,
    navBarHidden: js.UndefOr[scala.Boolean] = js.undefined,
    right: scala.Double | java.lang.String = null,
    top: scala.Double | java.lang.String = null,
    transition: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): openWindowParams = {
    val __obj = js.Dynamic.literal()
    if (activityEnterAnimation != null) __obj.updateDynamic("activityEnterAnimation")(activityEnterAnimation.asInstanceOf[js.Any])
    if (activityExitAnimation != null) __obj.updateDynamic("activityExitAnimation")(activityExitAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalStyle != null) __obj.updateDynamic("modalStyle")(modalStyle.asInstanceOf[js.Any])
    if (modalTransitionStyle != null) __obj.updateDynamic("modalTransitionStyle")(modalTransitionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(navBarHidden)) __obj.updateDynamic("navBarHidden")(navBarHidden)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[openWindowParams]
  }
}

