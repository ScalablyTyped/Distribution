package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  axis ? :react.react.CSSProperties,   axisLabel ? :react.react.CSSProperties,   grid ? :react.react.CSSProperties,   ticks ? :react.react.CSSProperties,   tickLabels ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait styleaxisCSSPropertiesaxi extends js.Object {
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonAxis] = js.undefined
  var width: Double
}

object styleaxisCSSPropertiesaxi {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    padding: Int | Double = null,
    style: AnonAxis = null
  ): styleaxisCSSPropertiesaxi = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[styleaxisCSSPropertiesaxi]
  }
}

