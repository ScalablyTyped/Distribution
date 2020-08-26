package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveNonInheritableGroupAttrs extends PluginConfig {
  var removeNonInheritableGroupAttrs: Boolean | js.Object = js.native
}

object PluginRemoveNonInheritableGroupAttrs {
  @scala.inline
  def apply(removeNonInheritableGroupAttrs: Boolean | js.Object): PluginRemoveNonInheritableGroupAttrs = {
    val __obj = js.Dynamic.literal(removeNonInheritableGroupAttrs = removeNonInheritableGroupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveNonInheritableGroupAttrs]
  }
  @scala.inline
  implicit class PluginRemoveNonInheritableGroupAttrsOps[Self <: PluginRemoveNonInheritableGroupAttrs] (val x: Self) extends AnyVal {
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
    def setRemoveNonInheritableGroupAttrs(value: Boolean | js.Object): Self = this.set("removeNonInheritableGroupAttrs", value.asInstanceOf[js.Any])
  }
  
}

