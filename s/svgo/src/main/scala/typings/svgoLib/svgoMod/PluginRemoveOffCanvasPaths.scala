package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveOffCanvasPaths extends PluginConfig {
  var removeOffCanvasPaths: scala.Boolean | js.Object
}

object PluginRemoveOffCanvasPaths {
  @scala.inline
  def apply(removeOffCanvasPaths: scala.Boolean | js.Object): PluginRemoveOffCanvasPaths = {
    val __obj = js.Dynamic.literal(removeOffCanvasPaths = removeOffCanvasPaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveOffCanvasPaths]
  }
}

