package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInlineStyles extends PluginConfig {
  var inlineStyles: Boolean | js.Object
}

object PluginInlineStyles {
  @scala.inline
  def apply(inlineStyles: Boolean | js.Object): PluginInlineStyles = {
    val __obj = js.Dynamic.literal(inlineStyles = inlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInlineStyles]
  }
}

