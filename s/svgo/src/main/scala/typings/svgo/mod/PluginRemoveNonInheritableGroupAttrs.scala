package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveNonInheritableGroupAttrs extends PluginConfig {
  var removeNonInheritableGroupAttrs: Boolean | js.Object
}

object PluginRemoveNonInheritableGroupAttrs {
  @scala.inline
  def apply(removeNonInheritableGroupAttrs: Boolean | js.Object): PluginRemoveNonInheritableGroupAttrs = {
    val __obj = js.Dynamic.literal(removeNonInheritableGroupAttrs = removeNonInheritableGroupAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveNonInheritableGroupAttrs]
  }
}

