package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveScriptElement extends PluginConfig {
  var removeScriptElement: scala.Boolean | js.Object
}

object PluginRemoveScriptElement {
  @scala.inline
  def apply(removeScriptElement: scala.Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
}

