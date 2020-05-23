package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the state of the playback changes.
  */
trait SoundChangeEvent extends SoundBaseEvent {
  /**
    * Text description of the state of playback.
    */
  var description: String
  /**
    * Current state of playback.
    */
  var state: Double
}

object SoundChangeEvent {
  @scala.inline
  def apply(description: String, source: Sound, state: Double): SoundChangeEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundChangeEvent]
  }
}

