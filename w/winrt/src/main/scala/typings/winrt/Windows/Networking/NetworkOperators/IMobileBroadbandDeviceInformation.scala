package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.CellularClass
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandDeviceInformation extends js.Object {
  var cellularClass: CellularClass = js.native
  var currentRadioState: MobileBroadbandRadioState = js.native
  var customDataClass: String = js.native
  var dataClasses: DataClasses = js.native
  var deviceId: String = js.native
  var deviceType: MobileBroadbandDeviceType = js.native
  var firmwareInformation: String = js.native
  var manufacturer: String = js.native
  var mobileEquipmentId: String = js.native
  var model: String = js.native
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  var simIccId: String = js.native
  var subscriberId: String = js.native
  var telephoneNumbers: IVectorView[String] = js.native
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
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], currentRadioState = currentRadioState.asInstanceOf[js.Any], customDataClass = customDataClass.asInstanceOf[js.Any], dataClasses = dataClasses.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], firmwareInformation = firmwareInformation.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mobileEquipmentId = mobileEquipmentId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkDeviceStatus = networkDeviceStatus.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], telephoneNumbers = telephoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
  @scala.inline
  implicit class IMobileBroadbandDeviceInformationOps[Self <: IMobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
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
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentRadioState(value: MobileBroadbandRadioState): Self = this.set("currentRadioState", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomDataClass(value: String): Self = this.set("customDataClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataClasses(value: DataClasses): Self = this.set("dataClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceType(value: MobileBroadbandDeviceType): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirmwareInformation(value: String): Self = this.set("firmwareInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileEquipmentId(value: String): Self = this.set("mobileEquipmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDeviceStatus(value: NetworkDeviceStatus): Self = this.set("networkDeviceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriberId(value: String): Self = this.set("subscriberId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTelephoneNumbers(value: IVectorView[String]): Self = this.set("telephoneNumbers", value.asInstanceOf[js.Any])
  }
  
}

