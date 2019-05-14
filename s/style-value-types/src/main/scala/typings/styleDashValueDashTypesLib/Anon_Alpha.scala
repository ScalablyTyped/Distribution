package typings
package styleDashValueDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var hue: scala.Double
  var lightness: scala.Double
  var saturation: scala.Double
}

object Anon_Alpha {
  @scala.inline
  def apply(
    hue: scala.Double,
    lightness: scala.Double,
    saturation: scala.Double,
    alpha: scala.Int | scala.Double = null
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(hue = hue, lightness = lightness, saturation = saturation)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alpha]
  }
}

