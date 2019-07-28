package typings.videoDotJs.videoDotJsMod.videojsNs

import typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue
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
    val __obj = js.Dynamic.literal(cue = cue, track = track)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[ChaptersTrackMenuItemOptions]
  }
}

