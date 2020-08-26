package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginInlineStyles extends PluginConfig {
  var inlineStyles: Boolean | js.Object = js.native
}

object PluginInlineStyles {
  @scala.inline
  def apply(inlineStyles: Boolean | js.Object): PluginInlineStyles = {
    val __obj = js.Dynamic.literal(inlineStyles = inlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInlineStyles]
  }
  @scala.inline
  implicit class PluginInlineStylesOps[Self <: PluginInlineStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInlineStyles(value: Boolean | js.Object): Self = this.set("inlineStyles", value.asInstanceOf[js.Any])
  }
  
}

