package typings.terminalDashKit

import typings.terminalDashKit.rectMod.Rect
import typings.terminalDashKit.terminalDashKitStrings.x
import typings.terminalDashKit.terminalDashKitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DstRect extends js.Object {
  var dstRect: Rect
  var offsetX: Double
  var offsetY: Double
  var srcRect: Rect
  var wrapOnly: js.UndefOr[x | y] = js.undefined
}

object Anon_DstRect {
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect, wrapOnly: x | y = null): Anon_DstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect, offsetX = offsetX, offsetY = offsetY, srcRect = srcRect)
    if (wrapOnly != null) __obj.updateDynamic("wrapOnly")(wrapOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DstRect]
  }
}

