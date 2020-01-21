package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the app the ability to retrieve device information from the local device. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation")
@js.native
/** Creates an instance of an object that allows the caller app to retrieve device information from the local device. */
class EasClientDeviceInformation () extends js.Object {
  /** Returns the friendly name of the local device. */
  var friendlyName: String = js.native
  /** Returns the identifier of the local device. */
  var id: String = js.native
  /** Returns the operating system of the local device. */
  var operatingSystem: String = js.native
  /** Returns the system firmware version of the local device. */
  var systemFirmwareVersion: String = js.native
  /** Returns the system hardware version of the local device. */
  var systemHardwareVersion: String = js.native
  /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
  var systemManufacturer: String = js.native
  /** Returns the system product name of the local device. */
  var systemProductName: String = js.native
  /** Returns the system SKU of the local device. */
  var systemSku: String = js.native
}

