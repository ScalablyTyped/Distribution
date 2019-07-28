package typings.terminalDashKit.screenBufferMod

import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blending: js.UndefOr[Boolean] = js.undefined
  var dst: Terminal | ScreenBuffer
  var height: js.UndefOr[Double] = js.undefined
  var noFill: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dst: Terminal | ScreenBuffer,
    blending: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    noFill: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
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

