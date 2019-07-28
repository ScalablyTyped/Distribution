package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasClientDeviceInformation extends js.Object {
  var friendlyName: String
  var id: String
  var operatingSystem: String
  var systemManufacturer: String
  var systemProductName: String
  var systemSku: String
}

object IEasClientDeviceInformation {
  @scala.inline
  def apply(
    friendlyName: String,
    id: String,
    operatingSystem: String,
    systemManufacturer: String,
    systemProductName: String,
    systemSku: String
  ): IEasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, id = id, operatingSystem = operatingSystem, systemManufacturer = systemManufacturer, systemProductName = systemProductName, systemSku = systemSku)
  
    __obj.asInstanceOf[IEasClientDeviceInformation]
  }
}

