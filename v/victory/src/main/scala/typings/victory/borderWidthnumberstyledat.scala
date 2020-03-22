package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  borderWidth ? :number,   style ? :{  data ? :react.react.CSSProperties,   labels ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait borderWidthnumberstyledat extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonData] = js.undefined
  var width: Double
}

object borderWidthnumberstyledat {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    borderWidth: Int | Double = null,
    padding: Int | Double = null,
    style: AnonData = null
  ): borderWidthnumberstyledat = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[borderWidthnumberstyledat]
  }
}

