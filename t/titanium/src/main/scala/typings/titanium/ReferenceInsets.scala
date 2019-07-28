package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary to specify edge insets for <Titanium.UI.iOS.CollisionBehavior.referenceInsets>.
  */
trait ReferenceInsets extends js.Object {
  /**
  	 * Bottom inset.
  	 */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
  	 * Left inset.
  	 */
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * Right inset.
  	 */
  var right: js.UndefOr[Double] = js.undefined
  /**
  	 * Top inset.
  	 */
  var top: js.UndefOr[Double] = js.undefined
}

object ReferenceInsets {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): ReferenceInsets = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceInsets]
  }
}

