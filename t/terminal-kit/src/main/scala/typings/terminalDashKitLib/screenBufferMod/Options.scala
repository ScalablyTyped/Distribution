package typings
package terminalDashKitLib.screenBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blending: js.UndefOr[scala.Boolean] = js.undefined
  var dst: terminalDashKitLib.terminalMod.Terminal | ScreenBuffer
  var height: js.UndefOr[scala.Double] = js.undefined
  var noFill: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dst: terminalDashKitLib.terminalMod.Terminal | ScreenBuffer,
    blending: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    noFill: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    if (!js.isUndefined(blending)) __obj.updateDynamic("blending")(blending)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(noFill)) __obj.updateDynamic("noFill")(noFill)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

