package typings.vegaTypings.encodeMod

import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageEncodeEntry
  extends EncodeEntry
     with AlignProperty {
  var aspect: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  var baseline: js.UndefOr[ProductionRule[ScaledValueRef[Baseline]]] = js.undefined
  var smooth: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  var url: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
}

object ImageEncodeEntry {
  @scala.inline
  def apply(
    align: ProductionRule[ScaledValueRef[Align]] = null,
    aspect: ProductionRule[BooleanValueRef] = null,
    baseline: ProductionRule[ScaledValueRef[Baseline]] = null,
    blend: ProductionRule[ScaledValueRef[Blend]] = null,
    cursor: ProductionRule[ScaledValueRef[Cursor]] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
    smooth: ProductionRule[BooleanValueRef] = null,
    stroke: ProductionRule[ColorValueRef] = null,
    strokeCap: ProductionRule[ScaledValueRef[StrokeCap]] = null,
    strokeDash: ProductionRule[ScaledValueRef[js.Array[Double]]] = null,
    strokeDashOffset: ProductionRule[NumericValueRef] = null,
    strokeJoin: ProductionRule[ScaledValueRef[StrokeJoin]] = null,
    strokeMiterLimit: ProductionRule[NumericValueRef] = null,
    strokeOpacity: ProductionRule[NumericValueRef] = null,
    strokeWidth: ProductionRule[NumericValueRef] = null,
    tooltip: ProductionRule[StringValueRef] = null,
    url: ProductionRule[StringValueRef] = null,
    width: ProductionRule[NumericValueRef] = null,
    x: ProductionRule[NumericValueRef] = null,
    x2: ProductionRule[NumericValueRef] = null,
    xc: ProductionRule[NumericValueRef] = null,
    y: ProductionRule[NumericValueRef] = null,
    y2: ProductionRule[NumericValueRef] = null,
    yc: ProductionRule[NumericValueRef] = null,
    zindex: ProductionRule[NumericValueRef] = null
  ): ImageEncodeEntry = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xc != null) __obj.updateDynamic("xc")(xc.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (yc != null) __obj.updateDynamic("yc")(yc.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodeEntry]
  }
}

