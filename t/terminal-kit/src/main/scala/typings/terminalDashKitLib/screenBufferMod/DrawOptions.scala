package typings
package terminalDashKitLib.screenBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var blending: js.UndefOr[scala.Boolean] = js.undefined
  var delta: js.UndefOr[scala.Boolean] = js.undefined
  var dst: js.UndefOr[terminalDashKitLib.terminalMod.Terminal | ScreenBuffer] = js.undefined
  var dstClipRect: js.UndefOr[terminalDashKitLib.rectMod.^] = js.undefined
  var srcClipRect: js.UndefOr[terminalDashKitLib.rectMod.^] = js.undefined
  var tile: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[
    scala.Boolean | terminalDashKitLib.terminalDashKitLibStrings.x | terminalDashKitLib.terminalDashKitLibStrings.y
  ] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    blending: js.UndefOr[scala.Boolean] = js.undefined,
    delta: js.UndefOr[scala.Boolean] = js.undefined,
    dst: terminalDashKitLib.terminalMod.Terminal | ScreenBuffer = null,
    dstClipRect: terminalDashKitLib.rectMod.^ = null,
    srcClipRect: terminalDashKitLib.rectMod.^ = null,
    tile: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: scala.Boolean | terminalDashKitLib.terminalDashKitLibStrings.x | terminalDashKitLib.terminalDashKitLibStrings.y = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blending)) __obj.updateDynamic("blending")(blending)
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta)
    if (dst != null) __obj.updateDynamic("dst")(dst.asInstanceOf[js.Any])
    if (dstClipRect != null) __obj.updateDynamic("dstClipRect")(dstClipRect)
    if (srcClipRect != null) __obj.updateDynamic("srcClipRect")(srcClipRect)
    if (!js.isUndefined(tile)) __obj.updateDynamic("tile")(tile)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

