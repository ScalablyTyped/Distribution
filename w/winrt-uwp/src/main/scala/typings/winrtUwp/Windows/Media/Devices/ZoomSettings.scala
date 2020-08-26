package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents zoom settings that can be applied to the ZoomControl by calling the Configure method. */
@js.native
trait ZoomSettings extends js.Object {
  /** Gets or sets a ZoomTransitionMode value indicating how the capture device should transition to the new zoom value specified with the Value property. */
  var mode: ZoomTransitionMode = js.native
  /** Gets or sets the zoom value to which the ZoomControl will transition. */
  var value: Double = js.native
}

object ZoomSettings {
  @scala.inline
  def apply(mode: ZoomTransitionMode, value: Double): ZoomSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
  @scala.inline
  implicit class ZoomSettingsOps[Self <: ZoomSettings] (val x: Self) extends AnyVal {
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
    def setMode(value: ZoomTransitionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

