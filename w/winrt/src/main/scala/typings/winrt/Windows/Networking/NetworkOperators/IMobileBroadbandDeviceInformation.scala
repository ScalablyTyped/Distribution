package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Devices.Sms.CellularClass
import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandDeviceInformation extends StObject {
  
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
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], currentRadioState = currentRadioState.asInstanceOf[js.Any], customDataClass = customDataClass.asInstanceOf[js.Any], dataClasses = dataClasses.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], firmwareInformation = firmwareInformation.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mobileEquipmentId = mobileEquipmentId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkDeviceStatus = networkDeviceStatus.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], telephoneNumbers = telephoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
  
  @scala.inline
  implicit class IMobileBroadbandDeviceInformationMutableBuilder[Self <: IMobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
    
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
    def setSimIccId(value: String): Self = StObject.set(x, "simIccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephoneNumbers(value: IVectorView[String]): Self = StObject.set(x, "telephoneNumbers", value.asInstanceOf[js.Any])
  }
}
