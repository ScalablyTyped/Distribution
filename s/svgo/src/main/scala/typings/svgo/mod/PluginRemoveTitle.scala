package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveTitle extends PluginConfig {
  var removeTitle: Boolean | js.Object
}

object PluginRemoveTitle {
  @scala.inline
  def apply(removeTitle: Boolean | js.Object): PluginRemoveTitle = {
    val __obj = js.Dynamic.literal(removeTitle = removeTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveTitle]
  }
}

