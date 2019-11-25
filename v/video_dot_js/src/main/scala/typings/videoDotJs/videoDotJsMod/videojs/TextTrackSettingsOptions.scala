package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackSettingsOptions extends ModalDialogOptions {
  var persistTextTrackSettings: js.UndefOr[Boolean] = js.undefined
}

object TextTrackSettingsOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    content: js.Any = null,
    description: String = null,
    fillAlways: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    persistTextTrackSettings: js.UndefOr[Boolean] = js.undefined,
    temporary: js.UndefOr[Boolean] = js.undefined,
    uncloseable: js.UndefOr[Boolean] = js.undefined
  ): TextTrackSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAlways)) __obj.updateDynamic("fillAlways")(fillAlways.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(persistTextTrackSettings)) __obj.updateDynamic("persistTextTrackSettings")(persistTextTrackSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.asInstanceOf[js.Any])
    if (!js.isUndefined(uncloseable)) __obj.updateDynamic("uncloseable")(uncloseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackSettingsOptions]
  }
}

