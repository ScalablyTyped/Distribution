package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveViewBox extends PluginConfig {
  var removeViewBox: scala.Boolean | js.Object
}

object PluginRemoveViewBox {
  @scala.inline
  def apply(removeViewBox: scala.Boolean | js.Object): PluginRemoveViewBox = {
    val __obj = js.Dynamic.literal(removeViewBox = removeViewBox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveViewBox]
  }
}

