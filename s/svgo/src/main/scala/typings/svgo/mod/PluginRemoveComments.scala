package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveComments extends PluginConfig {
  var removeComments: Boolean | js.Object
}

object PluginRemoveComments {
  @scala.inline
  def apply(removeComments: Boolean | js.Object): PluginRemoveComments = {
    val __obj = js.Dynamic.literal(removeComments = removeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveComments]
  }
}

