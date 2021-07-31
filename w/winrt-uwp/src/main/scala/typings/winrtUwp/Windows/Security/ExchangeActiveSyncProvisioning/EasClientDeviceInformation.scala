package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the app the ability to retrieve device information from the local device. */
trait EasClientDeviceInformation extends StObject {
  
  /** Returns the friendly name of the local device. */
  var friendlyName: String
  
  /** Returns the identifier of the local device. */
  var id: String
  
  /** Returns the operating system of the local device. */
  var operatingSystem: String
  
  /** Returns the system firmware version of the local device. */
  var systemFirmwareVersion: String
  
  /** Returns the system hardware version of the local device. */
  var systemHardwareVersion: String
  
  /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
  var systemManufacturer: String
  
  /** Returns the system product name of the local device. */
  var systemProductName: String
  
  /** Returns the system SKU of the local device. */
  var systemSku: String
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
  implicit class EasClientDeviceInformationMutableBuilder[Self <: EasClientDeviceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemFirmwareVersion(value: String): Self = StObject.set(x, "systemFirmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemHardwareVersion(value: String): Self = StObject.set(x, "systemHardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemManufacturer(value: String): Self = StObject.set(x, "systemManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemProductName(value: String): Self = StObject.set(x, "systemProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSku(value: String): Self = StObject.set(x, "systemSku", value.asInstanceOf[js.Any])
  }
}
