package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Devices.Sms.CellularClass
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the current state of the mobile broadband network device for the account. */
trait MobileBroadbandDeviceInformation extends StObject {
  
  /** Gets the cellular technology used by the mobile broadband network device. */
  var cellularClass: CellularClass
  
  /** Gets a value indicating the radio state of the device. */
  var currentRadioState: MobileBroadbandRadioState
  
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  var customDataClass: String
  
  /** Gets the cellular data services supported by the mobile broadband network device. */
  var dataClasses: DataClasses
  
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  var deviceId: String
  
  /** Gets a value indicating the type of Mobile Broadband device. */
  var deviceType: MobileBroadbandDeviceType
  
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  var firmwareInformation: String
  
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  var manufacturer: String
  
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  var mobileEquipmentId: String
  
  /** Gets the name of the model of the mobile broadband network device. */
  var model: String
  
  /** Gets the readiness status of the mobile broadband network device. */
  var networkDeviceStatus: NetworkDeviceStatus
  
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  var pinManager: MobileBroadbandPinManager
  
  /** Gets the revision of the mobile broadband device. */
  var revision: String
  
  /** Gets the serial number of the mobile broadband device. */
  var serialNumber: String
  
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  var simIccId: String
  
  /** Gets the subscriber identifier for the mobile broadband network device. */
  var subscriberId: String
  
  /** Gets the telephone numbers for the mobile broadband device. */
  var telephoneNumbers: IVectorView[String]
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
  implicit class MobileBroadbandDeviceInformationMutableBuilder[Self <: MobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRadioState(value: MobileBroadbandRadioState): Self = StObject.set(x, "currentRadioState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataClass(value: String): Self = StObject.set(x, "customDataClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataClasses(value: DataClasses): Self = StObject.set(x, "dataClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: MobileBroadbandDeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareInformation(value: String): Self = StObject.set(x, "firmwareInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileEquipmentId(value: String): Self = StObject.set(x, "mobileEquipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDeviceStatus(value: NetworkDeviceStatus): Self = StObject.set(x, "networkDeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinManager(value: MobileBroadbandPinManager): Self = StObject.set(x, "pinManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephoneNumbers(value: IVectorView[String]): Self = StObject.set(x, "telephoneNumbers", value.asInstanceOf[js.Any])
  }
}
