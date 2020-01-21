package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveStyleElement extends PluginConfig {
  var removeStyleElement: Boolean | js.Object
}

object PluginRemoveStyleElement {
  @scala.inline
  def apply(removeStyleElement: Boolean | js.Object): PluginRemoveStyleElement = {
    val __obj = js.Dynamic.literal(removeStyleElement = removeStyleElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveStyleElement]
  }
}

