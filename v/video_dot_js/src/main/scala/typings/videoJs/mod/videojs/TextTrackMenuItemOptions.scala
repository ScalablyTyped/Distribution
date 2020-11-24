package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackMenuItemOptions extends MenuItemOptions {
  
  var track: TextTrack = js.native
}
object TextTrackMenuItemOptions {
  
  @scala.inline
  def apply(track: TextTrack): TextTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit class TextTrackMenuItemOptionsOps[Self <: TextTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
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
    def setTrack(value: TextTrack): Self = this.set("track", value.asInstanceOf[js.Any])
  }
}
