package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveAttributesBySelector extends PluginConfig {
  var removeAttributesBySelector: Boolean | js.Object
}

object PluginRemoveAttributesBySelector {
  @scala.inline
  def apply(removeAttributesBySelector: Boolean | js.Object): PluginRemoveAttributesBySelector = {
    val __obj = js.Dynamic.literal(removeAttributesBySelector = removeAttributesBySelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveAttributesBySelector]
  }
}

