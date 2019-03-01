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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoModeSupported")(autoModeSupported)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("supported")(supported)
    __obj.asInstanceOf[IMediaDeviceControlCapabilities]
  }
}

