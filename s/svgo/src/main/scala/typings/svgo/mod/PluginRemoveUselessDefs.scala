package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUselessDefs extends PluginConfig {
  var removeUselessDefs: Boolean | js.Object
}

object PluginRemoveUselessDefs {
  @scala.inline
  def apply(removeUselessDefs: Boolean | js.Object): PluginRemoveUselessDefs = {
    val __obj = js.Dynamic.literal(removeUselessDefs = removeUselessDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessDefs]
  }
}

