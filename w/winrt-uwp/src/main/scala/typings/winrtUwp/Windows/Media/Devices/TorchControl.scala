package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the torch LED settings on a capture device. */
trait TorchControl extends js.Object {
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  var enabled: Boolean
  /** Gets or sets the intensity of the torch LED. */
  var powerPercent: Double
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean
  /** Gets a value that specifies if the capture device supports the torch control. */
  var supported: Boolean
}

object TorchControl {
  @scala.inline
  def apply(enabled: Boolean, powerPercent: Double, powerSupported: Boolean, supported: Boolean): TorchControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], powerSupported = powerSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorchControl]
  }
}

