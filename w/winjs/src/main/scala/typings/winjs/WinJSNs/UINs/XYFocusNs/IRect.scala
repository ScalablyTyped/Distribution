package typings.winjs.WinJSNs.UINs.XYFocusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRect extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var height: Double
  var left: Double
  var right: js.UndefOr[Double] = js.undefined
  var top: Double
  var width: Double
}

object IRect {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    top: Double,
    width: Double,
    bottom: Int | Double = null,
    right: Int | Double = null
  ): IRect = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRect]
  }
}

