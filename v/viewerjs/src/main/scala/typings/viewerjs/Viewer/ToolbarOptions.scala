package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var flipHorizontal: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var flipVertical: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var next: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var oneToOne: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var play: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var prev: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var reset: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var rotateLeft: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var rotateRight: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var zoomIn: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var zoomOut: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
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
    def setFlipHorizontal(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("flipHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipHorizontal: Self = this.set("flipHorizontal", js.undefined)
    @scala.inline
    def setFlipVertical(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("flipVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVertical: Self = this.set("flipVertical", js.undefined)
    @scala.inline
    def setNext(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setOneToOne(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("oneToOne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneToOne: Self = this.set("oneToOne", js.undefined)
    @scala.inline
    def setPlay(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setPrev(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setReset(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRotateLeft(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("rotateLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateLeft: Self = this.set("rotateLeft", js.undefined)
    @scala.inline
    def setRotateRight(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("rotateRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateRight: Self = this.set("rotateRight", js.undefined)
    @scala.inline
    def setZoomIn(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    @scala.inline
    def setZoomOut(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
  }
  
}

