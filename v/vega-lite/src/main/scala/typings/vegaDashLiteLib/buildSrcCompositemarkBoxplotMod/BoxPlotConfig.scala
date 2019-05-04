package typings
package vegaDashLiteLib.buildSrcCompositemarkBoxplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxPlotConfig
  extends vegaDashLiteLib.buildSrcMarkMod.MarkConfig {
  /** The default extent, which is used to determine where the whiskers extend to. The options are
    * - `"min-max": min and max are the lower and upper whiskers respectively.
    * - `"number": A scalar (integer or floating point number) that will be multiplied by the IQR and the product will be added to the third quartile to get the upper whisker and subtracted from the first quartile to get the lower whisker.
    */
  var extent: js.UndefOr[vegaDashLiteLib.vegaDashLiteLibStrings.`min-max` | scala.Double] = js.undefined
}

object BoxPlotConfig {
  @scala.inline
  def apply(
    align: vegaDashLiteLib.buildSrcVegaDotSchemaMod.HorizontalAlign = null,
    angle: scala.Int | scala.Double = null,
    baseline: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VerticalAlign = null,
    color: java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    cursor: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Cursor = null,
    dir: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Dir = null,
    dx: scala.Int | scala.Double = null,
    dy: scala.Int | scala.Double = null,
    ellipsis: java.lang.String = null,
    extent: vegaDashLiteLib.vegaDashLiteLibStrings.`min-max` | scala.Double = null,
    fill: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    filled: js.UndefOr[scala.Boolean] = js.undefined,
    font: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontStyle = null,
    fontWeight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight = null,
    href: java.lang.String = null,
    interpolate: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Interpolate = null,
    limit: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Orient = null,
    radius: scala.Int | scala.Double = null,
    shape: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeCap: vegaDashLiteLib.buildSrcVegaDotSchemaMod.StrokeCap = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeDashOffset: scala.Int | scala.Double = null,
    strokeJoin: vegaDashLiteLib.buildSrcVegaDotSchemaMod.StrokeJoin = null,
    strokeMiterLimit: scala.Int | scala.Double = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    tension: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    theta: scala.Int | scala.Double = null,
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

