package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupEncodeEntry extends RectEncodeEntry {
  var clip: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  var strokeForeground: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  var strokeOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

object GroupEncodeEntry {
  @scala.inline
  def apply(
    blend: ProductionRule[ScaledValueRef[Blend]] = null,
    clip: ProductionRule[BooleanValueRef] = null,
    cornerRadius: ProductionRule[NumericValueRef] = null,
    cornerRadiusBottomLeft: ProductionRule[NumericValueRef] = null,
    cornerRadiusBottomRight: ProductionRule[NumericValueRef] = null,
    cornerRadiusTopLeft: ProductionRule[NumericValueRef] = null,
    cornerRadiusTopRight: ProductionRule[NumericValueRef] = null,
    cursor: ProductionRule[StringValueRef] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
    stroke: ProductionRule[ColorValueRef] = null,
    strokeCap: ProductionRule[StringValueRef] = null,
    strokeDash: ProductionRule[ScaledValueRef[js.Array[Double]]] = null,
    strokeDashOffset: ProductionRule[NumericValueRef] = null,
    strokeForeground: ProductionRule[BooleanValueRef] = null,
    strokeJoin: ProductionRule[StringValueRef] = null,
    strokeMiterLimit: ProductionRule[NumericValueRef] = null,
    strokeOffset: ProductionRule[NumericValueRef] = null,
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
  ): GroupEncodeEntry = {
    val __obj = js.Dynamic.literal()
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cornerRadiusBottomLeft != null) __obj.updateDynamic("cornerRadiusBottomLeft")(cornerRadiusBottomLeft.asInstanceOf[js.Any])
    if (cornerRadiusBottomRight != null) __obj.updateDynamic("cornerRadiusBottomRight")(cornerRadiusBottomRight.asInstanceOf[js.Any])
    if (cornerRadiusTopLeft != null) __obj.updateDynamic("cornerRadiusTopLeft")(cornerRadiusTopLeft.asInstanceOf[js.Any])
    if (cornerRadiusTopRight != null) __obj.updateDynamic("cornerRadiusTopRight")(cornerRadiusTopRight.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeForeground != null) __obj.updateDynamic("strokeForeground")(strokeForeground.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOffset != null) __obj.updateDynamic("strokeOffset")(strokeOffset.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GroupEncodeEntry]
  }
}

