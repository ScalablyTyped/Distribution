package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorLikeObject extends _ColorValue {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: Double
  var green: Double
  var red: Double
}

object ColorLikeObject {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double, alpha: Int | Double = null): ColorLikeObject = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLikeObject]
  }
}

