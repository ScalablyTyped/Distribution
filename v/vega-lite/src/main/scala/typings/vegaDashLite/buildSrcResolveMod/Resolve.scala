package typings.vegaDashLite.buildSrcResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  var axis: js.UndefOr[AxisResolveMap] = js.undefined
  var legend: js.UndefOr[LegendResolveMap] = js.undefined
  var scale: js.UndefOr[ScaleResolveMap] = js.undefined
}

object Resolve {
  @scala.inline
  def apply(axis: AxisResolveMap = null, legend: LegendResolveMap = null, scale: ScaleResolveMap = null): Resolve = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[Resolve]
  }
}

