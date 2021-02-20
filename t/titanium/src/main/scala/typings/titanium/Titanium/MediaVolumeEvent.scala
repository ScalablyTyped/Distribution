package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the volume output changes.
  */
@js.native
trait MediaVolumeEvent extends MediaBaseEvent {
  
  /**
    * New volume level in dB.
    */
  var volume: Double = js.native
}
object MediaVolumeEvent {
  
  @scala.inline
  def apply(source: Media, volume: Double): MediaVolumeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaVolumeEvent]
  }
  
  @scala.inline
  implicit class MediaVolumeEventMutableBuilder[Self <: MediaVolumeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
