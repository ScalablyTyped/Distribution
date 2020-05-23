package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the state of the playback changes.
  */
trait AudioPlayerChangeEvent extends AudioPlayerBaseEvent {
  /**
    * Text description of the state of playback.
    */
  var description: Double
  /**
    * Current state of playback.
    */
  var state: Double
}

object AudioPlayerChangeEvent {
  @scala.inline
  def apply(description: Double, source: AudioPlayer, state: Double): AudioPlayerChangeEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerChangeEvent]
  }
}

