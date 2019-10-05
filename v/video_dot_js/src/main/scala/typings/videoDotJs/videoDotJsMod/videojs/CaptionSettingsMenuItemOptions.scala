package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsMod.videojs.TextTrack.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsMenuItemOptions extends TextTrackMenuItemOptions {
  var kind: Kind
}

object CaptionSettingsMenuItemOptions {
  @scala.inline
  def apply(
    kind: Kind,
    track: TextTrack,
    children: js.Array[Child] = null,
    label: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): CaptionSettingsMenuItemOptions = {
    val __obj = js.Dynamic.literal(kind = kind, track = track)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
}

