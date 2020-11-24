package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlBarOptions extends ComponentOptions {
  
  var fullscreenToggle: js.UndefOr[Boolean] = js.native
  
  var volumePanel: js.UndefOr[VolumePanelOptions] = js.native
}
object ControlBarOptions {
  
  @scala.inline
  def apply(): ControlBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlBarOptions]
  }
  
  @scala.inline
  implicit class ControlBarOptionsOps[Self <: ControlBarOptions] (val x: Self) extends AnyVal {
    
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
    def setFullscreenToggle(value: Boolean): Self = this.set("fullscreenToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenToggle: Self = this.set("fullscreenToggle", js.undefined)
    
    @scala.inline
    def setVolumePanel(value: VolumePanelOptions): Self = this.set("volumePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumePanel: Self = this.set("volumePanel", js.undefined)
  }
}
