package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the app the ability to retrieve device information from the local device. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation")
@js.native
class EasClientDeviceInformation () extends js.Object {
  /** Returns the friendly name of the local device. */
  var friendlyName: java.lang.String = js.native
  /** Returns the identifier of the local device. */
  var id: java.lang.String = js.native
  /** Returns the operating system of the local device. */
  var operatingSystem: java.lang.String = js.native
  /** Returns the system firmware version of the local device. */
  var systemFirmwareVersion: java.lang.String = js.native
  /** Returns the system hardware version of the local device. */
  var systemHardwareVersion: java.lang.String = js.native
  /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
  var systemManufacturer: java.lang.String = js.native
  /** Returns the system product name of the local device. */
  var systemProductName: java.lang.String = js.native
  /** Returns the system SKU of the local device. */
  var systemSku: java.lang.String = js.native
}

