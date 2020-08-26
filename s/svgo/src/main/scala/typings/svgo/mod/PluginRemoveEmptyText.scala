package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveEmptyText extends PluginConfig {
  var removeEmptyText: Boolean | js.Object = js.native
}

object PluginRemoveEmptyText {
  @scala.inline
  def apply(removeEmptyText: Boolean | js.Object): PluginRemoveEmptyText = {
    val __obj = js.Dynamic.literal(removeEmptyText = removeEmptyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyText]
  }
  @scala.inline
  implicit class PluginRemoveEmptyTextOps[Self <: PluginRemoveEmptyText] (val x: Self) extends AnyVal {
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
    def setRemoveEmptyText(value: Boolean | js.Object): Self = this.set("removeEmptyText", value.asInstanceOf[js.Any])
  }
  
}

