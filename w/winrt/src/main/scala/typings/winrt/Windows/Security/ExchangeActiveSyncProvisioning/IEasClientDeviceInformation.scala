package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEasClientDeviceInformation extends StObject {
  
  var friendlyName: String
  
  var id: String
  
  var operatingSystem: String
  
  var systemManufacturer: String
  
  var systemProductName: String
  
  var systemSku: String
}
object IEasClientDeviceInformation {
  
  inline def apply(
    friendlyName: String,
    id: String,
    operatingSystem: String,
    systemManufacturer: String,
    systemProductName: String,
    systemSku: String
  ): IEasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], systemManufacturer = systemManufacturer.asInstanceOf[js.Any], systemProductName = systemProductName.asInstanceOf[js.Any], systemSku = systemSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasClientDeviceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEasClientDeviceInformation] (val x: Self) extends AnyVal {
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setSystemManufacturer(value: String): Self = StObject.set(x, "systemManufacturer", value.asInstanceOf[js.Any])
    
    inline def setSystemProductName(value: String): Self = StObject.set(x, "systemProductName", value.asInstanceOf[js.Any])
    
    inline def setSystemSku(value: String): Self = StObject.set(x, "systemSku", value.asInstanceOf[js.Any])
  }
}
