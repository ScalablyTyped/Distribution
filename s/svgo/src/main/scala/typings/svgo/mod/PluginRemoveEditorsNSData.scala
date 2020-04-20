package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveEditorsNSData extends PluginConfig {
  var removeEditorsNSData: Boolean | js.Object
}

object PluginRemoveEditorsNSData {
  @scala.inline
  def apply(removeEditorsNSData: Boolean | js.Object): PluginRemoveEditorsNSData = {
    val __obj = js.Dynamic.literal(removeEditorsNSData = removeEditorsNSData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEditorsNSData]
  }
}

