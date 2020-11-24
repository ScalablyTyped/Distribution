package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackBitrateChanged event. */
@js.native
trait AdaptiveMediaSourcePlaybackBitrateChangedEventArgs extends js.Object {
  
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: Boolean = js.native
  
  /** Gets the new playback bitrate. */
  var newValue: Double = js.native
  
  /** Gets the old playback bitrate. */
  var oldValue: Double = js.native
}
object AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
  
  @scala.inline
  def apply(audioOnly: Boolean, newValue: Double, oldValue: Double): AdaptiveMediaSourcePlaybackBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(audioOnly = audioOnly.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourcePlaybackBitrateChangedEventArgsOps[Self <: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAudioOnly(value: Boolean): Self = this.set("audioOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: Double): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
}
