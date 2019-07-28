package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumePanelOptions extends ComponentOptions {
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var volumeControl: js.UndefOr[VolumeControlOptions] = js.undefined
}

object VolumePanelOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    volumeControl: VolumeControlOptions = null
  ): VolumePanelOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (volumeControl != null) __obj.updateDynamic("volumeControl")(volumeControl)
    __obj.asInstanceOf[VolumePanelOptions]
  }
}

