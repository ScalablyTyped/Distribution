package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveEmptyContainers extends PluginConfig {
  var removeEmptyContainers: Boolean | js.Object
}

object PluginRemoveEmptyContainers {
  @scala.inline
  def apply(removeEmptyContainers: Boolean | js.Object): PluginRemoveEmptyContainers = {
    val __obj = js.Dynamic.literal(removeEmptyContainers = removeEmptyContainers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveEmptyContainers]
  }
}

