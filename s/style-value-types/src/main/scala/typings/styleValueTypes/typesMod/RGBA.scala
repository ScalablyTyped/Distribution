package typings.styleValueTypes.typesMod

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
  def apply(blue: Double, green: Double, red: Double, alpha: js.UndefOr[Double] = js.undefined): RGBA = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

