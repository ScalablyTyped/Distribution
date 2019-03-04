package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasClientDeviceInformation extends js.Object {
  var friendlyName: java.lang.String
  var id: java.lang.String
  var operatingSystem: java.lang.String
  var systemManufacturer: java.lang.String
  var systemProductName: java.lang.String
  var systemSku: java.lang.String
}

object IEasClientDeviceInformation {
  @scala.inline
  def apply(
    friendlyName: java.lang.String,
    id: java.lang.String,
    operatingSystem: java.lang.String,
    systemManufacturer: java.lang.String,
    systemProductName: java.lang.String,
    systemSku: java.lang.String
  ): IEasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, id = id, operatingSystem = operatingSystem, systemManufacturer = systemManufacturer, systemProductName = systemProductName, systemSku = systemSku)
  
    __obj.asInstanceOf[IEasClientDeviceInformation]
  }
}

