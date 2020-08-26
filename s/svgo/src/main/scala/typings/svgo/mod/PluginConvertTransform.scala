package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConvertTransform extends PluginConfig {
  var convertTransform: Boolean | js.Object = js.native
}

object PluginConvertTransform {
  @scala.inline
  def apply(convertTransform: Boolean | js.Object): PluginConvertTransform = {
    val __obj = js.Dynamic.literal(convertTransform = convertTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertTransform]
  }
  @scala.inline
  implicit class PluginConvertTransformOps[Self <: PluginConvertTransform] (val x: Self) extends AnyVal {
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
    def setConvertTransform(value: Boolean | js.Object): Self = this.set("convertTransform", value.asInstanceOf[js.Any])
  }
  
}

