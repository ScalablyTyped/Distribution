package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the volume output changes.
  */
trait MediaVolumeEvent extends MediaBaseEvent {
  /**
    * New volume level in dB.
    */
  var volume: Double
}

object MediaVolumeEvent {
  @scala.inline
  def apply(source: Media, volume: Double): MediaVolumeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaVolumeEvent]
  }
}

