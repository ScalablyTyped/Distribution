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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellularClass")(cellularClass)
    __obj.updateDynamic("currentRadioState")(currentRadioState)
    __obj.updateDynamic("customDataClass")(customDataClass)
    __obj.updateDynamic("dataClasses")(dataClasses)
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("deviceType")(deviceType)
    __obj.updateDynamic("firmwareInformation")(firmwareInformation)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("mobileEquipmentId")(mobileEquipmentId)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("networkDeviceStatus")(networkDeviceStatus)
    __obj.updateDynamic("simIccId")(simIccId)
    __obj.updateDynamic("subscriberId")(subscriberId)
    __obj.updateDynamic("telephoneNumbers")(telephoneNumbers)
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
}

