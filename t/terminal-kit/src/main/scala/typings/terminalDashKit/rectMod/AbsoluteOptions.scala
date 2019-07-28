package typings.terminalDashKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsoluteOptions extends Options {
  var height: Double
  var width: Double
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AbsoluteOptions {
  @scala.inline
  def apply(height: Double, width: Double, x: Int | Double = null, y: Int | Double = null): AbsoluteOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsoluteOptions]
  }
}

