package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveScriptElement extends PluginConfig {
  var removeScriptElement: Boolean | js.Object
}

object PluginRemoveScriptElement {
  @scala.inline
  def apply(removeScriptElement: Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
}

