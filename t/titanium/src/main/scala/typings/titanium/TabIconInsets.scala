package typings.titanium

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
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * Top inset.
  	 */
  var top: js.UndefOr[Double] = js.undefined
}

object TabIconInsets {
  @scala.inline
  def apply(left: Int | Double = null, top: Int | Double = null): TabIconInsets = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIconInsets]
  }
}

