package typings
package terminalDashKitLib.rectMod.RectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsoluteOptions extends Options {
  var height: scala.Double
  var width: scala.Double
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object AbsoluteOptions {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): AbsoluteOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsoluteOptions]
  }
}

