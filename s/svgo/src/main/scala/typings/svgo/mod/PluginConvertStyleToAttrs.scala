package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertStyleToAttrs extends PluginConfig {
  var convertStyleToAttrs: Boolean | js.Object
}

object PluginConvertStyleToAttrs {
  @scala.inline
  def apply(convertStyleToAttrs: Boolean | js.Object): PluginConvertStyleToAttrs = {
    val __obj = js.Dynamic.literal(convertStyleToAttrs = convertStyleToAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertStyleToAttrs]
  }
}

