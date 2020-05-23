package typings.styleValueTypes.typesMod

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
  def apply(hue: Double, lightness: Double, saturation: Double, alpha: js.UndefOr[Double] = js.undefined): HSLA = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLA]
  }
}

