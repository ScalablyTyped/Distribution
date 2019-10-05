package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackMenuItemOptions extends MenuItemOptions {
  var track: TextTrack
}

object TextTrackMenuItemOptions {
  @scala.inline
  def apply(
    track: TextTrack,
    children: js.Array[Child] = null,
    label: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): TextTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(track = track)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[TextTrackMenuItemOptions]
  }
}

