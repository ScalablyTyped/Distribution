package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSessionActionDetails extends js.Object {
  
  // The action that the handler is associated with
  var action: MediaSessionAction = js.native
  
  // MAY be provided when action is seekto. Stores true if the action is being called multiple times as part of a sequence and this is not the last call in that sequence.
  var fastSeek: js.UndefOr[Boolean] = js.native
  
  // This MAY be provided when the action is seekbackward or seekforward. Stores number of seconds to move the playback time by.
  var seekOffset: js.UndefOr[Double] = js.native
  
  // MUST be provided when action is seekto. Stores the time in seconds to move the playback time to.
  var seekTime: js.UndefOr[Double] = js.native
}
object MediaSessionActionDetails {
  
  @scala.inline
  def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  @scala.inline
  implicit class MediaSessionActionDetailsOps[Self <: MediaSessionActionDetails] (val x: Self) extends AnyVal {
    
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
    def setAction(value: MediaSessionAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSeek(value: Boolean): Self = this.set("fastSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastSeek: Self = this.set("fastSeek", js.undefined)
    
    @scala.inline
    def setSeekOffset(value: Double): Self = this.set("seekOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeekOffset: Self = this.set("seekOffset", js.undefined)
    
    @scala.inline
    def setSeekTime(value: Double): Self = this.set("seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeekTime: Self = this.set("seekTime", js.undefined)
  }
}
