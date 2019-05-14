package typings
package styleDashValueDashTypesLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLA extends Color {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var hue: scala.Double
  var lightness: scala.Double
  var saturation: scala.Double
}

object HSLA {
  @scala.inline
  def apply(
    hue: scala.Double,
    lightness: scala.Double,
    saturation: scala.Double,
    alpha: scala.Int | scala.Double = null
  ): HSLA = {
    val __obj = js.Dynamic.literal(hue = hue, lightness = lightness, saturation = saturation)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLA]
  }
}

