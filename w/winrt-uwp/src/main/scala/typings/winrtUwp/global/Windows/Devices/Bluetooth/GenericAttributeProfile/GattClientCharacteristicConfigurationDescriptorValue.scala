package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.notify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the GATT ClientCharacteristicConfigurationDescriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue")
@js.native
object GattClientCharacteristicConfigurationDescriptorValue extends js.Object {
  /* 2 */ val indicate: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.indicate with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue.none with Double = js.native
  /* 1 */ @JSName("notify")
  val notify_ : notify with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue with Double
  ] = js.native
}

