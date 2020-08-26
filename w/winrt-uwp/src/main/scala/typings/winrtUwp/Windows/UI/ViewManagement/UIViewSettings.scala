package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
@js.native
trait UIViewSettings extends js.Object {
  /** Gets a value that indicates whether the device UI is optimized for touch input or mouse input. */
  var userInteractionMode: UserInteractionMode = js.native
}

object UIViewSettings {
  @scala.inline
  def apply(userInteractionMode: UserInteractionMode): UIViewSettings = {
    val __obj = js.Dynamic.literal(userInteractionMode = userInteractionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewSettings]
  }
  @scala.inline
  implicit class UIViewSettingsOps[Self <: UIViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserInteractionMode(value: UserInteractionMode): Self = this.set("userInteractionMode", value.asInstanceOf[js.Any])
  }
  
}

