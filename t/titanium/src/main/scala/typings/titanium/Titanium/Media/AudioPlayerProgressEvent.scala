package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired once per second with the current progress during playback.
  */
@js.native
trait AudioPlayerProgressEvent extends AudioPlayerBaseEvent {
  
  /**
    * Current progress, in milliseconds.
    */
  var progress: Double = js.native
}
object AudioPlayerProgressEvent {
  
  @scala.inline
  def apply(progress: Double, source: AudioPlayer): AudioPlayerProgressEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerProgressEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerProgressEventMutableBuilder[Self <: AudioPlayerProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
