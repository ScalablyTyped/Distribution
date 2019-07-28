package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the torch LED settings on a capture device. */
@JSGlobal("Windows.Media.Devices.TorchControl")
@js.native
abstract class TorchControl () extends js.Object {
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  var enabled: Boolean = js.native
  /** Gets or sets the intensity of the torch LED. */
  var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the torch control. */
  var supported: Boolean = js.native
}

