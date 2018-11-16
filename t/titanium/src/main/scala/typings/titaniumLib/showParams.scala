package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Dictionary of options for the <Titanium.UI.OptionDialog.show> method.
 */

trait showParams extends js.Object {
  /**
  	 * Determines whether to animate the dialog as it is shown.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var buttonNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * String to be used as a message for the dialog.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Array of String instances.
  	 */
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * Positions the arrow of the option dialog relative to the attached view's dimensions.
  	 */
  var rect: js.UndefOr[Dimension] = js.undefined
  /**
  	 * String to be used as title for the dialog.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * View to which to attach the dialog.
  	 */
  var view: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
}

