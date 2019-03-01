package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackSettingsOptions extends ModalDialogOptions {
  var persistTextTrackSettings: js.UndefOr[scala.Boolean] = js.undefined
}

object TextTrackSettingsOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    content: js.Any = null,
    description: java.lang.String = null,
    fillAlways: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    persistTextTrackSettings: js.UndefOr[scala.Boolean] = js.undefined,
    temporary: js.UndefOr[scala.Boolean] = js.undefined,
    uncloseable: js.UndefOr[scala.Boolean] = js.undefined
  ): TextTrackSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(fillAlways)) __obj.updateDynamic("fillAlways")(fillAlways)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(persistTextTrackSettings)) __obj.updateDynamic("persistTextTrackSettings")(persistTextTrackSettings)
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    if (!js.isUndefined(uncloseable)) __obj.updateDynamic("uncloseable")(uncloseable)
    __obj.asInstanceOf[TextTrackSettingsOptions]
  }
}

