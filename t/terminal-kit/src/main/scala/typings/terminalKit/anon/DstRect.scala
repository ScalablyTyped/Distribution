package typings.terminalKit.anon

import typings.terminalKit.rectMod.Rect
import typings.terminalKit.terminalKitStrings.x
import typings.terminalKit.terminalKitStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DstRect extends js.Object {
  var dstRect: Rect = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var srcRect: Rect = js.native
  var wrapOnly: js.UndefOr[x | y] = js.native
}

object DstRect {
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect): DstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], srcRect = srcRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DstRect]
  }
  @scala.inline
  implicit class DstRectOps[Self <: DstRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDstRect(value: Rect): Self = this.set("dstRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcRect(value: Rect): Self = this.set("srcRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapOnly(value: typings.terminalKit.terminalKitStrings.x | y): Self = this.set("wrapOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapOnly: Self = this.set("wrapOnly", js.undefined)
  }
  
}

