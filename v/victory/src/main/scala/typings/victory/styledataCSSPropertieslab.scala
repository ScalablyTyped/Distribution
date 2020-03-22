package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  data ? :react.react.CSSProperties,   labels ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait styledataCSSPropertieslab extends js.Object {
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonData] = js.undefined
  var width: Double
}

object styledataCSSPropertieslab {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    padding: Int | Double = null,
    style: AnonData = null
  ): styledataCSSPropertieslab = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[styledataCSSPropertieslab]
  }
}

