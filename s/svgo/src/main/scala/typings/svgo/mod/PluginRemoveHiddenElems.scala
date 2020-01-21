package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveHiddenElems extends PluginConfig {
  var removeHiddenElems: Boolean | js.Object
}

object PluginRemoveHiddenElems {
  @scala.inline
  def apply(removeHiddenElems: Boolean | js.Object): PluginRemoveHiddenElems = {
    val __obj = js.Dynamic.literal(removeHiddenElems = removeHiddenElems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveHiddenElems]
  }
}

