package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
@js.native
trait GattCharacteristicNotificationTrigger extends js.Object {
  
  /** Gets the GATT characteristic for which value change notifications are desired. */
  var characteristic: GattCharacteristic = js.native
}
object GattCharacteristicNotificationTrigger {
  
  @scala.inline
  def apply(characteristic: GattCharacteristic): GattCharacteristicNotificationTrigger = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTrigger]
  }
  
  @scala.inline
  implicit class GattCharacteristicNotificationTriggerOps[Self <: GattCharacteristicNotificationTrigger] (val x: Self) extends AnyVal {
    
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
    def setCharacteristic(value: GattCharacteristic): Self = this.set("characteristic", value.asInstanceOf[js.Any])
  }
}
