package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUnknownsAndDefaults extends PluginConfig {
  var removeUnknownsAndDefaults: Boolean | js.Object
}

object PluginRemoveUnknownsAndDefaults {
  @scala.inline
  def apply(removeUnknownsAndDefaults: Boolean | js.Object): PluginRemoveUnknownsAndDefaults = {
    val __obj = js.Dynamic.literal(removeUnknownsAndDefaults = removeUnknownsAndDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnknownsAndDefaults]
  }
}

