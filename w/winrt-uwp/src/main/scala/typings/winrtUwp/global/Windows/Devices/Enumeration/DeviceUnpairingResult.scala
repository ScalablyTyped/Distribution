package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to unpair a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResult")
@js.native
abstract class DeviceUnpairingResult ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceUnpairingResult {
  /** Gets the paired status of the device after the unpairing action completed. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Enumeration.DeviceUnpairingResultStatus = js.native
}

