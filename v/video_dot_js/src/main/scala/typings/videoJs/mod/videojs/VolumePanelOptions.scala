package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumePanelOptions extends ComponentOptions {
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var volumeControl: js.UndefOr[VolumeControlOptions] = js.native
}
object VolumePanelOptions {
  
  @scala.inline
  def apply(): VolumePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumePanelOptions]
  }
  
  @scala.inline
  implicit class VolumePanelOptionsOps[Self <: VolumePanelOptions] (val x: Self) extends AnyVal {
    
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
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setVolumeControl(value: VolumeControlOptions): Self = this.set("volumeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeControl: Self = this.set("volumeControl", js.undefined)
  }
}
