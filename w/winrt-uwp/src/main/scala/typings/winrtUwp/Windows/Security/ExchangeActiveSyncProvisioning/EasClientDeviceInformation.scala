package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the app the ability to retrieve device information from the local device. */
@js.native
trait EasClientDeviceInformation extends js.Object {
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
  @scala.inline
  implicit class EasClientDeviceInformationOps[Self <: EasClientDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemFirmwareVersion(value: String): Self = this.set("systemFirmwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemHardwareVersion(value: String): Self = this.set("systemHardwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemManufacturer(value: String): Self = this.set("systemManufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemProductName(value: String): Self = this.set("systemProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSku(value: String): Self = this.set("systemSku", value.asInstanceOf[js.Any])
  }
  
}

