package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveNodeRect extends js.Object {
  /**
    * bottom
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * left
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * right
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * top
    */
  var top: js.UndefOr[Double] = js.undefined
}

object ObserveNodeRect {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): ObserveNodeRect = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveNodeRect]
  }
}

