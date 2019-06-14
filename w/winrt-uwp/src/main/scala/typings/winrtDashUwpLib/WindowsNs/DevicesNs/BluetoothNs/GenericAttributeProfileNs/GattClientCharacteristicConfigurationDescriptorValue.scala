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
  
  /* 2 */ val indicate: indicate with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ @JSName("notify")
  val notify_FGattClientCharacteristicConfigurationDescriptorValue: notify with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue with scala.Double
  ] = js.native
}

