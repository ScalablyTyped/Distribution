package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConvertStyleToAttrs extends PluginConfig {
  var convertStyleToAttrs: Boolean | js.Object = js.native
}

object PluginConvertStyleToAttrs {
  @scala.inline
  def apply(convertStyleToAttrs: Boolean | js.Object): PluginConvertStyleToAttrs = {
    val __obj = js.Dynamic.literal(convertStyleToAttrs = convertStyleToAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertStyleToAttrs]
  }
  @scala.inline
  implicit class PluginConvertStyleToAttrsOps[Self <: PluginConvertStyleToAttrs] (val x: Self) extends AnyVal {
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
    def setConvertStyleToAttrs(value: Boolean | js.Object): Self = this.set("convertStyleToAttrs", value.asInstanceOf[js.Any])
  }
  
}

