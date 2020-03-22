package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  data ? :react.react.CSSProperties,   labels ? :react.react.CSSProperties},   candleColors ? :{  positive ? :string,   negative ? :string}} & victory.victory.ThemeBaseProps */
trait styledataCSSPropertieslabCandleColors extends js.Object {
  var candleColors: js.UndefOr[AnonNegative] = js.undefined
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonData] = js.undefined
  var width: Double
}

object styledataCSSPropertieslabCandleColors {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    candleColors: AnonNegative = null,
    padding: Int | Double = null,
    style: AnonData = null
  ): styledataCSSPropertieslabCandleColors = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (candleColors != null) __obj.updateDynamic("candleColors")(candleColors.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[styledataCSSPropertieslabCandleColors]
  }
}

