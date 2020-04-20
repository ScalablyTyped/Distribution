package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when there's an error.
		 */
trait AudioPlayerErrorEvent extends AudioPlayerBaseEvent {
  /**
  			 * Error code. Different between android and iOS.
  			 */
  var code: Double
  /**
  			 * Error message.
  			 */
  var error: String
}

object AudioPlayerErrorEvent {
  @scala.inline
  def apply(code: Double, error: String, source: AudioPlayer): AudioPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerErrorEvent]
  }
}

