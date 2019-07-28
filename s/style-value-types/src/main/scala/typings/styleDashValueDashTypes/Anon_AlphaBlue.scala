package typings.styleDashValueDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaBlue extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: Double
  var green: Double
  var red: Double
}

object Anon_AlphaBlue {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double, alpha: Int | Double = null): Anon_AlphaBlue = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlphaBlue]
  }
}

