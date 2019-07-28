package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveEmptyAttrs extends PluginConfig {
  var removeEmptyAttrs: Boolean | js.Object
}

object PluginRemoveEmptyAttrs {
  @scala.inline
  def apply(removeEmptyAttrs: Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
}

