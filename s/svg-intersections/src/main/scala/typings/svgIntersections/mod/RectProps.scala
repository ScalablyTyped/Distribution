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
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined
  ): RectProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectProps]
  }
}

