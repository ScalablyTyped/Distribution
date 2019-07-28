package typings.styleDashValueDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Color {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: Double
  var green: Double
  var red: Double
}

object RGBA {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double, alpha: Int | Double = null): RGBA = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

