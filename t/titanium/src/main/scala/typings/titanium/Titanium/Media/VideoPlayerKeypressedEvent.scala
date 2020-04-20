package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a hardware key is pressed in the view.
		 */
trait VideoPlayerKeypressedEvent extends VideoPlayerBaseEvent {
  /**
  			 * The code for the physical key that was pressed. For more details, see [KeyEvent](https://developer.android.com/reference/android/view/KeyEvent.html). This API is experimental and subject to change.
  			 */
  var keyCode: Double
}

object VideoPlayerKeypressedEvent {
  @scala.inline
  def apply(keyCode: Double, source: VideoPlayer): VideoPlayerKeypressedEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerKeypressedEvent]
  }
}

