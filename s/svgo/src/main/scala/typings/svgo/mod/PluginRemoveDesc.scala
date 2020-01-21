package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveDesc extends PluginConfig {
  var removeDesc: Boolean | js.Object
}

object PluginRemoveDesc {
  @scala.inline
  def apply(removeDesc: Boolean | js.Object): PluginRemoveDesc = {
    val __obj = js.Dynamic.literal(removeDesc = removeDesc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveDesc]
  }
}

