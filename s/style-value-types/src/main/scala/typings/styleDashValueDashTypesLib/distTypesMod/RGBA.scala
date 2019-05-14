package typings
package styleDashValueDashTypesLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Color {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object RGBA {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double, alpha: scala.Int | scala.Double = null): RGBA = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

