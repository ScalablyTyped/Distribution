package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

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
  sealed trait authenticatedSignedWrites
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic supports broadcasting */
  @js.native
  sealed trait broadcast
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The ExtendedProperties Descriptor is present */
  @js.native
  sealed trait extendedProperties
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic is indicatable */
  @js.native
  sealed trait indicate
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic doesn’t have any properties that apply. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic is notifiable */
  @js.native
  sealed trait notify
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic is readable */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic supports reliable writes */
  @js.native
  sealed trait reliableWrites
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic has writable auxiliaries */
  @js.native
  sealed trait writableAuxiliaries
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic is writable */
  @js.native
  sealed trait write
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /** The characteristic supports Write Without Response */
  @js.native
  sealed trait writeWithoutResponse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties
  
  /* 7 */ val authenticatedSignedWrites: authenticatedSignedWrites with scala.Double = js.native
  /* 1 */ val broadcast: broadcast with scala.Double = js.native
  /* 8 */ val extendedProperties: extendedProperties with scala.Double = js.native
  /* 6 */ val indicate: indicate with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ @JSName("notify")
  val notify_FGattCharacteristicProperties: notify with scala.Double = js.native
  /* 2 */ val read: read with scala.Double = js.native
  /* 9 */ val reliableWrites: reliableWrites with scala.Double = js.native
  /* 10 */ val writableAuxiliaries: writableAuxiliaries with scala.Double = js.native
  /* 4 */ val write: write with scala.Double = js.native
  /* 3 */ val writeWithoutResponse: writeWithoutResponse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties with scala.Double
  ] = js.native
}

