package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeBaseProps extends js.Object {
  var colorScale: js.Array[String]
  var height: Double
  var padding: js.UndefOr[Double] = js.undefined
  var width: Double
}

object ThemeBaseProps {
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double, padding: Int | Double = null): ThemeBaseProps = {
    val __obj = js.Dynamic.literal(colorScale = colorScale, height = height, width = width)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBaseProps]
  }
}

