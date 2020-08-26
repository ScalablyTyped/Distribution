package typings.terminalKit.screenBufferMod

import typings.terminalKit.terminalKitStrings.x
import typings.terminalKit.terminalKitStrings.y
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var blending: js.UndefOr[Boolean] = js.native
  var delta: js.UndefOr[Boolean] = js.native
  var dst: js.UndefOr[Terminal | ScreenBuffer] = js.native
  var dstClipRect: js.UndefOr[typings.terminalKit.rectMod.^] = js.native
  var srcClipRect: js.UndefOr[typings.terminalKit.rectMod.^] = js.native
  var tile: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean | x | y] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
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
    def setBlending(value: Boolean): Self = this.set("blending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlending: Self = this.set("blending", js.undefined)
    @scala.inline
    def setDelta(value: Boolean): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    @scala.inline
    def setDst(value: Terminal | ScreenBuffer): Self = this.set("dst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDst: Self = this.set("dst", js.undefined)
    @scala.inline
    def setDstClipRect(value: typings.terminalKit.rectMod.^): Self = this.set("dstClipRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDstClipRect: Self = this.set("dstClipRect", js.undefined)
    @scala.inline
    def setSrcClipRect(value: typings.terminalKit.rectMod.^): Self = this.set("srcClipRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcClipRect: Self = this.set("srcClipRect", js.undefined)
    @scala.inline
    def setTile(value: Boolean): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
    @scala.inline
    def setWrap(value: Boolean | typings.terminalKit.terminalKitStrings.x | y): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

