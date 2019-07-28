package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextField.padding>  that describes the padding
  */
trait TextFieldPadding extends js.Object {
  /**
  	 * Bottom padding (Android only, since 6.1.0)
  	 */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
  	 * Left padding
  	 */
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * Right padding
  	 */
  var right: js.UndefOr[Double] = js.undefined
  /**
  	 * Top padding (Android only, since 6.1.0)
  	 */
  var top: js.UndefOr[Double] = js.undefined
}

object TextFieldPadding {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): TextFieldPadding = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldPadding]
  }
}

