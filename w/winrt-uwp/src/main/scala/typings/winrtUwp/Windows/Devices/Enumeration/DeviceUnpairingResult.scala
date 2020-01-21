package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to unpair a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResult")
@js.native
abstract class DeviceUnpairingResult () extends js.Object {
  /** Gets the paired status of the device after the unpairing action completed. */
  var status: DeviceUnpairingResultStatus = js.native
}

