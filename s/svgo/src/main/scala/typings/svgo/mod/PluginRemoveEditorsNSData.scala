package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEditorsNSData extends PluginConfig {
  
  var removeEditorsNSData: Boolean | js.Object = js.native
}
object PluginRemoveEditorsNSData {
  
  @scala.inline
  def apply(removeEditorsNSData: Boolean | js.Object): PluginRemoveEditorsNSData = {
    val __obj = js.Dynamic.literal(removeEditorsNSData = removeEditorsNSData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEditorsNSData]
  }
  
  @scala.inline
  implicit class PluginRemoveEditorsNSDataOps[Self <: PluginRemoveEditorsNSData] (val x: Self) extends AnyVal {
    
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
    def setRemoveEditorsNSData(value: Boolean | js.Object): Self = this.set("removeEditorsNSData", value.asInstanceOf[js.Any])
  }
}
