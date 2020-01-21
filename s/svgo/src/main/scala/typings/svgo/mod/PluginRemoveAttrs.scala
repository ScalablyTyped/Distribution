package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveAttrs extends PluginConfig {
  var removeAttrs: Boolean | js.Object
}

object PluginRemoveAttrs {
  @scala.inline
  def apply(removeAttrs: Boolean | js.Object): PluginRemoveAttrs = {
    val __obj = js.Dynamic.literal(removeAttrs = removeAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveAttrs]
  }
}

