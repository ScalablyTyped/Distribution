package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function] = js.undefined
  var show: js.UndefOr[Boolean | Visibility] = js.undefined
  var size: js.UndefOr[ToolbarButtonSize] = js.undefined
}

object ToolbarButtonOptions {
  @scala.inline
  def apply(click: js.Function = null, show: Boolean | Visibility = null, size: ToolbarButtonSize = null): ToolbarButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonOptions]
  }
}

