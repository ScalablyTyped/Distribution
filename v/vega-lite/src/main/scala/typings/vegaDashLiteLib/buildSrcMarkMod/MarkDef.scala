package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkDef
  extends MarkConfig
     with BarBinSpacingMixins
     with PointOverlayMixins
     with LineOverlayMixins
     with TickThicknessMixins
     with MarkDefMixins
     with _AnyMark {
  /**
    * The mark type.
    * One of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
    * `"area"`, `"point"`, `"geoshape"`, `"rule"`, and `"text"`.
    */
  var `type`: Mark
}

object MarkDef {
  @scala.inline
  def apply(
    `type`: Mark,
    align: vegaDashLiteLib.buildSrcVegaDotSchemaMod.HorizontalAlign = null,
    angle: scala.Int | scala.Double = null,
    baseline: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VerticalAlign = null,
    binSpacing: scala.Int | scala.Double = null,
    clip: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    cursor: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Cursor = null,
    dir: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Dir = null,
    dx: scala.Int | scala.Double = null,
    dy: scala.Int | scala.Double = null,
    ellipsis: java.lang.String = null,
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
    line: scala.Boolean | OverlayMarkDef = null,
    opacity: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Orient = null,
    point: scala.Boolean | OverlayMarkDef | vegaDashLiteLib.vegaDashLiteLibStrings.transparent = null,
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
    style: java.lang.String | js.Array[java.lang.String] = null,
    tension: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    theta: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null,
    tooltip: js.Any = null,
    x2Offset: scala.Int | scala.Double = null,
    xOffset: scala.Int | scala.Double = null,
    y2Offset: scala.Int | scala.Double = null,
    yOffset: scala.Int | scala.Double = null
  ): MarkDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (binSpacing != null) __obj.updateDynamic("binSpacing")(binSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis)
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
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
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
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (x2Offset != null) __obj.updateDynamic("x2Offset")(x2Offset.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (y2Offset != null) __obj.updateDynamic("y2Offset")(y2Offset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef]
  }
}

