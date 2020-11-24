package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
@js.native
trait TimedMetadataPresentationModeChangedEventArgs extends js.Object {
  
  /** Gets the new presentation mode. */
  var newPresentationMode: TimedMetadataTrackPresentationMode = js.native
  
  /** Gets the old presentation mode. */
  var oldPresentationMode: TimedMetadataTrackPresentationMode = js.native
  
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  var track: TimedMetadataTrack = js.native
}
object TimedMetadataPresentationModeChangedEventArgs {
  
  @scala.inline
  def apply(
    newPresentationMode: TimedMetadataTrackPresentationMode,
    oldPresentationMode: TimedMetadataTrackPresentationMode,
    track: TimedMetadataTrack
  ): TimedMetadataPresentationModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(newPresentationMode = newPresentationMode.asInstanceOf[js.Any], oldPresentationMode = oldPresentationMode.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataPresentationModeChangedEventArgs]
  }
  
  @scala.inline
  implicit class TimedMetadataPresentationModeChangedEventArgsOps[Self <: TimedMetadataPresentationModeChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewPresentationMode(value: TimedMetadataTrackPresentationMode): Self = this.set("newPresentationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPresentationMode(value: TimedMetadataTrackPresentationMode): Self = this.set("oldPresentationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: TimedMetadataTrack): Self = this.set("track", value.asInstanceOf[js.Any])
  }
}
