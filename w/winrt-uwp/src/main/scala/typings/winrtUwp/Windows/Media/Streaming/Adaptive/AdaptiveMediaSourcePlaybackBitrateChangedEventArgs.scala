package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackBitrateChanged event. */
trait AdaptiveMediaSourcePlaybackBitrateChangedEventArgs extends StObject {
  
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: Boolean
  
  /** Gets the new playback bitrate. */
  var newValue: Double
  
  /** Gets the old playback bitrate. */
  var oldValue: Double
}
object AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
  
  inline def apply(audioOnly: Boolean, newValue: Double, oldValue: Double): AdaptiveMediaSourcePlaybackBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(audioOnly = audioOnly.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
