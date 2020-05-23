package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the app the ability to retrieve device information from the local device. */
trait EasClientDeviceInformation extends js.Object {
  /** Returns the friendly name of the local device. */
  var friendlyName: String
  /** Returns the identifier of the local device. */
  var id: String
  /** Returns the operating system of the local device. */
  var operatingSystem: String
  /** Returns the system firmware version of the local device. */
  var systemFirmwareVersion: String
  /** Returns the system hardware version of the local device. */
  var systemHardwareVersion: String
  /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
  var systemManufacturer: String
  /** Returns the system product name of the local device. */
  var systemProductName: String
  /** Returns the system SKU of the local device. */
  var systemSku: String
}

object EasClientDeviceInformation {
  @scala.inline
  def apply(
    friendlyName: String,
    id: String,
    operatingSystem: String,
    systemFirmwareVersion: String,
    systemHardwareVersion: String,
    systemManufacturer: String,
    systemProductName: String,
    systemSku: String
  ): EasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], systemFirmwareVersion = systemFirmwareVersion.asInstanceOf[js.Any], systemHardwareVersion = systemHardwareVersion.asInstanceOf[js.Any], systemManufacturer = systemManufacturer.asInstanceOf[js.Any], systemProductName = systemProductName.asInstanceOf[js.Any], systemSku = systemSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasClientDeviceInformation]
  }
}

