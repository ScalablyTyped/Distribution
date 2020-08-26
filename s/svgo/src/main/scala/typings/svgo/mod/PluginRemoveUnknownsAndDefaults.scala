package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveUnknownsAndDefaults extends PluginConfig {
  var removeUnknownsAndDefaults: Boolean | js.Object = js.native
}

object PluginRemoveUnknownsAndDefaults {
  @scala.inline
  def apply(removeUnknownsAndDefaults: Boolean | js.Object): PluginRemoveUnknownsAndDefaults = {
    val __obj = js.Dynamic.literal(removeUnknownsAndDefaults = removeUnknownsAndDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnknownsAndDefaults]
  }
  @scala.inline
  implicit class PluginRemoveUnknownsAndDefaultsOps[Self <: PluginRemoveUnknownsAndDefaults] (val x: Self) extends AnyVal {
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
    def setRemoveUnknownsAndDefaults(value: Boolean | js.Object): Self = this.set("removeUnknownsAndDefaults", value.asInstanceOf[js.Any])
  }
  
}

