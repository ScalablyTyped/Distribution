package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result of attempting to pair a device. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingResult")
@js.native
abstract class DevicePairingResult ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingResult {
  /** Gets the level of protection used to pair the device. */
  /* CompleteClass */
  override var protectionLevelUsed: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingProtectionLevel = js.native
  /** Gets the paired status of the device after the pairing action completed. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingResultStatus = js.native
}

