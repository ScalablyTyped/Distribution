package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveAttributesBySelector extends PluginConfig {
  var removeAttributesBySelector: Boolean | js.Object = js.native
}

object PluginRemoveAttributesBySelector {
  @scala.inline
  def apply(removeAttributesBySelector: Boolean | js.Object): PluginRemoveAttributesBySelector = {
    val __obj = js.Dynamic.literal(removeAttributesBySelector = removeAttributesBySelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttributesBySelector]
  }
  @scala.inline
  implicit class PluginRemoveAttributesBySelectorOps[Self <: PluginRemoveAttributesBySelector] (val x: Self) extends AnyVal {
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
    def setRemoveAttributesBySelector(value: Boolean | js.Object): Self = this.set("removeAttributesBySelector", value.asInstanceOf[js.Any])
  }
  
}

