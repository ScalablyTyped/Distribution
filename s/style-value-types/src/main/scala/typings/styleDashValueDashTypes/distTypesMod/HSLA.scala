package typings.styleDashValueDashTypes.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLA extends Color {
  var alpha: js.UndefOr[Double] = js.undefined
  var hue: Double
  var lightness: Double
  var saturation: Double
}

object HSLA {
  @scala.inline
  def apply(hue: Double, lightness: Double, saturation: Double, alpha: Int | Double = null): HSLA = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLA]
  }
}

