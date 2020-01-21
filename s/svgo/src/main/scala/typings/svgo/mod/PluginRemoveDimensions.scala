package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveDimensions extends PluginConfig {
  var removeDimensions: Boolean | js.Object
}

object PluginRemoveDimensions {
  @scala.inline
  def apply(removeDimensions: Boolean | js.Object): PluginRemoveDimensions = {
    val __obj = js.Dynamic.literal(removeDimensions = removeDimensions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveDimensions]
  }
}

