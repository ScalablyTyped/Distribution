package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPositionState extends js.Object {
  
  // Duration of media in seconds
  var duration: js.UndefOr[Double] = js.native
  
  // Playback rate of media, positive for forward playback, negative for backward playback. This number should not be zero
  var playbackRate: js.UndefOr[Double] = js.native
  
  // Last reported playback position in seconds, should be positive.
  var position: js.UndefOr[Double] = js.native
}
object MediaPositionState {
  
  @scala.inline
  def apply(): MediaPositionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPositionState]
  }
  
  @scala.inline
  implicit class MediaPositionStateOps[Self <: MediaPositionState] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
