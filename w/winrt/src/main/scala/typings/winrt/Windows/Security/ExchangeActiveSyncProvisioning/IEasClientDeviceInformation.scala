package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEasClientDeviceInformation extends StObject {
  
  var friendlyName: String = js.native
  
  var id: String = js.native
  
  var operatingSystem: String = js.native
  
  var systemManufacturer: String = js.native
  
  var systemProductName: String = js.native
  
  var systemSku: String = js.native
}
object IEasClientDeviceInformation {
  
  @scala.inline
  def apply(
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
  implicit class IEasClientDeviceInformationMutableBuilder[Self <: IEasClientDeviceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemManufacturer(value: String): Self = StObject.set(x, "systemManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemProductName(value: String): Self = StObject.set(x, "systemProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSku(value: String): Self = StObject.set(x, "systemSku", value.asInstanceOf[js.Any])
  }
}
