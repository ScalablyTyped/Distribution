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

