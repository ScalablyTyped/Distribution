package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandDeviceInformation extends js.Object {
  var cellularClass: winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  var currentRadioState: MobileBroadbandRadioState
  var customDataClass: java.lang.String
  var dataClasses: DataClasses
  var deviceId: java.lang.String
  var deviceType: MobileBroadbandDeviceType
  var firmwareInformation: java.lang.String
  var manufacturer: java.lang.String
  var mobileEquipmentId: java.lang.String
  var model: java.lang.String
  var networkDeviceStatus: NetworkDeviceStatus
  var simIccId: java.lang.String
  var subscriberId: java.lang.String
  var telephoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
}

object IMobileBroadbandDeviceInformation {
  @scala.inline
  def apply(
    cellularClass: winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass,
    currentRadioState: MobileBroadbandRadioState,
    customDataClass: java.lang.String,
    dataClasses: DataClasses,
    deviceId: java.lang.String,
    deviceType: MobileBroadbandDeviceType,
    firmwareInformation: java.lang.String,
    manufacturer: java.lang.String,
    mobileEquipmentId: java.lang.String,
    model: java.lang.String,
    networkDeviceStatus: NetworkDeviceStatus,
    simIccId: java.lang.String,
    subscriberId: java.lang.String,
    telephoneNumbers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  ): IMobileBroadbandDeviceInformation = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass, currentRadioState = currentRadioState, customDataClass = customDataClass, dataClasses = dataClasses, deviceId = deviceId, deviceType = deviceType, firmwareInformation = firmwareInformation, manufacturer = manufacturer, mobileEquipmentId = mobileEquipmentId, model = model, networkDeviceStatus = networkDeviceStatus, simIccId = simIccId, subscriberId = subscriberId, telephoneNumbers = telephoneNumbers)
  
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
}

