package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  data ? :react.react.CSSProperties,   labels ? :react.react.CSSProperties,   flyout ? :react.react.CSSProperties}} & victory.victory.ThemeBaseProps */
trait styledataCSSPropertieslabColorScale extends js.Object {
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Flyout] = js.undefined
  var width: Double
}

object styledataCSSPropertieslabColorScale {
  @scala.inline
  def apply(
    colorScale: js.Array[String],
    height: Double,
    width: Double,
    padding: js.UndefOr[Double] = js.undefined,
    style: Flyout = null
  ): styledataCSSPropertieslabColorScale = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[styledataCSSPropertieslabColorScale]
  }
}

