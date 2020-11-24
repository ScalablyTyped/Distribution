package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMinifyStyles extends PluginConfig {
  
  var minifyStyles: Boolean | js.Object = js.native
}
object PluginMinifyStyles {
  
  @scala.inline
  def apply(minifyStyles: Boolean | js.Object): PluginMinifyStyles = {
    val __obj = js.Dynamic.literal(minifyStyles = minifyStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMinifyStyles]
  }
  
  @scala.inline
  implicit class PluginMinifyStylesOps[Self <: PluginMinifyStyles] (val x: Self) extends AnyVal {
    
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
    def setMinifyStyles(value: Boolean | js.Object): Self = this.set("minifyStyles", value.asInstanceOf[js.Any])
  }
}
