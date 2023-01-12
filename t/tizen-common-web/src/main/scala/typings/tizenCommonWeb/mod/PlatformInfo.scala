package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformInfo extends StObject {
  
  /**
    * The firmware version.
    */
  val firmwareVersion: String | Null
  
  /**
    * The hardware version.
    */
  val hardwareVersion: String | Null
  
  /**
    * The manufacture date of device.
    */
  val manufactureDate: String | Null
  
  /**
    * The name of manufacturer.
    */
  val manufacturerName: String | Null
  
  /**
    * The URL of manufacturer.
    */
  val manufacturerUrl: String | Null
  
  /**
    * The model number is designated by manufacturer.
    */
  val modelNumber: String | Null
  
  /**
    * The operating system version.
    */
  val operatingSystemVersion: String | Null
  
  /**
    * The platform identifier
    */
  val platformId: String | Null
  
  /**
    * The platform version is defined by manufacturer.
    */
  val platformVersion: String | Null
  
  /**
    * The URL that points to support information from manufacturer.
    */
  val supportUrl: String | Null
  
  /**
    * The System time.
    */
  val systemTime: String | Null
}
object PlatformInfo {
  
  inline def apply(): PlatformInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = null, hardwareVersion = null, manufactureDate = null, manufacturerName = null, manufacturerUrl = null, modelNumber = null, operatingSystemVersion = null, platformId = null, platformVersion = null, supportUrl = null, systemTime = null)
    __obj.asInstanceOf[PlatformInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformInfo] (val x: Self) extends AnyVal {
    
    inline def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFirmwareVersionNull: Self = StObject.set(x, "firmwareVersion", null)
    
    inline def setHardwareVersion(value: String): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    inline def setHardwareVersionNull: Self = StObject.set(x, "hardwareVersion", null)
    
    inline def setManufactureDate(value: String): Self = StObject.set(x, "manufactureDate", value.asInstanceOf[js.Any])
    
    inline def setManufactureDateNull: Self = StObject.set(x, "manufactureDate", null)
    
    inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNameNull: Self = StObject.set(x, "manufacturerName", null)
    
    inline def setManufacturerUrl(value: String): Self = StObject.set(x, "manufacturerUrl", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUrlNull: Self = StObject.set(x, "manufacturerUrl", null)
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberNull: Self = StObject.set(x, "modelNumber", null)
    
    inline def setOperatingSystemVersion(value: String): Self = StObject.set(x, "operatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionNull: Self = StObject.set(x, "operatingSystemVersion", null)
    
    inline def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdNull: Self = StObject.set(x, "platformId", null)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionNull: Self = StObject.set(x, "platformVersion", null)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlNull: Self = StObject.set(x, "supportUrl", null)
    
    inline def setSystemTime(value: String): Self = StObject.set(x, "systemTime", value.asInstanceOf[js.Any])
    
    inline def setSystemTimeNull: Self = StObject.set(x, "systemTime", null)
  }
}
