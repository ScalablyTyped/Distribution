package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary to specify edge insets for <Titanium.UI.Tab.iconInsets>.
  */
trait TabIconInsets extends js.Object {
  /**
  	 * Left inset.
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Top inset.
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object TabIconInsets {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): TabIconInsets = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIconInsets]
  }
}

