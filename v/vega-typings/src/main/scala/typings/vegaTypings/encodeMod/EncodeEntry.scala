package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeEntry
  extends /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] {
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG element, removing the mark item from the ARIA accessibility tree.
    */
  var aria: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  /**
    * Sets the type of user interface element of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "role" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRole: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  /**
    * A human-readable, author-localized description for the role of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the "aria-roledescription" attribute.
    * Warning: this property is experimental and may be changed in the future.
    */
  var ariaRoleDescription: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var blend: js.UndefOr[ProductionRule[ScaledValueRef[Blend]]] = js.undefined
  var cursor: js.UndefOr[ProductionRule[ScaledValueRef[Cursor]]] = js.undefined
  /**
    * A text description of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If specified, this property determines the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute).
    */
  var description: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var fill: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  var fillOpacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var height: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var opacity: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var stroke: js.UndefOr[ProductionRule[ColorValueRef]] = js.undefined
  var strokeCap: js.UndefOr[ProductionRule[ScaledValueRef[StrokeCap]]] = js.undefined
  var strokeDash: js.UndefOr[ProductionRule[ScaledValueRef[js.Array[Double]]]] = js.undefined
  var strokeDashOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var strokeJoin: js.UndefOr[ProductionRule[ScaledValueRef[StrokeJoin]]] = js.undefined
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
  var zindex: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

object EncodeEntry {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.UndefOr[ProductionRule[ArbitraryValueRef]]] = null,
    aria: ProductionRule[BooleanValueRef] = null,
    ariaRole: ProductionRule[StringValueRef] = null,
    ariaRoleDescription: ProductionRule[StringValueRef] = null,
    blend: ProductionRule[ScaledValueRef[Blend]] = null,
    cursor: ProductionRule[ScaledValueRef[Cursor]] = null,
    description: ProductionRule[StringValueRef] = null,
    fill: ProductionRule[ColorValueRef] = null,
    fillOpacity: ProductionRule[NumericValueRef] = null,
    height: ProductionRule[NumericValueRef] = null,
    opacity: ProductionRule[NumericValueRef] = null,
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
  ): EncodeEntry = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (ariaRoleDescription != null) __obj.updateDynamic("ariaRoleDescription")(ariaRoleDescription.asInstanceOf[js.Any])
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
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
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeEntry]
  }
}

