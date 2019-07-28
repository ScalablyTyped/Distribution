package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveViewBox extends PluginConfig {
  var removeViewBox: Boolean | js.Object
}

object PluginRemoveViewBox {
  @scala.inline
  def apply(removeViewBox: Boolean | js.Object): PluginRemoveViewBox = {
    val __obj = js.Dynamic.literal(removeViewBox = removeViewBox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveViewBox]
  }
}

