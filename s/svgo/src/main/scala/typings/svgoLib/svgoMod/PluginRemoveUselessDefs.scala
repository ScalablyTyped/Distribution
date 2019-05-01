package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUselessDefs extends PluginConfig {
  var removeUselessDefs: scala.Boolean | js.Object
}

object PluginRemoveUselessDefs {
  @scala.inline
  def apply(removeUselessDefs: scala.Boolean | js.Object): PluginRemoveUselessDefs = {
    val __obj = js.Dynamic.literal(removeUselessDefs = removeUselessDefs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveUselessDefs]
  }
}

