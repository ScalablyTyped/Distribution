package typings.terminalDashKit.screenBufferMod

import typings.terminalDashKit.terminalDashKitStrings.x
import typings.terminalDashKit.terminalDashKitStrings.y
import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var blending: js.UndefOr[Boolean] = js.undefined
  var delta: js.UndefOr[Boolean] = js.undefined
  var dst: js.UndefOr[Terminal | ScreenBuffer] = js.undefined
  var dstClipRect: js.UndefOr[typings.terminalDashKit.rectMod.^] = js.undefined
  var srcClipRect: js.UndefOr[typings.terminalDashKit.rectMod.^] = js.undefined
  var tile: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean | x | y] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    blending: js.UndefOr[Boolean] = js.undefined,
    delta: js.UndefOr[Boolean] = js.undefined,
    dst: Terminal | ScreenBuffer = null,
    dstClipRect: typings.terminalDashKit.rectMod.^ = null,
    srcClipRect: typings.terminalDashKit.rectMod.^ = null,
    tile: js.UndefOr[Boolean] = js.undefined,
    wrap: Boolean | x | y = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blending)) __obj.updateDynamic("blending")(blending.asInstanceOf[js.Any])
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (dst != null) __obj.updateDynamic("dst")(dst.asInstanceOf[js.Any])
    if (dstClipRect != null) __obj.updateDynamic("dstClipRect")(dstClipRect.asInstanceOf[js.Any])
    if (srcClipRect != null) __obj.updateDynamic("srcClipRect")(srcClipRect.asInstanceOf[js.Any])
    if (!js.isUndefined(tile)) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

