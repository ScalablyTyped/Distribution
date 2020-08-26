package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveViewBox extends PluginConfig {
  var removeViewBox: Boolean | js.Object = js.native
}

object PluginRemoveViewBox {
  @scala.inline
  def apply(removeViewBox: Boolean | js.Object): PluginRemoveViewBox = {
    val __obj = js.Dynamic.literal(removeViewBox = removeViewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveViewBox]
  }
  @scala.inline
  implicit class PluginRemoveViewBoxOps[Self <: PluginRemoveViewBox] (val x: Self) extends AnyVal {
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
    def setRemoveViewBox(value: Boolean | js.Object): Self = this.set("removeViewBox", value.asInstanceOf[js.Any])
  }
  
}

