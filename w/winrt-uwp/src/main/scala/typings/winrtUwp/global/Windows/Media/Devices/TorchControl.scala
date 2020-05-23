package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the torch LED settings on a capture device. */
@JSGlobal("Windows.Media.Devices.TorchControl")
@js.native
abstract class TorchControl ()
  extends typings.winrtUwp.Windows.Media.Devices.TorchControl {
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Gets or sets the intensity of the torch LED. */
  /* CompleteClass */
  override var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  /* CompleteClass */
  override var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the torch control. */
  /* CompleteClass */
  override var supported: Boolean = js.native
}

