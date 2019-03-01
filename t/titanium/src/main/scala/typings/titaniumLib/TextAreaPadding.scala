package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextArea.padding>  that describes the padding
  */
trait TextAreaPadding extends js.Object {
  /**
  	 * Bottom padding
  	 */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Left padding
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Right padding
  	 */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Top padding
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object TextAreaPadding {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): TextAreaPadding = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaPadding]
  }
}

