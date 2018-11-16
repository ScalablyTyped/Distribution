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
  
  val authenticatedSignedWrites: authenticatedSignedWrites with java.lang.String = js.native
  val broadcast: broadcast with java.lang.String = js.native
  val extendedProperties: extendedProperties with java.lang.String = js.native
  val indicate: indicate with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSName("notify")
  val notify_FGattCharacteristicProperties: notify with java.lang.String = js.native
  val read: read with java.lang.String = js.native
  val reliableWrites: reliableWrites with java.lang.String = js.native
  val writableAuxiliaries: writableAuxiliaries with java.lang.String = js.native
  val write: write with java.lang.String = js.native
  val writeWithoutResponse: writeWithoutResponse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristicProperties with java.lang.String
  ] = js.native
}

