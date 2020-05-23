package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Kind
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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
}

