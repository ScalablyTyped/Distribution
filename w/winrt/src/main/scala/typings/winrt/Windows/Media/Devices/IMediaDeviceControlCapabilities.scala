package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControlCapabilities extends js.Object {
  var autoModeSupported: Boolean
  var default: Double
  var max: Double
  var min: Double
  var step: Double
  var supported: Boolean
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
}

