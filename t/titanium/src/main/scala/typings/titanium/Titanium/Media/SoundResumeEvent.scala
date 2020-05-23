package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when audio playback is resumed after an interruption.
  */
trait SoundResumeEvent extends SoundBaseEvent {
  /**
    * Indicates if the resume was from an interruption.
    */
  var interruption: Boolean
}

object SoundResumeEvent {
  @scala.inline
  def apply(interruption: Boolean, source: Sound): SoundResumeEvent = {
    val __obj = js.Dynamic.literal(interruption = interruption.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundResumeEvent]
  }
}

