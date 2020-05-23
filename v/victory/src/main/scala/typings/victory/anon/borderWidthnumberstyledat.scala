package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  borderWidth ? :number,   style ? :{  data ? :react.react.CSSProperties,   labels ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait borderWidthnumberstyledat extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Data] = js.undefined
  var width: Double
}

object borderWidthnumberstyledat {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    borderWidth: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    style: Data = null
  ): borderWidthnumberstyledat = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[borderWidthnumberstyledat]
  }
}

