package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTrackMenuItemOptions extends MenuItemOptions {
  
  var track: js.UndefOr[VideojsAudioTrack] = js.native
}
object AudioTrackMenuItemOptions {
  
  @scala.inline
  def apply(): AudioTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit class AudioTrackMenuItemOptionsOps[Self <: AudioTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
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
    def setTrack(value: VideojsAudioTrack): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
}
