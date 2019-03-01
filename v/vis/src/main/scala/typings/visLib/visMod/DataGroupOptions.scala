package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroupOptions extends js.Object {
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[scala.Unit]] = js.undefined
   // TODO
  var excludeFromLegend: js.UndefOr[scala.Boolean] = js.undefined
  var interpolation: js.UndefOr[scala.Boolean | InterpolationOptions] = js.undefined
  var shaded: js.UndefOr[Graph2dShadedOption] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.undefined
}

object DataGroupOptions {
  @scala.inline
  def apply(
    drawPoints: Graph2dDrawPointsOption | js.Function0[scala.Unit] = null,
    excludeFromLegend: js.UndefOr[scala.Boolean] = js.undefined,
    interpolation: scala.Boolean | InterpolationOptions = null,
    shaded: Graph2dShadedOption = null,
    style: java.lang.String = null,
    yAxisOrientation: RightLeftEnumType = null
  ): DataGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (drawPoints != null) __obj.updateDynamic("drawPoints")(drawPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromLegend)) __obj.updateDynamic("excludeFromLegend")(excludeFromLegend)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (shaded != null) __obj.updateDynamic("shaded")(shaded)
    if (style != null) __obj.updateDynamic("style")(style)
    if (yAxisOrientation != null) __obj.updateDynamic("yAxisOrientation")(yAxisOrientation)
    __obj.asInstanceOf[DataGroupOptions]
  }
}

