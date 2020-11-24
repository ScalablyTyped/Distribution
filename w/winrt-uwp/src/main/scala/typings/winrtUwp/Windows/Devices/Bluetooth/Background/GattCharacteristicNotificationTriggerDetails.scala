package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the Bluetooth LE device that caused this trigger to fire. */
@js.native
trait GattCharacteristicNotificationTriggerDetails extends js.Object {
  
  /** Gets the GATT characteristic that changed. */
  var characteristic: GattCharacteristic = js.native
  
  /** Gets a byte stream containing the new value of the characteristic. */
  var value: IBuffer = js.native
}
object GattCharacteristicNotificationTriggerDetails {
  
  @scala.inline
  def apply(characteristic: GattCharacteristic, value: IBuffer): GattCharacteristicNotificationTriggerDetails = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTriggerDetails]
  }
  
  @scala.inline
  implicit class GattCharacteristicNotificationTriggerDetailsOps[Self <: GattCharacteristicNotificationTriggerDetails] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setValue(value: IBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
