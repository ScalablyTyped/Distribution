package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConvertColors extends PluginConfig {
  
  var convertColors: Boolean | js.Object = js.native
}
object PluginConvertColors {
  
  @scala.inline
  def apply(convertColors: Boolean | js.Object): PluginConvertColors = {
    val __obj = js.Dynamic.literal(convertColors = convertColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertColors]
  }
  
  @scala.inline
  implicit class PluginConvertColorsOps[Self <: PluginConvertColors] (val x: Self) extends AnyVal {
    
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
    def setConvertColors(value: Boolean | js.Object): Self = this.set("convertColors", value.asInstanceOf[js.Any])
  }
}
