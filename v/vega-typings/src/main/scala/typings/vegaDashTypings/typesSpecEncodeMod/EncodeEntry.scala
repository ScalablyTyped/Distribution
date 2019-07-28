package typings.vegaDashTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeEntry
  extends /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] {
  var cursor: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var fill: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  var fillOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var height: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var opacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var stroke: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  var strokeCap: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var strokeDash: js.UndefOr[ProductionRule[ScaledValueRef[js.Array[Double]]]] = js.undefined
  var strokeDashOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var strokeJoin: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var strokeMiterLimit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var strokeOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var strokeWidth: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var tooltip: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var width: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var x: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var x2: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var xc: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var y: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var y2: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var yc: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

object EncodeEntry {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] = null,
    cursor: ProductionRule[StringValueRef] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
    stroke: ProductionRule[ColorValueRef] = null,
    strokeCap: ProductionRule[StringValueRef] = null,
    strokeDash: ProductionRule[ScaledValueRef[js.Array[Double]]] = null,
    strokeDashOffset: ProductionRule[NumericValueRef] = null,
    strokeJoin: ProductionRule[StringValueRef] = null,
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
    yc: ProductionRule[NumericValueRef] = null
  ): EncodeEntry = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[EncodeEntry]
  }
}

