package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroupOptions extends js.Object {
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[Unit]] = js.undefined
   // TODO
  var excludeFromLegend: js.UndefOr[Boolean] = js.undefined
  var interpolation: js.UndefOr[Boolean | InterpolationOptions] = js.undefined
  var shaded: js.UndefOr[Graph2dShadedOption] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.undefined
}

object DataGroupOptions {
  @scala.inline
  def apply(
    drawPoints: Graph2dDrawPointsOption | js.Function0[Unit] = null,
    excludeFromLegend: js.UndefOr[Boolean] = js.undefined,
    interpolation: Boolean | InterpolationOptions = null,
    shaded: Graph2dShadedOption = null,
    style: String = null,
    yAxisOrientation: RightLeftEnumType = null
  ): DataGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (drawPoints != null) __obj.updateDynamic("drawPoints")(drawPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromLegend)) __obj.updateDynamic("excludeFromLegend")(excludeFromLegend.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (shaded != null) __obj.updateDynamic("shaded")(shaded.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (yAxisOrientation != null) __obj.updateDynamic("yAxisOrientation")(yAxisOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroupOptions]
  }
}

