package typings.winrtUwp.Windows.Devices.I2c.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderI2cConnectionSettings extends js.Object {
  
  var busSpeed: js.Any = js.native
  
   /* unmapped type */ var sharingMode: js.Any = js.native
  
   /* unmapped type */ var slaveAddress: js.Any = js.native
}
object ProviderI2cConnectionSettings {
  
  @scala.inline
  def apply(busSpeed: js.Any, sharingMode: js.Any, slaveAddress: js.Any): ProviderI2cConnectionSettings = {
    val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderI2cConnectionSettings]
  }
  
  @scala.inline
  implicit class ProviderI2cConnectionSettingsOps[Self <: ProviderI2cConnectionSettings] (val x: Self) extends AnyVal {
    
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
    def setBusSpeed(value: js.Any): Self = this.set("busSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingMode(value: js.Any): Self = this.set("sharingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaveAddress(value: js.Any): Self = this.set("slaveAddress", value.asInstanceOf[js.Any])
  }
}
