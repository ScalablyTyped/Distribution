package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveEmptyText extends PluginConfig {
  var removeEmptyText: Boolean | js.Object
}

object PluginRemoveEmptyText {
  @scala.inline
  def apply(removeEmptyText: Boolean | js.Object): PluginRemoveEmptyText = {
    val __obj = js.Dynamic.literal(removeEmptyText = removeEmptyText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveEmptyText]
  }
}

