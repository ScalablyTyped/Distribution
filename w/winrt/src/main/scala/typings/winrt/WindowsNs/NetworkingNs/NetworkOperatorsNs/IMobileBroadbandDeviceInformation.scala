package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.DevicesNs.SmsNs.CellularClass
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandDeviceInformation extends js.Object {
  var cellularClass: CellularClass
  var currentRadioState: MobileBroadbandRadioState
  var customDataClass: String
  var dataClasses: DataClasses
  var deviceId: String
  var deviceType: MobileBroadbandDeviceType
  var firmwareInformation: String
  var manufacturer: String
  var mobileEquipmentId: String
  var model: String
  var networkDeviceStatus: NetworkDeviceStatus
  var simIccId: String
  var subscriberId: String
  var telephoneNumbers: IVectorView[String]
}

object IMobileBroadbandDeviceInformation {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    currentRadioState: MobileBroadbandRadioState,
    customDataClass: String,
    dataClasses: DataClasses,
    deviceId: String,
    deviceType: MobileBroadbandDeviceType,
    firmwareInformation: String,
    manufacturer: String,
    mobileEquipmentId: String,
    model: String,
    networkDeviceStatus: NetworkDeviceStatus,
    simIccId: String,
    subscriberId: String,
    telephoneNumbers: IVectorView[String]
  ): IMobileBroadbandDeviceInformation = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass, currentRadioState = currentRadioState, customDataClass = customDataClass, dataClasses = dataClasses, deviceId = deviceId, deviceType = deviceType, firmwareInformation = firmwareInformation, manufacturer = manufacturer, mobileEquipmentId = mobileEquipmentId, model = model, networkDeviceStatus = networkDeviceStatus, simIccId = simIccId, subscriberId = subscriberId, telephoneNumbers = telephoneNumbers)
  
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
}

