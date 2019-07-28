package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue.notify
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
  sealed trait indicate extends GattClientCharacteristicConfigurationDescriptorValue
  
  /** Neither notification nor indications are enabled. */
  @js.native
  sealed trait none extends GattClientCharacteristicConfigurationDescriptorValue
  
  /** Characteristic notifications are enabled. */
  @js.native
  sealed trait notify extends GattClientCharacteristicConfigurationDescriptorValue
  
  /* 2 */ val indicate: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue.indicate with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattClientCharacteristicConfigurationDescriptorValue.none with Double = js.native
  /* 1 */ @JSName("notify")
  val notify_FGattClientCharacteristicConfigurationDescriptorValue: notify with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattClientCharacteristicConfigurationDescriptorValue with Double] = js.native
}

