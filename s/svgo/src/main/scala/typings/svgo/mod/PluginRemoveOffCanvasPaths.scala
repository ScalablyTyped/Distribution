package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveOffCanvasPaths extends PluginConfig {
  var removeOffCanvasPaths: Boolean | js.Object
}

object PluginRemoveOffCanvasPaths {
  @scala.inline
  def apply(removeOffCanvasPaths: Boolean | js.Object): PluginRemoveOffCanvasPaths = {
    val __obj = js.Dynamic.literal(removeOffCanvasPaths = removeOffCanvasPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveOffCanvasPaths]
  }
}

