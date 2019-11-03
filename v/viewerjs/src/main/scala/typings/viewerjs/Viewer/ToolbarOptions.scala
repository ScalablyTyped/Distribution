package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var flipHorizontal: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var flipVertical: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var next: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var oneToOne: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var play: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var prev: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var reset: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var rotateLeft: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var rotateRight: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var zoomIn: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
  var zoomOut: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    flipHorizontal: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    flipVertical: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    next: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    oneToOne: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    play: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    prev: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    reset: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    rotateLeft: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    rotateRight: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    zoomIn: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null,
    zoomOut: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions = null
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (flipHorizontal != null) __obj.updateDynamic("flipHorizontal")(flipHorizontal.asInstanceOf[js.Any])
    if (flipVertical != null) __obj.updateDynamic("flipVertical")(flipVertical.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (oneToOne != null) __obj.updateDynamic("oneToOne")(oneToOne.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (rotateLeft != null) __obj.updateDynamic("rotateLeft")(rotateLeft.asInstanceOf[js.Any])
    if (rotateRight != null) __obj.updateDynamic("rotateRight")(rotateRight.asInstanceOf[js.Any])
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn.asInstanceOf[js.Any])
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarOptions]
  }
}

