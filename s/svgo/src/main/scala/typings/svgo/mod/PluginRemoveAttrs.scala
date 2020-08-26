package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveAttrs extends PluginConfig {
  var removeAttrs: Boolean | js.Object = js.native
}

object PluginRemoveAttrs {
  @scala.inline
  def apply(removeAttrs: Boolean | js.Object): PluginRemoveAttrs = {
    val __obj = js.Dynamic.literal(removeAttrs = removeAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttrs]
  }
  @scala.inline
  implicit class PluginRemoveAttrsOps[Self <: PluginRemoveAttrs] (val x: Self) extends AnyVal {
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
    def setRemoveAttrs(value: Boolean | js.Object): Self = this.set("removeAttrs", value.asInstanceOf[js.Any])
  }
  
}

