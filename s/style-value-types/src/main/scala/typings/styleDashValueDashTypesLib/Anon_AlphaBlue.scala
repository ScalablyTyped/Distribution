package typings
package styleDashValueDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaBlue extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object Anon_AlphaBlue {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double, alpha: scala.Int | scala.Double = null): Anon_AlphaBlue = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlphaBlue]
  }
}

