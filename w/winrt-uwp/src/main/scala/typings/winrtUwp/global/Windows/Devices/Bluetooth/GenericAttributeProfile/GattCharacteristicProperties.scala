package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.notify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the values for the GATT characteristic properties as well as the GATT Extended Characteristic Properties Descriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties")
@js.native
object GattCharacteristicProperties extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties with Double
  ] = js.native
  
  /* 7 */ val authenticatedSignedWrites: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.authenticatedSignedWrites with Double = js.native
  
  /* 1 */ val broadcast: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.broadcast with Double = js.native
  
  /* 8 */ val extendedProperties: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.extendedProperties with Double = js.native
  
  /* 6 */ val indicate: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.indicate with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.none with Double = js.native
  
  /* 5 */ @JSName("notify")
  val notify_ : notify with Double = js.native
  
  /* 2 */ val read: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.read with Double = js.native
  
  /* 9 */ val reliableWrites: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.reliableWrites with Double = js.native
  
  /* 10 */ val writableAuxiliaries: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writableAuxiliaries with Double = js.native
  
  /* 4 */ val write: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.write with Double = js.native
  
  /* 3 */ val writeWithoutResponse: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writeWithoutResponse with Double = js.native
}
