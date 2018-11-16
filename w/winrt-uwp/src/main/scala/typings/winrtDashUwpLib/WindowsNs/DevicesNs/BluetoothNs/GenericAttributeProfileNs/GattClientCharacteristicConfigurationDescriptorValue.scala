package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattClientCharacteristicConfigurationDescriptorValue extends js.Object

/** Represents the value of the GATT ClientCharacteristicConfigurationDescriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue")
@js.native
object GattClientCharacteristicConfigurationDescriptorValue extends js.Object {
  /** Characteristic indications are enabled. */
  @js.native
  sealed trait indicate
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue
  
  /** Neither notification nor indications are enabled. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue
  
  /** Characteristic notifications are enabled. */
  @js.native
  sealed trait notify
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue
  
  val indicate: indicate with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSName("notify")
  val notify_FGattClientCharacteristicConfigurationDescriptorValue: notify with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue with java.lang.String
  ] = js.native
}

