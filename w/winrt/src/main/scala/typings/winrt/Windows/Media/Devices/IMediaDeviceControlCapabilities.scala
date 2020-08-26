package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaDeviceControlCapabilities extends js.Object {
  var autoModeSupported: Boolean = js.native
  var default: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var step: Double = js.native
  var supported: Boolean = js.native
}

object IMediaDeviceControlCapabilities {
  @scala.inline
  def apply(
    autoModeSupported: Boolean,
    default: Double,
    max: Double,
    min: Double,
    step: Double,
    supported: Boolean
  ): IMediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaDeviceControlCapabilities]
  }
  @scala.inline
  implicit class IMediaDeviceControlCapabilitiesOps[Self <: IMediaDeviceControlCapabilities] (val x: Self) extends AnyVal {
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
    def setAutoModeSupported(value: Boolean): Self = this.set("autoModeSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

