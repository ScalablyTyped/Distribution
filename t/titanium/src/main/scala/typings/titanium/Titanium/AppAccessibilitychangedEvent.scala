package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired by the system when the device's accessibility service is turned on or off.
	 */
trait AppAccessibilitychangedEvent extends AppBaseEvent {
  /**
  		 * Whether accessibility is now enabled or disabled.
  		 */
  var enabled: Boolean
}

object AppAccessibilitychangedEvent {
  @scala.inline
  def apply(enabled: Boolean, source: App): AppAccessibilitychangedEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAccessibilitychangedEvent]
  }
}

