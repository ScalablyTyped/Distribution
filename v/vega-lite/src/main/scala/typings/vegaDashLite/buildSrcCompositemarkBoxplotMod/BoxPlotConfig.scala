package typings.vegaDashLite.buildSrcCompositemarkBoxplotMod

import typings.vegaDashLite.buildSrcMarkMod.MarkConfig
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Cursor
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Dir
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.FontStyle
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.FontWeight
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.HorizontalAlign
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Interpolate
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Orient
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.StrokeCap
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.StrokeJoin
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VerticalAlign
import typings.vegaDashLite.vegaDashLiteStrings.`min-max`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxPlotConfig extends MarkConfig {
  /** The default extent, which is used to determine where the whiskers extend to. The options are
    * - `"min-max": min and max are the lower and upper whiskers respectively.
    * - `"number": A scalar (integer or floating point number) that will be multiplied by the IQR and the product will be added to the third quartile to get the upper whisker and subtracted from the first quartile to get the lower whisker.
    */
  var extent: js.UndefOr[`min-max` | Double] = js.undefined
}

object BoxPlotConfig {
  @scala.inline
  def apply(
    align: HorizontalAlign = null,
    angle: Int | Double = null,
    baseline: VerticalAlign = null,
    color: String = null,
    cornerRadius: Int | Double = null,
    cursor: Cursor = null,
    dir: Dir = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    ellipsis: String = null,
    extent: `min-max` | Double = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    filled: js.UndefOr[Boolean] = js.undefined,
    font: String = null,
    fontSize: Int | Double = null,
    fontStyle: FontStyle = null,
    fontWeight: FontWeight = null,
    href: String = null,
    interpolate: Interpolate = null,
    limit: Int | Double = null,
    opacity: Int | Double = null,
    orient: Orient = null,
    radius: Int | Double = null,
    shape: String = null,
    size: Int | Double = null,
    stroke: String = null,
    strokeCap: StrokeCap = null,
    strokeDash: js.Array[Double] = null,
    strokeDashOffset: Int | Double = null,
    strokeJoin: StrokeJoin = null,
    strokeMiterLimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    tension: Int | Double = null,
    text: String = null,
    theta: Int | Double = null,
    tooltip: js.Any = null
  ): BoxPlotConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis)
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap)
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin)
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[BoxPlotConfig]
  }
}

