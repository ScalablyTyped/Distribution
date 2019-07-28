package typings.styleDashValueDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var hue: Double
  var lightness: Double
  var saturation: Double
}

object Anon_Alpha {
  @scala.inline
  def apply(hue: Double, lightness: Double, saturation: Double, alpha: Int | Double = null): Anon_Alpha = {
    val __obj = js.Dynamic.literal(hue = hue, lightness = lightness, saturation = saturation)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alpha]
  }
}

