package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveDoctype extends PluginConfig {
  var removeDoctype: Boolean | js.Object
}

object PluginRemoveDoctype {
  @scala.inline
  def apply(removeDoctype: Boolean | js.Object): PluginRemoveDoctype = {
    val __obj = js.Dynamic.literal(removeDoctype = removeDoctype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDoctype]
  }
}

