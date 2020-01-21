package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectProps
  extends _SvgProperties[js.Any] {
  var height: Double
  var rx: js.UndefOr[Double] = js.undefined
  var ry: js.UndefOr[Double] = js.undefined
  var width: Double
  var x: Double
  var y: Double
}

object RectProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    rx: Int | Double = null,
    ry: Int | Double = null
  ): RectProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectProps]
  }
}

