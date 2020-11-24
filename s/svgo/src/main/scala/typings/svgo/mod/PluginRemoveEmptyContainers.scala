package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEmptyContainers extends PluginConfig {
  
  var removeEmptyContainers: Boolean | js.Object = js.native
}
object PluginRemoveEmptyContainers {
  
  @scala.inline
  def apply(removeEmptyContainers: Boolean | js.Object): PluginRemoveEmptyContainers = {
    val __obj = js.Dynamic.literal(removeEmptyContainers = removeEmptyContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyContainers]
  }
  
  @scala.inline
  implicit class PluginRemoveEmptyContainersOps[Self <: PluginRemoveEmptyContainers] (val x: Self) extends AnyVal {
    
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
    def setRemoveEmptyContainers(value: Boolean | js.Object): Self = this.set("removeEmptyContainers", value.asInstanceOf[js.Any])
  }
}
