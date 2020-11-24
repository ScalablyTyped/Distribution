package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.CellularClass
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the current state of the mobile broadband network device for the account. */
@js.native
trait MobileBroadbandDeviceInformation extends js.Object {
  
  /** Gets the cellular technology used by the mobile broadband network device. */
  var cellularClass: CellularClass = js.native
  
  /** Gets a value indicating the radio state of the device. */
  var currentRadioState: MobileBroadbandRadioState = js.native
  
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  var customDataClass: String = js.native
  
  /** Gets the cellular data services supported by the mobile broadband network device. */
  var dataClasses: DataClasses = js.native
  
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  var deviceId: String = js.native
  
  /** Gets a value indicating the type of Mobile Broadband device. */
  var deviceType: MobileBroadbandDeviceType = js.native
  
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  var firmwareInformation: String = js.native
  
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  var manufacturer: String = js.native
  
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  var mobileEquipmentId: String = js.native
  
  /** Gets the name of the model of the mobile broadband network device. */
  var model: String = js.native
  
  /** Gets the readiness status of the mobile broadband network device. */
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  var pinManager: MobileBroadbandPinManager = js.native
  
  /** Gets the revision of the mobile broadband device. */
  var revision: String = js.native
  
  /** Gets the serial number of the mobile broadband device. */
  var serialNumber: String = js.native
  
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  var simIccId: String = js.native
  
  /** Gets the subscriber identifier for the mobile broadband network device. */
  var subscriberId: String = js.native
  
  /** Gets the telephone numbers for the mobile broadband device. */
  var telephoneNumbers: IVectorView[String] = js.native
}
object MobileBroadbandDeviceInformation {
  
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
    pinManager: MobileBroadbandPinManager,
    revision: String,
    serialNumber: String,
    simIccId: String,
    subscriberId: String,
    telephoneNumbers: IVectorView[String]
  ): MobileBroadbandDeviceInformation = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], currentRadioState = currentRadioState.asInstanceOf[js.Any], customDataClass = customDataClass.asInstanceOf[js.Any], dataClasses = dataClasses.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], firmwareInformation = firmwareInformation.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mobileEquipmentId = mobileEquipmentId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkDeviceStatus = networkDeviceStatus.asInstanceOf[js.Any], pinManager = pinManager.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], telephoneNumbers = telephoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceInformation]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceInformationOps[Self <: MobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
    
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
    def setPinManager(value: MobileBroadbandPinManager): Self = this.set("pinManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = this.set("subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephoneNumbers(value: IVectorView[String]): Self = this.set("telephoneNumbers", value.asInstanceOf[js.Any])
  }
}
