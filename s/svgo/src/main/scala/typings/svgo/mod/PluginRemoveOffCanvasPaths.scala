package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveOffCanvasPaths extends PluginConfig {
  var removeOffCanvasPaths: Boolean | js.Object = js.native
}

object PluginRemoveOffCanvasPaths {
  @scala.inline
  def apply(removeOffCanvasPaths: Boolean | js.Object): PluginRemoveOffCanvasPaths = {
    val __obj = js.Dynamic.literal(removeOffCanvasPaths = removeOffCanvasPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveOffCanvasPaths]
  }
  @scala.inline
  implicit class PluginRemoveOffCanvasPathsOps[Self <: PluginRemoveOffCanvasPaths] (val x: Self) extends AnyVal {
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
    def setRemoveOffCanvasPaths(value: Boolean | js.Object): Self = this.set("removeOffCanvasPaths", value.asInstanceOf[js.Any])
  }
  
}

