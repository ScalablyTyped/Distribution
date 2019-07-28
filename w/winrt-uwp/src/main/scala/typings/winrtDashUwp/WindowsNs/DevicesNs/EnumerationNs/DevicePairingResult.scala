package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to pair a device. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResult")
@js.native
abstract class DevicePairingResult () extends js.Object {
  /** Gets the level of protection used to pair the device. */
  var protectionLevelUsed: DevicePairingProtectionLevel = js.native
  /** Gets the paired status of the device after the pairing action completed. */
  var status: DevicePairingResultStatus = js.native
}

