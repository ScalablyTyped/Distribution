package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceControlCapabilities extends js.Object {
  var autoModeSupported: scala.Boolean
  var default: scala.Double
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
  var supported: scala.Boolean
}

object IMediaDeviceControlCapabilities {
  @scala.inline
  def apply(
    autoModeSupported: scala.Boolean,
    default: scala.Double,
    max: scala.Double,
    min: scala.Double,
    step: scala.Double,
    supported: scala.Boolean
  ): IMediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported, default = default, max = max, min = min, step = step, supported = supported)
  
    __obj.asInstanceOf[IMediaDeviceControlCapabilities]
  }
}

