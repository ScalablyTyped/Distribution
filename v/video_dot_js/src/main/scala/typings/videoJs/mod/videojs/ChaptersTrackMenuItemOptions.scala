package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChaptersTrackMenuItemOptions extends MenuItemOptions {
  var cue: TextTrackCue
  var track: TextTrack
}

object ChaptersTrackMenuItemOptions {
  @scala.inline
  def apply(
    cue: TextTrackCue,
    track: TextTrack,
    children: js.Array[Child] = null,
    label: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): ChaptersTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersTrackMenuItemOptions]
  }
}

