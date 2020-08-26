package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for a FocusControl object. */
@js.native
trait FocusSettings extends js.Object {
  /** Gets or sets a value indicating the auto focus range setting. */
  var autoFocusRange: AutoFocusRange = js.native
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  var disableDriverFallback: Boolean = js.native
  /** Gets or sets a value indicating the manual focus distance setting. */
  var distance: ManualFocusDistance = js.native
  /** Gets or sets a value indicating the focus mode setting. */
  var mode: FocusMode = js.native
  /** Gets or sets the focus value setting. */
  var value: Double = js.native
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  var waitForFocus: Boolean = js.native
}

object FocusSettings {
  @scala.inline
  def apply(
    autoFocusRange: AutoFocusRange,
    disableDriverFallback: Boolean,
    distance: ManualFocusDistance,
    mode: FocusMode,
    value: Double,
    waitForFocus: Boolean
  ): FocusSettings = {
    val __obj = js.Dynamic.literal(autoFocusRange = autoFocusRange.asInstanceOf[js.Any], disableDriverFallback = disableDriverFallback.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], waitForFocus = waitForFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusSettings]
  }
  @scala.inline
  implicit class FocusSettingsOps[Self <: FocusSettings] (val x: Self) extends AnyVal {
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
    def setAutoFocusRange(value: AutoFocusRange): Self = this.set("autoFocusRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableDriverFallback(value: Boolean): Self = this.set("disableDriverFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: ManualFocusDistance): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: FocusMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForFocus(value: Boolean): Self = this.set("waitForFocus", value.asInstanceOf[js.Any])
  }
  
}

