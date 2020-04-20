package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveMetadata extends PluginConfig {
  var removeMetadata: Boolean | js.Object
}

object PluginRemoveMetadata {
  @scala.inline
  def apply(removeMetadata: Boolean | js.Object): PluginRemoveMetadata = {
    val __obj = js.Dynamic.literal(removeMetadata = removeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveMetadata]
  }
}

