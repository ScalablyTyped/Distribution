package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired once the [seekToTime](Titanium.Media.AudioPlayer.seek) method completes.
  */
@js.native
trait AudioPlayerSeekEvent extends AudioPlayerBaseEvent {
  
  /**
    * The event for any prior seek request that is still in process will be invoked
    * immediately with the `finished` parameter set to `false`.
    * If the new request completes without being interrupted by another seek
    * request or by any other operation this event will be invoked with
    * the `finished` parameter set to `true`.
    */
  var finished: Boolean = js.native
}
object AudioPlayerSeekEvent {
  
  @scala.inline
  def apply(finished: Boolean, source: AudioPlayer): AudioPlayerSeekEvent = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerSeekEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerSeekEventMutableBuilder[Self <: AudioPlayerSeekEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}
