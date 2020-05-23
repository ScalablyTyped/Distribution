package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  max ? :react.react.CSSProperties,   maxLabels ? :react.react.CSSProperties,   median ? :react.react.CSSProperties,   medianLabels ? :react.react.CSSProperties,   min ? :react.react.CSSProperties,   minLabels ? :react.react.CSSProperties,   q1 ? :react.react.CSSProperties,   q1Labels ? :react.react.CSSProperties,   q3 ? :react.react.CSSProperties,   q3Labels ? :react.react.CSSProperties},   boxWidth ? :number} & victory.victory.ThemeBaseProps */
trait stylemaxCSSPropertiesmaxL extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.undefined
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Max] = js.undefined
  var width: Double
}

object stylemaxCSSPropertiesmaxL {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    boxWidth: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    style: Max = null
  ): stylemaxCSSPropertiesmaxL = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(boxWidth)) __obj.updateDynamic("boxWidth")(boxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[stylemaxCSSPropertiesmaxL]
  }
}

