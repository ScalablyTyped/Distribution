package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertTransform extends PluginConfig {
  var convertTransform: Boolean | js.Object
}

object PluginConvertTransform {
  @scala.inline
  def apply(convertTransform: Boolean | js.Object): PluginConvertTransform = {
    val __obj = js.Dynamic.literal(convertTransform = convertTransform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginConvertTransform]
  }
}

