package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTrackMenuItemOptions extends MenuItemOptions {
  var track: js.UndefOr[stdLib.AudioTrack] = js.undefined
}

object AudioTrackMenuItemOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    label: java.lang.String = null,
    multiSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    track: stdLib.AudioTrack = null
  ): AudioTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (track != null) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[AudioTrackMenuItemOptions]
  }
}

