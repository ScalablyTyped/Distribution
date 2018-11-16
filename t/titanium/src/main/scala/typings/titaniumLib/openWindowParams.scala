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

