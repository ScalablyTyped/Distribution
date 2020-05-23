package typings.vegaTypings.encodeMod

import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcEncodeEntry extends EncodeEntry {
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var endAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var innerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var outerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var padAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var startAngle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

object ArcEncodeEntry {
  @scala.inline
  def apply(
    aria: ProductionRule[BooleanValueRef] = null,
    ariaRole: ProductionRule[StringValueRef] = null,
    ariaRoleDescription: ProductionRule[StringValueRef] = null,
    blend: ProductionRule[ScaledValueRef[Blend]] = null,
    cornerRadius: ProductionRule[NumericValueRef] = null,
    cursor: ProductionRule[ScaledValueRef[Cursor]] = null,
    description: ProductionRule[StringValueRef] = null,
    endAngle: ProductionRule[NumericValueRef] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    innerRadius: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
    outerRadius: ProductionRule[NumericValueRef] = null,
    padAngle: ProductionRule[NumericValueRef] = null,
    startAngle: ProductionRule[NumericValueRef] = null,
    stroke: ProductionRule[ColorValueRef] = null,
    strokeCap: ProductionRule[ScaledValueRef[StrokeCap]] = null,
    strokeDash: ProductionRule[ScaledValueRef[js.Array[Double]]] = null,
    strokeDashOffset: ProductionRule[NumericValueRef] = null,
    strokeJoin: ProductionRule[ScaledValueRef[StrokeJoin]] = null,
    strokeMiterLimit: ProductionRule[NumericValueRef] = null,
    strokeOpacity: ProductionRule[NumericValueRef] = null,
    strokeWidth: ProductionRule[NumericValueRef] = null,
    tooltip: ProductionRule[StringValueRef] = null,
    width: ProductionRule[NumericValueRef] = null,
    x: ProductionRule[NumericValueRef] = null,
    x2: ProductionRule[NumericValueRef] = null,
    xc: ProductionRule[NumericValueRef] = null,
    y: ProductionRule[NumericValueRef] = null,
    y2: ProductionRule[NumericValueRef] = null,
    yc: ProductionRule[NumericValueRef] = null,
    zindex: ProductionRule[NumericValueRef] = null
  ): ArcEncodeEntry = {
    val __obj = js.Dynamic.literal()
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (ariaRoleDescription != null) __obj.updateDynamic("ariaRoleDescription")(ariaRoleDescription.asInstanceOf[js.Any])
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xc != null) __obj.updateDynamic("xc")(xc.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (yc != null) __obj.updateDynamic("yc")(yc.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcEncodeEntry]
  }
}

