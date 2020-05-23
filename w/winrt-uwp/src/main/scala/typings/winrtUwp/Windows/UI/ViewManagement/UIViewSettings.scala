package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
trait UIViewSettings extends js.Object {
  /** Gets a value that indicates whether the device UI is optimized for touch input or mouse input. */
  var userInteractionMode: UserInteractionMode
}

object UIViewSettings {
  @scala.inline
  def apply(userInteractionMode: UserInteractionMode): UIViewSettings = {
    val __obj = js.Dynamic.literal(userInteractionMode = userInteractionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewSettings]
  }
}

