package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeControlOptions extends ComponentOptions {
  
  var vertical: js.UndefOr[Boolean] = js.native
  
  var volumeBar: js.UndefOr[VolumeBar] = js.native
}
object VolumeControlOptions {
  
  @scala.inline
  def apply(): VolumeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeControlOptions]
  }
  
  @scala.inline
  implicit class VolumeControlOptionsOps[Self <: VolumeControlOptions] (val x: Self) extends AnyVal {
    
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
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setVolumeBar(value: VolumeBar): Self = this.set("volumeBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeBar: Self = this.set("volumeBar", js.undefined)
  }
}
