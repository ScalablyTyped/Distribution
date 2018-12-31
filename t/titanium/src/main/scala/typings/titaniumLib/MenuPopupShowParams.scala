package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for showing a menu popup with <Titanium.UI.iOS.MenuPopup.show>.
  */
trait MenuPopupShowParams extends js.Object {
  /**
  	 * Determines whether the menu popup should be opened or closed animated.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates the arrow direction of the menu popup.
  	 */
  var arrowDirection: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The view where the menu pop is shown at.
  	 */
  var view: titaniumLib.TitaniumNs.UINs.View
}

