package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveTitle extends PluginConfig {
  var removeTitle: Boolean | js.Object = js.native
}

object PluginRemoveTitle {
  @scala.inline
  def apply(removeTitle: Boolean | js.Object): PluginRemoveTitle = {
    val __obj = js.Dynamic.literal(removeTitle = removeTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveTitle]
  }
  @scala.inline
  implicit class PluginRemoveTitleOps[Self <: PluginRemoveTitle] (val x: Self) extends AnyVal {
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
    def setRemoveTitle(value: Boolean | js.Object): Self = this.set("removeTitle", value.asInstanceOf[js.Any])
  }
  
}

