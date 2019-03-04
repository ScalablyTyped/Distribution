package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DstRect extends js.Object {
  var dstRect: terminalDashKitLib.rectMod.Rect
  var offsetX: scala.Double
  var offsetY: scala.Double
  var srcRect: terminalDashKitLib.rectMod.Rect
  var wrapOnly: js.UndefOr[
    terminalDashKitLib.terminalDashKitLibStrings.x | terminalDashKitLib.terminalDashKitLibStrings.y
  ] = js.undefined
}

object Anon_DstRect {
  @scala.inline
  def apply(
    dstRect: terminalDashKitLib.rectMod.Rect,
    offsetX: scala.Double,
    offsetY: scala.Double,
    srcRect: terminalDashKitLib.rectMod.Rect,
    wrapOnly: terminalDashKitLib.terminalDashKitLibStrings.x | terminalDashKitLib.terminalDashKitLibStrings.y = null
  ): Anon_DstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect, offsetX = offsetX, offsetY = offsetY, srcRect = srcRect)
    if (wrapOnly != null) __obj.updateDynamic("wrapOnly")(wrapOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DstRect]
  }
}

