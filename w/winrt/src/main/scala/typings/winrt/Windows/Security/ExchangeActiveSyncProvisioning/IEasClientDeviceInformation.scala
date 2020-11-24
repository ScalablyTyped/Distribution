package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEasClientDeviceInformation extends js.Object {
  
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
  implicit class IEasClientDeviceInformationOps[Self <: IEasClientDeviceInformation] (val x: Self) extends AnyVal {
    
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
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemManufacturer(value: String): Self = this.set("systemManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemProductName(value: String): Self = this.set("systemProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSku(value: String): Self = this.set("systemSku", value.asInstanceOf[js.Any])
  }
}
