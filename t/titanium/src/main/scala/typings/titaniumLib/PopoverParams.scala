package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for <Titanium.UI.iPad.Popover.show> and <Titanium.UI.iPad.Popover.hide>.
  */
trait PopoverParams extends js.Object {
  /**
  	 * Indicates whether to animate showing or hiding the popover.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the arrow position of the popover relative to the attached view object's dimensions
  	 * when showing the popover.
  	 */
  var rect: js.UndefOr[Dimension] = js.undefined
  /**
  	 * Attaches the popover to the specified view when showing the popover.
  	 */
  var view: titaniumLib.TitaniumNs.UINs.View
}

