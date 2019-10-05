package typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.notify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattCharacteristicProperties extends js.Object

/** Specifies the values for the GATT characteristic properties as well as the GATT Extended Characteristic Properties Descriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties")
@js.native
object GattCharacteristicProperties extends js.Object {
  /** The characteristic supports signed writes */
  @js.native
  sealed trait authenticatedSignedWrites extends GattCharacteristicProperties
  
  /** The characteristic supports broadcasting */
  @js.native
  sealed trait broadcast extends GattCharacteristicProperties
  
  /** The ExtendedProperties Descriptor is present */
  @js.native
  sealed trait extendedProperties extends GattCharacteristicProperties
  
  /** The characteristic is indicatable */
  @js.native
  sealed trait indicate extends GattCharacteristicProperties
  
  /** The characteristic doesn’t have any properties that apply. */
  @js.native
  sealed trait none extends GattCharacteristicProperties
  
  /** The characteristic is notifiable */
  @js.native
  sealed trait notify extends GattCharacteristicProperties
  
  /** The characteristic is readable */
  @js.native
  sealed trait read extends GattCharacteristicProperties
  
  /** The characteristic supports reliable writes */
  @js.native
  sealed trait reliableWrites extends GattCharacteristicProperties
  
  /** The characteristic has writable auxiliaries */
  @js.native
  sealed trait writableAuxiliaries extends GattCharacteristicProperties
  
  /** The characteristic is writable */
  @js.native
  sealed trait write extends GattCharacteristicProperties
  
  /** The characteristic supports Write Without Response */
  @js.native
  sealed trait writeWithoutResponse extends GattCharacteristicProperties
  
  /* 7 */ val authenticatedSignedWrites: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.authenticatedSignedWrites with Double = js.native
  /* 1 */ val broadcast: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.broadcast with Double = js.native
  /* 8 */ val extendedProperties: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.extendedProperties with Double = js.native
  /* 6 */ val indicate: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.indicate with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.none with Double = js.native
  /* 5 */ @JSName("notify")
  val notify_FGattCharacteristicProperties: notify with Double = js.native
  /* 2 */ val read: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.read with Double = js.native
  /* 9 */ val reliableWrites: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.reliableWrites with Double = js.native
  /* 10 */ val writableAuxiliaries: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writableAuxiliaries with Double = js.native
  /* 4 */ val write: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.write with Double = js.native
  /* 3 */ val writeWithoutResponse: typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties.writeWithoutResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattCharacteristicProperties with Double] = js.native
}

