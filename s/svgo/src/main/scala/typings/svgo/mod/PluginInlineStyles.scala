package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInlineStyles extends PluginConfig {
  var cleanupAttrs: Boolean | js.Object
}

object PluginInlineStyles {
  @scala.inline
  def apply(cleanupAttrs: Boolean | js.Object): PluginInlineStyles = {
    val __obj = js.Dynamic.literal(cleanupAttrs = cleanupAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginInlineStyles]
  }
}

