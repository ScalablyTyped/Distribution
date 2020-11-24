package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackPositionChangeRequested event. */
@js.native
trait PlaybackPositionChangeRequestedEventArgs extends js.Object {
  
  /** Gets a value indicating the requested offset into the media item. */
  var requestedPlaybackPosition: Double = js.native
}
object PlaybackPositionChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedPlaybackPosition: Double): PlaybackPositionChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackPosition = requestedPlaybackPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackPositionChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlaybackPositionChangeRequestedEventArgsOps[Self <: PlaybackPositionChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequestedPlaybackPosition(value: Double): Self = this.set("requestedPlaybackPosition", value.asInstanceOf[js.Any])
  }
}
