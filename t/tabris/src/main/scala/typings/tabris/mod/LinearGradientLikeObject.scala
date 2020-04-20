package typings.tabris.mod

import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientLikeObject extends _LinearGradientValue {
  var colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])]
  var direction: js.UndefOr[Double | left | top | right | bottom] = js.undefined
}

object LinearGradientLikeObject {
  @scala.inline
  def apply(
    colorStops: js.Array[ColorValue | (js.Tuple2[ColorValue, PercentValue])],
    direction: Double | left | top | right | bottom = null
  ): LinearGradientLikeObject = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientLikeObject]
  }
}

