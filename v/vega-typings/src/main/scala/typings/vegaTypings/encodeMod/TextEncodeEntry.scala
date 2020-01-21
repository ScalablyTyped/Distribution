package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncodeEntry
  extends EncodeEntry
     with AlignProperty
     with ThetaProperty {
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var baseline: js.UndefOr[ProductionRule[TextBaselineValueRef]] = js.undefined
  var dir: js.UndefOr[ProductionRule[ScaledValueRef[TextDirection]]] = js.undefined
  var dx: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var dy: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var ellipsis: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var font: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var fontSize: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var fontStyle: js.UndefOr[ProductionRule[FontStyleValueRef]] = js.undefined
  var fontWeight: js.UndefOr[ProductionRule[FontWeightValueRef]] = js.undefined
  var limit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var lineBreak: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var lineHeight: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var radius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var text: js.UndefOr[ProductionRule[TextValueRef]] = js.undefined
}

object TextEncodeEntry {
  @scala.inline
  def apply(
    align: ProductionRule[ScaledValueRef[Align]] = null,
    angle: ProductionRule[NumericValueRef] = null,
    baseline: ProductionRule[TextBaselineValueRef] = null,
    cursor: ProductionRule[StringValueRef] = null,
    dir: ProductionRule[ScaledValueRef[TextDirection]] = null,
    dx: ProductionRule[NumericValueRef] = null,
    dy: ProductionRule[NumericValueRef] = null,
    ellipsis: ProductionRule[StringValueRef] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    font: ProductionRule[StringValueRef] = null,
    fontSize: ProductionRule[NumericValueRef] = null,
    fontStyle: ProductionRule[FontStyleValueRef] = null,
    fontWeight: ProductionRule[FontWeightValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    limit: ProductionRule[NumericValueRef] = null,
    lineBreak: ProductionRule[StringValueRef] = null,
    lineHeight: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
    radius: ProductionRule[NumericValueRef] = null,
    stroke: ProductionRule[ColorValueRef] = null,
    strokeCap: ProductionRule[StringValueRef] = null,
    strokeDash: ProductionRule[ScaledValueRef[js.Array[Double]]] = null,
    strokeDashOffset: ProductionRule[NumericValueRef] = null,
    strokeJoin: ProductionRule[StringValueRef] = null,
    strokeMiterLimit: ProductionRule[NumericValueRef] = null,
    strokeOpacity: ProductionRule[NumericValueRef] = null,
    strokeWidth: ProductionRule[NumericValueRef] = null,
    text: ProductionRule[TextValueRef] = null,
    theta: ProductionRule[NumericValueRef] = null,
    tooltip: ProductionRule[StringValueRef] = null,
    width: ProductionRule[NumericValueRef] = null,
    x: ProductionRule[NumericValueRef] = null,
    x2: ProductionRule[NumericValueRef] = null,
    xc: ProductionRule[NumericValueRef] = null,
    y: ProductionRule[NumericValueRef] = null,
    y2: ProductionRule[NumericValueRef] = null,
    yc: ProductionRule[NumericValueRef] = null
  ): TextEncodeEntry = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xc != null) __obj.updateDynamic("xc")(xc.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (yc != null) __obj.updateDynamic("yc")(yc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncodeEntry]
  }
}

