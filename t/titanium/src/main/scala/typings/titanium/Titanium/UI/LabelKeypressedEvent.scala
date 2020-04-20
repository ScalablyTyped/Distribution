package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a hardware key is pressed in the view.
		 */
trait LabelKeypressedEvent extends LabelBaseEvent {
  /**
  			 * The code for the physical key that was pressed. For more details, see [KeyEvent](https://developer.android.com/reference/android/view/KeyEvent.html). This API is experimental and subject to change.
  			 */
  var keyCode: Double
}

object LabelKeypressedEvent {
  @scala.inline
  def apply(keyCode: Double, source: Label): LabelKeypressedEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKeypressedEvent]
  }
}

