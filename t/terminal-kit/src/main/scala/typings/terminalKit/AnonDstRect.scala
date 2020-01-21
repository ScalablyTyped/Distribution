package typings.terminalKit

import typings.terminalKit.rectMod.Rect
import typings.terminalKit.terminalKitStrings.x
import typings.terminalKit.terminalKitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDstRect extends js.Object {
  var dstRect: Rect
  var offsetX: Double
  var offsetY: Double
  var srcRect: Rect
  var wrapOnly: js.UndefOr[x | y] = js.undefined
}

object AnonDstRect {
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect, wrapOnly: x | y = null): AnonDstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], srcRect = srcRect.asInstanceOf[js.Any])
    if (wrapOnly != null) __obj.updateDynamic("wrapOnly")(wrapOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDstRect]
  }
}

