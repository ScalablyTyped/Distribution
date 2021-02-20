package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
@js.native
trait GattCharacteristicNotificationTrigger extends StObject {
  
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
  implicit class GattCharacteristicNotificationTriggerMutableBuilder[Self <: GattCharacteristicNotificationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristic(value: GattCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
  }
}
