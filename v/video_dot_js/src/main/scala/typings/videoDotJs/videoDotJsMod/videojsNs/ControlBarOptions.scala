package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlBarOptions extends ComponentOptions {
  var volumePanel: js.UndefOr[VolumePanelOptions] = js.undefined
}

object ControlBarOptions {
  @scala.inline
  def apply(children: js.Array[Child] = null, volumePanel: VolumePanelOptions = null): ControlBarOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (volumePanel != null) __obj.updateDynamic("volumePanel")(volumePanel)
    __obj.asInstanceOf[ControlBarOptions]
  }
}

